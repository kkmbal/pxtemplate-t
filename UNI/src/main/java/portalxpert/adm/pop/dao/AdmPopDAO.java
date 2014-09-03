package portalxpert.adm.pop.dao;

import java.util.List;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.stereotype.Repository;

import portalxpert.adm.pop.model.AdmPopApndFileVO;
import portalxpert.adm.pop.model.AdmPopUserMap;
import portalxpert.adm.pop.model.AdmPopVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class AdmPopDAO extends EgovAbstractMapper {
	
	
	/**
	 * Method Desciption : 팝업목록조회
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	public List<AdmPopVO> getAdmPopList(AdmPopVO admPopVO) throws Exception{
		return (List<AdmPopVO>)list("AdmPopDAO.getAdmPopList", admPopVO);
	}
	  
	
	/**
	 * Method Desciption : 팝업 조회 건수
	 *  
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	 public int getAdmPopListToCnt(AdmPopVO admPopVO) throws Exception{
		 return (Integer) selectByPk("AdmPopDAO.getAdmPopListToCnt", admPopVO);
	 }
		 
	 
	 /**
	 * Method Desciption : 팝업 상세조회 
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	 public AdmPopVO getAdmPop(AdmPopVO admPopVO) throws Exception{
		 return (AdmPopVO) selectByPk("AdmPopDAO.getAdmPop", admPopVO);
	 }
		 
	 
	/**
	 * Method Desciption : 홍보 배너 이미지 조회 
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	public List<AdmPopVO> getAdmPopAppendImg(AdmPopApndFileVO admPopVO) throws Exception{
		return (List<AdmPopVO>)list("AdmPopDAO.getAdmPopAppendImg", admPopVO);
	}
		  
		
	/**
	 * Method Desciption : 홍보 배너등록
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	public void insertAdmPop(AdmPopVO admPopVO) throws Exception{
		insert("AdmPopDAO.insertAdmPop", admPopVO);
	}
		  
	/**
	 * Method Desciption : 홍보 배너이미지등록
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	public void insertAdmPopAppendImg(AdmPopApndFileVO admPopVO) throws Exception{
		insert("AdmPopDAO.insertAdmPopAppendImg", admPopVO);
	}
	
	/**
	 * Method Desciption : 팝업수정
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */	
	public void updateAdmPop(AdmPopVO admPopVO) throws Exception{
		update("AdmPopDAO.updateAdmPop", admPopVO);
	}
	
	
	/**
	 * Method Desciption : 팝업삭제
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */	
	public int deleteAdmPop(AdmPopVO admPopVO) throws Exception{
		return delete("AdmPopDAO.deleteAdmPop", admPopVO);
	}
	
	/**
	 * Method Desciption : 팝업이미지삭제
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */	
	public int deleteAdmPopAppendImg(AdmPopVO admPopVO) throws Exception{
		return delete("AdmPopDAO.deleteAdmPopAppendImg", admPopVO);
	}

	/**
	 * Method Desciption : 팝업공개대상삭제
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */	
	public void deleteAdmPopUserMap(AdmPopVO admPopVO) throws Exception{
		delete("AdmPopDAO.deleteAdmPopUserMap", admPopVO);
	}

	/**
	 * Method Desciption : 팝업공개대상등록
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */	
	public void insertAdmPopUserMap(AdmPopUserMap vo) throws Exception{
		insert("AdmPopDAO.insertAdmPopUserMap", vo);
	}

	/**
	 * Method Desciption : 팝업공개대상조회
	 * 
	 * @param con
	 * @param box
	 * @return
	 * @throws ApplicationException
	 */
	public List<AdmPopUserMap> getAdmPopUserMapList(AdmPopVO admPopVO) throws Exception{
		return (List<AdmPopUserMap>)list("AdmPopDAO.getAdmPopUserMapList", admPopVO);
	}

}
