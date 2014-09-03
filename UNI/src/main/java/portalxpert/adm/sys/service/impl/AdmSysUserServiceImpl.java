package portalxpert.adm.sys.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import portalxpert.adm.sys.dao.AdmSysDAO;
import portalxpert.adm.sys.model.AdmSysPsnUserInfoVO;
import portalxpert.adm.sys.model.AdmSysUserAuthVO;
import portalxpert.adm.sys.service.AdmSysUserService;
import portalxpert.common.config.Constant;
import portalxpert.common.model.UserInfoVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("admSysUserService")
public class AdmSysUserServiceImpl extends EgovAbstractServiceImpl implements AdmSysUserService {
	
	@Autowired
    private AdmSysDAO admSysMapper;
    
	
	private final static Logger logger = LoggerFactory.getLogger(AdmSysUserServiceImpl.class);
	 
    /**
     * 사용자목록
     * @param AdmSysPsnUserInfoVO
     * @return AdmSysPsnUserInfoVO
     * @exception Exception
     */
    public List<AdmSysPsnUserInfoVO> getAdmSysUserInfoList(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception {
    	try{
    		return admSysMapper.getAdmSysUserInfoList(admSysPsnUserInfoVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
     * 사용자목록 총수
     * @param AdmSysPsnUserInfoVO
     * @return int
     * @exception Exception
     */
    public int getAdmSysUserInfoListCnt(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception {
    	try{
    		return admSysMapper.getAdmSysUserInfoListCnt(admSysPsnUserInfoVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
     * 사용자정보
     * @param AdmSysPsnUserInfoVO
     * @return AdmSysPsnUserInfoVO
     * @exception Exception
     */
    public AdmSysPsnUserInfoVO getAdmSysUserInfo(AdmSysPsnUserInfoVO admSysPsnUserInfoVO)  throws Exception {
    	try{
    		return admSysMapper.getAdmSysUserInfo(admSysPsnUserInfoVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    

    
    /**
     * 사용자등록
     * @param AdmSysPsnUserInfoVO
     * @return void
     * @exception Exception
     */
    public void insertPsnUserInfo(String json, HttpSession session) throws Exception {
    	try{
    		JSONObject bbsObject = JSONObject.fromObject(json);
    		AdmSysPsnUserInfoVO admSysPsnUserInfoVO = new AdmSysPsnUserInfoVO();
    		admSysPsnUserInfoVO.setUserId(bbsObject.getString("userId"));
    		admSysPsnUserInfoVO.setUserName(bbsObject.getString("userName"));
    		admSysPsnUserInfoVO.setUserPassword(bbsObject.getString("userPassword"));
    		admSysPsnUserInfoVO.setDeptCode(bbsObject.getString("deptCode"));
    		admSysPsnUserInfoVO.setMobile(bbsObject.getString("mobile"));
    		admSysPsnUserInfoVO.setMail(bbsObject.getString("mail"));
    		
    		//로그인된 User 정보 세팅
	    	UserInfoVO usrInfo = (UserInfoVO)session.getAttribute("pxLoginInfo");
	    	admSysPsnUserInfoVO.setRegrId(usrInfo.getId());
	    	admSysPsnUserInfoVO.setRegrName(usrInfo.getName());
	    	admSysPsnUserInfoVO.setUpdrId(usrInfo.getId());
	    	admSysPsnUserInfoVO.setUpdrName(usrInfo.getName());
	    	admSysPsnUserInfoVO.setDelYn("N");
	    	
	    	
	    	
	    	
			AdmSysPsnUserInfoVO admSysUserInfo = admSysMapper.getAdmSysUserInfo(admSysPsnUserInfoVO);
	    	
	    	if(admSysUserInfo == null){
	    		admSysMapper.insertPsnUserInfo(admSysPsnUserInfoVO);
	    	}else{
	    		admSysMapper.updatePsnUserInfo(admSysPsnUserInfoVO);
	    	}
	    	
	    	//권한
	    	AdmSysUserAuthVO admSysUserAuthVO = new AdmSysUserAuthVO();
	    	admSysUserAuthVO.setUserId(admSysPsnUserInfoVO.getUserId());
	    	
	    	admSysMapper.deleteUserAuth(admSysUserAuthVO);
			JSONArray jsonArr = (JSONArray)bbsObject.get("authList");			
			for (int i=0; i < jsonArr.size(); i++)
			{
				JSONObject obj = (JSONObject)jsonArr.get(i);
				
				admSysUserAuthVO = new AdmSysUserAuthVO();
				admSysUserAuthVO.setUserId(admSysPsnUserInfoVO.getUserId());
				admSysUserAuthVO.setRegrId(usrInfo.getId());
				admSysUserAuthVO.setRegrName(usrInfo.getName());
				admSysUserAuthVO.setUpdrId(usrInfo.getId());
				admSysUserAuthVO.setUpdrName(usrInfo.getName());
				admSysUserAuthVO.setAuthCd(obj.getString("authCd"));
				admSysUserAuthVO.setDelYn("N");
				
	    		admSysMapper.insertUserAuth(admSysUserAuthVO);
			}
	    	
	  
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
     * 사용자수정
     * @param AdmSysPsnUserInfoVO
     * @return void
     * @exception Exception
     */
    public void updatePsnUserInfo(AdmSysPsnUserInfoVO admSysPsnUserInfoVO, HttpSession session) throws Exception {
    	try{
	    	//로그인된 User 정보 세팅
	    	UserInfoVO usrInfo = (UserInfoVO)session.getAttribute("pxLoginInfo");
	    	admSysPsnUserInfoVO.setUpdrId((String)usrInfo.getId());
	    	admSysPsnUserInfoVO.setUpdrName((String)usrInfo.getName());
	    	
	    	admSysMapper.updatePsnUserInfo(admSysPsnUserInfoVO);
	    	
	    	//권한
	    	AdmSysUserAuthVO admSysUserAuthVO = new AdmSysUserAuthVO();
	    	admSysUserAuthVO.setUserId(admSysPsnUserInfoVO.getUserId());
	    	admSysUserAuthVO.setRegrId(usrInfo.getId());
	    	admSysUserAuthVO.setRegrName(usrInfo.getName());
	    	admSysUserAuthVO.setUpdrId(usrInfo.getId());
	    	admSysUserAuthVO.setUpdrName(usrInfo.getName());
	    	admSysUserAuthVO.setAuthCd(admSysPsnUserInfoVO.getAuthCd());
	    	
	    	AdmSysUserAuthVO admSysUserAuthInfo = admSysMapper.getAdmSysUserAuthInfo(admSysUserAuthVO);
	    	if(admSysUserAuthInfo == null){
	    		admSysUserAuthVO.setDelYn("N");
	    		admSysMapper.insertUserAuth(admSysUserAuthVO);
	    	}else{
	    		admSysMapper.updateUserAuth(admSysUserAuthVO);
	    	}
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
     * 부서목록
     * @param AdmSysPsnUserInfoVO
     * @return AdmSysPsnUserInfoVO
     * @exception Exception
     */
    public List<AdmSysPsnUserInfoVO> getUserDeptInfoList(AdmSysPsnUserInfoVO admSysPsnUserInfoVO)  throws Exception {
    	try{
    		return admSysMapper.getUserDeptInfoList(admSysPsnUserInfoVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }

}
