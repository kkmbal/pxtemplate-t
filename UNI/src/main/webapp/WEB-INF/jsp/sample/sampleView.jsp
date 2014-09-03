<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>

<%@ include file="/WEB-INF/jsp/common/include/includeTaglibs.jsp"%>

<title></title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />

<%@ include file="/WEB-INF/jsp/common/include/includeJsCss.jsp"%>

<script type="text/javascript">

	function fn_selectList() {
		document.frm.action = "<c:url value='/sample/selectSampleList.do'/>";
		document.frm.submit();
	}

</script>

</head>

<body>


<form name="frm">

<input name="pageIndex" type="hidden" value="<c:out value='${searchVO.pageIndex}'/>"/>

	<div class="transparent"></div>

	<div id="layerPopup" class="layerPopup">

		<div class="area_title_pop clfix">
			<h3>의견제출</h3>
		</div>

		<div class="scroll_A_pop">
		<table class="table_view_pop" summary="의견제출 상세(제목, 이름, 소속, 전화번호, 이메일, 내용, 첨부파일)">
		<caption>의견제출 상세</caption>
		<tbody>
		<tr>
			<th scope="row">제목</th>
			<td colspan="3" class="typeAB"><c:out value='${result.docTitle}'/></td>
		</tr>
		<tr>
			<th scope="row">이름</th>
			<td><c:out value='${result.authorName}'/></td>
			<th scope="row">소속</th>
			<td><c:out value='${result.authorAttach}'/></td>
		</tr>
		<tr>
			<th scope="row">전화번호</th>
			<td><c:out value='${result.authorTel}'/></td>
			<th scope="row">이메일</th>
			<td><c:out value='${result.authorEmail}'/></td>
		</tr>
		<tr>
			<th scope="row" rowspan="2">내용</th>
			<td colspan="3" class="typeAB">
				<a href="" class="link"><c:out value='${result.docUrl}'/></a>
			</td>
		</tr>
		<tr>
			<td colspan="3" class="typeAB">
				<c:out value='${result.docDesc}'/>
			</td>
		</tr>
		</tbody>
		</table>
		</div>
		<div class="area_btn_A_pop">
			<a href="javascript:fn_selectList();" class="btn_A">목록</a>
		</div>
		
		
	</div>
</form>
	

</body>
</html>