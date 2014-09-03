package portalxpert.board.board230.dao;

import org.springframework.stereotype.Repository;

import portalxpert.board.board230.model.BBSMovieVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class BBSMovieDAO extends EgovAbstractMapper {

	/**
     * 동영상  목록 화면
     @param searchVO - 조회할 정보가 담긴 SearchConditionVO
     * @return ArrayList
     * @exception Exception
     
    public ArrayList getBBSMovieList(SearchConditionVO searchVO) throws Exception;
    */
    /**
     * 동영상  목록 Total Count
     @param searchVO - 조회할 정보가 담긴 SearchConditionVO
     * @return int
     * @exception Exception
     
    public int getBBSMovieListTotCnt(SearchConditionVO searchVO) throws Exception;
    */
	
    /**
     * 동영상 상세화면 조회
     * @param bbsMovieVO - 등록할 정보가 담긴 vo
     * @return BBSMovieVO
     * @exception Exception
     
	public BBSMovieVO getBBSMovieSelect(BBSMovieVO bbsMovieVO)throws Exception;
    */
	
	/**
	 * 동영상서버에서 보내는 메타 데이터를 DB에 저장한다
     * @param bbsMovieVO - 등록할 정보가 담긴 vo
	 * @return 등록 결과
	 * @exception Exception
	 */
    public int insertBBSMovie(BBSMovieVO bbsMovieVO){
    	return insert("BBSMovieDAO.insertBBSMovie", bbsMovieVO);
    }
    
    public int updateTnMspMvp(BBSMovieVO bbsMovieVO){
    	return insert("BBSMovieDAO.updateTnMspMvp", bbsMovieVO);
    }
    
    public int getTnMspMvpCnt(BBSMovieVO bbsMovieVO){
    	return (Integer) selectByPk("BBSMovieDAO.getTnMspMvpCnt", bbsMovieVO);
    }
    
	/**
	 * 동영상 플레이 정보
	 * @param bbsMovieVO
	 * @return
	 */
    public BBSMovieVO getMoviePlayInfo(BBSMovieVO bbsMovieVO){
    	return (BBSMovieVO) selectByPk("BBSMovieDAO.getMoviePlayInfo", bbsMovieVO);
    }
}
