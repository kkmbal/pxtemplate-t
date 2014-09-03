package portalxpert.board.board212.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board211.model.BbsImgBoardNotiInfoVO;
import portalxpert.board.board212.dao.Board212DAO;
import portalxpert.board.board212.service.Board212Service;
import portalxpert.common.config.Constant;
import portalxpert.common.model.BoardSearchVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;


@Service("board212Service")
public class Board212ServiceImpl extends EgovAbstractServiceImpl implements  Board212Service {
	

	@Autowired
    private Board212DAO board212Mapper;
	
	private final static Logger logger = LoggerFactory.getLogger(Board212ServiceImpl.class); 
	
	
	
    
    
    /**
	 * video 게시판  (게시판 권한 포함 ) 리스트 
	 * @param BbsImgBoardNotiInfoVO
	 * @return BbsImgBoardNotiInfoVO - 이미지 게시판 리스트
	 * @throws Exception
	 *  @author crossent
	 */   
    public List<BbsImgBoardNotiInfoVO> getBbsVideoBoardAuthBoardList(BbsImgBoardNotiInfoVO vo) throws Exception
    {
    	try{
    		return board212Mapper.getBbsVideoBoardAuthBoardList(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
        
    }

    /**
	 * video 게시판  (게시판 권한 포함 ) 리스트  건수
	 * @param BbsImgBoardNotiInfoVO
	 * @return  이미지 게시판 리스트 건수
	 * @throws Exception
	 * @author crossent
	 */   
    public int getBbsVideoBoardAuthBoardListCnt(BbsImgBoardNotiInfoVO vo) throws Exception 
    {
    	try{
    		return board212Mapper.getBbsVideoBoardAuthBoardListCnt(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    
    
    /**
	 * video 게시판  (게시글 권한 포함 ) 리스트 
	 * @param BbsImgBoardNotiInfoVO
	 * @return BbsImgBoardNotiInfoVO - 이미지 게시판 리스트
	 * @throws Exception
	 *  @author crossent
	 */   
    public List<BbsImgBoardNotiInfoVO> getBbsVideoBoardAuthNotiList(BbsImgBoardNotiInfoVO vo) throws Exception
    {
    	try{
    		return board212Mapper.getBbsVideoBoardAuthNotiList(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
        
    }

    /**
	 * video 게시판  (게시글 권한 포함 ) 리스트  건수
	 * @param BbsImgBoardNotiInfoVO
	 * @return  이미지 게시판 리스트 건수
	 * @throws Exception
	 * @author crossent
	 */   
    public int getBbsVideoBoardAuthNotiListCnt(BbsImgBoardNotiInfoVO vo) throws Exception
    {
    	try{
    		return board212Mapper.getBbsVideoBoardAuthNotiListCnt(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    
    /**
	 * 페이지별 게시물 정보 조회 
	 * @param BbsNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return 게시물 정보 
	 * @exception Exception
	 */    
    public List<BbsNotiInfoVO> getBbsNotiInfoListForPaging(BoardSearchVO vo) throws Exception {
    	try{
    		return board212Mapper.getBbsNotiInfoListForPaging(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
	 * 사용자 게시판 리스트 총 갯수
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 게시판 총 갯수
	 * @exception
	 */
    public int getBbsNotiInfoListTotCnt(BoardSearchVO vo)throws Exception  {
    	try{
    		return board212Mapper.getBbsNotiInfoListTotCnt(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    
    
}
