package portalxpert.adm.sys.model;

import portalxpert.common.model.SearchConditionVO;

public class AdmSysPsnUserInfoVO extends SearchConditionVO 
{
	private String userId; /*사용자_아이디*/
	private String userName; /*사용자_명*/
	private String userNick; /*사용자_닉네임*/
	private String userIntro; /*사용자_소개*/
	private String userJob; /*사용자_직업*/
	private Long slctPotoSeq; /*선택_사진_일련번호*/
	private String deptCode; /*부서_코드*/
	private String deptName; /*부서_코드_명*/
	private String userBirth; /*사용자_생일*/
	private String reprFilePath; /*대표_파일_경로*/
	private String reprFileName; /*대표_파일_명*/
	private String reprFilePrvwPath; /*대표_파일_미리보기_경로*/
	private String reprFilePrvwName; /*대표_파일_미리보기_명*/
	private Long restId; /*사용자_식당_아이디*/
	private String tmlnReadDttm; /*타임라인_조회_일시*/
	private String menu1ActDiv; /*메뉴1_동작_구분*/
	private String menu2ActDiv; /*메뉴2_동작_구분*/
	private String menu3ActDiv; /*메뉴3_동작_구분*/
	private String menu4ActDiv; /*메뉴4_동작_구분*/
	private String menu5ActDiv; /*메뉴5_동작_구분*/
	private String menu6ActDiv; /*메뉴6_동작_구분*/
	private String menu7ActDiv; /*메뉴7_동작_구분*/
	private String menu8ActDiv; /*메뉴8_동작_구분*/
	private String menu9ActDiv; /*메뉴9_동작_구분*/
	private Long smsBalCnt; /*SMS_잔여_건수*/
	private Long smsAllCnt; /*SMS_전체_건수*/
	private Long psnSaveQty; /*개인_저장_량*/
	private String delYn; /*삭제_여부*/
	private String regrId; /*등록자_아이디*/
	private String regrName; /*등록자_명*/
	private String regDttm; /*등록_일시*/
	private String updrId; /*수정자_아이디*/
	private String updrName; /*수정자_명*/
	private String updDttm; /*수정_일시*/
	
	private String  authCd;
	private String  authNm;
	private String titleName;
	private String telephonenumber;
	private String mobile;
	private String mail;
	private String interMail;
	private String userPassword;
	private String deptFname;
	private String seq;
	
	
	public String getAuthNm() {
		return authNm;
	}
	public void setAuthNm(String authNm) {
		this.authNm = authNm;
	}
	public String getAuthCd() {
		return authCd;
	}
	public void setAuthCd(String authCd) {
		this.authCd = authCd;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getTelephonenumber() {
		return telephonenumber;
	}
	public void setTelephonenumber(String telephonenumber) {
		this.telephonenumber = telephonenumber;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getInterMail() {
		return interMail;
	}
	public void setInterMail(String interMail) {
		this.interMail = interMail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getDeptFname() {
		return deptFname;
	}
	public void setDeptFname(String deptFname) {
		this.deptFname = deptFname;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUserIntro() {
		return userIntro;
	}
	public void setUserIntro(String userIntro) {
		this.userIntro = userIntro;
	}
	public String getUserJob() {
		return userJob;
	}
	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}
	public Long getSlctPotoSeq() {
		return slctPotoSeq;
	}
	public void setSlctPotoSeq(Long slctPotoSeq) {
		this.slctPotoSeq = slctPotoSeq;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getReprFilePath() {
		return reprFilePath;
	}
	public void setReprFilePath(String reprFilePath) {
		this.reprFilePath = reprFilePath;
	}
	public String getReprFileName() {
		return reprFileName;
	}
	public void setReprFileName(String reprFileName) {
		this.reprFileName = reprFileName;
	}
	public String getReprFilePrvwPath() {
		return reprFilePrvwPath;
	}
	public void setReprFilePrvwPath(String reprFilePrvwPath) {
		this.reprFilePrvwPath = reprFilePrvwPath;
	}
	public String getReprFilePrvwName() {
		return reprFilePrvwName;
	}
	public void setReprFilePrvwName(String reprFilePrvwName) {
		this.reprFilePrvwName = reprFilePrvwName;
	}
	public Long getRestId() {
		return restId;
	}
	public void setRestId(Long restId) {
		this.restId = restId;
	}
	public String getTmlnReadDttm() {
		return tmlnReadDttm;
	}
	public void setTmlnReadDttm(String tmlnReadDttm) {
		this.tmlnReadDttm = tmlnReadDttm;
	}
	public String getMenu1ActDiv() {
		return menu1ActDiv;
	}
	public void setMenu1ActDiv(String menu1ActDiv) {
		this.menu1ActDiv = menu1ActDiv;
	}
	public String getMenu2ActDiv() {
		return menu2ActDiv;
	}
	public void setMenu2ActDiv(String menu2ActDiv) {
		this.menu2ActDiv = menu2ActDiv;
	}
	public String getMenu3ActDiv() {
		return menu3ActDiv;
	}
	public void setMenu3ActDiv(String menu3ActDiv) {
		this.menu3ActDiv = menu3ActDiv;
	}
	public String getMenu4ActDiv() {
		return menu4ActDiv;
	}
	public void setMenu4ActDiv(String menu4ActDiv) {
		this.menu4ActDiv = menu4ActDiv;
	}
	public String getMenu5ActDiv() {
		return menu5ActDiv;
	}
	public void setMenu5ActDiv(String menu5ActDiv) {
		this.menu5ActDiv = menu5ActDiv;
	}
	public String getMenu6ActDiv() {
		return menu6ActDiv;
	}
	public void setMenu6ActDiv(String menu6ActDiv) {
		this.menu6ActDiv = menu6ActDiv;
	}
	public String getMenu7ActDiv() {
		return menu7ActDiv;
	}
	public void setMenu7ActDiv(String menu7ActDiv) {
		this.menu7ActDiv = menu7ActDiv;
	}
	public String getMenu8ActDiv() {
		return menu8ActDiv;
	}
	public void setMenu8ActDiv(String menu8ActDiv) {
		this.menu8ActDiv = menu8ActDiv;
	}
	public String getMenu9ActDiv() {
		return menu9ActDiv;
	}
	public void setMenu9ActDiv(String menu9ActDiv) {
		this.menu9ActDiv = menu9ActDiv;
	}
	public Long getSmsBalCnt() {
		return smsBalCnt;
	}
	public void setSmsBalCnt(Long smsBalCnt) {
		this.smsBalCnt = smsBalCnt;
	}
	public Long getSmsAllCnt() {
		return smsAllCnt;
	}
	public void setSmsAllCnt(Long smsAllCnt) {
		this.smsAllCnt = smsAllCnt;
	}
	public Long getPsnSaveQty() {
		return psnSaveQty;
	}
	public void setPsnSaveQty(Long psnSaveQty) {
		this.psnSaveQty = psnSaveQty;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	public String getRegrId() {
		return regrId;
	}
	public void setRegrId(String regrId) {
		this.regrId = regrId;
	}
	public String getRegrName() {
		return regrName;
	}
	public void setRegrName(String regrName) {
		this.regrName = regrName;
	}
	public String getRegDttm() {
		return regDttm;
	}
	public void setRegDttm(String regDttm) {
		this.regDttm = regDttm;
	}
	public String getUpdrId() {
		return updrId;
	}
	public void setUpdrId(String updrId) {
		this.updrId = updrId;
	}
	public String getUpdrName() {
		return updrName;
	}
	public void setUpdrName(String updrName) {
		this.updrName = updrName;
	}
	public String getUpdDttm() {
		return updDttm;
	}
	public void setUpdDttm(String updDttm) {
		this.updDttm = updDttm;
	}
	
}
