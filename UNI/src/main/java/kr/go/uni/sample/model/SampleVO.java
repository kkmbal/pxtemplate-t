package kr.go.uni.sample.model;

import kr.go.uni.common.model.PaginationVO;

/**
 * 
 * com.kats.common.sample.model.SampleRequestVO.java
 * 클래스 설명 : 
 * 		
 * @author 
 * @since 2014. 6. 16.
 * @version 1.0.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *  수정일		 	수정자		수정내용
 *  -------    		--------    ---------------------------
 *  2014. 6. 2.	    admin	    	최초 생성
 * </pre>
 */

public class SampleVO extends PaginationVO{

	private int rn;
	private String seq;
	private String docTitle;
	private String docUrl;
	private String authorName;
	private String authorAttach;
	private String authorTel;
	private String authorEmail;
	private String docDesc;
	private String attachFileId;
	private String regDate;
	private int readCount;
	
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getDocTitle() {
		return docTitle;
	}
	public void setDocTitle(String docTitle) {
		this.docTitle = docTitle;
	}
	public String getDocUrl() {
		return docUrl;
	}
	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorAttach() {
		return authorAttach;
	}
	public void setAuthorAttach(String authorAttach) {
		this.authorAttach = authorAttach;
	}
	public String getAuthorTel() {
		return authorTel;
	}
	public void setAuthorTel(String authorTel) {
		this.authorTel = authorTel;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public String getDocDesc() {
		return docDesc;
	}
	public void setDocDesc(String docDesc) {
		this.docDesc = docDesc;
	}
	public String getAttachFileId() {
		return attachFileId;
	}
	public void setAttachFileId(String attachFileId) {
		this.attachFileId = attachFileId;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	
	
    
	
}
