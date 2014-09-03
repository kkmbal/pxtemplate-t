package portalxpert.common.service;



import portalxpert.common.model.UserInfoVO;


public interface UserLoginService {

	 /**
	 * 로그인 정보 조회
	 * @param UserInfoVO
	 * @return
	 * @exception Exception
	 */
   public UserInfoVO getLoginInfo(String userId) throws Exception;

	 /**
	 * 인증서 로그인 정보 조회
	 * @param UserInfoVO
	 * @return
	 * @exception Exception
	 */
  public UserInfoVO getLoginInfoBySsnId(String ssnId) throws Exception;
	

    
}
