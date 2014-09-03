package portalxpert.board.board100.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import portalxpert.board.board100.model.BbsAddItemInfoVO;
import portalxpert.board.board100.model.BbsBoardAddItemVO;
import portalxpert.board.board100.model.BbsBoardChartPopVO;
import portalxpert.board.board100.model.BbsBoardInfoVO;
import portalxpert.board.board100.model.BbsBoardUserMapVO;
import portalxpert.board.board100.model.BbsNotiApndFileVO;
import portalxpert.board.board100.model.BbsNotiInfoVO;
import portalxpert.board.board100.model.BbsNotiOpnVO;
import portalxpert.board.board100.model.BbsNotiSurveyExmplVO;
import portalxpert.board.board100.model.BbsNotiSurveyVO;
import portalxpert.board.board100.model.BbsNotiUserMapVO;
import portalxpert.board.board100.model.BbsTotalSearchVO;
import portalxpert.board.board100.model.PbsUserBoardInfoVO;
import portalxpert.board.board100.model.PbsUserBoardPartInfoVO;
import portalxpert.board.board100.model.PsnTmlnInfoVO;
import portalxpert.common.model.BoardSearchVO;
import portalxpert.common.model.SearchConditionVO;
import portalxpert.organization.model.CategoryVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class Board100DAO  extends EgovAbstractMapper {

	
    public BbsBoardInfoVO getAdminBoardName(BbsBoardInfoVO vo) throws Exception {
    	return (BbsBoardInfoVO) selectByPk("Board100DAO.getAdminBoardName", vo);
    }
    
    /**
	 * 관리자 게시판 명을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return 동일 게시판 갯수
	 * @exception
	 */
    
    public int getAdminIsBoardName(BbsBoardInfoVO vo) {
    	return (Integer) selectByPk("Board100DAO.getAdminIsBoardName", vo);
    }
    
    /**
	 * 추가항목 리스트를 조회한다.
	 * @param 
	 * @return 추가 항목 리스트
	 * @exception
	 */
    public List<BbsAddItemInfoVO> getAdminAddItemList(BbsAddItemInfoVO vo) throws Exception {
    	return (List<BbsAddItemInfoVO>)list("Board100DAO.getAdminAddItemList", vo);
    }
    
    /**
	 * 공용 게시판 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return 게시판 목록
	 * @exception Exception
	 */
    public List<BbsBoardChartPopVO> getAdminBbsChartPopList(SearchConditionVO searchVO) throws Exception {
    	return (List<BbsBoardChartPopVO>)list("Board100DAO.getAdminBbsChartPopList", searchVO);
    }
    
    /**
	 * 공용 게시판 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return 게시판 총 갯수
	 * @exception
	 */
    public int getAdminBbsChartPopListTotCnt(SearchConditionVO searchVO) {
    	return (Integer) selectByPk("Board100DAO.getAdminBbsChartPopListTotCnt", searchVO);
    }
    
    /**
	 * 사용자 게시판 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return 게시판 목록
	 * @exception Exception
	 */
    public List<BbsBoardChartPopVO> getMyBbsChartPopList(BoardSearchVO boardSearchVO) throws Exception {
    	return (List<BbsBoardChartPopVO>)list("Board100DAO.getMyBbsChartPopList", boardSearchVO);
    }
    
    /**
	 * 사용자 게시판 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return 게시판 총 갯수
	 * @exception
	 */
    public int getMyBbsChartPopListTotCnt(BoardSearchVO boardSearchVO) {
    	return (Integer) selectByPk("Board100DAO.getMyBbsChartPopListTotCnt", boardSearchVO);
    }
    
    /**
     * 게시판 마스터 입력
     * @param vo 게시판 마스터 정보
     * @return 입력 성공 건수
     */
    public int insertAdminBbsBoardInfo(BbsBoardInfoVO vo) throws Exception  {
    	return insert("Board100DAO.insertAdminBbsBoardInfo", vo);
    }
    
    /**
     * 게시판 사용자 매핑 입력
     * @param vo 게시판 사용자 정보
     * @return 입력 성공 건수
     */
    public int insertAdminBbsBoardUserMap(BbsBoardUserMapVO vo) throws Exception  {
    	return insert("Board100DAO.insertAdminBbsBoardUserMap", vo);
    }
    
    /**
     * 게시판 추가 항목 입력
     * @param vo 게시판 추가항목 정보
     * @return 입력 성공 건수
     */
    public int insertAdminBbsBoardAddItem(BbsBoardAddItemVO vo) throws Exception  {
    	return insert("Board100DAO.insertAdminBbsBoardAddItem", vo);
    }
    
    
    /**
	 * 게시판 생성 내용을 조회한다.
	 * @param BbsBoardInfoVO - 조회할 정보가 담긴 Map
	 * @return 게시판 상세 내용
	 * @exception
	 */
    public List<BbsBoardInfoVO> getAdminBbsBoardInfoList(BbsBoardInfoVO searchVO) {
    	return (List<BbsBoardInfoVO>)list("Board100DAO.getAdminBbsBoardInfoList", searchVO);
    }
    
    /**
	 * 게시판 생성 사용자 매핑 정보 조회한다.
	 * @param BbsBoardUserMapVO - 조회할 정보가 담긴 Map
	 * @return 게시판 상세 내용
	 * @exception
	 */
    public List<BbsBoardUserMapVO> getAdminBbsBoardUserMapList(BbsBoardUserMapVO vo) {
    	return (List<BbsBoardUserMapVO>)list("Board100DAO.getAdminBbsBoardUserMapList", vo);
    }
    
    /**
	 * 게시판 생성 추가 항목정보를 조회한다.
	 * @param BbsBoardAddItemVO - 조회할 정보가 담긴 Map
	 * @return 게시판 상세 내용
	 * @exception
	 */
    public List<BbsBoardAddItemVO> getAdminBbsBoardAddItemList(BbsBoardAddItemVO vo) {
    	return (List<BbsBoardAddItemVO>)list("Board100DAO.getAdminBbsBoardAddItemList", vo);
    }
    
    /**
     * 게시판 마스터 수정
     * @param vo 게시판 마스터 정보
     * @return 수정 성공 건수
     */
    public int updateAdminBbsBoardInfo(BbsBoardInfoVO vo) throws Exception  {
    	return update("Board100DAO.updateAdminBbsBoardInfo", vo);
    }
    
    /**
     * 사용자 매핑 정보 삭제
     * @param vo 사용자 매핑 정보
     * @return 삭제 성공 건수
     */
    public int deleteAdminBbsBoardUserMap(BbsBoardUserMapVO vo) throws Exception  {
    	return delete("Board100DAO.deleteAdminBbsBoardUserMap", vo);
    }
    
    /**
     * 추가 항목정보 삭제
     * @param vo 추가 항목정보
     * @return 삭제 성공 건수
     */
    public int deleteAdminBbsBoardAddItem(BbsBoardAddItemVO vo) throws Exception  {
    	return delete("Board100DAO.deleteAdminBbsBoardAddItem", vo);
    }
    
    /**
	 * 사용자 게시판 명을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return 동일 게시판 갯수
	 * @exception
	 */
    public int getUserIsBoardName(PbsUserBoardInfoVO vo) {
    	return (Integer) selectByPk("Board100DAO.getUserIsBoardName", vo);
    }
    
    /**
     * 개인 게시판 메인 입력
     * @param vo 개인 게시판 입력 정보 
     * @return 입력 성공 건수
     */
    public int insertPbsUserBoardInfo(PbsUserBoardInfoVO vo) throws Exception  {
    	return insert("Board100DAO.insertPbsUserBoardInfo", vo);
    }
    
    /**
     * 개인 게시판 메인 수정
     * @param vo 개인 게시판 수정 정보 
     * @return 수정 성공 건수
     */
    public int updatePbsUserBoardInfo(PbsUserBoardInfoVO vo) throws Exception  {
    	return update("Board100DAO.updatePbsUserBoardInfo", vo);
    }
    
    /**
     * 개인 게시판 참여 정보 입력
     * @param vo 개인 게시판 참여 정보
     * @return 입력 성공 건수
     */
    public int insertPbsUserBoardPartInfo(PbsUserBoardPartInfoVO vo) throws Exception  {
    	return insert("Board100DAO.insertPbsUserBoardPartInfo", vo);
    }
    
    /**
     * 타임라인 정보 등록 
     * @param vo 타임라인 정보
     * @return 입력 성공 건수
     */
    public int insertPsnTmlnInfo(PsnTmlnInfoVO vo) throws Exception{
    	return insert("Board100DAO.insertPsnTmlnInfo", vo);
    }
    
    /**
     * 개인 게시판 참여 정보 삭제
     * @param vo 개인 게시판 참여 정보
     * @return 삭제 성공 건수
     */
    public int deletePbsUserBoardPartInfo(PbsUserBoardPartInfoVO vo) throws Exception  {
    	return delete("Board100DAO.deletePbsUserBoardPartInfo", vo);
    }
    
    /**
	 * 개인 게시판 정보를 조회한다.
	 * @param PbsUserBoardInfoVO - 조회할 정보가 담긴 Map
	 * @return 개인 게시판 내용 
	 * @exception
	 */
    public List<PbsUserBoardInfoVO> getPbsUserBoardInfoList(PbsUserBoardInfoVO vo) {
    	return (List<PbsUserBoardInfoVO>)list("Board100DAO.getPbsUserBoardInfoList", vo);
    }
    
    /**
	 * 개인 게시판 참여 정보를 조회한다.
	 * @param PbsUserBoardPartInfoVO - 조회할 정보가 담긴 Map
	 * @return 개인 게시판 참여 내용 
	 * @exception
	 */
    public List<PbsUserBoardPartInfoVO> getPbsUserBoardPartInfoList(PbsUserBoardPartInfoVO vo) {
    	return (List<PbsUserBoardPartInfoVO>)list("Board100DAO.getPbsUserBoardPartInfoList", vo);
    }
    
    /**
     * 게시물 정보 입력
     * @param vo 게시물 입력정보
     * @return 입력 성공 건수
     */
    public int insertBbsNotiInfo(BbsNotiInfoVO vo) throws Exception  {
    	return insert("Board100DAO.insertBbsNotiInfo", vo);
    }
    
    /**
	 * 게시물 정보 조회
	 * @param BbsNotiInfoVO - 조회할 정보가 담긴 Map
	 * @return 게시물 정보 
	 * @exception
	 */
    public List<BbsNotiInfoVO> getBbsNotiInfoList(BbsNotiInfoVO vo) {
    	return (List<BbsNotiInfoVO>)list("Board100DAO.getBbsNotiInfoList", vo);
    }
    
    /**
     * 의견 정보 입력
     * @param vo 의견 입력정보
     * @return 입력 성공 건수
     */
    public int insertBbsNotiOpn(BbsNotiOpnVO vo) throws Exception  {
    	return insert("Board100DAO.insertBbsNotiOpn", vo);
    }
    
    /**
	 * 의견 정보 조회
	 * @param BbsNotiOpnVO - 조회할 정보가 담긴 Map
	 * @return 의견 정보 
	 * @exception
	 */
    public List<BbsNotiOpnVO> getBbsNotiOpnList(BbsNotiOpnVO vo) {
    	return (List<BbsNotiOpnVO>)list("Board100DAO.getBbsNotiOpnList", vo);
    }
    
    /**
     * 첨부파일 입력
     * @param vo 첨부파일 입력정보
     * @return 첨부파일 성공 건수
     */
    public int insertBbsNotiApndFile(BbsNotiApndFileVO vo) throws Exception  {
    	return insert("Board100DAO.insertBbsNotiApndFile", vo);
    }
    
    /**
	 * 첨부파일 조회
	 * @param BbsTmpNotiApndFileVO - 조회할 정보가 담긴 Map
	 * @return 첨부파일 정보 
	 * @exception
	 */
    public List<BbsNotiApndFileVO> getBbsNotiApndFileList(BbsNotiApndFileVO vo) {
    	return (List<BbsNotiApndFileVO>)list("Board100DAO.getBbsNotiApndFileList", vo);
    }
    
    /**
	 * 사용자 게시판 리스트 
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 게시판 리스트
	 * @exception Exception
	 */
    public List<PbsUserBoardInfoVO> getUserBbsList(BoardSearchVO vo) throws Exception{
    	return (List<PbsUserBoardInfoVO>)list("Board100DAO.getUserBbsList", vo);
    }
    
    /**
	 * 사용자 게시판 리스트 총 갯수
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 게시판 총 갯수
	 * @exception
	 */
    public int getUserBbsListTotCnt(BoardSearchVO vo){
    	return (Integer) selectByPk("Board100DAO.getUserBbsListTotCnt", vo);
    }
    
    /**
	 * 사용자 게시판 삭제
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 삭제 성공
	 * @exception
	 */
    public int deleteUserBbs(PbsUserBoardInfoVO boardInfo){
    	return delete("Board100DAO.deleteUserBbs", boardInfo);
    }
    
    /**
	 * 게시판 종합 검색 리스트
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 게시판 리스트
	 * @exception Exception
	 */
    public List<BbsTotalSearchVO> getBbsTotalSearchList(SearchConditionVO searchVO) throws Exception{
    	return (List<BbsTotalSearchVO>)list("Board100DAO.getBbsTotalSearchList", searchVO);
    }
    
    /**
	 * 게시판 종합 검색 리스트 총 갯수
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 게시판 총 갯수
	 * @exception
	 */
    public int getBbsTotalSearchListTotCnt(SearchConditionVO searchVO){
    	return (Integer) selectByPk("Board100DAO.getBbsTotalSearchListTotCnt", searchVO);
    }
    
    /**
	 * 게시판 종합 검색 리스트
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 게시판 리스트
	 * @exception Exception
	 */
    public List<BbsTotalSearchVO> getBbsTotalSearchList2(SearchConditionVO searchVO) throws Exception{
    	return (List<BbsTotalSearchVO>)list("Board100DAO.getBbsTotalSearchList2", searchVO);
    }
    
    /**
	 * 게시판 종합 검색 리스트 총 갯수
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 게시판 총 갯수
	 * @exception
	 */
    public int getBbsTotalSearchListTotCnt2(SearchConditionVO searchVO){
    	return (Integer) selectByPk("Board100DAO.getBbsTotalSearchListTotCnt2", searchVO);
    }
    
    /**
     * 설문 정보 등록 
     * @param PsnTmlnApndFileVO - 입력할 정보가 담긴 VO 
     * @return 입력 성공 건수
	 * @exception Exception
     */
    public int insertBbsNotiSurvey(BbsNotiSurveyVO vo) throws Exception  {
    	return insert("Board100DAO.insertBbsNotiSurvey", vo);
    }
    
    
    /**
     * 설문 보기 정보 등록 
     * @param PsnTmlnApndFileVO - 입력할 정보가 담긴 VO 
     * @return 입력 성공 건수
	 * @exception Exception
     */
    public int insertBbsNotiSurveyExmpl(BbsNotiSurveyExmplVO vo) throws Exception  {
    	return insert("Board100DAO.insertBbsNotiSurveyExmpl", vo);
    }
    
    /**
     * 게시물 권한 입력 
     * @param BbsNotiUserMapVO - 입력할 정보가 담긴 VO 
     * @return 입력 성공 건수
	 * @exception Exception
     */
    public int insertBbsNotiUserMap(BbsNotiUserMapVO vo) throws Exception  {
    	return insert("Board100DAO.insertBbsNotiUserMap", vo);
    }
    
    /**
     * 게시물 권한 입력 
     * @param BoardSearchVO - 입력할 정보가 담긴 VO 
     * @return 입력 성공 건수
	 * @exception Exception
     */
    public String getUserBbsMapList(BoardSearchVO vo) throws Exception  {
    	return (String) selectByPk("Board100DAO.getUserBbsMapList", vo);
    }
    
    /**
     * 게시물 정보 수정
     * @param vo 게시물 수정 정보
     * @return 수정 성공 건수
     */
    public int updateBbsNotiInfo(BbsNotiInfoVO vo) throws Exception  {
    	return update("Board100DAO.updateBbsNotiInfo", vo);
    }
    
    /**
     * 설문 보기정보  삭제
     * @param vo 설문 보기 정보
     * @return 삭제 성공 건수
     */
    public int deleteBbsNotiSurveyExmpl(BbsNotiSurveyVO vo) throws Exception  {
    	return delete("Board100DAO.deleteBbsNotiSurveyExmpl", vo);
    }
    
    /**
     * 설문 정보  삭제
     * @param vo 설문  정보
     * @return 삭제 성공 건수
     */
    public int deleteBbsNotiSurvey(BbsNotiSurveyVO vo) throws Exception  {
    	return delete("Board100DAO.deleteBbsNotiSurvey", vo);
    }
    
    /**
     * 첨부 정보  삭제
     * @param vo 첨부  정보
     * @return 삭제 성공 건수
     */
    public int deleteBbsNotiApndFile(BbsNotiInfoVO vo) throws Exception  {
    	return delete("Board100DAO.deleteBbsNotiApndFile", vo);
    }
    
    /**
     * 게시물 권한 정보  삭제
     * @param vo 권한 정보
     * @return 삭제 성공 건수
     */
    public int deleteBbsNotiUserMap(BbsNotiInfoVO vo) throws Exception  {
    	return delete("Board100DAO.deleteBbsNotiUserMap", vo);
    }
    
    /**
	 * 사용자 게시글 삭제
	 * @param Map<String, Object> map
	 * @return 삭제 성공
	 * @exception Exception
	 * @auther crossent 
	 */
    public int deleteNotiInfo(Map<String, Object> map)throws Exception{
    	return delete("Board100DAO.deleteNotiInfo", map);
    }
    
    public int deleteBbsNotiAddItemForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiAddItemForBoard", map);
    }
    public int deleteBbsNotiApndFileForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiApndFileForBoard", map);
    }
    public int deleteBbsNotiEvalInfoForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiEvalInfoForBoard", map);
    }
    public int deleteBbsNotiOpnForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiOpnForBoard", map);
    }
    public int deleteBbsNotiOpnApndFileForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiOpnApndFileForBoard", map);
    }
    public int deleteBbsNotiOpnEvalInfoForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiOpnEvalInfoForBoard", map);
    }
    public int deleteBbsNotiPopupInfoForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiPopupInfoForBoard", map);
    }
    public int deleteBbsNotiSurveyForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiSurveyForBoard", map);
    }
    public int deleteBbsNotiSurveyAnswForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiSurveyAnswForBoard", map);
    }
    public int deleteBbsNotiSurveyExmplForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiSurveyExmplForBoard", map);
    }
    public int deleteBbsNotiTagInfoForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiTagInfoForBoard", map);
    }
    public int deleteBbsNotiUserEvalCntForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiUserEvalCntForBoard", map);
    }
    public int deleteBbsNotiUserMapForBoard (Map<String, Object> map) throws Exception {
    	return delete("Board100DAO.deleteBbsNotiUserMapForBoard", map);
    }
    
    /**
     * 게시판 접근 권한가져오기
     * @param BbsBoardInfoVO
     * @return List<BbsBoardInfoVO>
     * @exception Exception
     * @auther crossent 
     */
    public List<BbsBoardInfoVO> getBoardUserMapInfo(BbsBoardInfoVO vo)throws Exception{
    	return (List<BbsBoardInfoVO>)list("Board100DAO.getBoardUserMapInfo", vo);
    }
    
    /**
     * 게시글 PNUM 가져오기
     * @param BbsBoardInfoVO
     * @return int 
     * @exception Exception
     * @auther crossent 
     */
    public int getBbsMyPnumInfo(BbsNotiInfoVO vo) throws Exception{
    	return (Integer) selectByPk("Board100DAO.getBbsMyPnumInfo", vo);
    }
    
    /**
     * 게시물 권한 정보 조회
     * @param vo 권한 정보
     * @return 게시물 권한 정보
     */    
    public List<BbsNotiUserMapVO> getBbsNotiUserMapList(BbsNotiUserMapVO vo) {
    	return (List<BbsNotiUserMapVO>)list("Board100DAO.getBbsNotiUserMapList", vo);
    }
    
    /**
     * 게시판 카테고리 정보조회
     * @param vo 카테고리 정보
     * @return 게시판 카테고리 정보
     */    
    public CategoryVO selectMyCategoryCont(CategoryVO vo) {
    	return (CategoryVO) selectByPk("Board100DAO.selectMyCategoryCont", vo);
    }
    
    /**
     * 게시판 카테고리 건수조회
     * @param vo 카테고리 정보
     * @return 게시판 카테고리 정보 건수
     */    
    public int selectMyCategoryContCnt(CategoryVO vo) throws Exception  {
    	return (Integer) selectByPk("Board100DAO.selectMyCategoryContCnt", vo);
    }

    /**
     * 게시판 카테고리 정보 등록
     * @param vo 카테고리 정보
     * @return 게시판 카테고리 정보
	 * @exception Exception
     */
    public int insertPbsUserCategoryInfo(CategoryVO vo) throws Exception  {
    	return insert("Board100DAO.insertPbsUserCategoryInfo", vo);
    }

    /**
     * 게시판 카테고리 정보 수정
     * @param vo 카테고리 정보
     * @return 게시판 카테고리 정보
	 * @exception Exception
     */
    public int updatePbsUserCategoryInfo(CategoryVO vo) throws Exception  {
    	return update("Board100DAO.updatePbsUserCategoryInfo", vo);
    }
    
    /**
     * 선택한 카테고리 하위 개인 게시판 정보 조회
     * @param PbsUserBoardInfoVO
     * @return List<PbsUserBoardInfoVO>
     * @exception Exception
     * @auther 
     */
    public List<PbsUserBoardInfoVO> getPbsUserBoardInfoCateList(PbsUserBoardInfoVO vo)throws Exception{
    	return (List<PbsUserBoardInfoVO>)list("Board100DAO.getPbsUserBoardInfoCateList", vo);
    }
    
    /**
     * 선택한 카테고리 하위 공용 게시판 정보 조회
     * @param BbsBoardInfoVO
     * @return List<BbsBoardInfoVO>
     * @exception Exception
     * @auther 
     */
    public List<BbsBoardInfoVO> getBbsBoardInfoCateList(BbsBoardInfoVO vo)throws Exception{
    	return (List<BbsBoardInfoVO>)list("Board100DAO.getBbsBoardInfoCateList", vo);
    }
    
    /**
	 * 공용 게시판 삭제
	 * @param 
	 * @return 삭제 성공
	 * @exception
	 */
    public int deleteBbsBoardInfo(BbsBoardInfoVO boardInfo)throws Exception{
    	return delete("Board100DAO.deleteBbsBoardInfo", boardInfo);
    }
    
    /**
	 * 참여게시판 입력
	 * @param 
	 * @return 입력 성공
	 * @exception
	 */
    public int insertPbsUserBoardCateUse(PbsUserBoardInfoVO boardInfo)throws Exception{
    	return insert("Board100DAO.insertPbsUserBoardCateUse", boardInfo);
    }

    /**
     * 게시글 삭제여부
     * @param BoardSearchVO
     * @return String
     * @exception Exception
     * @auther crossent 
     */
    public String getNotiDelYn(BoardSearchVO vo)throws Exception{
    	return (String) selectByPk("Board100DAO.getNotiDelYn", vo);
    }
    
    /**
     * 게시글 권한 가져오기
     * @param BbsNotiInfoVO
     * @return int 
     * @exception Exception
     * @auther  
     */
    public int getNotiUserAuth(BbsNotiInfoVO vo) throws Exception{
    	return (Integer) selectByPk("Board100DAO.getNotiUserAuth", vo);
    }
    
    /**
     * 게시판 사용현황 가져오기
     * @param BbsBoardInfoVO
     * @return int 
     * @exception Exception
     * @auther  
     */
    public BbsBoardInfoVO getAdmBbsStat(BbsBoardInfoVO vo) throws Exception {
    	return (BbsBoardInfoVO) selectByPk("Board100DAO.getAdmBbsStat", vo);
    }
    
    /**
     * 게시판 공개여부 가져오기
     * @param BbsBoardInfoVO
     * @return int 
     * @exception Exception
     * @auther  
     */
    public BbsBoardInfoVO getAdminBoardOpen(BbsBoardInfoVO vo) throws Exception {
    	return (BbsBoardInfoVO) selectByPk("Board100DAO.getAdminBoardOpen", vo);
    }
}
