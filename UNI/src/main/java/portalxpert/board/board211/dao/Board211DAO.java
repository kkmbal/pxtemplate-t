package portalxpert.board.board211.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board211.model.BbsImgBoardNotiInfoVO;
import portalxpert.common.model.BoardSearchVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class Board211DAO extends EgovAbstractMapper {
	
	
	
	/**
	 * 권한구분 조회
	 * @param 
	 * @return 권한구분 조회
	 * @exception Exception
	 * @author crossent
	 */
	public String getBbsImgBoardAuthFlag(String boardId){
		return (String) selectByPk("Board211DAO.getBbsImgBoardAuthFlag", boardId);
	}
	
	
	
	/**
	 *  이미지 게시판 (게시글 권한 포함 ) 리스트 
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  이미지 게시판 리스트 
	 * @exception Exception
	 */
	public List<BbsImgBoardNotiInfoVO> getBbsImgBoardAuthNotiList(BbsImgBoardNotiInfoVO vo){
		return (List<BbsImgBoardNotiInfoVO>)list("Board211DAO.getBbsImgBoardAuthNotiList", vo);
	}
	
    /**
	 *  이미지 게시판 (게시글 권한 포함 )리스트 건수
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  이미지 게시판 리스트 건수
	 * @exception Exception
	 */
	public int getBbsImgBoardAuthNotiListCnt(BbsImgBoardNotiInfoVO vo){
		return (Integer) selectByPk("Board211DAO.getBbsImgBoardAuthNotiListCnt", vo);
	}
	
    
    
    /**
	 *  이미지 게시판 (게시판 권한 포함 )리스트 
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  이미지 게시판 리스트 
	 * @exception Exception
	 */
	public List<BbsImgBoardNotiInfoVO> getBbsImgBoardAuthBoardList(BbsImgBoardNotiInfoVO vo){
		return (List<BbsImgBoardNotiInfoVO>)list("Board211DAO.getBbsImgBoardAuthBoardList", vo);
	}
	
    /**
	 *  이미지 게시판 (게시판 권한 포함 )리스트 건수
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  이미지 게시판 리스트 건수
	 * @exception Exception
	 */
	public int getBbsImgBoardAuthBoardListCnt(BbsImgBoardNotiInfoVO vo){
		return (Integer) selectByPk("Board211DAO.getBbsImgBoardAuthBoardListCnt", vo);
	}
    
    /**
	 * 이미지 게시판  게시물 삭제
	 * @param 
	 * @return  이미지 게시판  게시물 삭제
	 * @throws Exception
	 * @author crossent
	 */   
    public void updateImgNotiInfo(String notiId) throws Exception  {
    	update("Board211DAO.updateImgNotiInfo", notiId);
    }
    
   
    
    
    /**
	 * 공지 리스트 
	 * @param BbsImgBoardNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return  게시판별 공지 리스트 
	 * @exception Exception
	 */
    public List<BbsImgBoardNotiInfoVO> getBbsNotiList(String boardId){
    	return (List<BbsImgBoardNotiInfoVO>)list("Board211DAO.getBbsNotiList", boardId);
    }
	
    
    /**
	 * 게시물 정보 조회
	 * @param BoardSearchVO - 조회할 정보가 담긴 Map
	 * @return 게시물 정보 
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiInfoVO> getBbsNotiInfoListForPaging(BoardSearchVO vo)throws Exception {
    	return (List<BbsNotiInfoVO>)list("Board211DAO.getBbsNotiInfoListForPaging", vo);
    }
    
    /**
	 * 게시물 총 개수 조회
	 * @param BoardSearchVO - 조회할 정보가 담긴 VO
	 * @return 게시판 총 갯수
	 * @exception Exception
	 * @auther crossent 
	 */
    public int getBbsNotiInfoListTotCnt(BoardSearchVO vo)throws Exception{
    	return (Integer) selectByPk("Board211DAO.getBbsNotiInfoListTotCnt", vo);
    }
    
    
}
