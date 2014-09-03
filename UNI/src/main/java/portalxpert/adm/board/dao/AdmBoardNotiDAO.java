package portalxpert.adm.board.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import portalxpert.adm.banner.model.AdmBannerVO;
import portalxpert.adm.board.model.AdmBoardNotiDelInfoVO;
import portalxpert.adm.board.model.AdmBoardNotiInfoVO;
import portalxpert.adm.board.model.AdmBoardNotiPopInfoVO;
import portalxpert.adm.board.model.AdmBoardPbsNotiInfoVO;
import portalxpert.board.board100.model.BbsNotiApndFileVO;
import portalxpert.board.board100.model.BbsNotiOpnVO;
import portalxpert.board.board100.model.PbsUserBoardInfoVO;
import portalxpert.board.board100.model.PbsUserBoardPartInfoVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class AdmBoardNotiDAO extends EgovAbstractMapper  {
	
    /**
	 * 게시물관리 목록
	 * @param AdmBoardNotiInfoVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmBoardNotiInfoVO> getAdmBoardNotiList(AdmBoardNotiInfoVO admBoardNotiInfoVO) throws Exception{
    	return (List<AdmBoardNotiInfoVO>)list("AdmBoardNotiDAO.getAdmBoardNotiList", admBoardNotiInfoVO);
    }
    
    /**
	 * 게시물관리 목록 Count
	 * @param AdmBoardNotiInfoVO
	 * @return int
	 * @exception Exception
	 */
    public int getAdmBoardNotiCnt(AdmBoardNotiInfoVO admBoardNotiInfoVO) throws Exception{
    	return (Integer) selectByPk("AdmBoardNotiDAO.AdmBoardNotiInfoVO", admBoardNotiInfoVO);
    }
    
    /**
	 * 게시물관리 삭제시 삭제코드 리스트
	 * @param AdmBoardNotiInfoVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmBoardNotiInfoVO> getAdmBoardNotiDelCodeList() throws Exception{
    	return (List<AdmBoardNotiInfoVO>)list("AdmBoardNotiDAO.getAdmBoardNotiDelCodeList", null);
    }
    
    /**
	 * 게시물 이동1 (BBS_NOTI_INFO Insert)
	 * @param AdmBoardNotiInfoVO
	 * @return
	 * @exception Exception
	 */
    public void insertAdmBoardNotiMove1(AdmBoardNotiInfoVO admBoardNotiInfoVO) throws Exception{
    	insert("AdmBoardNotiDAO.insertAdmBoardNotiMove1", admBoardNotiInfoVO);
    }
    
    /**
	 * 게시물 이동2 (BBS_NOTI_DEL_INFO Insert)
	 * @param AdmBoardNotiInfoVO
	 * @return
	 * @exception Exception
	 */
    public void insertAdmBoardNotiMove2(AdmBoardNotiInfoVO admBoardNotiInfoVO) throws Exception{
    	insert("AdmBoardNotiDAO.insertAdmBoardNotiMove2", admBoardNotiInfoVO);
    }
    
    /**
	 * 게시물 이동3 (BBS_NOTI_INFO Update)
	 * @param AdmBoardNotiInfoVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmBoardNotiMove3(AdmBoardNotiInfoVO admBoardNotiInfoVO) throws Exception{
    	update("AdmBoardNotiDAO.updateAdmBoardNotiMove3", admBoardNotiInfoVO);
    }
    
    /**
	 * 게시물 삭제1 (BBS_NOTI_DEL_INFO Insert)
	 * @param AdmBoardNotiInfoVO
	 * @return
	 * @exception Exception
	 */
    public void insertAdmBoardNotiDelete1(AdmBoardNotiInfoVO admBoardNotiInfoVO) throws Exception{
    	insert("AdmBoardNotiDAO.insertAdmBoardNotiDelete1", admBoardNotiInfoVO);
    }
    
    /**
	 * 게시물 삭제2 (BBS_NOTI_INFO Update)
	 * @param AdmBoardNotiInfoVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmBoardNotiDelete2(AdmBoardNotiInfoVO admBoardNotiInfoVO) throws Exception{
    	update("AdmBoardNotiDAO.updateAdmBoardNotiDelete2", admBoardNotiInfoVO);
    }
    
	/**
	 * 개인게시판 목록 Count
	 * @param admBoardPbsNotiInfoVO
	 * @return
	 * @throws Exception
	 */
    public int getAdmPbsBoardCnt(AdmBoardPbsNotiInfoVO admBoardPbsNotiInfoVO) throws Exception{
    	return (Integer) selectByPk("AdmBoardNotiDAO.getAdmPbsBoardCnt", admBoardPbsNotiInfoVO);
    }
    
	/**
	 * 개인게시판 목록
	 * @param admBoardPbsNotiInfoVO
	 * @return
	 * @throws Exception
	 */
    public List<AdmBoardPbsNotiInfoVO> getAdmPbsBoardList(AdmBoardPbsNotiInfoVO admBoardPbsNotiInfoVO) throws Exception{
    	return (List<AdmBoardPbsNotiInfoVO>)list("AdmBoardNotiDAO.getAdmPbsBoardList", admBoardPbsNotiInfoVO);
    }
    
    /**
	 * 개인 게시판 정보를 조회한다.
	 * @param PbsUserBoardInfoVO - 조회할 정보가 담긴 Map
	 * @return 개인 게시판 내용 
	 * @exception
	 */
    public List<PbsUserBoardInfoVO> getPbsUserBoardInfoList(PbsUserBoardInfoVO vo) {
    	return (List<PbsUserBoardInfoVO>)list("AdmBoardNotiDAO.getPbsUserBoardInfoList", vo);
    }
    
    /**
	 * 개인 게시판 참여 정보를 조회한다.
	 * @param PbsUserBoardPartInfoVO - 조회할 정보가 담긴 Map
	 * @return 개인 게시판 참여 내용 
	 * @exception
	 */
    public List<PbsUserBoardPartInfoVO> getPbsUserBoardPartInfoList(PbsUserBoardPartInfoVO vo) {
    	return (List<PbsUserBoardPartInfoVO>)list("AdmBoardNotiDAO.getPbsUserBoardPartInfoList", vo);
    }
    
	/**
	 * 공지사항 목록
	 * @param vo
	 * @return
	 * @throws Exception
	 */
    public List<AdmBoardNotiPopInfoVO> getBoardPopupList(AdmBoardNotiPopInfoVO vo) throws Exception{
    	return (List<AdmBoardNotiPopInfoVO>)list("AdmBoardNotiDAO.getBoardPopupList", vo);
    }
    
	/**
	 * 공지사항 목록 Count
	 * @param admBoardNotiPopInfoVO
	 * @return
	 * @throws Exception
	 */
    public int getBoardPopupCnt(AdmBoardNotiPopInfoVO admBoardNotiPopInfoVO) throws Exception{
    	return (Integer) selectByPk("AdmBoardNotiDAO.getBoardPopupCnt", admBoardNotiPopInfoVO);
    }
    
    /**
     * 공지사항 속성정보
     * @param vo
     * @return
     * @throws Exception
     */
    public AdmBoardNotiPopInfoVO selectAdmPopupNotiInfo(AdmBoardNotiPopInfoVO vo) throws Exception{
    	return (AdmBoardNotiPopInfoVO) selectByPk("AdmBoardNotiDAO.selectAdmPopupNotiInfo", vo);
    }
    
    /**
     * 공지사항 조회
     * @param admBoardNotiPopInfoVO
     * @return
     * @throws Exception
     */
    public int selectAdmPopupNoti(AdmBoardNotiPopInfoVO admBoardNotiPopInfoVO) throws Exception{
    	return (Integer) selectByPk("AdmBoardNotiDAO.selectAdmPopupNoti", admBoardNotiPopInfoVO);
    }
    
    /**
     * 공지사항 수정
     * @param admBoardNotiPopInfoVO
     * @return
     * @throws Exception
     */
    public int updateAdmPopupNoti(AdmBoardNotiPopInfoVO admBoardNotiPopInfoVO) throws Exception{
    	return update("AdmBoardNotiDAO.updateAdmPopupNoti", admBoardNotiPopInfoVO);
    }

    /**
     * 공지사항 추가
     * @param admBoardNotiPopInfoVO
     * @return
     * @throws Exception
     */
    public int insertAdmPopupNoti(AdmBoardNotiPopInfoVO admBoardNotiPopInfoVO) throws Exception{
    	return insert("AdmBoardNotiDAO.insertAdmPopupNoti", admBoardNotiPopInfoVO);
    }
    
 	/**
 	 * 공지사항 팝업 전체취소
 	 * @param AdmBoardNotiPopInfoVO
 	 * @return ModelMap
 	 * @exception Exception
 	 */
    public int updateAdmAllPopupCancel(AdmBoardNotiPopInfoVO admBoardNotiPopInfoVO) throws Exception{
    	return update("AdmBoardNotiDAO.updateAdmAllPopupCancel", admBoardNotiPopInfoVO);
    }
    
    /**
	 * 삭제이동게시물 목록
	 * @param AdmBoardNotiDelInfoVO
	 * @return List
	 * @exception Exception
	 */
    public List<AdmBoardNotiDelInfoVO> getAdmBoardNotiDelList(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception{
    	return (List<AdmBoardNotiDelInfoVO>)list("AdmBoardNotiDAO.getAdmBoardNotiDelList", admBoardNotiDelInfoVO);
    }
    
    /**
	 * 삭제이동게시물 목록 Count
	 * @param AdmBoardNotiDelInfoVO
	 * @return int
	 * @exception Exception
	 */
    public int getAdmBoardNotiDelCnt(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception{
    	return (Integer) selectByPk("AdmBoardNotiDAO.getAdmBoardNotiDelCnt", admBoardNotiDelInfoVO);
    }
    
    /**
	 * 삭제이동게시물조회 단건
	 * @param AdmBoardNotiDelInfoVO
	 * @return AdmBoardNotiDelInfoVO
	 * @exception Exception
	 */
    public AdmBoardNotiDelInfoVO getAdmBoardNotiDel(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception{
    	return (AdmBoardNotiDelInfoVO) selectByPk("AdmBoardNotiDAO.getAdmBoardNotiDel", admBoardNotiDelInfoVO);
    }
    
    /**
	 * 삭제게시물 복원1 (BBS_NOTI_DEL_INFO 정보삭제)
	 * @param AdmBoardNotiDelInfoVO
	 * @return
	 * @exception Exception
	 */
    public void deleteAdmBoardNotiDelRollBack1(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception{
    	delete("AdmBoardNotiDAO.deleteAdmBoardNotiDelRollBack1", admBoardNotiDelInfoVO);
    }
    
    /**
	 * 삭제게시물 복원2 (BBS_NOTI_INFO 정보수정)
	 * @param AdmBoardNotiDelInfoVO
	 * @return
	 * @exception Exception
	 */
    public void updateAdmBoardNotiDelRollBack2(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception{
    	update("AdmBoardNotiDAO.updateAdmBoardNotiDelRollBack2", admBoardNotiDelInfoVO);
    }
    
    /**
	 * 삭제이동게시물조회
	 * @param AdmBoardNotiDelInfoVO
	 * @return AdmBoardNotiDelInfoVO
	 * @exception Exception
	 */
    public List getBbsNotiInfoView(AdmBoardNotiInfoVO admBoardNotiInfoVO) throws Exception{
    	return (List<AdmBannerVO>)list("AdmBoardNotiDAO.getBbsNotiInfoView", admBoardNotiInfoVO);
    }

    /**
	 * 삭제이동게시판조회
	 * @param AdmBoardNotiDelInfoVO
	 * @return AdmBoardNotiDelInfoVO
	 * @exception Exception
	 */
	public AdmBoardNotiInfoVO getAdminBbsBoardInfo(AdmBoardNotiInfoVO admBoardNotiDelInfoVO){
		return (AdmBoardNotiInfoVO) selectByPk("AdmBoardNotiDAO.getAdminBbsBoardInfo", admBoardNotiDelInfoVO);
	}
	
    /**
	 * BBS_게시물_첨부_파일
	 * @param BbsNotiApndFileVO - 조회할 정보가 담긴 VO
	 * @return BBS_게시물_첨부_파일 정보 
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiApndFileVO> getBbsNotiApndFileListForView(BbsNotiApndFileVO vo)throws Exception {
    	return (List<BbsNotiApndFileVO>)list("AdmBoardNotiDAO.getBbsNotiApndFileListForView", vo);
    }
    
    /**
	 * BBS 게시물 의견
	 * @param BbsNotiOpnVO - 조회할 정보가 담긴 VO
	 * @return BBS 게시물 의견
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiOpnVO> getBbsNotiOpnList1ForView(BbsNotiOpnVO vo)throws Exception {
    	return (List<BbsNotiOpnVO>)list("AdmBoardNotiDAO.getBbsNotiOpnList1ForView", vo);
    }
    
    /**
	 * BBS 게시물 의견의 의견
	 * @param BbsNotiOpnVO - 조회할 정보가 담긴 VO
	 * @return BBS 게시물 의견
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiOpnVO> getBbsNotiOpnList2ForView(BbsNotiOpnVO vo)throws Exception {
    	return (List<BbsNotiOpnVO>)list("AdmBoardNotiDAO.getBbsNotiOpnList2ForView", vo);
    }
    
    /**
     * BBS_게시물_첨부_파일
     * @param BbsNotiApndFileVO - 조회할 정보가 담긴 VO
     * @return BBS_게시물_첨부_파일 정보 
     * @exception Exception
     * @auther crossent 
     */
    public BbsNotiApndFileVO getBbsNotiApndFile(BbsNotiApndFileVO vo)throws Exception {
    	return (BbsNotiApndFileVO) selectByPk("AdmBoardNotiDAO.getBbsNotiApndFile", vo);
    }
    
    public int deleteBbsNotiAddItemForBoard (Map<String, Object> map) throws Exception {
    	return delete("AdmBoardNotiDAO.deleteBbsNotiAddItemForBoard", map);
    }
    public int deleteBbsNotiApndFileForBoard (Map<String, Object> map) throws Exception {
    	return delete("AdmBoardNotiDAO.deleteBbsNotiApndFileForBoard", map);
    }
    public int deleteBbsNotiEvalInfoForBoard (Map<String, Object> map) throws Exception {
    	return delete("AdmBoardNotiDAO.deleteBbsNotiEvalInfoForBoard", map);
    }
    public int deleteBbsNotiOpnForBoard (Map<String, Object> map) throws Exception {
    	return delete("AdmBoardNotiDAO.deleteBbsNotiOpnForBoard", map);
    }
    public int deleteBbsNotiSurveyForBoard (Map<String, Object> map) throws Exception {
    	return delete("AdmBoardNotiDAO.deleteBbsNotiSurveyForBoard", map);
    }
    public int deleteBbsNotiSurveyAnswForBoard (Map<String, Object> map) throws Exception {
    	return delete("AdmBoardNotiDAO.deleteBbsNotiSurveyAnswForBoard", map);
    }
    public int deleteBbsNotiSurveyExmplForBoard (Map<String, Object> map) throws Exception {
    	return delete("AdmBoardNotiDAO.deleteBbsNotiSurveyExmplForBoard", map);
    }
    public int deleteBbsNotiUserMapForBoard (Map<String, Object> map) throws Exception {
    	return delete("AdmBoardNotiDAO.deleteBbsNotiUserMapForBoard", map);
    }

    /* 게시물 영구삭제 */
	public void deleteNotiInfoRollback(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception {
		delete("AdmBoardNotiDAO.deleteNotiInfoRollback", admBoardNotiDelInfoVO);
	}
	public void deleteBbsNotiAddItemRollback(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception {
		delete("AdmBoardNotiDAO.deleteBbsNotiAddItemRollback", admBoardNotiDelInfoVO);
	}
	public void deleteBbsNotiApndFileRollback(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception {
		delete("AdmBoardNotiDAO.deleteBbsNotiApndFileRollback", admBoardNotiDelInfoVO);
	}
	public void deleteBbsNotiEvalInfoRollback(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception {
		delete("AdmBoardNotiDAO.deleteBbsNotiEvalInfoRollback", admBoardNotiDelInfoVO);
	}
	public void deleteBbsNotiOpnRollback(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception {
		delete("AdmBoardNotiDAO.deleteBbsNotiOpnRollback", admBoardNotiDelInfoVO);
	}
	public void deleteBbsNotiUserMapRollback(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception {
		delete("AdmBoardNotiDAO.deleteBbsNotiUserMapRollback", admBoardNotiDelInfoVO);
	}
	public void deleteBbsNotiSurveyRollback(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception {
		delete("AdmBoardNotiDAO.deleteBbsNotiSurveyRollback", admBoardNotiDelInfoVO);
	}
	public void deleteBbsNotiSurveyAnswRollback(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception {
		delete("AdmBoardNotiDAO.deleteBbsNotiSurveyAnswRollback", admBoardNotiDelInfoVO);
	}
	public void deleteBbsNotiSurveyExmplRollback(AdmBoardNotiDelInfoVO admBoardNotiDelInfoVO) throws Exception {
		delete("AdmBoardNotiDAO.deleteBbsNotiSurveyExmplRollback", admBoardNotiDelInfoVO);
	}
	/* 게시물 영구삭제 */
}
