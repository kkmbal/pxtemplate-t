<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">

<%@ include file="/WEB-INF/jsp/common/include/includeTaglibs.jsp"%>

<head>
<title> </title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />

<%@ include file="/WEB-INF/jsp/common/include/includeJsCss.jsp"%>

<script type="text/javascript">
	function fn_selectList(pageNo) {
		document.frm.pageIndex.value = pageNo;
		document.frm.action = "<c:url value='/sample/selectSampleList.do'/>";
		document.frm.submit();
	}

	function fn_detail(seq) {
		document.frm.seq.value = seq;
		document.frm.action = "<c:url value='/sample/sampleView.do'/>";
		document.frm.submit();
	}

</script>

</head>

<body>


<!-- layout_layerPopup -->
<form name="frm">
	
<input name="pageIndex" type="hidden" value="<c:out value='${searchVO.pageIndex}'/>"/>
<input name="seq" type="hidden" value=""/>

	<div class="transparent"></div>
	
	<div id="layerPopup" class="layerPopup">

		<div class="area_title_pop clfix">
			<h3>의견제출</h3>
			<span class="total">총 <strong><c:out value="${resultCnt }"/></strong>건</span>
		</div>

		<table class="table_boardList_pop" summary="의견제출 목록(번호, 제목, 첨부파일, 등록일, 조회수)">
		<caption>의견제출 목록</caption>
		<colgroup>
			<col width="70px" />
			<col width="524px" />
			<col width="65px" />
			<col width="75px" />
			<col width="66px" />
		</colgroup>
		<thead>
		<tr>
			<th scope="col">No.</th>
			<th scope="col">제목</th>
			<th scope="col">첨부파일</th>
			<th scope="col">등록일</th>
			<th scope="col">조회수</th>
		</tr>
		</thead>
		<tbody>
			<c:choose>
	    		<c:when test="${paginationInfo.totalRecordCount == 0}">
	    			<tr>
						<td colspan="5" class="noData">해당 내역이 존재하지 않습니다.</td>
					</tr>
	    		</c:when>
	    		<c:otherwise>
					<c:forEach var="result" items="${resultList}" varStatus="status">
					<tr>
						<td><c:out value="${result.rn}"/></td>
						<td class="talL"><a href="javascript:fn_detail('<c:out value="${result.seq}"/>');" class="link" style="width:510px">${result.docTitle}<c:out value="${result.docTitle}"/></a></td>
						<td>
							<c:if test="${result.attachFileId != null}">
									<img src="<c:url value='/images/common/icon_file.gif' />" alt="" title="첨부파일" />
							</c:if>
						</td>
						<td><c:out value="${result.regDate}"/></td>
						<td><c:out value="${result.readCount}"/></td>
					</tr>
					</c:forEach>
				</c:otherwise>	
			</c:choose>	
		</tbody>
		</table>

		<!-- page -->
		<div class="page">
			<c:if test="${not empty paginationInfo}">
			<ui:pagination paginationInfo="${paginationInfo}" type="image" jsFunction="fn_selectList" />
			</c:if>
		</div>
		<!-- page E -->

	
	</div>
	
		<div class="area_btn_A_pop">
			<a href="<c:url value='/sample/sampleWrite.do'/>" class="btn_A">쓰기</a>
		</div>	

</form>
	

</body>
</html>