package portalxpert.adm.main.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import portalxpert.adm.banner.model.AdmBannerVO;
import portalxpert.adm.main.model.AdmMainVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class AdmMainDAO extends EgovAbstractMapper {
	
	/**
	 * 선택안된 컨텐츠 조회
	 * @param amVO
	 * @return
	 * @throws Exception
     * @author crossent
	 */
	public List getUnselectContentList(AdmMainVO amVO) throws Exception{
		return (List)list("AdmMainDAO.getUnselectContentList", amVO);
	}
	
	/**
	 * 필수 컨텐츠 조회
	 * @param amVO
	 * @return
	 * @throws Exception
     * @author crossent
	 */
	public List getMandatoryContentList(AdmMainVO amVO) throws Exception{
		return (List)list("AdmMainDAO.getMandatoryContentList", amVO);
	}
	
	/**
	 * 기본 컨텐츠 조회
	 * @param amVO
	 * @return
	 * @throws Exception
     * @author crossent
	 */
	public List getDefaultContentList(AdmMainVO amVO) throws Exception{
		return (List)list("AdmMainDAO.getDefaultContentList", amVO);
	}
	
	/**
	 * 기존 설정 컨텐츠 삭제
	 * @param amVO
	 * @throws Exception
     * @author crossent
	 */
	public void deleteStandardContent(AdmMainVO amVO) throws Exception{
		delete("AdmMainDAO.deleteStandardContent", amVO);
	}
	
	/**
	 * 설정된 컨텐츠 저장
	 * @param amVO
	 * @throws Exception
     * @author crossent
	 */
	public void insertStandardContent(AdmMainVO amVO) throws Exception{
		insert("AdmMainDAO.insertStandardContent", amVO);
	}
	
	/**
	 * 필수 게시판 조회
	 * @return
	 * @throws Exception
     * @author crossent
	 */
	public List getMandatoryBoardList(AdmMainVO amVO) throws Exception{
		return (List)list("AdmMainDAO.getMandatoryBoardList", amVO);
	}
	
	/**
	 * 기본 게시판 조회
	 * @return
	 * @throws Exception
     * @author crossent
	 */
	public List getDefaultBoardList(AdmMainVO amVO) throws Exception{
		return (List)list("AdmMainDAO.getDefaultBoardList", amVO);
	}
	
	/**
	 * 기존 설정된 게시판 삭제
	 * @throws Exception
     * @author crossent
	 */
	public void deleteStandardBoard(AdmMainVO amVO) throws Exception{
		delete("AdmMainDAO.deleteStandardBoard", amVO);
	}
	
	/**
	 * 설정된 게시판 저장
	 * @param amVO
	 * @throws Exception
     * @author crossent
	 */
	public void insertStandardBoard(AdmMainVO amVO) throws Exception{
		insert("AdmMainDAO.insertStandardBoard", amVO);
	}
	
	/**
	 * 업무데스크 카테고리 조회
	 * @return
	 * @throws Exception
     * @author crossent
	 */
	public List getWorkDeskCategoryList() throws Exception{
		return (List<AdmBannerVO>)list("AdmMainDAO.getWorkDeskCategoryList", null);
	}
	
	/**
	 * 업무데스크 카테고리별 항목 조회
	 * @return
	 * @throws Exception
     * @author crossent
	 */
	public List getWorkDeskList() throws Exception{
		return (List<AdmBannerVO>)list("AdmMainDAO.getWorkDeskList", null);
	}
	
	/**
	 * 업무데스크 설정 건수
	 * @return
	 * @throws Exception
     * @author crossent
	 */
	public int getWorkDeskCnt() throws Exception{
		return (Integer) selectByPk("AdmMainDAO.getWorkDeskCnt", null);
	}
	
	/**
	 * 기존 설정 리셋
	 * @throws Exception
     * @author crossent
	 */
	public void updateWorkDeskReset() throws Exception{
		update("AdmMainDAO.updateWorkDeskReset", null);
	}
	
	/**
	 * 설정된 항목 저장
	 * @param amVO
	 * @throws Exception
     * @author crossent
	 */
	public void updateWorkDesk(AdmMainVO amVO) throws Exception{
		update("AdmMainDAO.updateWorkDesk", null);
	}
	
}
