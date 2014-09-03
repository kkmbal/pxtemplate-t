package portalxpert.adm.sys.service.impl;

import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.omg.CORBA.portable.ApplicationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import portalxpert.adm.sys.dao.AdmSysDAO;
import portalxpert.adm.sys.model.AdmSysAuthVO;
import portalxpert.adm.sys.model.AdmSysMenuAuthVO;
import portalxpert.adm.sys.model.AdmSysUserAuthVO;
import portalxpert.adm.sys.service.AdmSysAuthService;
import portalxpert.common.config.Constant;
import portalxpert.common.model.UserInfoVO;
import portalxpert.common.utils.CommUtil;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("admSysAuthService")
public class AdmSysAuthServiceImpl extends EgovAbstractServiceImpl implements AdmSysAuthService {
	
	@Autowired
    private AdmSysDAO admSysMapper;
    
	
	private final static Logger logger = LoggerFactory.getLogger(AdmSysAuthServiceImpl.class);
	 
    /**
     * 권한목록
     * @param AdmSysAuthVO
     * @return AdmSysAuthVO
     * @exception Exception
     */
    public List<AdmSysAuthVO> getAdmSysAuthList(AdmSysAuthVO admSysAuthVO) throws Exception {
    	try{
    		return admSysMapper.getAdmSysAuthList(admSysAuthVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
     * 권한목록 총수
     * @param AdmSysUserAuthVO
     * @return int
     * @exception Exception
     */
    public int getAdmSysAuthListCnt(AdmSysAuthVO AdmSysAuthVO) throws Exception {
    	try{
    		return admSysMapper.getAdmSysAuthListCnt(AdmSysAuthVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
     *  권한정보
     * @param AdmSysUserAuthVO
     * @return AdmSysPsnUserInfoVO
     * @exception Exception
     */
    public AdmSysAuthVO getAdmSysAuthInfo(AdmSysAuthVO admSysAuthVO)  throws Exception {
    	try{
    		return admSysMapper.getAdmSysAuthInfo(admSysAuthVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
     * 권한등록
     * @param AdmSysUserAuthVO
     * @return void
     * @exception Exception
     */
    public void insertAuth(AdmSysAuthVO admSysAuthVO, HttpSession session) throws Exception{
    	try{
    		//로그인된 User 정보 세팅
	    	UserInfoVO usrInfo = (UserInfoVO)session.getAttribute("pxLoginInfo");
	    	admSysAuthVO.setRegrId((String)usrInfo.getId());
	    	admSysAuthVO.setRegrName((String)usrInfo.getName());
	    	admSysAuthVO.setUpdrId((String)usrInfo.getId());
	    	admSysAuthVO.setUpdrName((String)usrInfo.getName());
	    	admSysAuthVO.setDelYn("N");
	    	
	    	AdmSysAuthVO admSysAuthInfo = admSysMapper.getAdmSysAuthInfo(admSysAuthVO);
	    	if(admSysAuthInfo == null){
	    		admSysMapper.insertAuth(admSysAuthVO);
	    	}else{
	    		admSysMapper.updateAuth(admSysAuthVO);
	    	}
	    	
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}   
    }        
              
    
    /**
     * 사용자 권한등록
     * @param AdmSysUserAuthVO
     * @return void
     * @exception Exception
     */
    public void insertUserAuth(AdmSysUserAuthVO admSysUserAuthVO, HttpSession session)throws Exception {
    	try{
	    	//로그인된 User 정보 세팅
	    	UserInfoVO usrInfo = (UserInfoVO)session.getAttribute("pxLoginInfo");
	    	admSysUserAuthVO.setRegrId((String)usrInfo.getId());
	    	admSysUserAuthVO.setRegrName((String)usrInfo.getName());
	    	
	    	admSysMapper.insertUserAuth(admSysUserAuthVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
     * 사용자 권한수정
     * @param AdmSysUserAuthVO
     * @return void
     * @exception Exception
     */
    public void updateUserAuth(AdmSysUserAuthVO admSysUserAuthVO, HttpSession session) throws Exception {
    	try{
	    	//로그인된 User 정보 세팅
	    	UserInfoVO usrInfo = (UserInfoVO)session.getAttribute("pxLoginInfo");
	    	admSysUserAuthVO.setUpdrId((String)usrInfo.getId());
	    	admSysUserAuthVO.setUpdrName((String)usrInfo.getName());
	    	
	    	admSysMapper.updateUserAuth(admSysUserAuthVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
     * 메뉴 권한정보
     * @param AdmSysMenuAuthVO
     * @return AdmSysMenuAuthVO
     * @exception Exception
     */
    public AdmSysMenuAuthVO getAdmSysMenuAuthInfo(AdmSysMenuAuthVO admSysMenuAuthVO) throws Exception{
    	try{
    		String authCdStr = admSysMenuAuthVO.getAuthCd(); // 다건.
    		
    		TreeMap<String, JSONObject> jsonMap = new TreeMap<String, JSONObject>();
    		for (String authCd : StringUtils.tokenizeToStringArray(authCdStr, ",")) {
    			AdmSysMenuAuthVO vo = new AdmSysMenuAuthVO();
    			vo.setAuthCd(authCd);
    			vo = admSysMapper.getAdmSysMenuAuthInfo(vo);
    			if(vo != null){
	    			JSONArray jsonArr = JSONArray.fromObject(vo.getMenuConts());
	    			for(int i = 0;i<jsonArr.size();i++){
	    				jsonMap.put(jsonArr.getJSONObject(i).getString("menuId"), jsonArr.getJSONObject(i));
	    			}
    			}
    		}
    		
    		JSONArray json = new JSONArray();
    		Set<String> keySet = jsonMap.keySet();
    		for(String key : keySet){
    			json.add(jsonMap.get(key));
    		}
    		
    		admSysMenuAuthVO.setMenuConts(json.toString());
    		return admSysMenuAuthVO;
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}   
    }
    
    /**
     * 메뉴 권한등록
     * @param AdmSysMenuAuthVO
     * @return void
     * @exception Exception
     */
    public void insertMenuAuth(AdmSysMenuAuthVO admSysMenuAuthVO, HttpSession session) throws Exception{
    	try{
    		//로그인된 User 정보 세팅
	    	UserInfoVO usrInfo = (UserInfoVO)session.getAttribute("pxLoginInfo");
	    	admSysMenuAuthVO.setRegrId((String)usrInfo.getId());
	    	admSysMenuAuthVO.setRegrName((String)usrInfo.getName());
	    	
	    	admSysMapper.insertMenuAuth(admSysMenuAuthVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}   
    }    
    
    /**
     * 메뉴 권한수정
     * @param AdmSysMenuAuthVO
     * @return void
     * @exception Exception
     */
    public void updateMenuAuth(AdmSysMenuAuthVO admSysMenuAuthVO, HttpSession session) throws Exception{
    	try{
    		//로그인된 User 정보 세팅
	    	UserInfoVO usrInfo = (UserInfoVO)session.getAttribute("pxLoginInfo");
	    	admSysMenuAuthVO.setUpdrId((String)usrInfo.getId());
	    	admSysMenuAuthVO.setUpdrName((String)usrInfo.getName());
	    	
	    	admSysMapper.updateMenuAuth(admSysMenuAuthVO);

	    	//SYSTEM 외 권한 메뉴정보 Update
	    	if(Constant.ROLE_SUPER.getVal().equals(admSysMenuAuthVO.getAuthCd())){
		    	
				JSONArray jsonArr = JSONArray.fromObject(admSysMenuAuthVO.getMenuConts());
				
				admSysMenuAuthVO.setAuthCd(Constant.ROLE_SUPER.getVal());
				List<AdmSysMenuAuthVO> listAdmSysMenuAuthInfo = admSysMapper.getAdmSysNoSystemMenuAuthInfo(admSysMenuAuthVO);
				
	    		for(AdmSysMenuAuthVO vo : listAdmSysMenuAuthInfo){
	    			JSONArray updateJsonArr = new JSONArray();
	    			if(!CommUtil.isEmpty(vo.getMenuConts())){
		    			JSONArray jsonArrSub = JSONArray.fromObject(vo.getMenuConts());
						for (int i=0; i < jsonArr.size(); i++){
							for (int j=0; j < jsonArrSub.size(); j++){

								if(jsonArr.getJSONObject(i).getInt("menuId") == jsonArrSub.getJSONObject(j).getInt("menuId")){
									updateJsonArr.add(jsonArr.getJSONObject(i));
								}
							}
						}
						admSysMenuAuthVO.setAuthCd(vo.getAuthCd());
						admSysMenuAuthVO.setMenuConts(updateJsonArr.toString());
						admSysMapper.updateMenuAuth(admSysMenuAuthVO);
		    		}
	    		}
	    	}

		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}   
    } 
    
 	
    /**
     * 권한코드 전체 목록
     * @param AdmSysAuthVO
     * @return void
     * @exception Exception
     */
	public List<AdmSysAuthVO> getAuchCodeList(AdmSysAuthVO admSysAuthVO) throws Exception{
    	try{
    		return admSysMapper.getAuchCodeList(admSysAuthVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	
	 /**
	  * Method Desciption : 권한정보 조회
	  * 
	  * @param con
	  * @return
	  * @throws ApplicationException
	  */
	 public List<AdmSysAuthVO> getAuthInfo(String userId) throws Exception
	 {
	   	try{
	   		return admSysMapper.getAuthInfo(userId);
			}catch(Exception e){
				throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
			}
	   }
}
