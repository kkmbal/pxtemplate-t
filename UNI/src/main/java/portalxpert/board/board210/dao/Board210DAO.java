package portalxpert.board.board210.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import portalxpert.board.board100.model.BbsBoardInfoVO;
import portalxpert.board.board100.model.BbsNotiApndFileVO;
import portalxpert.board.board100.model.BbsNotiDelInfoVO;
import portalxpert.board.board100.model.BbsNotiEvalInfoVO;
import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board100.model.BbsNotiOpnVO;
import portalxpert.board.board100.model.BbsNotiSurveyVO;
import portalxpert.board.board100.model.ComCodeSpecVO;
import portalxpert.board.board100.model.TbsNotiDelInfoVO;
import portalxpert.common.model.BoardSearchVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

/**
 * @author crossent
 *
 */
@Repository
public class Board210DAO extends EgovAbstractMapper  {
	
	/**
	 * 게시물 정보 조회
	 * @param BoardSearchVO - 조회할 정보가 담긴 Map
	 * @return 게시물 정보 
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiInfoVO> getBbsNotiInfoListForPaging(BoardSearchVO vo)throws Exception {
    	return (List<BbsNotiInfoVO>)list("Board210DAO.getBbsNotiInfoListForPaging", vo);
    }
    
    /**
	 * 게시물 총 개수 조회
	 * @param BoardSearchVO - 조회할 정보가 담긴 VO
	 * @return 게시판 총 갯수
	 * @exception Exception
	 * @auther crossent 
	 */
    public int getBbsNotiInfoListTotCnt(BoardSearchVO vo)throws Exception{
    	return (Integer) selectByPk("Board210DAO.getBbsNotiInfoListTotCnt", vo);
    }
    
	/**
	 * 게시물 목록 조회
	 * @param BoardSearchVO - 조회할 정보가 담긴 Map
	 * @return 게시물 정보 
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiInfoVO> getBbsNotiInfoList(BoardSearchVO vo)throws Exception {
    	return (List<BbsNotiInfoVO>)list("Board210DAO.getBbsNotiInfoList", vo);
    }
    
    /**
     * 나의 작성글 여부 확인 
     * @param Map<String, Object> map
     * @return 타인의 글 갯수
     * @exception Exception
     * @auther crossent 
     */
    public int getMyNotiCheckList(Map<String, Object> map)throws Exception{
    	return (Integer) selectByPk("Board210DAO.getMyNotiCheckList", map);
    }
    
    /**
     * 게시판 즐겨찾기 여부     * @param BoardSearchVO - 조회할 정보가 담긴 VO
     * @return 즐겨찻기 된 갯수
     * @exception Exception
     * @auther crossent 
     */
    public int getMyBbsFavoriteYn(BoardSearchVO vo)throws Exception{
    	return (Integer) selectByPk("Board210DAO.getMyBbsFavoriteYn", vo);
    }
    
    /**
	 * 즐겨찾기 추가
	 * @param BoardSearchVO - 조회할 정보가 담긴 VO
	 * @return 성공 여부
	 * @exception Exception
	 * @auther crossent
	 */
    public int insertBbsFavorite(BoardSearchVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsFavorite", vo);
    }
    
    /**
	 * 즐겨찾기 삭제
	 * @param BoardSearchVO - 조회할 정보가 담긴 VO
	 * @return 성공 여부
	 * @exception Exception
	 * @auther crossent
	 */
    public int deleteBbsFavorite(BoardSearchVO vo)throws Exception{
    	return delete("Board210DAO.deleteBbsFavorite", vo);
    }
    
    /**
     * 게시글 이동
     * @param Map
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int updateBbsNotiInfoForMove(Map<String, Object> map)throws Exception{
    	return update("Board210DAO.updateBbsNotiInfoForMove", map);
    }
    
    /**
     * 게시글 이동
     * @param Map
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int insertBbsNotiInfoForMove(BbsNotiInfoVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsNotiInfoForMove", vo);
    }
    
    /**
     * 링크 등록
     * @param BbsNotiInfoVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int insertBbsNotiInfoForLink(BbsNotiInfoVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsNotiInfoForLink", vo);
    }
    
    /**
     * 게시글 읽음처리
     * @param BbsNotiEvalInfoVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int updateBbsNotiEvalInfoForRead(BbsNotiEvalInfoVO vo)throws Exception{
    	return update("Board210DAO.updateBbsNotiEvalInfoForRead", vo);
    }
    
    /**
	 * 게시글 상세정보
	 * @param BbsNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return 게시물 정보 
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiInfoVO> getBbsNotiInfoView(BbsNotiInfoVO vo)throws Exception {
    	return (List<BbsNotiInfoVO>)list("Board210DAO.getBbsNotiInfoView", vo);
    }
    
    /**
	 * BBS_게시물_첨부_파일
	 * @param BbsNotiApndFileVO - 조회할 정보가 담긴 VO
	 * @return BBS_게시물_첨부_파일 정보 
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiApndFileVO> getBbsNotiApndFileListForView(BbsNotiApndFileVO vo)throws Exception {
    	return (List<BbsNotiApndFileVO>)list("Board210DAO.getBbsNotiApndFileListForView", vo);
    }
    
    /**
     * BBS_게시물_첨부_파일
     * @param BbsNotiApndFileVO - 조회할 정보가 담긴 VO
     * @return BBS_게시물_첨부_파일 정보 
     * @exception Exception
     * @auther crossent 
     */
    public BbsNotiApndFileVO getBbsNotiApndFile(BbsNotiApndFileVO vo)throws Exception {
    	return (BbsNotiApndFileVO) selectByPk("Board210DAO.getBbsNotiApndFile", vo);
    }
    
    /**
	 * BBS_게시물_태그 
	 * @param BbsNotiTagInfoVO - 조회할 정보가 담긴 VO
	 * @return BBS_게시물_태그_정보
	 * @exception Exception
	 * @auther crossent 
	 */
//    public List<BbsNotiTagInfoVO> getBbsNotiTagInfoList(BbsNotiTagInfoVO vo)throws Exception ;
    
    /**
	 * BBS_게시물_평가_정보
	 * @param BbsNotiEvalInfoVO - 조회할 정보가 담긴 VO
	 * @return BBS_게시물_태그_정보
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiEvalInfoVO> getBbsNotiEvalInfoList(BbsNotiEvalInfoVO vo)throws Exception {
    	return (List<BbsNotiEvalInfoVO>)list("Board210DAO.getBbsNotiEvalInfoList", vo);
    }
    
    /**
	 * BBS 게시물 의견
	 * @param BbsNotiOpnVO - 조회할 정보가 담긴 VO
	 * @return BBS 게시물 의견
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiOpnVO> getBbsNotiOpnList1ForView(BbsNotiOpnVO vo)throws Exception {
    	return (List<BbsNotiOpnVO>)list("Board210DAO.getBbsNotiOpnList1ForView", vo);
    }
    
    /**
	 * BBS 게시물 의견의 의견
	 * @param BbsNotiOpnVO - 조회할 정보가 담긴 VO
	 * @return BBS 게시물 의견
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiOpnVO> getBbsNotiOpnList2ForView(BbsNotiOpnVO vo)throws Exception {
    	return (List<BbsNotiOpnVO>)list("Board210DAO.getBbsNotiOpnList2ForView", vo);
    }
    
    /**
	 * BBS 게시판 
	 * @param BbsBoardInfoVO - 조회할 정보가 담긴 VO
	 * @return BBS 게시판 
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsBoardInfoVO> getBbsBoardInfoListForView(BbsBoardInfoVO vo)throws Exception {
    	return (List<BbsBoardInfoVO>)list("Board210DAO.getBbsBoardInfoListForView", vo);
    }
    
    /**
     * 의견 등록
     * @param BbsNotiOpnVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int insertBbsNotiOpnForView(BbsNotiOpnVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsNotiOpnForView", vo);
    }
    
    /**
     * 의견 수정
     * @param BbsNotiOpnVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int updateBbsNotiOpnForView(BbsNotiOpnVO vo)throws Exception{
    	return update("Board210DAO.updateBbsNotiOpnForView", vo);
    }
    
    /**
     * 의견 삭제
     * @param BbsNotiOpnVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int deleteBbsNotiOpnForView(BbsNotiOpnVO vo)throws Exception{
    	return delete("Board210DAO.deleteBbsNotiOpnForView", vo);
    }
    
    /**
     * BBS_게시물_평가_정보 등록 건수
     * @param BbsNotiOpnVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int getBbsNotiEvalInfoCntForView(BbsNotiEvalInfoVO vo)throws Exception{
    	return (Integer) selectByPk("Board210DAO.getBbsNotiEvalInfoCntForView", vo);
    }
    
    /**
     * BBS_게시물_평가_정보 등록
     * @param BbsNotiEvalInfoVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int insertBbsNotiEvalInfoForView(BbsNotiEvalInfoVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsNotiEvalInfoForView", vo);
    }
    
    /**
     * 게시글 상세보기시 조회수 올리기
     * @param BbsNotiEvalInfoVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int insertBbsNotiEvalInfoForRead(BbsNotiEvalInfoVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsNotiEvalInfoForRead", vo);
    }
    
    /**
	 * 게시글 상세보기 이전글 다음글 
	 * @param BbsNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return 게시물 정보 
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiInfoVO> getBbsPrevNextNotiInfoForView(BbsNotiInfoVO vo)throws Exception {
    	return (List<BbsNotiInfoVO>)list("Board210DAO.getBbsPrevNextNotiInfoForView", vo);
    }
    
    /**
     * 게시글 MAX NOTI_ID 조회
     * @return String
     * @exception Exception
     * @auther crossent 
     */
    public String getMaxNotiId()throws Exception{
    	return (String) selectByPk("Board210DAO.getMaxNotiId", null);
    }
    
    /**
     * 게시글 설문조사 MAX SURVEYNO 조회
     * @return String
     * @exception Exception
     * @auther crossent 
     */
    public int getMaxSurveyNo()throws Exception{
    	return (Integer) selectByPk("Board210DAO.getMaxSurveyNo", null);
    }
    
    /**
     * 게시글 추가항목 이동
     * @param BbsNotiInfoVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int insertBbsNotiAddItemForMove(BbsNotiInfoVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsNotiAddItemForMove", vo);
    }
    
    /**
     * 게시글 첨부파일 이동
     * @param BbsNotiInfoVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int insertBbsNotiApndFileForMove(BbsNotiInfoVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsNotiApndFileForMove", vo);
    }
    
    /**
     * 게시글 평가 이동
     * @param BbsNotiEvalInfoVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int insertBbsNotiEvalInfoForMove(BbsNotiInfoVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsNotiEvalInfoForMove", vo);
    }
    
    /**
     * 게시글 의견 이동
     * @param BbsNotiEvalInfoVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int insertBbsOpnForMove(BbsNotiInfoVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsOpnForMove", vo);
    }
    
    /**
     * 게시글 사용자 매핍 이동 
     * @param BbsNotiEvalInfoVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int insertBbsNotiUserMapForMove(BbsNotiInfoVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsNotiUserMapForMove", vo);
    }
    
    /**
     * 게시글 설문조사 이동 
     * @param BbsNotiEvalInfoVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int insertBbsSurveyForMove(BbsNotiSurveyVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsSurveyForMove", vo);
    }
    
    /**
     * 게시글별 답글존재 여부
     * @param map
     * @return String
     * @exception Exception
     * @auther crossent 
     */
    public String getReNotiYn(Map<String, Object> map)throws Exception{
    	return (String) selectByPk("Board210DAO.getReNotiYn", map);
    }
    
    /**
     * 게시글 읽음 건수
     * @param BbsNotiInfoVO
     * @return String
     * @exception Exception
     * @auther crossent 
     */
    public int getNotiReadCnt(BbsNotiEvalInfoVO vo)throws Exception{
    	return (Integer) selectByPk("Board210DAO.getNotiReadCnt", vo);
    }
    
    /**
     * 게시글 읽음 건수
     * @param BbsNotiInfoVO
     * @return String
     * @exception Exception
     * @auther crossent 
     */
    public int updateBbsNotiInfoForCntPlus(BbsNotiEvalInfoVO vo)throws Exception{
    	return update("Board210DAO.updateBbsNotiInfoForCntPlus", vo);
    }
    
    /**
     * 게시글 내용 조회
     * @param notiId
     * @return String
     * @exception Exception
     * @auther crossent 
     */
    public BbsNotiInfoVO getBbsNotiInfoViewForNotiConts(String notiId)throws Exception{
    	return (BbsNotiInfoVO) selectByPk("Board210DAO.getBbsNotiInfoViewForNotiConts", notiId);
    }
    
    /**
     * 게시글 삭제정보 
     * @param BbsNotiDelInfoVO
     * @return int
     * @exception Exception
     * @auther crossent 
     */
    public int insertBbsNotiDelInfo(BbsNotiDelInfoVO vo)throws Exception{
    	return insert("Board210DAO.insertBbsNotiDelInfo", vo);
    }
    
    /**
	 * 동영상 파일정보  
	 * @param TbsNotiDelInfoVO - 조회할 정보가 담긴 VO
	 * @return 동영상 파일정보  
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<TbsNotiDelInfoVO> getTnMspMvpFileList(String notiId)throws Exception {
    	return (List<TbsNotiDelInfoVO>)list("Board210DAO.getTnMspMvpFileList", notiId);
    }
    
    /**
     * 코드 조회
     * @return List<ComCodeSpecVO>
     * @exception Exception
     * @auther crossent 
     */
    public List<ComCodeSpecVO> getComCodeSpecList()throws Exception {
    	return (List<ComCodeSpecVO>)list("Board210DAO.getComCodeSpecList", null);
    }

    /**
	 * 이미지,동영상 파일과 게시물 정보  
	 * @param notiId - 게시물ID
	 * @return 이미지,동영상 파일정보  
	 * @exception Exception
	 */
	public List<BbsNotiInfoVO> getBbsMovieImagePrevNextNotiInfoForView(BoardSearchVO vo) throws Exception {
		return (List<BbsNotiInfoVO>)list("Board210DAO.getBbsMovieImagePrevNextNotiInfoForView", vo);
	}
	
    /**
     * 이미지,동영상 게시글 PNUM 가져오기
     * @param BbsNotiInfoVO
     * @return int 
     * @exception Exception
     */
    public int getBbsImgMoviePnumInfo(BbsNotiInfoVO vo) throws Exception{
    	return (Integer) selectByPk("Board210DAO.getBbsImgMoviePnumInfo", vo);
    }
	
    
}

