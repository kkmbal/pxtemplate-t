package kr.go.uni.common.model;


/**
 * 
 * kr.co.intsystem.egovframework.common.model.PaginationVO.java
 * 클래스 설명 : 
 * 		
 * @author 
 * @since 2014. 6. 23.
 * @version 1.0.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *  수정일		 	수정자		수정내용
 *  -------    		--------    ---------------------------
 *  2014. 6. 23.	      		    	최초 생성
 * </pre>
 */

public class PaginationVO {

	/** 페이지사이즈 */
	private int pageSize = 10;
	
	/** recordCountPerPage */
	private int recordCountPerPage = 10;
	
	/** 현재페이지 */
    private int pageIndex = 1;

    /** firstIndex */
    private int firstIndex = 1;

    /** lastIndex */
    private int lastIndex = 1;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}

	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getFirstIndex() {
		return firstIndex;
	}

	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}

	public int getLastIndex() {
		return lastIndex;
	}

	public void setLastIndex(int lastIndex) {
		this.lastIndex = lastIndex;
	}

}
