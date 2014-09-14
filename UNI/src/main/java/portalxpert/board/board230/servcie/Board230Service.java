package portalxpert.board.board230.servcie;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import portalxpert.board.board100.model.BbsNotiApndFileVO;
import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board100.model.BbsNotiSurveyAnswVO;
import portalxpert.board.board100.model.BbsNotiSurveyExmplVO;
import portalxpert.board.board100.model.BbsNotiSurveyRsltVO;
import portalxpert.board.board100.model.BbsNotiSurveyVO;
import portalxpert.board.board230.model.BbsTmpNotiApndFileVO;
import portalxpert.board.board230.model.BbsTmpNotiInfoVO;
import portalxpert.board.board230.model.BbsTmpNotiUserMapVO;


public interface Board230Service {
	
	/**
	 * 동영상 파일 키
	 * @param 
	 * @return 동영상 파일 키
	 * @exception
	 */
   public int selectMovieKey() throws Exception;
   
   
   /**
	 * 게시물 정보 임시저장
	 * @param BbsNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return 게시물 임시저정 정보 입력
	 * @exception Exception
	 */
   BbsTmpNotiInfoVO insertBbsTmpNotiInfo(String json, HttpServletRequest request, HttpSession session) throws Exception;
   
   /**
     * yblee 
	 * 게시물 정보 임시저장
	 * @param BbsNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return 게시물 임시저정 정보 입력
	 * @exception Exception
	 */
  BbsTmpNotiInfoVO insertBbsTmpNotiInfoNew(String json, HttpServletRequest request, HttpSession session) throws Exception;
   
   /**
	 * 임시저장 정보 조회
	 * @param BbsTmpNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return 임시저장 정보 조회
	 * @exception Exception
	 */
   public List<BbsTmpNotiInfoVO> getBbsTmpNotiInfoList(BbsTmpNotiInfoVO vo) throws Exception;
   
   /**
	 * 임시저장 첨부 조회
	 * @param BbsTmpNotiApndFileVO - 조회할 정보가 담긴 VO
	 * @return 임시저장 첨부 조회
	 * @exception Exception
	 */
   public List<BbsTmpNotiApndFileVO> getBbsTmpNotiApndFileList(BbsTmpNotiApndFileVO vo) throws Exception;
   
   /**
	 * 임시저장 조회자 지정 조회
	 * @param BbsTmpNotiUserMapVO - 조회할 정보가 담긴 VO
	 * @return 임시저장 조회자 지정 조회
	 * @exception Exception
	 */   
   public List<BbsTmpNotiUserMapVO> getBbsTmpNotiUserMapList(BbsTmpNotiUserMapVO vo) throws Exception;
   
   /**
	 * 임시저장 설문 정보 조회
	 * @param BbsNotiSurveyVO - 조회할 정보가 담긴 VO
	 * @return 임시저장 조회자 지정 조회
	 * @exception Exception
	 */   
   public List<BbsNotiSurveyVO> getBbsNotiSurveyList(BbsNotiSurveyVO vo) throws Exception;
   
   /**
    * yblee
	 * 임시저장 설문 정보 조회
	 * @param BbsNotiSurveyVO - 조회할 정보가 담긴 VO
	 * @return 임시저장 조회자 지정 조회
	 * @exception Exception
	 */   
  public List<BbsNotiSurveyVO> getBbsNotiSurveyListNew(BbsNotiSurveyVO vo) throws Exception;
  
  /**
	 * 임시저장 설문 보기 정보  조회
	 * @param BbsNotiSurveyExmplVO - 조회할 정보가 담긴 VO
	 * @return 임시저장 설문 보기 정보 조회
	 * @exception Exception
	 */   
   public List<BbsNotiSurveyExmplVO> getBbsNotiSurveyExmplList(BbsNotiSurveyExmplVO vo) throws Exception ;
   
   /**
    * yblee
	 * 임시저장 설문 보기 정보  조회
	 * @param BbsNotiSurveyExmplVO - 조회할 정보가 담긴 VO
	 * @return 임시저장 설문 보기 정보 조회
	 * @exception Exception
	 */   
  public List<BbsNotiSurveyExmplVO> getBbsNotiSurveyExmplListNew(BbsNotiSurveyExmplVO vo) throws Exception ;
  
  /**
   * yblee
   * 설문 보기 결과 조회 
   * @param BbsNotiSurveyAnswVO - 조회할 정보가 담긴 VO 
   * @return 설문 보기 결과 정보
	 * @exception Exception
	 */
  public List<BbsNotiSurveyAnswVO> getBbsNotiSurveyAnswList(BbsNotiSurveyAnswVO vo) throws Exception ;
  
  /**
   * yblee
   * 설문 결과 문제별 카운트 조회 
   * @param BbsNotiSurveyRsltVO - 입력할 정보가 담긴 VO 
   * @return 설문 보기 결과 정보
	 * @exception Exception
   */
  public List<BbsNotiSurveyRsltVO> getSurveyRsltAnswCntList(BbsNotiSurveyRsltVO vo) throws Exception;
  
  /**
   * yblee
   * 설문 결과 참여인원수 조회 
   * @param BbsNotiSurveyRsltVO - 입력할 정보가 담긴 VO 
   * @return 설문 결과 참여인원수
	 * @exception Exception
   */
  public int getSurveyRsltMemberCnt(BbsNotiSurveyRsltVO vo) throws Exception;
  
  /**
   * yblee
	 * 설문결과 내 직접입력 및 주관식 엑셀다운
	 * @param BbsNotiSurveyRsltVO - 입력할 정보가 담긴 VO 
	 * @return 직접입력 및 주관식 정보  
	 * @exception Exception
	 */
  public List<BbsNotiSurveyRsltVO> getSurveyRsltExcelDown(BbsNotiSurveyRsltVO vo) throws Exception;
  
   /**
	 * 게시물 조회
	 * @param BbsNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return 게시물 조회 정보
	 * @exception Exception
	 */   
   public List<BbsNotiInfoVO> getBbsNotiInfoList(BbsNotiInfoVO vo) throws Exception;
   
   /**
	 * 게시물 첨부 조회
	 * @param BbsNotiApndFileVO - 조회할 정보가 담긴 VO
	 * @return 게시물첨부 조회 정보
	 * @exception Exception
	 */
   public List<BbsNotiApndFileVO> getBbsNotiApndFileList(BbsNotiApndFileVO vo) throws Exception;
   
	/**
    * 설문제출 여부 
    * @param   
    * @return 설문 제출 여부 
    */
	public int getBbsNotiSurveyResultYN(BbsNotiSurveyAnswVO vo)  throws Exception;
	
	/**
     * 소통글에 대한 설문 결과 등록 
     * @param 소통글에 대한 설문 결과정보  
     * @return 입력 객체
     */
	public BbsNotiSurveyAnswVO insertBbsNotiSurveyAnsw(String json, HttpSession session) throws Exception;
}
