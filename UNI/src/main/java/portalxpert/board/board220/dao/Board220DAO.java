package portalxpert.board.board220.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import portalxpert.board.board100.model.BbsNotiApndFileVO;
import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board100.model.BbsNotiOpnVO;
import portalxpert.common.model.BoardSearchVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

/**
 * @author crossent
 *
 */
@Repository
public class Board220DAO extends EgovAbstractMapper {

	/**
	 * 게시물 정보 조회
	 * @param BoardSearchVO - 조회할 정보가 담긴 Map
	 * @return 게시물 정보 
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiInfoVO> getBbsNotiInfoListForTmln(BoardSearchVO vo)throws Exception {
    	return (List<BbsNotiInfoVO>)list("Board220DAO.getBbsNotiInfoListForTmln", vo);
    }
    
    /**
	 * BBS 게시물 의견
	 * @param BbsNotiOpnVO - 조회할 정보가 담긴 VO
	 * @return BBS 게시물 의견
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiOpnVO> getBbsNotiOpnListForTmln(BbsNotiOpnVO vo)throws Exception {
    	return (List<BbsNotiOpnVO>)list("Board220DAO.getBbsNotiOpnListForTmln", vo);
    }
    
    /**
     * BBS 첨부
     * @param BbsNotiOpnVO - 조회할 정보가 담긴 VO
     * @return BBS 게시물 첨부
     * @exception Exception
     * @auther crossent 
     */
    public List<BbsNotiApndFileVO> getBbsNotiApndListForTmln(BbsNotiApndFileVO vo)throws Exception {
    	return (List<BbsNotiApndFileVO>)list("Board220DAO.getBbsNotiApndListForTmln", vo);
    }
	
}
