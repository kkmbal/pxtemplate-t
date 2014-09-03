package portalxpert.board.board213.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board211.model.BbsImgBoardNotiInfoVO;
import portalxpert.common.model.BoardSearchVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class Board213DAO extends EgovAbstractMapper {
	
	
	
	
    
    /**
	 *  Contents 게시판 (게시판 권한 포함 )리스트 
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  이미지 게시판 리스트 
	 * @exception Exception
	 */
	public List<BbsImgBoardNotiInfoVO> getBbsContentsBoardAuthBoardList(BbsImgBoardNotiInfoVO vo){
		return (List<BbsImgBoardNotiInfoVO>)list("Board213DAO.getBbsContentsBoardAuthBoardList", vo);
	}
	
    /**
	 *  Contents 게시판 (게시판 권한 포함 )리스트 건수
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  이미지 게시판 리스트 건수
	 * @exception Exception
	 */
	public int getBbsContentsBoardAuthBoardListCnt(BbsImgBoardNotiInfoVO vo){
		return (Integer) selectByPk("Board213DAO.getBbsContentsBoardAuthBoardListCnt", vo);
	}
    
    
    
    /**
	 *  Contents 게시판 (게시글 권한 포함 )리스트 
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  이미지 게시판 리스트 
	 * @exception Exception
	 */
	public List<BbsImgBoardNotiInfoVO> getBbsContentsBoardAuthNotiList(BbsImgBoardNotiInfoVO vo){
		return (List<BbsImgBoardNotiInfoVO>)list("Board213DAO.getBbsContentsBoardAuthNotiList", vo);
	}
	
    /**
	 *  Contents 게시판 (게시글 권한 포함 )리스트 건수
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  이미지 게시판 리스트 건수
	 * @exception Exception
	 */
	public int getBbsContentsBoardAuthNotiListCnt(BbsImgBoardNotiInfoVO vo){
		return (Integer) selectByPk("Board213DAO.getBbsContentsBoardAuthNotiListCnt", vo);
	}
    
    
    /**
	 * 게시물 정보 조회
	 * @param BoardSearchVO - 조회할 정보가 담긴 Map
	 * @return 게시물 정보 
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiInfoVO> getBbsNotiInfoListForPaging(BoardSearchVO vo)throws Exception {
    	return (List<BbsNotiInfoVO>)list("Board213DAO.getBbsNotiInfoListForPaging", vo);
    }
    
    /**
	 * 게시물 총 개수 조회
	 * @param BoardSearchVO - 조회할 정보가 담긴 VO
	 * @return 게시판 총 갯수
	 * @exception Exception
	 * @auther crossent 
	 */
    public int getBbsNotiInfoListTotCnt(BoardSearchVO vo)throws Exception{
    	return (Integer) selectByPk("Board213DAO.getBbsNotiInfoListTotCnt", vo);
    }
    
	
    
    
    
    
}
