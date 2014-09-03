<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>

<%@ include file="/WEB-INF/jsp/common/include/includeTaglibs.jsp"%>

<title></title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />

<%@ include file="/WEB-INF/jsp/common/include/includeJsCss.jsp"%>

<script type="text/javascript">
	$(document).ready(function() {
			$("#telephone").css("ime-mode", "disabled");
			$("#name").css("ime-mode", "active");
			$("#part").css("ime-mode", "active");
			$("#email").css("ime-mode", "inactive");
			$("#email3").css("ime-mode", "inactive");
			
	});


	function fn_save() {
		var frm = document.frm;
		
		if($("#name").val() == "") {
			alert("이름을 입력해 주십시오.");
			$("#name").focus();
			return;
		}
		if($("#part").val() == "") {
			alert("소속을 입력해 주십시오.");
			$("#part").focus();
			return;
		}
		if($("#telephone").val() == "") {
			alert("전화번호를 입력해 주십시오.");
			$("#telephone").focus();
			return;
		}
		if($("#email").val() == "") {
			alert("이메일을 입력해 주십시오.");
			$("#email").focus();
			return;
		}
		
		if(confirm("저장하시겠습니까?")) {
			//debugger;
			//document.form_1.text_1.value = "";
			//frm.action = "<c:url value='/sample/sampleSave.do'/>";
			//frm.submit();
			
			var obj = {
				"authorName" : $("#authorName").val(),
				"authorAttach" : $("#authorAttach").val(),
				"authorTel" : $("#authorTel").val(),
				"authorEmail" : $("#authorEmail").val(),
				"docDesc" : $("#docDesc").val()
			};			
			
			PortalCommon.getJson({
				url : "<c:url value='/sample/sampleSave.do'/>",
				data: { data : JSON.stringify(obj) },
				success : function(data) {
					if (data.jsonResult.success === true) {
						location.href = "<c:url value='/sample/selectSampleList.do'/>"; 
					}
				}
			});			
		}
	
	}
	
	function fn_cancel() {
		location.href = "<c:url value='/sample/selectSampleList.do'/>";
	}
</script>

</head>

<body>

	
	<div class="transparent"></div>
	
	<div id="layerPopup" class="layerPopup">

		<div class="area_title_pop clfix">
			<h3>의견제출</h3>
			<span class="description"><strong>*</strong> 는 필수입력사항입니다.</span>
		</div>

		<div class="scroll_A_pop">
		<form method="post" id="frm" name="frm">
		<fieldset>
		<legend>의견제출 등록</legend>
		<table class="table_write_pop" summary="의견제출 등록(이름, 소속, 전화번호, 이메일, 내용, 첨부파일)">
		<caption>의견제출 등록</caption>
		<tbody>
		<tr>
			<th scope="row" class="borderBn paT13"><label for="name"><strong class="requisite">이름<span>필수입력사항</span></strong></label></th>
			<td class="typeAB borderBn paT8"><input type="text" id="authorName" name="authorName" value="" class="input" style="width:126px" maxLength="18"/></td>
		</tr>
		<tr>
			<th scope="row" class="borderBn"><label for="part"><strong class="requisite">소속<span>필수입력사항</span></strong></label></th>
			<td class="typeAB borderBn"><input type="text" id="authorAttach" name="authorAttach" value="" class="input" style="width:265px" maxLength="190"/></td>
		</tr>
		<tr>
			<th scope="row" class="borderBn"><label for="telephone"><strong class="requisite">전화번호<span>필수입력사항</span></strong></label></th>
			<td class="typeAB borderBn"><input type="text" id="authorTel" name="authorTel" value="" class="input" style="width:126px" maxLength="12"/></td>
		</tr>
		<tr>
			<th scope="row"><label for="email"><strong class="requisite">이메일<span>필수입력사항</span></strong></label></th>
			<td class="typeAB paB8">
				<input type="text" id="auhtorEmail" name="auhtorEmail" value="" class="input" style="width:126px" maxLength="20"/>
				@
				<select id="email-2" name="email" style="width:120px">
				<option>직접입력</option>
				<option>chol.com</option>
				<option>dreamwiz.com</option>
				<option>empal.com</option>
				<option>freechal.com</option>
				<option>google.com</option>
				<option>hanafos.com</option>
				<option>hanmail.net</option>
				<option>hanmir.com</option>
				<option>hitel.net</option>
				<option>hotmail.com</option>
				<option>korea.com</option>
				<option>lycos.co.kr</option>
				<option>nate.com</option>
				<option>naver.com</option>
				<option>netian.com</option>
				<option>paran.com</option>
				<option>yahoo.co.kr</option>
				</select>
				<input type="text" id="email3" name="email" value="" class="input" style="width:120px" title="직접입력" maxLength="20"/>
			</td>
		</tr>
		<tr>
			<th scope="row"><label for="description">내용</label></th>
			<td class="typeABB">
				<strong class="tit_document"><c:out value='${searchVO.docTitle}'/></strong>
				<a href="${searchVO.docUrl}" class="link" target="_blank"><c:out value='${searchVO.docUrl}'/></a>
				<input name="docTitle" type="hidden" value="<c:out value='${searchVO.docTitle}'/>"/>
				<input name="docUrl" type="hidden" value="<c:out value='${searchVO.docUrl}'/>"/>
				<!-- <input name="docTitle" type="hidden" value="test"/>
				<input name="docUrl" type="hidden" value="test"/> -->
				<textarea id="docDesc" name="docDesc" rows="6" cols="97" class="typeA" maxLength="1400"></textarea>
			</td>
		</tr>
		</tbody>
		</table>
		</fieldset>
		</form>
		</div>

		<div class="area_btn_A_pop">
			<a href="javascript:fn_save();" class="btn_A">확인</a>
			<a href="javascript:fn_cancel();" class="btn_A">취소</a>
		</div>
		
		<!-- <a href="#btn_layerPopup" class="btn_close_LP" title="팝업창 닫기"><img src="../../images/pop/btn_close.gif" alt="" /></a> -->
	
	</div>
	

</body>
</html>