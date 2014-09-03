package portalxpert.board.board212.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board211.model.BbsImgBoardNotiInfoVO;
import portalxpert.common.model.BoardSearchVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class Board212DAO extends EgovAbstractMapper {
	
	
	
	
    
    /**
	 *  Video 게시판 (게시판 권한 포함 )리스트 
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  이미지 게시판 리스트 
	 * @exception Exception
	 */
	public List<BbsImgBoardNotiInfoVO> getBbsVideoBoardAuthBoardList(BbsImgBoardNotiInfoVO vo){
		return (List<BbsImgBoardNotiInfoVO>)list("Board212DAO.getBbsVideoBoardAuthBoardList", vo);
	}
	
    /**
	 *  Video 게시판 (게시판 권한 포함 )리스트 건수
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  이미지 게시판 리스트 건수
	 * @exception Exception
	 */
	public int getBbsVideoBoardAuthBoardListCnt(BbsImgBoardNotiInfoVO vo){
		return (Integer) selectByPk("Board212DAO.getBbsVideoBoardAuthBoardListCnt", vo);
	}
    
    
    
    /**
	 *  Video 게시판 (게시글 권한 포함 )리스트 
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  이미지 게시판 리스트 
	 * @exception Exception
	 */
	public List<BbsImgBoardNotiInfoVO> getBbsVideoBoardAuthNotiList(BbsImgBoardNotiInfoVO vo){
		return (List<BbsImgBoardNotiInfoVO>)list("Board212DAO.getBbsVideoBoardAuthNotiList", vo);
	}
	
    /**
	 *  Video 게시판 (게시글 권한 포함 )리스트 건수
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  이미지 게시판 리스트 건수
	 * @exception Exception
	 */
	public int getBbsVideoBoardAuthNotiListCnt(BbsImgBoardNotiInfoVO vo){
		return (Integer) selectByPk("Board212DAO.getBbsVideoBoardAuthNotiListCnt", vo);
	}
    
    
    /**
	 * 게시물 정보 조회
	 * @param BoardSearchVO - 조회할 정보가 담긴 Map
	 * @return 게시물 정보 
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiInfoVO> getBbsNotiInfoListForPaging(BoardSearchVO vo)throws Exception {
    	return (List<BbsNotiInfoVO>)list("Board212DAO.getBbsNotiInfoListForPaging", vo);
    }
    
    /**
	 * 게시물 총 개수 조회
	 * @param BoardSearchVO - 조회할 정보가 담긴 VO
	 * @return 게시판 총 갯수
	 * @exception Exception
	 * @auther crossent 
	 */
    public int getBbsNotiInfoListTotCnt(BoardSearchVO vo)throws Exception{
    	return (Integer) selectByPk("Board212DAO.getBbsNotiInfoListTotCnt", vo);
    }
    
	
    
    
    
    
}
