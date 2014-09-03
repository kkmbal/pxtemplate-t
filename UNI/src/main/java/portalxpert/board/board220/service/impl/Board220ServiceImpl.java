package portalxpert.board.board220.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import portalxpert.board.board100.dao.Board100DAO;
import portalxpert.board.board100.model.BbsNotiApndFileVO;
import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board100.model.BbsNotiOpnVO;
import portalxpert.board.board220.dao.Board220DAO;
import portalxpert.board.board220.service.Board220Service;
import portalxpert.common.config.Constant;
import portalxpert.common.model.BoardSearchVO;
import portalxpert.common.model.UserInfoVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("board220Service")
public class Board220ServiceImpl extends EgovAbstractServiceImpl implements Board220Service {

	@Autowired
    private Board220DAO board220Mapper;
    
	@Autowired
    private Board100DAO board100Mapper;
	
	/**
	 * 페이지별 게시물 정보 조회 
	 * @param BbsNotiInfoVO - 조회할 정보가 담긴 VO
	 * @return 게시물 정보 
	 * @exception Exception
	 */  
	public List<BbsNotiInfoVO> getBbsNotiInfoListForTmln(BoardSearchVO vo) throws Exception {
		try{
			return board220Mapper.getBbsNotiInfoListForTmln(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
	}

    /**
	 * BBS 게시물 의견
	 * @param BbsNotiOpnVO - 조회할 정보가 담긴 VO
	 * @return BBS 게시물 의견
	 * @exception Exception
	 * @auther crossent 
	 */
    public List<BbsNotiOpnVO> getBbsNotiOpnListForTmln(BbsNotiOpnVO vo)throws Exception {
    	try{
    		return board220Mapper.getBbsNotiOpnListForTmln(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
     * BBS 첨부
     * @param BbsNotiOpnVO - 조회할 정보가 담긴 VO
     * @return BBS 게시물 첨부
     * @exception Exception
     * @auther crossent 
     */
    public List<BbsNotiApndFileVO> getBbsNotiApndListForTmln(BbsNotiApndFileVO vo)throws Exception {
    	try{
    		return board220Mapper.getBbsNotiApndListForTmln(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
    }
    
    /**
     * 게시물수정
     * @exception Exception
     * @auther crossent 
     */
    public BbsNotiInfoVO updateBbsNotiInfo(String json, HttpSession session, HttpServletRequest request) throws Exception{
    	BbsNotiInfoVO vo = new BbsNotiInfoVO();
		try {
			
			UserInfoVO info = (UserInfoVO)session.getAttribute("pxLoginInfo");
			JSONObject bbsNotiObject = JSONObject.fromObject(json);
			vo.setBoardId((String)bbsNotiObject.get("boardId")) ;
			vo.setNotiId((String)bbsNotiObject.get("notiId")) ;
			vo.setNotiConts((String)bbsNotiObject.get("notiConts")) ;
			vo.setUpdrId(info.getId()) ;
			vo.setUpdrName(info.getName()) ;
			vo.setIsAdmin("");
			
			board100Mapper.updateBbsNotiInfo(vo);
		}catch(Exception e){
			throw processException(Constant.E000001.getVal(), new String[]{e.toString(), this.getClass().getSimpleName()}, e);
		}
		
		return vo;
    }
    	
}
