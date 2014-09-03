package portalxpert.organization.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import portalxpert.common.model.BoardSearchVO;
import portalxpert.organization.model.BbsVO;
import portalxpert.organization.model.CategoryVO;
import portalxpert.organization.model.OrganizationVO;
import portalxpert.organization.model.UserVO;

public interface OrganizationService {

	/**
	 * 조직 리스트
	 * @return 조직 리스트
	 * @exception Exception
	 */
    List<OrganizationVO> getOrganizationList() throws Exception;

    /**
     * 조직도 검색
     * @return 조직도 리스트
     * @exception Exception
     */
    List<OrganizationVO> getOrganizationListBySearch( String orgfullname) throws Exception;

	/**
	 * 조직도 에서 사용자조회
	 * @param oucode 부서코드
	 * @return 사용자 리스트
	 */
	List<UserVO> getUserList(OrganizationVO vo) throws Exception;
	
	/**
	 * 공용 카테고리 정보 저장	 
	 * * 
	 * @return 저장 성공 여부
	 */
	String insertCategory(CategoryVO vo) throws Exception;
	
	/**
	 * 사용자 카테고리 정보 저장	 
	 * * 
	 * @return 저장 성공 여부
	 */
	String insertMyCategory(CategoryVO vo,HttpSession session) throws Exception;
	
	/**
	 * 카테고리 정보 조회
	 * @param oucode 부서코드
	 * @return 사용자 리스트
	 */
	List<CategoryVO> getCategoryList(CategoryVO vo, String userId, HttpSession session)throws Exception;
	
	/**
	 * 사용자 직원 검색
	 * @param userVO
	 * @return
	 * @author crossent
	 */
	List<UserVO> getDeptMemberList(UserVO userVO) throws Exception;
	
	/**
	 * 사용자 직원 검색 건수
	 * @param userVO
	 * @return
	 * @author crossent
	 */
	int getDeptMemberListTotCnt(UserVO userVO) throws Exception;
	
	/**
	 * 직원 검색
	 * @param userVO
	 * @return
	 * @author crossent
	 */
	List<UserVO> getUserSearchList(UserVO userVO) throws Exception;
	
	/**
	 * 직원 검색 건수
	 * @param userVO
	 * @return
	 * @author crossent
	 */
	int getUserSearchListTotCnt(UserVO userVO) throws Exception;
	
	/**
	 * 부서명 가져오기
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	UserVO getDeptName(UserVO userVO) throws Exception;
	
	/**
	 * 부서 인원수 가져오기
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	int getDeptNameMemberCnt(OrganizationVO vo) throws Exception;
	
	
	public List<BbsVO> getUserBbsMapList(BoardSearchVO vo) throws Exception ;

	
	
    /**
     * 게시판 운영 정보 조회
     * @param vo 사용자 아이디
     * @return 게시판 리스트
     */
    public List<BbsVO> getBbsOperInfo(BbsVO vo) throws Exception;
}
