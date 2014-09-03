package portalxpert.adm.gen.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import portalxpert.adm.gen.dao.AdmGenManageDAO;
import portalxpert.adm.gen.model.AdmGenContentManageVO;
import portalxpert.adm.gen.service.AdmGenContentManageService;
import portalxpert.common.config.Constant;
import portalxpert.common.model.UserInfoVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("admGenContentManageService")
public class AdmGenContentManageServiceImpl extends EgovAbstractServiceImpl implements AdmGenContentManageService {
	
	@Autowired
    private AdmGenManageDAO admGenManageMapper;
    
	
	private final static Logger logger = LoggerFactory.getLogger(AdmGenContentManageServiceImpl.class);
    
    /**
	 * 콘텐츠조회 목록
	 * @param AdmGenContentManageVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmGenContentManageVO> getAdmGenContentManageList(AdmGenContentManageVO admGenContentManageVO) throws Exception {
    	try{
    		return admGenManageMapper.getAdmGenContentManageList(admGenContentManageVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
	 * 콘텐츠조회 목록 Count
	 * @param AdmGenContentManageVO
	 * @return int
	 * @exception Exception
	 */
    public int getAdmGenContentManageCnt(AdmGenContentManageVO admGenContentManageVO) throws Exception {
    	try{
    		return admGenManageMapper.getAdmGenContentManageCnt(admGenContentManageVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
	 * 콘텐츠단건 조회
	 * @param AdmGenContentManageVO
	 * @return AdmGenContentManageVO
	 * @exception Exception
	 */
    public AdmGenContentManageVO getAdmGenContentManage(AdmGenContentManageVO admGenContentManageVO) throws Exception {
        try{
        	return admGenManageMapper.getAdmGenContentManage(admGenContentManageVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
	 * 콘텐츠 등록
	 * @param AdmGenContentManageVO
	 * @return
	 * @exception Exception
	 */
    @Transactional
    public void insertAdmGenContentManage(AdmGenContentManageVO admGenContentManageVO, HttpSession session) throws Exception {
    	try{
	    	//로그인된 User 정보 세팅
	    	UserInfoVO usrInfo = (UserInfoVO)session.getAttribute("pxLoginInfo");
			admGenContentManageVO.setUserId((String)usrInfo.getId());
			admGenContentManageVO.setUserName((String)usrInfo.getName());
			admGenManageMapper.insertAdmGenContentManage(admGenContentManageVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
	 * 콘텐츠 수정
	 * @param AdmGenContentManageVO
	 * @return
	 * @exception Exception
	 */
    @Transactional
    public void updateAdmGenContentManage(AdmGenContentManageVO admGenContentManageVO, HttpSession session) throws Exception {
    	try{
	    	//로그인된 User 정보 세팅
	    	UserInfoVO usrInfo = (UserInfoVO)session.getAttribute("pxLoginInfo");
	    	admGenContentManageVO.setUserId((String)usrInfo.getId());
	    	admGenContentManageVO.setUserName((String)usrInfo.getName());
	    	
	    	admGenManageMapper.updateAdmGenContentManage(admGenContentManageVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
	 * 콘텐츠 삭제
	 * @param AdmGenContentManageVO
	 * @return
	 * @exception Exception
	 */
    @Transactional
    public void deleteAdmGenContentManage(AdmGenContentManageVO admGenContentManageVO) throws Exception {
    	try{
    		admGenManageMapper.deleteAdmGenContentManage(admGenContentManageVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
}
