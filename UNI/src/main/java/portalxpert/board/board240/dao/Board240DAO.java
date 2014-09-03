package portalxpert.board.board240.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import portalxpert.board.board230.model.BbsTmpNotiInfoVO;
import portalxpert.common.model.BoardSearchVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class Board240DAO extends EgovAbstractMapper  {

	/**
	 * 임시저장 기본정보 조회
	 * @param BbsTmpNotiInfoVO - 조회할 정보가 담긴 Map
	 * @return 임시저장 정보 
	 * @exception
	 */
    public List<BbsTmpNotiInfoVO> getBbsTmpNotiInfoListForPaging(BoardSearchVO vo)throws Exception  {
    	return (List<BbsTmpNotiInfoVO>)list("Board240DAO.getBbsTmpNotiInfoListForPaging", vo);
    }

    /**
	 * 임시 게시물 총 개수 조회
	 * @param BoardSearchVO - 조회할 정보가 담긴 VO
	 * @return 게시판 총 갯수
	 * @exception Exception
	 * @auther crossent 
	 */
    public int getBbsTmpNotiInfoListTotCnt(BoardSearchVO vo)throws Exception{
    	return (Integer) selectByPk("Board240DAO.getBbsTmpNotiInfoListTotCnt", vo);
    }
}

