package portalxpert.adm.main.service.impl;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import portalxpert.adm.main.dao.AdmMainDAO;
import portalxpert.adm.main.model.AdmMainVO;
import portalxpert.adm.main.service.AdmMainService;
import portalxpert.common.config.Constant;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("admMainService")
public class AdmMainServiceImpl extends EgovAbstractServiceImpl implements AdmMainService {
	
	@Autowired
    private AdmMainDAO admMainMapper;

    private final static Logger logger = LoggerFactory.getLogger(AdmMainServiceImpl.class);
    
    /**
     * 선택안된 컨텐츠 조회
     * @author crossent
     */
    public List getUnselectContentList(AdmMainVO amVO) throws Exception {
    	try{
    		return admMainMapper.getUnselectContentList(amVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
	
    /**
     * 필수 컨텐츠 조회
     * @author crossent
     */
	public List getMandatoryContentList(AdmMainVO amVO) throws Exception {
		try{
			return admMainMapper.getMandatoryContentList(amVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
	
	/**
	 * 기본 컨텐츠 조회
     * @author crossent
	 */
	public List getDefaultContentList(AdmMainVO amVO) throws Exception {
		try{
			return admMainMapper.getDefaultContentList(amVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
	
	/**
	 * 선택된 컨텐츠 저장 처리
     * @author crossent
	 */
	public String setSelectContent(String json, AdmMainVO amVO) throws Exception {
	    	
		AdmMainVO admVO = new AdmMainVO();
		AdmMainVO admVO2 = new AdmMainVO();
		
    	try {
			
			JSONObject contentObject = JSONObject.fromObject(json);
			JSONArray jsonArr = (JSONArray) contentObject.get("mandatoryContentList");
			JSONArray jsonArr2 = (JSONArray) contentObject.get("defaultContentList");
			
			admMainMapper.deleteStandardContent(amVO);
			
			if (jsonArr.size() > 0) {
				for (int i=0; i < jsonArr.size(); i++) {
					JSONObject obj = (JSONObject) jsonArr.get(i);	
					
					admVO.setUserId(amVO.getUserId());
					admVO.setUserName(amVO.getUserName());
					admVO.setStndCntsSeq(i+1);
					admVO.setCntsTp(amVO.getCntsTp());
					admVO.setCntsId((String)obj.get("cntsId"));
					admVO.setMndtYn("Y");
					
					admMainMapper.insertStandardContent(admVO);			
				}
			}
			
			if (jsonArr2.size() > 0) {
				for (int j=0; j < jsonArr2.size(); j++) {
					JSONObject obj2 = (JSONObject) jsonArr2.get(j);	
				
					admVO2.setUserId(amVO.getUserId());
					admVO2.setUserName(amVO.getUserName());
					admVO2.setStndCntsSeq(j+1+jsonArr.size());
					admVO2.setCntsTp(amVO.getCntsTp());
					admVO2.setCntsId((String)obj2.get("cntsId"));
					admVO2.setMndtYn("D");
					
					admMainMapper.insertStandardContent(admVO2);			
				}
			}
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
			
		return "OK";
    }
	
	/**
	 * 필수 게시판 조회
     * @author crossent
	 */
	public List getMandatoryBoardList(AdmMainVO amVO) throws Exception {
		try{
			return admMainMapper.getMandatoryBoardList(amVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 기본 게시판 조회
     * @author crossent
	 */
	public List getDefaultBoardList(AdmMainVO amVO) throws Exception {
		try{
			return admMainMapper.getDefaultBoardList(amVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 선택된 게시판 저장 처리
     * @author crossent
	 */
	public String setSelectBoard(String json, AdmMainVO amVO) throws Exception {
		
		AdmMainVO admVO = new AdmMainVO();
		AdmMainVO admVO2 = new AdmMainVO();
    	
		try {
			
    		JSONObject boardObject = JSONObject.fromObject(json);
			JSONArray jsonArr = (JSONArray) boardObject.get("mandatoryBoardList");
			JSONArray jsonArr2 = (JSONArray) boardObject.get("defaultBoardList");
			
			admMainMapper.deleteStandardBoard(amVO);
			
			if (jsonArr.size() > 0) {
				for (int i=0; i < jsonArr.size(); i++) {
					JSONObject obj = (JSONObject) jsonArr.get(i);	
				
					admVO.setUserId(amVO.getUserId());
					admVO.setUserName(amVO.getUserName());
					admVO.setStndBoardSeq(i+1);
					admVO.setBoardId((String)obj.get("boardId"));
					admVO.setBoardName((String)obj.get("boardName"));
					admVO.setBoardUseDiv(amVO.getBoardUseDiv());
					admVO.setMndtYn("Y");
					
					admMainMapper.insertStandardBoard(admVO);		
				}
			}
			
			if (jsonArr2.size() > 0) {
				for (int j=0; j < jsonArr2.size(); j++) {
					JSONObject obj2 = (JSONObject) jsonArr2.get(j);	
				
					admVO2.setUserId(amVO.getUserId());
					admVO2.setUserName(amVO.getUserName());
					admVO2.setStndBoardSeq(j+1+jsonArr.size());
					admVO2.setBoardId((String)obj2.get("boardId"));
					admVO2.setBoardName((String)obj2.get("boardName"));
					admVO2.setBoardUseDiv(amVO.getBoardUseDiv());
					admVO2.setMndtYn("D");
					
					admMainMapper.insertStandardBoard(admVO2);		
				}
			}
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
		
		return "OK";
	}
	
	/**
	 * 업무데스크 카테고리 조회
     * @author crossent
	 */
	public List getWorkDeskCategoryList() throws Exception {
		try{
			return admMainMapper.getWorkDeskCategoryList();
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 업무데스크 카테고리별 항목 조회
     * @author crossent
	 */
	public List getWorkDeskList() throws Exception {
		try{
			return admMainMapper.getWorkDeskList();
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 업무데스크 건수
     * @author crossent
	 */
	public int getWorkDeskCnt() throws Exception {
		try{
			return admMainMapper.getWorkDeskCnt();
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 업무데스크 저장 처리
     * @author crossent
	 */
	public String setSelectWorkDesk(String json, AdmMainVO amVO) throws Exception {
		
		AdmMainVO admVO = new AdmMainVO();
    	
		try {
			
			JSONObject workDeskObject = JSONObject.fromObject(json);
			JSONArray jsonArr = (JSONArray)workDeskObject.get("selectedWorkDesk");			
			
			admMainMapper.updateWorkDeskReset();
			
			for (int i=0; i < jsonArr.size(); i++) {
				JSONObject obj = (JSONObject)jsonArr.get(i);	
				
				admVO.setUserId(amVO.getUserId());
				admVO.setUserName(amVO.getUserName());
				admVO.setLinkCatId((String)obj.get("linkCatId"));
				admVO.setLinkCd((String)obj.get("linkCd"));
				admVO.setMainDspGb("Y");
				
				admMainMapper.updateWorkDesk(admVO);			
			}
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
		
		return "OK";
	}
	
}
