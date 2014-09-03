package portalxpert.adm.banner.dao;

import java.util.List;

import kr.go.uni.sample.model.SampleVO;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.stereotype.Repository;

import portalxpert.adm.banner.model.AdmBannerApndFileVO;
import portalxpert.adm.banner.model.AdmBannerVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;




@Repository
public class AdmBannerDAO extends EgovAbstractMapper{
	
	
	/**
	 * Method Desciption : 홍보배너목록조회
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	@SuppressWarnings("unchecked")
	public List<AdmBannerVO> getAdmBannerList(AdmBannerVO admBannerVO) throws Exception{
		return (List<AdmBannerVO>)list("AdmBannerDAO.getAdmBannerList", admBannerVO);
	}
	  
	
	/**
	 * Method Desciption : 홍보배너 조회 건수
	 *  
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	 public int getAdmBannerListToCnt(AdmBannerVO admBannerVO) throws Exception{
		 return (Integer) selectByPk("AdmBannerDAO.getAdmBannerListToCnt", admBannerVO);
	 }
		 
	 
	 /**
	 * Method Desciption : 홍보배너 상세조회 
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	 public AdmBannerVO getAdmBanner(AdmBannerVO admBannerVO) throws Exception{
		 return (AdmBannerVO) selectByPk("AdmBannerDAO.getAdmBanner", admBannerVO);
	 }
		 
	 
	/**
	 * Method Desciption : 홍보 배너 이미지 조회 
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	public List<AdmBannerVO> getAdmBannerAppendImg(AdmBannerApndFileVO admBannerVO) throws Exception{
		return (List<AdmBannerVO>)list("AdmBannerDAO.getAdmBannerAppendImg", admBannerVO);
	}
		  
		
	/**
	 * Method Desciption : 홍보 배너등록
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	public void insertAdmBanner(AdmBannerVO admBannerVO) throws Exception{
		insert("AdmBannerDAO.insertAdmBanner", admBannerVO);
	}
		  
	/**
	 * Method Desciption : 홍보 배너이미지등록
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	public void insertAdmBannerAppendImg(AdmBannerApndFileVO admBannerVO) throws Exception{
		insert("AdmBannerDAO.insertAdmBannerAppendImg", admBannerVO);
	}
	
	/**
	 * Method Desciption : 홍보배너수정
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */	
	public void updateAdmBanner(AdmBannerVO admBannerVO) throws Exception{
		update("AdmBannerDAO.updateAdmBanner", admBannerVO);
	}
	
	
	/**
	 * Method Desciption : 홍보배너삭제
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */	
	public int deleteAdmBanner(AdmBannerVO admBannerVO) throws Exception{
		return delete("AdmBannerDAO.deleteAdmBanner", admBannerVO);
	}
	
	/**
	 * Method Desciption : 홍보배너이미지삭제
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */	
	public int deleteAdmBannerAppendImg(AdmBannerVO admBannerVO) throws Exception{
		return delete("AdmBannerDAO.deleteAdmBannerAppendImg", admBannerVO);
	}



}
