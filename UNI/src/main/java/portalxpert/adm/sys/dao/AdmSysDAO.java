package portalxpert.adm.sys.dao;

import java.util.List;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.stereotype.Repository;

import portalxpert.adm.gen.model.AdmGenLinkVO;
import portalxpert.adm.sys.model.AdmSysAuthVO;
import portalxpert.adm.sys.model.AdmSysBbsNotiApndFileVO;
import portalxpert.adm.sys.model.AdmSysMenuAuthVO;
import portalxpert.adm.sys.model.AdmSysPsnUserInfoVO;
import portalxpert.adm.sys.model.AdmSysTagCloudInfoVO;
import portalxpert.adm.sys.model.AdmSysUserAuthVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;


@Repository
public class AdmSysDAO extends EgovAbstractMapper {
	
	/**
	 * 동영상관리 목록
	 * @param AdmSysBbsNotiApndFileVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmSysBbsNotiApndFileVO> getAdmSysMainMovieList(AdmSysBbsNotiApndFileVO admSysBbsNotiApndFileVO) throws Exception{
    	return (List<AdmSysBbsNotiApndFileVO>)list("AdmSysDAO.getAdmSysMainMovieList", admSysBbsNotiApndFileVO);
    }
    
    /**
	 * 동영상관리 목록 Count
	 * @param AdmSysBbsNotiApndFileVO
	 * @return int
	 * @exception Exception
	 */
    public int getAdmSysMainMovieCnt(AdmSysBbsNotiApndFileVO admSysBbsNotiApndFileVO) throws Exception{
    	return (Integer) selectByPk("AdmSysDAO.AdmSysBbsNotiApndFileVO", admSysBbsNotiApndFileVO);
    }
    
    /**
	 * 동영상관리 수정
	 * @param AdmSysBbsNotiApndFileVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmSysMainMovie(AdmSysBbsNotiApndFileVO admSysBbsNotiApndFileVO) throws Exception{
    	update("AdmSysDAO.updateAdmSysMainMovie", admSysBbsNotiApndFileVO);
    }
    
	/**
	 * 개인쿼터관리 목록
	 * @param AdmSysPsnUserInfoVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmSysPsnUserInfoVO> getAdmSysPsnQtyList(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception{
    	return (List<AdmSysPsnUserInfoVO>)list("AdmSysDAO.getAdmSysPsnQtyList", admSysPsnUserInfoVO);
    }
    
    /**
	 * 개인쿼터관리 목록 Count
	 * @param AdmSysPsnUserInfoVO
	 * @return int
	 * @exception Exception
	 */
    public int getAdmSysPsnQtyCnt(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception{
    	return (Integer) selectByPk("AdmSysDAO.getAdmSysPsnQtyCnt", admSysPsnUserInfoVO);
    }
    
    /**
	 * 개인쿼터관리 쿼터 수정
	 * @param AdmSysPsnUserInfoVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmSysPsnQty(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception{
    	update("AdmSysDAO.updateAdmSysPsnQty", admSysPsnUserInfoVO);
    }
    
	/**
	 * SMS쿼터관리 목록
	 * @param AdmSysPsnUserInfoVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmSysPsnUserInfoVO> getAdmSysSmsQtyList(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception{
    	return (List<AdmSysPsnUserInfoVO>)list("AdmSysDAO.getAdmSysSmsQtyList", admSysPsnUserInfoVO);
    }
    
    /**
	 * SMS쿼터관리 목록 Count
	 * @param AdmSysPsnUserInfoVO
	 * @return int
	 * @exception Exception
	 */
    public int getAdmSysSmsQtyCnt(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception{
    	return (Integer) selectByPk("AdmSysDAO.getAdmSysSmsQtyCnt", admSysPsnUserInfoVO);
    }
    
    /**
	 * SMS쿼터관리 쿼터 수정
	 * @param AdmSysPsnUserInfoVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmSysSmsQty(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception{
    	update("AdmSysDAO.updateAdmSysSmsQty", admSysPsnUserInfoVO);
    }
    
	/**
	 * 태그클라우드관리 목록
	 * @param AdmSysTagCloudInfoVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmSysTagCloudInfoVO> getAdmSysTagCloudList(AdmSysTagCloudInfoVO admSysTagCloudInfoVO) throws Exception{
    	return (List<AdmSysTagCloudInfoVO>)list("AdmSysDAO.getAdmSysTagCloudList", admSysTagCloudInfoVO);
    }
    
    /**
	 * 태그클라우드관리 목록 Count
	 * @param AdmSysTagCloudInfoVO
	 * @return int
	 * @exception Exception
	 */
    public int getAdmSysTagCloudCnt(AdmSysTagCloudInfoVO admSysTagCloudInfoVO) throws Exception{
    	return (Integer) selectByPk("AdmSysDAO.getAdmSysTagCloudCnt", admSysTagCloudInfoVO);
    }
    
    /**
	 * 태그클라우드관리 단건
	 * @param AdmSysTagCloudInfoVO
	 * @return AdmSysTagCloudInfoVO
	 * @exception Exception
	 */
    public AdmSysTagCloudInfoVO getAdmSysTagCloud(AdmSysTagCloudInfoVO admSysTagCloudInfoVO) throws Exception{
    	return (AdmSysTagCloudInfoVO) selectByPk("AdmSysDAO.getAdmSysTagCloud", admSysTagCloudInfoVO);
    }
    
    /**
	 * 태그클라우드관리 링크카테고리리스트 combo
	 * @param 
	 * @return List
	 * @exception Exception
	 */
    public List<AdmGenLinkVO> getAdmSysTagCloudLinkCtlgList() throws Exception{
    	return (List<AdmGenLinkVO>)list("AdmSysDAO.getAdmSysTagCloudLinkCtlgList", null);
    }
    
    /**
	 * 태그클라우드관리 링크리스트 combo
	 * @param AdmSysTagCloudInfoVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmGenLinkVO> getAdmSysTagCloudLinkList(AdmSysTagCloudInfoVO admSysTagCloudInfoVO) throws Exception{
    	return (List<AdmGenLinkVO>)list("AdmSysDAO.getAdmSysTagCloudLinkList", admSysTagCloudInfoVO);
    }
    
    /**
	 * 태그클라우드관리 등록
	 * @param AdmSysTagCloudInfoVO
	 * @return
	 * @exception Exception
	 */
    public void insertAdmSysTagCloud(AdmSysTagCloudInfoVO admSysTagCloudInfoVO) throws Exception{
    	insert("AdmSysDAO.insertAdmSysTagCloud", admSysTagCloudInfoVO);
    }
    
    /**
	 * 태그클라우드관리 수정
	 * @param AdmSysTagCloudInfoVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmSysTagCloud(AdmSysTagCloudInfoVO admSysTagCloudInfoVO) throws Exception{
    	update("AdmSysDAO.updateAdmSysTagCloud", admSysTagCloudInfoVO);
    }
    
    /**
	 * 태그클라우드관리 삭제
	 * @param AdmSysTagCloudInfoVO
	 * @return
	 * @exception Exception
	 */
    public void deleteAdmSysTagCloud(AdmSysTagCloudInfoVO admSysTagCloudInfoVO) throws Exception{
    	delete("AdmSysDAO.deleteAdmSysTagCloud", admSysTagCloudInfoVO);
    }
    
    
    
    //********************************************** 신규추가 ****************************************
    
    /**
     * 사용자목록
     * @param AdmSysPsnUserInfoVO
     * @return AdmSysPsnUserInfoVO
     * @exception Exception
     */
    public List<AdmSysPsnUserInfoVO> getAdmSysUserInfoList(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception{
    	return (List<AdmSysPsnUserInfoVO>)list("AdmSysDAO.getAdmSysUserInfoList", admSysPsnUserInfoVO);
    }
    
    /**
     * 사용자목록 총수
     * @param AdmSysPsnUserInfoVO
     * @return int
     * @exception Exception
     */
    public int getAdmSysUserInfoListCnt(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception{
    	return (Integer) selectByPk("AdmSysDAO.getAdmSysUserInfoListCnt", admSysPsnUserInfoVO);
    }
    
    /**
     * 사용자정보
     * @param AdmSysPsnUserInfoVO
     * @return AdmSysPsnUserInfoVO
     * @exception Exception
     */
    public AdmSysPsnUserInfoVO getAdmSysUserInfo(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception{
    	return (AdmSysPsnUserInfoVO) selectByPk("AdmSysDAO.getAdmSysUserInfo", admSysPsnUserInfoVO);
    }
    
    /**
     * 사용자등록
     * @param AdmSysPsnUserInfoVO
     * @return void
     * @exception Exception
     */
    public void insertPsnUserInfo(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception{
    	insert("AdmSysDAO.insertPsnUserInfo", admSysPsnUserInfoVO);
    }
    
    /**
     * 사용자수정
     * @param AdmSysPsnUserInfoVO
     * @return void
     * @exception Exception
     */
    public void updatePsnUserInfo(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception{
    	update("AdmSysDAO.updatePsnUserInfo", admSysPsnUserInfoVO);
    }
    
    /**
     *  권한목록
     * @param AdmSysUserAuthVO
     * @return AdmSysPsnUserInfoVO
     * @exception Exception
     */
    public List<AdmSysAuthVO> getAdmSysAuthList(AdmSysAuthVO admSysAuthVO) throws Exception{
    	return (List<AdmSysAuthVO>)list("AdmSysDAO.getAdmSysAuthList", admSysAuthVO);
    }
    
    /**
     *  권한목록 총수
     * @param AdmSysUserAuthVO
     * @return int
     * @exception Exception
     */
    public int getAdmSysAuthListCnt(AdmSysAuthVO admSysAuthVO) throws Exception{
    	return (Integer) selectByPk("AdmSysDAO.getAdmSysAuthListCnt", admSysAuthVO);
    }
    
    /**
     *  권한정보
     * @param AdmSysUserAuthVO
     * @return AdmSysPsnUserInfoVO
     * @exception Exception
     */
    public AdmSysAuthVO getAdmSysAuthInfo(AdmSysAuthVO admSysAuthVO) throws Exception{
    	return (AdmSysAuthVO) selectByPk("AdmSysDAO.getAdmSysAuthInfo", admSysAuthVO);
    }
    
    /**
     * 권한등록
     * @param AdmSysUserAuthVO
     * @return void
     * @exception Exception
     */
    public void insertAuth(AdmSysAuthVO admSysAuthVO) throws Exception{
    	insert("AdmSysDAO.insertAuth", admSysAuthVO);
    }
    
    /**
     * 권한수정
     * @param AdmSysUserAuthVO
     * @return void
     * @exception Exception
     */
    public void updateAuth(AdmSysAuthVO admSysAuthVO) throws Exception{
    	update("AdmSysDAO.updateAuth", admSysAuthVO);
    }
    
    /**
     * 사용자 권한정보
     * @param AdmSysUserAuthVO
     * @return AdmSysPsnUserInfoVO
     * @exception Exception
     */
    public AdmSysUserAuthVO getAdmSysUserAuthInfo(AdmSysUserAuthVO admSysUserAuthVO) throws Exception{   
    	return (AdmSysUserAuthVO) selectByPk("AdmSysDAO.getAdmSysUserAuthInfo", admSysUserAuthVO);
    }
    
    /**
     * 사용자 권한등록
     * @param AdmSysUserAuthVO
     * @return void
     * @exception Exception
     */
    public void insertUserAuth(AdmSysUserAuthVO admSysUserAuthVO) throws Exception{
    	insert("AdmSysDAO.insertUserAuth", admSysUserAuthVO);
    }
    
    /**
     * 사용자 권한수정
     * @param AdmSysUserAuthVO
     * @return void
     * @exception Exception
     */
    public void updateUserAuth(AdmSysUserAuthVO admSysUserAuthVO) throws Exception{
    	update("AdmSysDAO.updateUserAuth", admSysUserAuthVO);
    }
    
    /**
     * 메뉴 권한정보
     * @param AdmSysMenuAuthVO
     * @return AdmSysMenuAuthVO
     * @exception Exception
     */
    public AdmSysMenuAuthVO getAdmSysMenuAuthInfo(AdmSysMenuAuthVO admSysMenuAuthVO) throws Exception{
    	return (AdmSysMenuAuthVO) selectByPk("AdmSysDAO.getAdmSysMenuAuthInfo", admSysMenuAuthVO);
    }
    
    /**
     * 메뉴 권한정보
     * @param AdmSysMenuAuthVO
     * @return AdmSysMenuAuthVO
     * @exception Exception
     */
    public List<AdmSysMenuAuthVO> getAdmSysNoSystemMenuAuthInfo(AdmSysMenuAuthVO admSysMenuAuthVO) throws Exception{ 
    	return (List<AdmSysMenuAuthVO>)list("AdmSysDAO.getAdmSysNoSystemMenuAuthInfo", admSysMenuAuthVO);
    }
    
    /**
     * 메뉴 권한등록
     * @param AdmSysMenuAuthVO
     * @return void
     * @exception Exception
     */
    public void insertMenuAuth(AdmSysMenuAuthVO admSysMenuAuthVO) throws Exception{
    	insert("AdmSysDAO.insertMenuAuth", admSysMenuAuthVO);
    }
    
    /**
     * 메뉴 권한수정
     * @param AdmSysMenuAuthVO
     * @return void
     * @exception Exception
     */
    public void updateMenuAuth(AdmSysMenuAuthVO admSysMenuAuthVO) throws Exception{
    	update("AdmSysDAO.updateMenuAuth", admSysMenuAuthVO);
    }
    
    /**
     * 부서목록
     * @param AdmSysPsnUserInfoVO
     * @return AdmSysPsnUserInfoVO
     * @exception Exception
     */
    public List<AdmSysPsnUserInfoVO> getUserDeptInfoList(AdmSysPsnUserInfoVO admSysPsnUserInfoVO) throws Exception{
    	return (List<AdmSysPsnUserInfoVO>)list("AdmSysDAO.getUserDeptInfoList", admSysPsnUserInfoVO);
    }
    
    /**
     * 권한코드 전체 목록
     * @param AdmSysAuthVO
     * @return void
     * @exception Exception
     */
	public List<AdmSysAuthVO> getAuchCodeList(AdmSysAuthVO admSysAuthVO) throws Exception{
		return (List<AdmSysAuthVO>)list("AdmSysDAO.getAuchCodeList", admSysAuthVO);
	}
	
	 /**
	  * Method Desciption : 권한정보 조회
	  * 
	  * @param con
	  * @return
	  * @throws ApplicationException
	  */
	 public List<AdmSysAuthVO> getAuthInfo(String userId) throws Exception{
		 return (List<AdmSysAuthVO>)list("AdmSysDAO.getAuthInfo", userId);
	 }

    /**
     * 사용자 권한삭제
     * @param AdmSysUserAuthVO
     * @return void
     * @exception Exception
     */
	public void deleteUserAuth(AdmSysUserAuthVO admSysUserAuthVO){
		delete("AdmSysDAO.deleteUserAuth", admSysUserAuthVO);
	}
}
