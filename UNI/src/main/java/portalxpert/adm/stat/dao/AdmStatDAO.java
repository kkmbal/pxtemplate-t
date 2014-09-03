/**
 * 
 */
package portalxpert.adm.stat.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import portalxpert.adm.stat.model.AdmStatBBSVO;
import portalxpert.adm.stat.model.AdmStatSearchVO;
import portalxpert.adm.stat.model.AdmStatSurveyVO;
import portalxpert.adm.stat.model.AdmStatUseVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

/**
 * @author crossent
 *
 */
@Repository
public class AdmStatDAO extends EgovAbstractMapper {

	public AdmStatBBSVO getAdmBbsInfoStatistics(AdmStatSearchVO searchForm){
		return (AdmStatBBSVO) selectByPk("AdmStatDAO.getAdmBbsInfoStatistics", searchForm);
	}

	public List<AdmStatBBSVO> getAdmBbsTopList(AdmStatSearchVO searchForm){
		return (List<AdmStatBBSVO>)list("AdmStatDAO.getAdmBbsTopList", searchForm);
	}

	public List<AdmStatBBSVO> getAdmMessengerStatistics(AdmStatSearchVO searchForm){
		return (List<AdmStatBBSVO>)list("AdmStatDAO.getAdmMessengerStatistics", searchForm);
	}

	public AdmStatBBSVO getAdmPBbsInfoStatistics(AdmStatSearchVO searchForm){
		return (AdmStatBBSVO) selectByPk("AdmStatDAO.getAdmPBbsInfoStatistics", searchForm);
	}

	public List<AdmStatBBSVO> getAdmPBbsTopList(AdmStatSearchVO searchForm){
		return (List<AdmStatBBSVO>)list("AdmStatDAO.getAdmPBbsTopList", searchForm);
	}

	public List<AdmStatUseVO> getAdmUseStatList(AdmStatSearchVO searchForm){
		return (List<AdmStatUseVO>)list("AdmStatDAO.getAdmUseStatList", searchForm);
	}

	public List<AdmStatBBSVO> getAdmPBbsPopup(AdmStatSearchVO searchForm){
		return (List<AdmStatBBSVO>)list("AdmStatDAO.getAdmPBbsPopup", searchForm);
	}
	
	/**
	 * 설문리스트
	 * @return
	 * @throws Exception
	 */
	public List<AdmStatSurveyVO> getAdmSurVeyList(AdmStatSurveyVO admStatSurveyVO){
		return (List<AdmStatSurveyVO>)list("AdmStatDAO.getAdmSurVeyList", admStatSurveyVO);
	}
	
	/**
	 * 설문리스트 갯수
	 * @param admStatSurveyVO
	 * @return
	 * @throws Exception
	 */
	public int getAdmSurVeyCnt(AdmStatSurveyVO admStatSurveyVO){
		return (Integer) selectByPk("AdmStatDAO.getAdmSurVeyCnt", admStatSurveyVO);
	}

	public int getAdmPBbsPopupCnt(AdmStatSearchVO searchForm){
		return (Integer) selectByPk("AdmStatDAO.getAdmPBbsPopupCnt", searchForm);
	}
	
	public List<AdmStatBBSVO> getAdmBbsStatList(AdmStatSearchVO searchForm){
		return (List<AdmStatBBSVO>)list("AdmStatDAO.getAdmBbsStatList", searchForm);
	}
	public int getAdmBbsStatListTotCnt(AdmStatSearchVO searchForm){
		return (Integer) selectByPk("AdmStatDAO.getAdmBbsStatListTotCnt", searchForm);
	}

}
