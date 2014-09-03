package portalxpert.organization.service.impl;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import portalxpert.board.board100.dao.Board100DAO;
import portalxpert.board.board100.model.PbsUserBoardCateUseVO;
import portalxpert.common.config.Constant;
import portalxpert.common.dao.UserLoginDAO;
import portalxpert.common.model.BoardSearchVO;
import portalxpert.common.model.UserInfoVO;
import portalxpert.organization.dao.OrganizationDAO;
import portalxpert.organization.model.BbsVO;
import portalxpert.organization.model.CategoryVO;
import portalxpert.organization.model.OrganizationVO;
import portalxpert.organization.model.UserVO;
import portalxpert.organization.service.OrganizationService;
import portalxpert.organization.web.OrganizationController;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.property.EgovPropertyService;


@Service("organizationService")
public class OrganizationServiceImpl extends EgovAbstractServiceImpl implements  OrganizationService {
	
	private final static Logger logger = LoggerFactory.getLogger(OrganizationController.class);
	
	@Autowired
    private OrganizationDAO organizationMapper;
    
	@Autowired
    private UserLoginDAO userLoginMapper;
    

	
	@Autowired
    private Board100DAO board100Mapper;
    
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;

	public List<OrganizationVO> getOrganizationList() throws Exception{
		try{
			OrganizationVO vo = new OrganizationVO();
			vo.setDeptCode(propertiesService.getString("START_DEPT_CODE"));
			return organizationMapper.getOrganizationList(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}

	public List<OrganizationVO> getOrganizationListBySearch(String orgfullname) throws Exception {
		try{
			OrganizationVO vo = new OrganizationVO();
			vo.setDeptCode(propertiesService.getString("START_DEPT_CODE"));
			vo.setOrgfullname(orgfullname);
			return organizationMapper.getOrganizationListBySearch(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}

	public List<UserVO> getUserList(OrganizationVO vo) throws Exception {
		try{
			return organizationMapper.getUserList(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	public String insertCategory(CategoryVO vo) throws Exception {
    	    	
		String id ="";
		try {
			
			//Object savePoint = transactionStatus.createSavepoint();
			//vo.setId("test");
			organizationMapper.deleteCategory(vo);
			organizationMapper.insertCategory(vo);	

		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}	
		
		return id;
    }
	
	public String insertMyCategory(CategoryVO vo, HttpSession session) throws Exception {
    	
		String id ="";
		try {
			
			//Object savePoint = transactionStatus.createSavepoint();
			//vo.setId("test");
			organizationMapper.deleteCategory(vo);
			organizationMapper.insertCategory(vo);	
			
			UserInfoVO info = (UserInfoVO)session.getAttribute("pxLoginInfo");
			
			if(! vo.getBoardId().equals("")){
				JSONObject jo = JSONObject.fromObject(vo.getBoardId());
				 
				JSONArray list = jo.getJSONArray("boardId");
				
				PbsUserBoardCateUseVO pbsUserBoardCateUseVO = new PbsUserBoardCateUseVO();
				pbsUserBoardCateUseVO.setUserId(info.getId());
				organizationMapper.deletePbsUserBoardCateUse(pbsUserBoardCateUseVO); 
				
				for (Iterator i = list.iterator(); i.hasNext();) {
					JSONObject ob = (JSONObject) i.next();
					
					String sId = ob.getString("id");
					logger.debug("sId : "+sId);
					
					pbsUserBoardCateUseVO.setBoardId(sId);
					pbsUserBoardCateUseVO.setDelYn("N");
					pbsUserBoardCateUseVO.setRegrId(info.getId());
					pbsUserBoardCateUseVO.setRegrName(info.getName());
					pbsUserBoardCateUseVO.setUpdrId(info.getId());
					pbsUserBoardCateUseVO.setUpdrName(info.getName());
					organizationMapper.insertPbsUserBoardCateUse(pbsUserBoardCateUseVO);

				}
			}

		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}		
		
		return id;
    }
	
	public List<CategoryVO> getCategoryList(CategoryVO vo, String UserId, HttpSession session) throws Exception {
		try{
			List list = null;
			if(vo.getAdmin().equals("1")){//공용게시판 리스트
				vo.setId(Constant.ROLE_SUPER.getVal());
				String superAdmin = (String)session.getAttribute("superAdmin")==null?"":(String)session.getAttribute("superAdmin");
				if( superAdmin.equals(Constant.ROLE_SUPER.getVal()))
		    	{ 
					vo.setId(Constant.ROLE_SUPER.getVal());
		    	}
			}
			
			list = organizationMapper.getCategoryList(vo);//모든 게시판
			
			/*if (vo.getKind().equals("2")) //사용자용이면 나의 권한에 맞는 리스트를 생성한다. 
			{
				List categoryList = new ArrayList();
				
				BbsVO bbsVo = new BbsVO();
				bbsVo.setUserid(vo.getId());
				
				BoardSearchVO boardSearchVO = new BoardSearchVO();
				boardSearchVO.setUserId(UserId);
				
				String auth = board100Mapper.getUserBbsMapList(boardSearchVO);
				
				bbsVo.setUserMap(auth);
				logger.debug("auth : "+auth);
				logger.debug("getCategoryList : "+bbsVo.getUserMap());
				
				//List boardList = organizationMapper.getBbsAuthList(bbsVo);
				List boardList = organizationMapper.getBbsAuthListNew(bbsVo);//사용자에게 권한이 있는 게시판
				
				
				if (list.size() > 0)
				{
					CategoryVO category = (CategoryVO)list.get(0);//모든JSON 				
					JSONArray jsonArr = JSONArray.fromObject(category.getConts());		
					logger.debug("나의게시판 갯수 : "+boardList.size()+" !@! 모든게시판 갯수 : "+jsonArr.size());
					for (int i=0; i < boardList.size(); i++)
					{
						BbsVO bbs = (BbsVO)boardList.get(i);//사용자에게 권한이 있는 게시판
						for (int j=0; j < jsonArr.size(); j++)
						{
							JSONObject jsonObject = (JSONObject)jsonArr.get(j);
							if (bbs.getBoardId().equals(jsonObject.get("boardId")))
							{
								//logger.debug(bbs.getBoardId()+" 같다....!@##$@#$#@$@$##$@##$"+ jsonObject.get("boardId"));
								
								addPushList(categoryList, jsonObject);
								String pId = ""+jsonObject.get("pId");
								addCategoryList(category, categoryList, pId);
							}
						}
					}
					
					//정렬처리	
					List categoryOrderList = new ArrayList();
					for (int i=0; i < jsonArr.size(); i++)
					{
						JSONObject jsonObject = (JSONObject)jsonArr.get(i);
						
						for (int j=0; j< categoryList.size(); j++)
						{
							JSONObject json = (JSONObject)categoryList.get(j);
							
							if (jsonObject.equals(json))
							{
								categoryOrderList.add(json);
								break;
							}
						}
					}
					categoryList = null;
					bbsVo = null;
					
					list.clear();			
					String jsonStr = "[";
					for (int i=0; i< categoryOrderList.size(); i++)
					{
						JSONObject json = (JSONObject)categoryOrderList.get(i);
						jsonStr += json.toString()+",";
					}
					jsonStr = jsonStr.substring(0, jsonStr.length()-1)+"]";
					
					CategoryVO cateVo = new CategoryVO();
					cateVo.setId(vo.getId());
					cateVo.setKind(vo.getKind());
					cateVo.setConts(jsonStr);
					
					if (categoryOrderList.size() == 0)
					{
						cateVo.setConts("[{\"id\":1,\"pId\":0,\"boardId\":\"root\",\"name\":\"공통게시판\",\"icon\":\"../resources/images/img/img_category.png\"},{\"id\":99999,\"pId\":1,\"boardId\":\"99999999\",\"name\":\"임시저장\",\"icon\":\"../resources/images/img/img_category.png\"}]");
					}
					logger.debug("공통게시판 JSON : " + jsonStr);
					list.add(cateVo);
				}			
				
			}*/
			return list;
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	public void addPushList(List categoryList, JSONObject obj) throws Exception{
		try{
			boolean contain = false;
			for (int i=0; i < categoryList.size(); i++)
			{
				JSONObject json = (JSONObject)categoryList.get(i);
				if (json.equals(obj))
				{
					contain = true;
					break;
				}
			}
			if (!contain) categoryList.add(obj);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	public void addCategoryList(CategoryVO category, List categoryList, String pid) throws Exception{
		try{
			JSONArray jsonArr = JSONArray.fromObject(category.getConts());
			for (int i=0; i < jsonArr.size(); i++)
			{
				JSONObject json = (JSONObject)jsonArr.get(i);
				String id = ""+json.get("id"); 
				if (id.equals(pid))
				{
					addPushList(categoryList, json);
					String pId = ""+json.get("pId");
					if(!pId.equals("0"))
					{
						addCategoryList(category, categoryList, ""+json.get("pId"));
					}
				}
			}
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 사용자 직원 검색
	 * @author crossent
	 */
	public List<UserVO> getDeptMemberList(UserVO userVO) throws Exception {
		try{
			return organizationMapper.getDeptMemberList(userVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 사용자 직원 검색 건수
     * @author crossent
	 */
	public int getDeptMemberListTotCnt(UserVO userVO) throws Exception {
		try{
			return organizationMapper.getDeptMemberListTotCnt(userVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 직원 검색
	 * @author crossent
	 */
	public List<UserVO> getUserSearchList(UserVO userVO) throws Exception {
		try{
			return organizationMapper.getUserSearchList(userVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 직원 검색 건수
     * @author crossent
	 */
	public int getUserSearchListTotCnt(UserVO userVO) throws Exception {
		try{
			return organizationMapper.getUserSearchListTotCnt(userVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 부서명 가져오기
	 * @author crossent
	 */
	public UserVO getDeptName(UserVO userVO) throws Exception {
		try{
			return organizationMapper.getDeptName(userVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 부서 인원수 가져오기
	 * @author crossent
	 */
	public int getDeptNameMemberCnt(OrganizationVO vo) throws Exception {
		try{
			return organizationMapper.getDeptNameMemberCnt(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 나의 권한에 맞는 게시판 리스트 
	 * @author 
	 */
	public List<BbsVO> getUserBbsMapList(BoardSearchVO vo) throws Exception {
		try{
			vo.setDeptCode(propertiesService.getString("START_DEPT_CODE"));
			String auth = board100Mapper.getUserBbsMapList(vo);
			
			BbsVO bbsVo = new BbsVO();
			bbsVo.setUserMap(auth);
	
			return organizationMapper.getBbsAuthListNew(bbsVo);//사용자에게 권한이 있는 게시판
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	
    
    /**
     * 게시판 운영 정보 조회
     * @param vo 사용자 아이디
     * @return 게시판 리스트
     */
    public List<BbsVO> getBbsOperInfo(BbsVO vo) throws Exception {
    	try {
    		return organizationMapper.getBbsOperInfo(vo);
    	}catch(Exception e){
    		throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
    	}
    }
}
