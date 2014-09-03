package portalxpert.board.board213.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board211.model.BbsImgBoardNotiInfoVO;
import portalxpert.board.board213.dao.Board213DAO;
import portalxpert.board.board213.service.Board213Service;
import portalxpert.common.config.Constant;
import portalxpert.common.model.BoardSearchVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;


@Service("board213Service")
public class Board213ServiceImpl extends EgovAbstractServiceImpl implements  Board213Service {
	

	@Autowired
    private Board213DAO board213Mapper;
	
	private final static Logger logger = LoggerFactory.getLogger(Board213ServiceImpl.class); 
	
	
	
    
    
    /**
	 * Contents 게시판  (게시판 권한 포함 ) 리스트 
	 * @param BbsImgBoardNotiInfoVO
	 * @return BbsImgBoardNotiInfoVO - 이미지 게시판 리스트
	 * @throws Exception
	 *  @author crossent
	 */   
    public List<BbsImgBoardNotiInfoVO> getBbsContentsBoardAuthBoardList(BbsImgBoardNotiInfoVO vo) throws Exception
    {
    	try{
    		return board213Mapper.getBbsContentsBoardAuthBoardList(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
        
    }

    /**
	 * Contents 게시판  (게시판 권한 포함 ) 리스트  건수
	 * @param BbsImgBoardNotiInfoVO
	 * @return  이미지 게시판 리스트 건수
	 * @throws Exception
	 * @author crossent
	 */   
    public int getBbsContentsBoardAuthBoardListCnt(BbsImgBoardNotiInfoVO vo) throws Exception
    {
    	try{
    		return board213Mapper.getBbsContentsBoardAuthBoardListCnt(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    
    
    /**
	 * Contents 게시판  (게시글 권한 포함 ) 리스트 
	 * @param BbsImgBoardNotiInfoVO
	 * @return BbsImgBoardNotiInfoVO - 이미지 게시판 리스트
	 * @throws Exception
	 *  @author crossent
	 */   
    public List<BbsImgBoardNotiInfoVO> getBbsContentsBoardAuthNotiList(BbsImgBoardNotiInfoVO vo) throws Exception
    {
    	try{    	
    		return board213Mapper.getBbsContentsBoardAuthNotiList(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
        
    }

    /**
	 * Contents 게시판  (게시글 권한 포함 ) 리스트  건수
	 * @param BbsImgBoardNotiInfoVO
	 * @return  이미지 게시판 리스트 건수
	 * @throws Exception
	 * @author crossent
	 */   
    public int getBbsContentsBoardAuthNotiListCnt(BbsImgBoardNotiInfoVO vo) throws Exception
    {
    	try{
    		return board213Mapper.getBbsContentsBoardAuthNotiListCnt(vo);
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
    		return board213Mapper.getBbsNotiInfoListForPaging(vo);
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
    		return board213Mapper.getBbsNotiInfoListTotCnt(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    
    
}
