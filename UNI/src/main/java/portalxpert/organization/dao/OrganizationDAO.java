package portalxpert.organization.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import portalxpert.board.board100.model.PbsUserBoardCateUseVO;
import portalxpert.organization.model.BbsVO;
import portalxpert.organization.model.CategoryVO;
import portalxpert.organization.model.OrganizationVO;
import portalxpert.organization.model.UserVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class OrganizationDAO  extends EgovAbstractMapper {

	/**
	 * 조직 리스트
	 * @return 조직 리스트
	 * @exception Exception
	 */
	public List<OrganizationVO> getOrganizationList(OrganizationVO vo){
		return (List<OrganizationVO>)list("OrganizationDAO.getOrganizationList", vo);
	}

    /**
     * 조직도 검색
     * @return 조직도 리스트
     * @exception Exception
     */
	public List<OrganizationVO> getOrganizationListBySearch(OrganizationVO vo){
		return (List<OrganizationVO>)list("OrganizationDAO.getOrganizationListBySearch", vo);
	}

    /**
     * 조직도 에서 사용자조회
     * @param vo 부서코드
     * @return 사용자 리스트
     */
	public List<UserVO> getUserList(OrganizationVO vo){
		return (List<UserVO>)list("OrganizationDAO.getUserList", vo);
	}
	
    
    /**
     * 카테고리 정보 저장
     * @param vo 카테고리 정보(json)
     * @return 카테고리  리스트
     */
    public int insertCategory(CategoryVO vo) throws Exception  {
    	return insert("OrganizationDAO.insertCategory", vo);
    }
    
    /**
     * 카테고리 정보 저장
     * @param vo 카테고리 정보(json)
     * @return 카테고리  리스트
     */
    public int insertPbsUserBoardCateUse(PbsUserBoardCateUseVO pbsUserBoardCateUseVO) throws Exception{
    	return insert("OrganizationDAO.insertPbsUserBoardCateUse", pbsUserBoardCateUseVO);
    }
    
    /**
     * 카테고리 정보 삭제
     * @param vo 카테고리 정보(json)
     * @return 삭제 성공 여부
     */
    public int deleteCategory(CategoryVO vo) throws Exception{
    	return delete("OrganizationDAO.deleteCategory", vo);
    }
    
    /**
     * 게시판 사용 카테고리 삭제
     * @param vo 사용자 카테고리 
     * @return 삭제 성공 여부
     */
    public int deletePbsUserBoardCateUse(PbsUserBoardCateUseVO pbsUserBoardCateUseVO) throws Exception{
    	return delete("OrganizationDAO.deletePbsUserBoardCateUse", pbsUserBoardCateUseVO);
    }
    
    /**
     * 카테고리 정보 조회
     * @param vo 사용자 아이디
     * @return 카테고리 리스트
     */
    public List<CategoryVO> getCategoryList(CategoryVO vo){
    	return (List<CategoryVO>)list("OrganizationDAO.getCategoryList", vo);
    }
    
    /**
     * 카테고리 정보 조회
     * @param vo 사용자 아이디
     * @return 카테고리 리스트
     */
    public List<CategoryVO> getMyCategoryList(CategoryVO vo){
    	return (List<CategoryVO>)list("OrganizationDAO.getMyCategoryList", vo);
    }
    
    /**
     * 게시판 정보 조회
     * @param vo 사용자 아이디
     * @return 게시판 리스트
     */
    public List<CategoryVO> getBbsAuthList(BbsVO vo){
    	return (List<CategoryVO>)list("OrganizationDAO.getBbsAuthList", vo);
    }
    
    /**
     * 게시판 운영 정보 조회
     * @param vo 사용자 아이디
     * @return 게시판 리스트
     */
    public List<BbsVO> getBbsOperInfo(BbsVO vo){
    	return (List<BbsVO>)list("OrganizationDAO.getBbsOperInfo", vo);
    }

    /**
     * 사용자 직원 검색
     * @param userVO
     * @return
     * @author crossent
     */
    public List<UserVO> getDeptMemberList(UserVO userVO) throws Exception{
    	return (List<UserVO>)list("OrganizationDAO.getDeptMemberList", userVO);
    }
    
    /**
     * 사용자 직원 검색 건수
     * @param userVO
     * @return
     * @author crossent
     */
    public int getDeptMemberListTotCnt(UserVO userVO) throws Exception{
    	return (Integer) selectByPk("OrganizationDAO.getDeptMemberListTotCnt", userVO);
    }
    
    /**
     * 직원 검색
     * @param userVO
     * @return
     * @author crossent
     */
    public List<UserVO> getUserSearchList(UserVO userVO) throws Exception{
    	return (List<UserVO>)list("OrganizationDAO.getUserSearchList", userVO);
    }
    
    /**
     * 직원 검색 건수
     * @param userVO
     * @return
     * @author crossent
     */
    public int getUserSearchListTotCnt(UserVO userVO) throws Exception{
    	return (Integer) selectByPk("OrganizationDAO.getUserSearchListTotCnt", userVO);
    }
    
    /**
     * 부서명 가져오기
     * @param vo
     * @return
     * @throws Exception
     */
    public UserVO getDeptName(UserVO userVO) throws Exception{
    	return (UserVO) selectByPk("OrganizationDAO.getDeptName", userVO);
    }
    
    /**
     * 부서 인원수 가져오기
     * @param userVO
     * @return
     * @throws Exception
     * @author crossent
     */
    public int getDeptNameMemberCnt(OrganizationVO vo) throws Exception{
    	return (Integer) selectByPk("OrganizationDAO.getDeptNameMemberCnt", vo);
    }
    
    /**
     * 게시판 정보 조회
     * @param vo 사용자 아이디
     * @return 게시판 리스트
     */
    public List<BbsVO> getBbsAuthListNew(BbsVO vo){
    	return (List<BbsVO>)list("OrganizationDAO.getBbsAuthListNew", vo);
    }

}
