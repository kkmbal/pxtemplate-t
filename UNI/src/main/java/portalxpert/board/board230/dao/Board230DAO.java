package portalxpert.board.board230.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import portalxpert.board.board100.model.BbsNotiApndFileVO;
import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board100.model.BbsNotiSurveyExmplVO;
import portalxpert.board.board100.model.BbsNotiSurveyVO;
import portalxpert.board.board230.model.BbsTmpNotiApndFileVO;
import portalxpert.board.board230.model.BbsTmpNotiInfoVO;
import portalxpert.board.board230.model.BbsTmpNotiUserMapVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class Board230DAO extends EgovAbstractMapper  {

	public int getMovieKey() throws Exception{
		return (Integer) selectByPk("Board230DAO.", null);
	}
	
	
	/**
     * 게시물 정보 임시 입력
     * @param vo 게시물 임시 입력정보
     * @return 입력 성공 건수
     */
    public int insertBbsTmpNotiInfo(BbsTmpNotiInfoVO vo) throws Exception  {
    	return insert("Board230DAO.insertBbsTmpNotiInfo", vo);
    }
    
    /**
     * 첨부파일 임시 입력
     * @param vo 첨부파일 입력정보
     * @return 첨부파일 성공 건수
     */
    public int insertBbsTmpNotiApndFile(BbsTmpNotiApndFileVO vo) throws Exception  {
    	return insert("Board230DAO.insertBbsTmpNotiApndFile", vo);
    }
    
    
    /**
     * 임시 설문 정보 등록 
     * @param PsnTmlnApndFileVO - 입력할 정보가 담긴 VO 
     * @return 임시 입력 성공 건수
	 * @exception Exception
     */
    public int insertBbsTmpNotiSurvey(BbsNotiSurveyVO vo) throws Exception  {
    	return insert("Board230DAO.insertBbsTmpNotiSurvey", vo);
    }
    
    
    /**
     * 임시 설문 보기 정보 등록 
     * @param PsnTmlnApndFileVO - 입력할 정보가 담긴 VO 
     * @return 입력 성공 건수
	 * @exception Exception
     */
    public int insertBbsTmpNotiSurveyExmpl(BbsNotiSurveyExmplVO vo) throws Exception  {
    	return insert("Board230DAO.insertBbsTmpNotiSurveyExmpl", vo);
    }
    
    /**
     * 게시물 권한 입력 
     * @param BbsNotiUserMapVO - 입력할 정보가 담긴 VO 
     * @return 입력 성공 건수
	 * @exception Exception
     */
    public int insertBbsTmpNotiUserMap(BbsTmpNotiUserMapVO vo) throws Exception  {
    	return insert("Board230DAO.insertBbsTmpNotiUserMap", vo);
    }
    
    
    /**
	 * 임시저장 기본정보 조회
	 * @param BbsTmpNotiInfoVO - 조회할 정보가 담긴 Map
	 * @return 임시저장 정보 
	 * @exception
	 */
    public List<BbsTmpNotiInfoVO> getBbsTmpNotiInfoList(BbsTmpNotiInfoVO vo) {
    	return (List<BbsTmpNotiInfoVO>)list("Board230DAO.getBbsTmpNotiInfoList", vo);
    }
    
    /**
	 * 임시저장 첨부(이미지,동영상) 조회
	 * @param BbsTmpNotiApndFileVO - 조회할 정보가 담긴 Map
	 * @return 임시저장 첨부 정보 
	 * @exception
	 */
    public List<BbsTmpNotiApndFileVO> getBbsTmpNotiApndFileList(BbsTmpNotiApndFileVO vo) {
    	return (List<BbsTmpNotiApndFileVO>)list("Board230DAO.getBbsTmpNotiApndFileList", vo);
    }
    
    /**
	 * 임시저장 조회자 지정  조회
	 * @param BbsTmpNotiUserMapVO - 조회할 정보가 담긴 Map
	 * @return 임시저장 조회자 지정 정보 
	 * @exception
	 */
    public List<BbsTmpNotiUserMapVO> getBbsTmpNotiUserMapList(BbsTmpNotiUserMapVO vo) {
    	return (List<BbsTmpNotiUserMapVO>)list("Board230DAO.getBbsTmpNotiUserMapList", vo);
    }
    
    /**
	 * 임시저장 설문정보  조회
	 * @param BbsNotiSurveyVO - 조회할 정보가 담긴 Map
	 * @return 임시저장 설문 정보 
	 * @exception
	 */
    public List<BbsNotiSurveyVO> getBbsNotiSurveyList(BbsNotiSurveyVO vo) {
    	return (List<BbsNotiSurveyVO>)list("Board230DAO.getBbsNotiSurveyList", vo);
    }
    
    /**
	 * 임시저장 설문정보 보기 조회
	 * @param BbsNotiSurveyExmplVO - 조회할 정보가 담긴 Map
	 * @return 임시저장 설문 보기 정보 
	 * @exception
	 */
    public List<BbsNotiSurveyExmplVO> getBbsNotiSurveyExmplList(BbsNotiSurveyExmplVO vo) {
    	return (List<BbsNotiSurveyExmplVO>)list("Board230DAO.getBbsNotiSurveyExmplList", vo);
    }
    
    
    /**
	 * 게시물 조회 
	 * @param BbsNotiInfoVO - 조회할 정보가 담긴 Map
	 * @return 게시물 보기 정보 
	 * @exception
	 */
    public List<BbsNotiInfoVO> getBbsNotiInfoList(BbsNotiInfoVO vo) {
    	return (List<BbsNotiInfoVO>)list("Board230DAO.getBbsNotiInfoList", vo);
    }
    
    /**
	 * 게시물 첨부 조회 
	 * @param BbsNotiInfoVO - 조회할 정보가 담긴 Map
	 * @return 게시물 첨부  정보 
	 * @exception
	 */
    public List<BbsNotiApndFileVO> getBbsNotiApndFileList(BbsNotiApndFileVO vo) {	
    	return (List<BbsNotiApndFileVO>)list("Board230DAO.getBbsNotiApndFileList", vo);
    }
    
    /**
     * 임시게시물 수정 
     * @param BbsTmpNotiInfoVO - 수정할 정보가 담긴 VO 
     * @return 수정 성공 건수
	 * @exception Exception
     */
    public int updateBbsTmpNotiInfo(BbsTmpNotiInfoVO vo) throws Exception  {
    	return update("Board230DAO.updateBbsTmpNotiInfo", vo);
    }
    
    
    /**
     * 임시게시물 삭제
     * @param BbsTmpNotiInfoVO - 수정할 정보가 담긴 VO 
     * @return 삭제 성공 건수
	 * @exception Exception
     */
    public int deleteBbsTmpNotiInfo(BbsTmpNotiInfoVO vo) throws Exception  {
    	return delete("Board230DAO.deleteBbsTmpNotiInfo", vo);
    }
    
    /**
     * 임시 첨부 게시물 삭제 
     * @param BbsTmpNotiInfoVO - 수정할 정보가 담긴 VO 
     * @return 삭제 성공 건수
	 * @exception Exception
     */
    public int deleteBbsTmpNotiApndFile(BbsTmpNotiInfoVO vo) throws Exception  {
    	return delete("Board230DAO.deleteBbsTmpNotiApndFile", vo);
    }
    
    /**
     * 임시 첨부 설문 보기 삭제 
     * @param BbsTmpNotiInfoVO - 삭제할 정보가 담긴 VO 
     * @return 삭제 성공 건수
	 * @exception Exception
     */
    public int deleteBbsTmpNotiSurveyExmpl(BbsTmpNotiInfoVO vo) throws Exception  {
    	return delete("Board230DAO.deleteBbsTmpNotiSurveyExmpl", vo);
    }
    
    /**
     * 임시 첨부 설문 삭제 
     * @param BbsTmpNotiInfoVO - 삭제할 정보가 담긴 VO 
     * @return 삭제 성공 건수
	 * @exception Exception
     */
    public int deleteBbsTmpNotiSurvey(BbsTmpNotiInfoVO vo) throws Exception  {
    	return delete("Board230DAO.deleteBbsTmpNotiSurvey", vo);
    }
    
    /**
     * 임시 권한정보 삭제 
     * @param BbsTmpNotiInfoVO - 삭제할 정보가 담긴 VO 
     * @return 삭제 성공 건수
	 * @exception Exception
     */
    public int deleteBbsTmpNotiUserMap(BbsTmpNotiInfoVO vo) throws Exception  {
    	return delete("Board230DAO.deleteBbsTmpNotiUserMap", vo);
    }
    
}

