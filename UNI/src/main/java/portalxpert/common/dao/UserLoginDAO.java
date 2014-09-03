package portalxpert.common.dao;


import org.omg.CORBA.portable.ApplicationException;
import org.springframework.stereotype.Repository;

import portalxpert.common.model.UserInfoVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class UserLoginDAO  extends EgovAbstractMapper
{

	 /**
	 * Method Desciption : 로그인정보 조회
	 * 
	 * @param con
	 * @return
	 * @throws ApplicationException
	 */
	 public UserInfoVO getLoginInfo(String userId) throws Exception{
		 return (UserInfoVO) selectByPk("UserLoginDAO.getLoginInfo", userId);
	 }
	 
	 /**
	 * Method Desciption : 인증서 로그인정보 조회
	 * 
	 * @param con
	 * @return
	 * @throws ApplicationException
	 */
	 public UserInfoVO getLoginInfoBySsnId(String ssnId) throws Exception{
		 return (UserInfoVO) selectByPk("UserLoginDAO.getLoginInfoBySsnId", ssnId);
	 }
	 

	 


}
