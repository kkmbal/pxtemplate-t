package portalxpert.board.board213.service;

import java.util.List;

import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board211.model.BbsImgBoardNotiInfoVO;
import portalxpert.common.model.BoardSearchVO;


public interface Board213Service 
{
	


	/**
	 * Contents 게시판  (게시판 권한 포함 ) 리스트 
	 * @param BbsImgBoardNotiInfoVO -  조회할 정보가 담긴 VO
	 * @return 이미지 게시판 리스트 
	 * @exception Exception
	 * @author crossent
	 */
	List<BbsImgBoardNotiInfoVO> getBbsContentsBoardAuthBoardList(BbsImgBoardNotiInfoVO vo) throws Exception;
	
	
	/**
	 * Contents 게시판 (게시판 권한 포함 ) 리스트 건수
	 * @param BbsImgBoardNotiInfoVO -  조회할 정보가 담긴 VO
	 * @return 이미지 게시판 리스트 건수
	 * @exception Exception
	 * @author crossent
	 */
	int getBbsContentsBoardAuthBoardListCnt(BbsImgBoardNotiInfoVO vo) throws Exception;
	
	
	/**
	 * Contents 게시판  (게시글 권한 포함 ) 리스트 
	 * @param BbsImgBoardNotiInfoVO -  조회할 정보가 담긴 VO
	 * @return 이미지 게시판 리스트 
	 * @exception Exception
	 * @author crossent
	 */
	List<BbsImgBoardNotiInfoVO> getBbsContentsBoardAuthNotiList(BbsImgBoardNotiInfoVO vo) throws Exception;
	
	
	/**
	 * Contents 게시판 (게시글 권한 포함 ) 리스트 건수
	 * @param BbsImgBoardNotiInfoVO -  조회할 정보가 담긴 VO
	 * @return 이미지 게시판 리스트 건수
	 * @exception Exception
	 * @author crossent
	 */
	int getBbsContentsBoardAuthNotiListCnt(BbsImgBoardNotiInfoVO vo) throws Exception;
	
	/**
	 * 페이지별 게시물 정보 조회(이미지형)
	 * @param BbsNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return 게시물 정보
	 * @exception Exception
	 */
    List<BbsNotiInfoVO> getBbsNotiInfoListForPaging(BoardSearchVO vo) throws Exception;
    
    /**
	 * 게시물 정보 조회 카운트(이미지)
	 * @param BbsNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return 게시물 정보
	 * @exception Exception
	 */
    int getBbsNotiInfoListTotCnt(BoardSearchVO vo) throws Exception;
	
	
	
	
}
