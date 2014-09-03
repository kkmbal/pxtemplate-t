package portalxpert.board.board230.servcie;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import portalxpert.board.board100.model.BbsNotiApndFileVO;
import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board100.model.BbsNotiSurveyExmplVO;
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
	 * 임시저장 설문 보기 정보  조회
	 * @param BbsNotiSurveyExmplVO - 조회할 정보가 담긴 VO
	 * @return 임시저장 설문 보기 정보 조회
	 * @exception Exception
	 */   
   public List<BbsNotiSurveyExmplVO> getBbsNotiSurveyExmplList(BbsNotiSurveyExmplVO vo) throws Exception ;
   
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
   
      
}
