package portalxpert.adm.gen.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import portalxpert.adm.gen.model.AdmGenCodeManageVO;
import portalxpert.adm.gen.model.AdmGenContentManageVO;
import portalxpert.adm.gen.model.AdmGenLinkVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class AdmGenManageDAO extends EgovAbstractMapper {

	/**
	 * 상위코드 목록조회
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	public List<AdmGenCodeManageVO> getAdmGenCommonLCodeList(AdmGenCodeManageVO admGenCodeManageVO){
		return (List<AdmGenCodeManageVO>)list("AdmGenManageDAO.getAdmGenCommonLCodeList", admGenCodeManageVO);
	}
	
    /**
	 * 상위코드 목록 총건수조회
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 글 총 개수
	 * @exception
	 */
	public int getAdmGenCommonListTotCnt(AdmGenCodeManageVO admGenCodeManageVO){
		return (Integer) selectByPk("AdmGenManageDAO.getAdmGenCommonListTotCnt", admGenCodeManageVO);
	}
    
	/**
	 * 상위코드 중복 여부 확인
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 코드중복여부확인(0/1)
	 * @exception
	 */
	public int getAdmGenCheckCodeCdCnt(String checkCd){
		return (Integer) selectByPk("AdmGenManageDAO.getAdmGenCheckCodeCdCnt", checkCd);
	}

	/**
	 * 상위코드 상세조회
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 상위코드 상세정보
	 * @exception
	 */
	public AdmGenCodeManageVO getAdmGenCommonLCodeOne(AdmGenCodeManageVO admGenCodeManageVO){
		return (AdmGenCodeManageVO) selectByPk("AdmGenManageDAO.getAdmGenCommonLCodeOne", admGenCodeManageVO);
	}

	/**
	 * 상위코드 등록
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 상위코드 등록 성공여부
	 * @exception
	 */
	public int insertAdmGenCommonLCode(AdmGenCodeManageVO admGenCodeManageVO){
		return insert("AdmGenManageDAO.insertAdmGenCommonLCode", admGenCodeManageVO);
	}
	
	/**
	 * 상위코드 수정
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 상위코드 수정 성공여부
	 * @exception
	 */
	public int updateAdmGenCommonLCode(AdmGenCodeManageVO admGenCodeManageVO){
		return update("AdmGenManageDAO.updateAdmGenCommonLCode", admGenCodeManageVO);
	}
	
	/**
	 * 상위코드 삭제-상위코드의 세부코드삭제
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 상세코드 삭제 성공여부
	 * @exception
	 */
	public int deleteAdmGenCommonSCodeAll(AdmGenCodeManageVO admGenCodeManageVO){
		return delete("AdmGenManageDAO.deleteAdmGenCommonSCodeAll", admGenCodeManageVO);
	}
		
	/**
	 * 상위코드 삭제
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 상위코드 삭제 성공여부
	 * @exception
	 */
	public int deleteAdmGenCommonLCode(AdmGenCodeManageVO admGenCodeManageVO){
		return delete("AdmGenManageDAO.deleteAdmGenCommonLCode", admGenCodeManageVO);
	}

	/**
	 * 세부코드 목록조회
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	public List<AdmGenCodeManageVO> getAdmGenCommonSCodeList(AdmGenCodeManageVO admGenCodeManageVO){
		return (List<AdmGenCodeManageVO>)list("AdmGenManageDAO.getAdmGenCommonSCodeList", admGenCodeManageVO);
	}
	
	
	/**
	 * 세부코드 목록조회
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	public List<AdmGenCodeManageVO> getAdmGenCommonCodeSpecList(AdmGenCodeManageVO admGenCodeManageVO){
		return (List<AdmGenCodeManageVO>)list("AdmGenManageDAO.getAdmGenCommonCodeSpecList", admGenCodeManageVO);
	}

	/**
	 * 세부코드 조회를 위한 상위코드 목록조회
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	public List<AdmGenCodeManageVO> getAdmGenCommonLCodeType(){
		return (List<AdmGenCodeManageVO>)list("AdmGenManageDAO.getAdmGenCommonLCodeType", null);
	}
    
	/**
	 * 세부코드 목록 총건수조회
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 글 총 개수
	 * @exception
	 */
	public int getAdmGenCommonSCodeListTotCnt(AdmGenCodeManageVO admGenCodeManageVO){
		return (Integer) selectByPk("AdmGenManageDAO.getAdmGenCommonSCodeListTotCnt", admGenCodeManageVO);
	}

	/**
	 * 세부코드 저장시, 세부코드 중복여부조회
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 코드중복여부확인
	 * @exception
	 */
	public int getAdmGenCheckCodeCdSpecCnt(AdmGenCodeManageVO admGenCodeManageVO){
		return (Integer) selectByPk("AdmGenManageDAO.getAdmGenCheckCodeCdSpecCnt", admGenCodeManageVO);
	}

	/**
	 * 세부코드 상세조회
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 선택한 상세코드 정보
	 * @exception
	 */
	public AdmGenCodeManageVO getAdmGenCommonSCodeOne(AdmGenCodeManageVO admGenCodeManageVO){
		return (AdmGenCodeManageVO) selectByPk("AdmGenManageDAO.getAdmGenCommonSCodeOne", admGenCodeManageVO);
	}

	/**
	 * 세부코드 등록
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 상세코드 등록성공여부
	 * @exception
	 */
	public int insertAdmGenCommonSCode(AdmGenCodeManageVO admGenCodeManageVO){
		return insert("AdmGenManageDAO.insertAdmGenCommonSCode", admGenCodeManageVO);
	}

	/**
	 * 세부코드 수정
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 상세코드 수정성공여부
	 * @exception
	 */
	public int updateAdmGenCommonSCode(AdmGenCodeManageVO admGenCodeManageVO){
		return update("AdmGenManageDAO.updateAdmGenCommonSCode", admGenCodeManageVO);
	}
	
	/**
	 * 세부코드 삭제
	 * @param admGenCodeManageVO - 조회할 정보가 담긴 VO
	 * @return 상세코드 삭제성공여부
	 * @exception
	 */
	public int deleteAdmGenCommonSCode(AdmGenCodeManageVO admGenCodeManageVO){
		return delete("AdmGenManageDAO.deleteAdmGenCommonSCode", admGenCodeManageVO);
	}

    /**
	 * 콘텐츠조회 목록
	 * @param AdmGenContentManageVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmGenContentManageVO> getAdmGenContentManageList(AdmGenContentManageVO admGenContentManageVO) throws Exception{
    	return (List<AdmGenContentManageVO>)list("AdmGenManageDAO.getAdmGenContentManageList", admGenContentManageVO);
    }
    
    /**
	 * 콘텐츠조회 목록 Count
	 * @param AdmGenContentManageVO
	 * @return int
	 * @exception Exception
	 */
    public int getAdmGenContentManageCnt(AdmGenContentManageVO admGenContentManageVO) throws Exception{
    	return (Integer) selectByPk("AdmGenManageDAO.getAdmGenContentManageCnt", admGenContentManageVO);
    }
    
    /**
	 * 콘텐츠조회 단건
	 * @param AdmGenContentManageVO
	 * @return AdmGenContentManageVO
	 * @exception Exception
	 */
    public AdmGenContentManageVO getAdmGenContentManage(AdmGenContentManageVO admGenContentManageVO) throws Exception{
    	return (AdmGenContentManageVO) selectByPk("AdmGenManageDAO.getAdmGenContentManage", admGenContentManageVO);
    }
    
    /**
	 * 콘텐츠 등록
	 * @param AdmGenContentManageVO
	 * @return
	 * @exception Exception
	 */
    public void insertAdmGenContentManage(AdmGenContentManageVO admGenContentManageVO) throws Exception{
    	insert("AdmGenManageDAO.insertAdmGenContentManage", admGenContentManageVO);
    }
    
    /**
	 * 콘텐츠 수정
	 * @param AdmGenContentManageVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenContentManage(AdmGenContentManageVO admGenContentManageVO) throws Exception{
    	 update("AdmGenManageDAO.updateAdmGenContentManage", admGenContentManageVO);
    }
    
    /**
	 * 콘텐츠 삭제
	 * @param AdmGenContentManageVO
	 * @return
	 * @exception Exception
	 */
    public void deleteAdmGenContentManage(AdmGenContentManageVO admGenContentManageVO) throws Exception{
    	delete("AdmGenManageDAO.deleteAdmGenContentManage", admGenContentManageVO);
    }
    
	/////////////////////////// 링크분류관리 START ///////////////////////////
    /**
	 * 링크 분류 조회
	 * @param AdmGenLinkVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmGenLinkVO> getAdmGenSysLinkCtlgList(AdmGenLinkVO admGenLinkVO) throws Exception{
    	return (List<AdmGenLinkVO>)list("AdmGenManageDAO.getAdmGenSysLinkCtlgList", admGenLinkVO);
    }
    
    /**
	 * 링크 분류 조회 Count
	 * @param AdmGenLinkVO
	 * @return int
	 * @exception Exception
	 */
    public int getAdmGenSysLinkCtlgCnt(AdmGenLinkVO admGenLinkVO) throws Exception{
    	return (Integer) selectByPk("AdmGenManageDAO.getAdmGenSysLinkCtlgCnt", admGenLinkVO);
    }
    
    /**
	 * 링크 분류 조회 단건
	 * @param AdmGenLinkVO
	 * @return AdmGenLinkVO
	 * @exception Exception
	 */
    public AdmGenLinkVO getAdmGenSysLinkCtlg(AdmGenLinkVO admGenLinkVO) throws Exception{
    	return (AdmGenLinkVO) selectByPk("AdmGenManageDAO.getAdmGenSysLinkCtlg", admGenLinkVO);
    }
    
    /**
	 * 링크분류등록시 분류순서 수정
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenSysLinkCtlgIOrder(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenSysLinkCtlgIOrder", admGenLinkVO);
    }
    
    /**
	 * 링크분류 등록
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void insertAdmGenSysLinkCtlg(AdmGenLinkVO admGenLinkVO) throws Exception{
    	insert("AdmGenManageDAO.insertAdmGenSysLinkCtlg", admGenLinkVO);
    }
    
    
    
    
    
    /**
	 * 링크분류 수정(링크명)
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenSysLinkCtlg(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenSysLinkCtlg", admGenLinkVO);
    }
    
    /**
	 * 링크분류수정시 링크분류 순서 수정1
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenSysLinkCtlgUOrder1(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenSysLinkCtlgUOrder1", admGenLinkVO);
    }
    
    /**
	 * 링크분류수정시 링크분류 순서 수정2
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenSysLinkCtlgUOrder2(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenSysLinkCtlgUOrder2", admGenLinkVO);
    }
    
    /**
	 * 링크분류 수정(링크순서)
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenSysLinkCtlgUOrder(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenSysLinkCtlgUOrder", admGenLinkVO);
    }
    
    
    
    
    
    /**
	 * 링크분류삭제시 링크분류 순서 수정
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenSysLinkCtlgDOrder(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenSysLinkCtlgDOrder", admGenLinkVO);
    }
    
    /**
	 * 링크 삭제
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void deleteAdmGenSysLinkAll(AdmGenLinkVO admGenLinkVO) throws Exception{
    	delete("AdmGenManageDAO.deleteAdmGenSysLinkAll", admGenLinkVO);
    }
    
    /**
	 * 링크분류 삭제
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void deleteAdmGenSysLinkCtlg(AdmGenLinkVO admGenLinkVO) throws Exception{
    	delete("AdmGenManageDAO.deleteAdmGenSysLinkCtlg", admGenLinkVO);
    }
    
    /**
	 * 업무데스크 삭제
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void deleteAdmGenSysLinkCtlgPsnJobDesk(AdmGenLinkVO admGenLinkVO) throws Exception{
    	delete("AdmGenManageDAO.deleteAdmGenSysLinkCtlgPsnJobDesk", admGenLinkVO);
    }
    
    /////////////////////////// 링크분류관리 END ///////////////////////////
    
    /////////////////////////// 링크관리 START ///////////////////////////
    /**
	 * 링크조회 목록
	 * @param AdmGenLinkVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmGenLinkVO> getAdmGenSysLinkList(AdmGenLinkVO admGenLinkVO) throws Exception{
    	return (List<AdmGenLinkVO>)list("AdmGenManageDAO.getAdmGenSysLinkList", admGenLinkVO);
    }
    
    /**
	 * 링크조회 목록 Count
	 * @param AdmGenLinkVO
	 * @return int
	 * @exception Exception
	 */
    public int getAdmGenSysLinkCnt(AdmGenLinkVO admGenLinkVO) throws Exception{
    	return (Integer) selectByPk("AdmGenManageDAO.getAdmGenSysLinkCnt", admGenLinkVO);
    }
    
    /**
	 * 링크분류목록 Comb
	 * @param AdmGenLinkVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmGenLinkVO> getAdmGenSysLinkCatList(AdmGenLinkVO admGenLinkVO) throws Exception{
    	return (List<AdmGenLinkVO>)list("AdmGenManageDAO.getAdmGenSysLinkCatList", admGenLinkVO);
    }
    
    /**
	 * 링크조회 단건
	 * @param AdmGenLinkVO
	 * @return AdmGenLinkVO
	 * @exception Exception
	 */
    public AdmGenLinkVO getAdmGenSysLink(AdmGenLinkVO admGenLinkVO) throws Exception{
    	return (AdmGenLinkVO) selectByPk("AdmGenManageDAO.getAdmGenSysLink", admGenLinkVO);
    }
    
    
    
    
    
    /**
	 * 링크등록시 분류순서 수정
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenSysLinkIOrder(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenSysLinkIOrder", admGenLinkVO);
    }
    
    /**
	 * 링크 등록
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void insertAdmGenSysLink(AdmGenLinkVO admGenLinkVO) throws Exception{
    	insert("AdmGenManageDAO.insertAdmGenSysLink", admGenLinkVO);
    }
    
    
    
    
    
    /**
	 * 링크 수정(링크명)
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenSysLink(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenSysLink", admGenLinkVO);
    }
    
    /**
	 * 링크수정시 링크 순서 수정1
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenSysLinkUOrder1(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenSysLinkUOrder1", admGenLinkVO);
    }
    
    /**
	 * 링크수정시 링크 순서 수정2
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenSysLinkUOrder2(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenSysLinkUOrder2", admGenLinkVO);
    }
    
    /**
	 * 링크 수정(링크순서)
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenSysLinkUOrder(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenSysLinkUOrder", admGenLinkVO);
    }
    
    
    
    
    
    /**
	 * 링크삭제시 링크순서 수정
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenSysLinkDOrder(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenSysLinkDOrder", admGenLinkVO);
    }
    
    /**
	 * 링크 삭제
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void deleteAdmGenSysLink(AdmGenLinkVO admGenLinkVO) throws Exception{
    	delete("AdmGenManageDAO.deleteAdmGenSysLink", admGenLinkVO);
    }
    
    /**
	 *  업무데스크 삭제
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void deleteAdmGenSysLinkPsnJobDesk(AdmGenLinkVO admGenLinkVO) throws Exception{
    	delete("AdmGenManageDAO.deleteAdmGenSysLinkPsnJobDesk", admGenLinkVO);
    }
    
    /////////////////////////// 링크관리 END ///////////////////////////
    
    /////////////////////////// 업무데스크관리 START ///////////////////////////
    /**
	 * 메인화면에 표시되는 링크 설정을 위한 조회
	 * @param AdmGenLinkVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmGenLinkVO> getAdmGenMainLinkList(AdmGenLinkVO admGenLinkVO) throws Exception{
    	return (List<AdmGenLinkVO>)list("AdmGenManageDAO.getAdmGenMainLinkList", admGenLinkVO);
    }
    
    /**
	 * 메인화면에 표시되는 링크 설정 초기화
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenMainLinkAll(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenMainLinkAll", admGenLinkVO);
    }
    
    /**
	 * 메인화면에 표시되는 링크 설정
	 * @param AdmGenLinkVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmGenMainLink(AdmGenLinkVO admGenLinkVO) throws Exception{
    	update("AdmGenManageDAO.updateAdmGenMainLink", admGenLinkVO);
    }
    
    /////////////////////////// 업무데스크관리 END ///////////////////////////
    
}
