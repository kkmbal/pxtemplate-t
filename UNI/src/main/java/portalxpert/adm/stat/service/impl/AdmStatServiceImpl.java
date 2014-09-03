/**
 * 
 */
package portalxpert.adm.stat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import portalxpert.adm.stat.dao.AdmStatDAO;
import portalxpert.adm.stat.model.AdmStatBBSVO;
import portalxpert.adm.stat.model.AdmStatSearchVO;
import portalxpert.adm.stat.model.AdmStatSurveyVO;
import portalxpert.adm.stat.model.AdmStatUseVO;
import portalxpert.adm.stat.service.AdmStatService;
import portalxpert.common.config.Constant;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * @author crossent
 *
 */
@Service("admStatService")
public class AdmStatServiceImpl extends EgovAbstractServiceImpl implements AdmStatService {

	@Autowired
    private AdmStatDAO admStatMapper;
	
	/**
	 * 게시판 통계정보
	 * @param searchForm
	 * @return
	 * @throws Exception
	 */
	public AdmStatBBSVO getAdmBbsInfoStatistics(AdmStatSearchVO searchForm)
			throws Exception {
		try{
			return admStatMapper.getAdmBbsInfoStatistics(searchForm);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}


	/**
	 * 게시판 조회수(Top20)
	 * @param searchForm
	 * @return
	 * @throws Exception
	 */
	public List<AdmStatBBSVO> getAdmBbsTopList(AdmStatSearchVO searchForm)
			throws Exception {
		try{
			return admStatMapper.getAdmBbsTopList(searchForm);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}

	/**
	 * 메신저통계
	 * @param searchForm
	 * @return
	 * @throws Exception
	 */
	public List<AdmStatBBSVO> getAdmMessengerStatistics(
			AdmStatSearchVO searchForm) throws Exception {
		try{
			return admStatMapper.getAdmMessengerStatistics(searchForm);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}

	/**
	 * 개인게시판 통계기본정보
	 * @param searchForm
	 * @return
	 * @throws Exception
	 */
	public AdmStatBBSVO getAdmPBbsInfoStatistics(AdmStatSearchVO searchForm) throws Exception{
		try{
			return admStatMapper.getAdmPBbsInfoStatistics(searchForm);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}

	/**
	 * 개인게시판 Top20
	 * @param searchForm
	 * @return
	 * @throws Exception
	 */
	public List<AdmStatBBSVO> getAdmPBbsTopList(AdmStatSearchVO searchForm) throws Exception{
		try{
			return admStatMapper.getAdmPBbsTopList(searchForm);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 이용현황 통계
	 * @param searchForm
	 * @return
	 * @throws Exception
	 */
	public List<AdmStatUseVO> getAdmUseStatList(AdmStatSearchVO searchForm) throws Exception{
		try{
			return admStatMapper.getAdmUseStatList(searchForm);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 개인게시판 게시판 선택 팝업창
	 * @param searchForm
	 * @return
	 * @throws Exception
	 */
	public List<AdmStatBBSVO> getAdmPBbsPopup(AdmStatSearchVO searchForm) throws Exception{
		try{
			return admStatMapper.getAdmPBbsPopup(searchForm);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 개인게시판 게시판 선택 팝업창 CNT
	 * @param searchForm
	 * @return
	 */
	public int getAdmPBbsPopupCnt(AdmStatSearchVO searchForm) throws Exception{
		try{
			return admStatMapper.getAdmPBbsPopupCnt(searchForm);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}

	/**
	 * 설문리스트
	 * @return
	 * @throws Exception
	 */
	public List<AdmStatSurveyVO> getAdmSurVeyList(AdmStatSurveyVO admStatSurveyVO) throws Exception{
		try{
			return admStatMapper.getAdmSurVeyList(admStatSurveyVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	/**
	 * 설문리스트 갯수
	 * @param admStatSurveyVO
	 * @return
	 * @throws Exception
	 */
	public int getAdmSurVeyCnt(AdmStatSurveyVO admStatSurveyVO) throws Exception{
		try{
			return admStatMapper.getAdmSurVeyCnt(admStatSurveyVO);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}
	
	
	/**
	 * 게시판 통계 조회
	 * @param searchForm
	 * @return
	 * @throws Exception
	 */
	public List<AdmStatBBSVO> getAdmBbsStatList(AdmStatSearchVO searchForm)	throws Exception {
		try{
			return admStatMapper.getAdmBbsStatList(searchForm);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}	
	
	/**
	 * 게시판 통계 총갯수
	 * @param searchForm
	 * @return
	 * @throws Exception
	 */
	public int getAdmBbsStatListTotCnt(AdmStatSearchVO searchForm) throws Exception {
		try{
			return admStatMapper.getAdmBbsStatListTotCnt(searchForm);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}	
}
