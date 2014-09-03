package portalxpert.main.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import portalxpert.common.model.UserInfoVO;
import portalxpert.main.model.MainVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class MainDAO  extends EgovAbstractMapper{

	
	/**
	 * 최근게시물 - 전체공지 조회
	 * @param mainVO
	 * @return
	 * @throws Exception
	 * @author crossent
	 */
	public List getTotalNoticeList(MainVO mainVO) throws Exception{
		return (List)list("MainDAO.getTotalNoticeList", mainVO);
	}
	
	/**
	 * 게시물 조회
	 * @param mainVO
	 * @return
	 * @throws Exception
	 * @author crossent
	 */
	public List getBoardList(MainVO mainVO) throws Exception{
		return (List)list("MainDAO.getBoardList", mainVO);
	}
	
	/**
	 * 최근게시물 - 게시물 preview
	 * @param mainVO
	 * @return
	 * @throws Exception
	 * @author crossent	 
	 */
	public MainVO getNoticePreview(MainVO mainVO) throws Exception{
		return (MainVO) selectByPk("MainDAO.getNoticePreview", mainVO);
	}
	
	/**
	 * 최근게시물 설정- 설정 게시판 조회
	 * @param userVO
	 * @return
	 * @throws Exception
	 * @author crossent	 
	 */
	public List getUserBoardList(UserInfoVO userVO) throws Exception{
		return (List)list("MainDAO.getUserBoardList", userVO);
	}
	
	/**
	 * 최근게시물 설정- 사용자 설정 게시판 건수
	 * @param userVO
	 * @return
	 * @throws Exception
	 * @author crossent	 
	 */
	public int getUserBoardSetCnt(UserInfoVO userVO) throws Exception{
		return (Integer) selectByPk("MainDAO.getUserBoardSetCnt", userVO);
	}
	
	/**
	 * 최근게시물 설정 - 사용자 설정 삭제
	 * @param userVO
	 * @return
	 * @throws Exception
	 * @author crossent	 
	 */
	public void deleteUserBoardSet(UserInfoVO userVO) throws Exception{
		delete("MainDAO.deleteUserBoardSet", userVO);
	}
	
	/**
	 * 최근게시물 설정 - 사용자 설정 저장
	 * @param mainVO
	 * @return
	 * @throws Exception
	 * @author crossent	 
	 */
	public void insertUserBoardSet(MainVO mainVO) throws Exception{
		insert("MainDAO.insertUserBoardSet", mainVO);
	}
	
	/**
	 * 게시물 평가 정보 읽음 건수
	 * @param mainVO
	 * @return
	 * @throws Exception
	 */
	public int getBbsNotiEvalInfoCnt(MainVO mainVO) throws Exception{
		return (Integer) selectByPk("MainDAO.getBbsNotiEvalInfoCnt", mainVO);
	}
	
	/**
	 * 게시물 평가 정보 읽음 저장
	 * @param mainVO
	 * @throws Exception
	 * @author crossent	 
	 */
	public void insertBbsNotiEvalInfo(MainVO mainVO) throws Exception{
		insert("MainDAO.insertBbsNotiEvalInfo", mainVO);
	}
	
	/**
	 * 게시물 읽음 카운트 증가
	 * @param mainVO
	 * @throws Exception
	 */
	public void updateBbsNotiInfoReadCnt(MainVO mainVO) throws Exception{
		update("MainDAO.updateBbsNotiInfoReadCnt", mainVO);
	}
	
	/**
	 * 관심시스템 조회
	 * @return mainVO
	 * @exception Exception
	 * @author crossent
	 */
	public List getTagCloudList(MainVO mainVO) throws Exception{
		return (List)list("MainDAO.getTagCloudList", mainVO);
	}
	
	/**
	 * 업무데스크 - 사용자 설정 조회
	 * @param userVO
	 * @return
	 * @throws Exception
	 * @author crossent	 
	 */
	public List getUserWorkDeskList(UserInfoVO userVO) throws Exception{
		return (List)list("MainDAO.getUserWorkDeskList", userVO);
	}
	
	/**
	 * 업무데스크 사용자 카운트
	 * @param userVO
	 * @return
	 * @throws Exception
	 * @author crossent	 
	 */
	public int getUserWorkDeskCnt(UserInfoVO userVO) throws Exception{
		return (Integer) selectByPk("MainDAO.getUserWorkDeskCnt", userVO);
	}
	
	/**
	 * 업무데스크 기본 카운트
	 * @return
	 * @throws Exception
	 * @author crossent	 
	 */
	public int getDefaultWorkDeskCnt() throws Exception{
		return (Integer) selectByPk("MainDAO.getDefaultWorkDeskCnt", null);
	}
	
	/**
	 * 업무데스크 - 사용자 설정 삭제
	 * @param userVO
	 * @return
	 * @throws Exception
	 * @author crossent	 
	 */
	public void deleteUserWorkDesk(UserInfoVO userVO) throws Exception{
		delete("MainDAO.deleteUserWorkDesk", userVO);
	}
	
	/**
	 * 업무데스크 - 사용자 설정 저장
	 * @param mainVO
	 * @return
	 * @throws Exception
	 * @author crossent	 
	 */
	public void insertUserWorkDesk(MainVO mainVO) throws Exception{
		insert("MainDAO.insertUserWorkDesk", mainVO);
	}
	
	/**
	 * 최근 동영상/이미지
	 * @return
	 * @throws Exception
	 * @author crossent
	 */
	public List getRecentVodImageList() throws Exception{
		return (List)list("MainDAO.getRecentVodImageList", null);
	}
	
	/**
	 * 많이 본 동영상/이미지
	 * @return
	 * @throws Exception
	 * @author crossent
	 */
	public List getMostViewedVodImageList() throws Exception{
		return (List)list("MainDAO.getMostViewedVodImageList", null);
	}
	
	/**
	 * 공지게시 팝업 조회
	 * @return
	 * @throws Exception
	 * @author crossent
	 */
	public List getNotiPopup() throws Exception{
		return (List)list("MainDAO.getNotiPopup", null);
	}
	

	
	/**
	 * 공지게시 팝업 카운트
	 * @return
	 * @throws Exception
	 * @author crossent
	 */
	public int getNotiPopupCnt() throws Exception{
		return (Integer) selectByPk("MainDAOgetNotiPopupCnt.", null);
	}
	
	
}