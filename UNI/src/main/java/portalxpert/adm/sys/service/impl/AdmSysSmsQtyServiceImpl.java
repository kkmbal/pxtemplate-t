package portalxpert.adm.sys.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import portalxpert.adm.sys.dao.AdmSysDAO;
import portalxpert.adm.sys.model.AdmSysPsnUserInfoVO;
import portalxpert.adm.sys.service.AdmSysSmsQtyService;
import portalxpert.common.config.Constant;
import portalxpert.common.model.UserInfoVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.property.EgovPropertyService;


@Service("admSysSmsQtyService")
public class AdmSysSmsQtyServiceImpl  extends EgovAbstractServiceImpl implements AdmSysSmsQtyService
{
	
	@Autowired
    private AdmSysDAO admSysMapper;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    private final static Logger logger = LoggerFactory.getLogger(AdmSysSmsQtyServiceImpl.class);
    
    /**
	 * SMS쿼터관리 목록
	 * @param AdmSysPsnUserInfoVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmSysPsnUserInfoVO> getAdmSysSmsQtyList(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception {
        try{
        	return admSysMapper.getAdmSysSmsQtyList(admSysPsnUserInfoVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
	 * SMS쿼터관리 목록 Count
	 * @param AdmSysPsnUserInfoVO
	 * @return int
	 * @exception Exception
	 */
    public int getAdmSysSmsQtyCnt(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception {
        try{
        	return admSysMapper.getAdmSysSmsQtyCnt(admSysPsnUserInfoVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
	 * SMS쿼터관리 쿼터 수정
	 * @param AdmSysPsnUserInfoVO
	 * @return
	 * @exception Exception
	 */
    @Transactional
    public void updateAdmSysSmsQty(AdmSysPsnUserInfoVO admSysPsnUserInfoVO, HttpSession session) throws Exception {
    	try{
	    	//로그인된 User 정보 세팅
	    	UserInfoVO usrInfo = (UserInfoVO)session.getAttribute("pxLoginInfo");
	    	admSysPsnUserInfoVO.setUpdrId((String)usrInfo.getId());
	    	admSysPsnUserInfoVO.setUpdrName((String)usrInfo.getName());
	    	
	    	admSysMapper.updateAdmSysSmsQty(admSysPsnUserInfoVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
}
