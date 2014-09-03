package portalxpert.common.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import portalxpert.common.config.Constant;
import portalxpert.common.dao.UserLoginDAO;
import portalxpert.common.model.UserInfoVO;
import portalxpert.common.service.UserLoginService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("userLoginService")
public class UserLoginServiceImpl extends EgovAbstractServiceImpl implements UserLoginService
{
	@Autowired
    private UserLoginDAO userLoginMapper;
	
    private final static Logger logger = LoggerFactory.getLogger(UserLoginServiceImpl.class);
    

    /** 
	 * 로그인 정보 조회
	 * @param String : userId
	 * @return UserInfoVO 
	 * @exception Exception
	 */
    public UserInfoVO getLoginInfo(String userId) throws Exception 
    {
    	try{
    		return userLoginMapper.getLoginInfo(userId);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /** 
	 * 인증서 로그인 정보 조회
	 * @param String : userId
	 * @return UserInfoVO 
	 * @exception Exception
	 */
    public UserInfoVO getLoginInfoBySsnId(String ssnId) throws Exception 
    {
    	try{
    		return userLoginMapper.getLoginInfoBySsnId(ssnId);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    

    
	
	

}
