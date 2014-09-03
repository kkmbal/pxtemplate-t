<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="ko">
<head>
<title></title>
<%@ include file="/WEB-INF/jsp/portalxpert/common/inc/taglibs.jsp"%>
<%@ include file="/WEB-INF/jsp/portalxpert/common/inc/jsLibs.jsp"%>

<script type="text/javascript">
	
	var loadingComplete = false;
	
	var write_apnd_kind = '010';
	var jsonAppendImgList = [];  //이미지 리스트
	var jsonAppendMovList = [];  //동영상 리스트
	var jsonAppendResearchList = [];//설문 보기 리스트
	var jsonAppendFileList = [];  //첨부 리스트
	
	var tmpNotiSeq = '${tmpNotiSeq}';
	var boardId = '${boardId}';
	var userId = '${userId}';
	var nojoYn = '${nojoYn}';
	var notiWriteId = '${notiWriteId}';
	var boardKind = '${boardKind}';
	var moblOpenYN = '${moblOpenYN}';
	var moblOpenDiv = '${moblOpenDiv}';
	var editDiv = '${editDiv}';
	var opnWrteDiv = '${opnWrteDiv}';
	var replyPrmsDiv = '${replyPrmsDiv}';
	var nickUseYn = '${nickUseYn}';
	var makrDispDiv = '${makrDispDiv}';  //작성자 표기 구분
	var agrmOppUseYn = '${agrmOppUseYn}';  //찬/반 구분
	
	
	var isAdmin = '${isAdmin}';
	var notiId = '${notiId}';
	var basicCloseDttm = '${basicCloseDttm}';
	var boardForm = '${boardForm}';
	var boardFormSpec = '${boardFormSpec}';
	var notiReadmanAsgnYn = '${notiReadmanAsgnYn}';
	var kind = '${kind}';
	var pageIndex = '${pageIndex}';
	var WEB_DIR = '${WEB_DIR}';
	var SAVE_DIR = '${SAVE_DIR}';
	var userDiv ;
	var userName;
	var insertMode = "insert";
	
	var imgUploadMax = ${imgUploadMax};
	var imgUploadSize = ${imgUploadSize};
	var apndUploadMax = ${apndUploadMax};
	var apndUploadSize = ${apndUploadSize};
	var surveyUploadMax = ${surveyUploadMax};
	var surveyUploadView = ${surveyUploadView};
	
	var upNotiId = '${upNotiId}';
	
	var apndFileSz = '${apndFileSz}';  //파일 업로드 제한사이즈
	
	if (boardId == 'BBS999999')
	{
		apndFileSz = 50000;
	}
	
	var boardExplUseYn = '${boardExplUseYn}';
	var boardExpl = '${boardExpl}';
	var webMovieDir = "";
	var WEB_MOVIE_DIR = '${WEB_MOVIE_DIR}';
	
	//파일업로드목록
	var savedApndList = ${apndList};
	var userMapList = ${userMapList};
	
	//임시
	var tmpNotiList = ${tmpNotiList};
	var tmpApndList = ${tmpApndList};
	var tmpUserList = ${tmpUserList};
	var tmpSurveyList = ${tmpSurveyList};
	var tmpSurveyExmplList = ${tmpSurveyExmplList};
	
	//글수정
	var notiList = ${notiList};
	var surveyList = ${surveyList};
	var surveyExmplList = ${surveyExmplList};
	
	//답글
	var reply_list = ${reply_list};
	//복사
	var type = '${type}';
	
	
</script>
<script type="text/javascript" src="${RES_HOME}/js/portal/board/board230Write.js"></script>
<script type="text/javascript" src="${RES_HOME}/js/portal/editor.js"></script>
</head>

<body>
<div class="container">
	<div class="header">
		<div class="h1">${boardName}</div>
		<div class="loc">
			<a href="#" class="home"><img src="${RES_HOME}/images/ico_home.png" alt="홈" /></a>
			<a href="#">커뮤니티</a>
			<strong class="str">${boardName}</strong>
		</div>
	</div>

	<p class="txt_notice">게시판 게시기준에 맞지 않는 부적절한 게시물은 작성자의 동의 없이 삭제됩니다.</p>

	<div class="btn_board_top">
		<div class="fl">
			<button type="button" class="btn_style2_4" onclick="javascript:fnWriteTempInsert();">임시저장</button>
			<button type="button" class="btn_style2_2" onclick="javascript:fnWriteCancel();">취소</button>
		</div>
		<div class="fr">
			<button type="button" class="btn_style3_2" onclick="javascript:fnWriteInsert();">등록</button>
			<button type="button" class="btn_style4_2" id="btn_item_list2">목록</button>
		</div>
	</div>
	<table class="tbl_form" summary="이 표는 소속기관, 작성자, 제목, 공개대상, 내용, 첨부로 구성된 게시판A를 입력합니다.">
	<caption>게시판A</caption>
	<colgroup>
		<col style="width:15%" />
		<col style="width:35%" />
		<col style="width:15%" />
		<col style="width:auto" />
	</colgroup>
	<tbody>
	<tr>
		<th scope="row">소속 기관</th>
		<td>${deptName}</td>
		<th scope="row">작성자</th>
		<td>${userName}</td>
	</tr>
	<tr>
		<th scope="row"><label for="input01">제목</label></th>
		<td colspan="3">
			<input type="text" class="text" id="txt_title" style="width:503px" value=""  title="제목을 입력합니다." /> &nbsp;
			<c:if test="${boardKind != '120' && isAdmin == 'Y'}">
			<input type="checkbox" class="check" id="rt4" value=""  title="공지를 체크합니다." /> <strong><label for="check01" class="mgrn">공지</label></strong>
			</c:if>
		</td>
	</tr>
	<tr>
		<c:choose>
			<c:when test="${boardForm == '040'}">
				<th scope="row"><label for="input01">교육일정</label></th>
			</c:when>
			<c:otherwise>
				<th scope="row"><label for="input01">게시기간</label></th>
			</c:otherwise>
		</c:choose>
		<td colspan="3">
			<div class="sec_calender">
				<input type="text" class="text" id="openReserveDate" name="openReserveDate" title="시작날짜를 입력합니다. 예)YYYY.MM.DD">
			</div> ~ 
			<div class="sec_calender">
				<input type="text" class="text" id="openCloseDate" name="openCloseDate" title="종료날짜를 입력합니다. 예)YYYY.MM.DD">
			</div>		
		</td>
	</tr>
	<tr>
		<th scope="row"><label for="input04">공개 대상</label></th>
		<td colspan="3">
			<span class="selectN" style="width:150px">
				<span>
					<select title="" name="notiOpenDiv" id="notiOpenDiv">
						<option value="010" selected>전체공개
 						<%-- <option value="020">사용자지정  --%>
						<option value="040">운영자만공개
						<option value="030">부서지정
					</select>
				</span>
			</span>
			<button type="button" class="btn_style1_3" type="button" id="notiOpenDivBtn" style="display:none;">조직도</button>
			<div class="listbox">
				<ul id="OpenDeptCategories">
				</ul>
				<ul id="OpenEmpCategories">
				</ul>
			</div>
		</td>
	</tr>
	<tr id="div_img_view_text" style="display:none;">
	<th scope="row">이미지등록</th>
	<td colspan="3" class="imgEnrol">
			목록에 게시될 이미지 1개를 반드시 선택해 주십시오.
	</td>
	<tr id="div_img_view" style="display:none;">	
	<td colspan="4" class="img_upload">
	<ul class="img_optList">
		    <li class="img_imgadd">
		    <form id="bbsImgform0" name="bbsImgform0" enctype="multipart/form-data" method="post">
			<input type="file" size="1" title="이미지추가" id="apndImg0" name="bbsUpImg0" class="img_file">
			</form>
			</li>
	
		    <li class="img_imgadd">
		    <form id="bbsImgform1" name="bbsImgform1" enctype="multipart/form-data" method="post">
			<input type="file" size="1" title="이미지추가" id="apndImg1" name="bbsUpImg1" class="img_file">
			</form>
			</li>
	
		    <li class="img_imgadd">
		    <form id="bbsImgform2" name="bbsImgform2" enctype="multipart/form-data" method="post">
			<input type="file" size="1" title="이미지추가" id="apndImg2" name="bbsUpImg2" class="img_file">
			</form>
			</li>
	
		    <li class="img_imgadd">
		    <form id="bbsImgform3" name="bbsImgform3" enctype="multipart/form-data" method="post">
			<input type="file" size="1" title="이미지추가" id="apndImg3" name="bbsUpImg3" class="img_file">
			</form>
			</li>
	
		    <li class="img_imgadd">
		    <form id="bbsImgform4" name="bbsImgform4" enctype="multipart/form-data" method="post">
			<input type="file" size="1" title="이미지추가" id="apndImg4" name="bbsUpImg4" class="img_file">
			</form>
			</li>
		</ul>
	</td>
	</tr>
	<tr id="div_mv_view" style="display:none;">
	<th scope="row">동영상등록</th>
	<td colspan="3">
		
		<div id="movieImgformDiv">
		<ul>
		    <li>
		    <form id="movieImgform" name="movieImgform" enctype="multipart/form-data" method="post">
		    
		    <input type="text" class="text" style="width:520px" readonly>
			<span class="file_wrap">
				<button class="btn_style1_2" type="button">파일</button>
				<input type="file" id="apndMovie" name="bbsUpMovie" class="file_hidden" />
			</span>		    
		    
			</form>
			</li>	
		</ul>
		</div>
		<div id="movieFileDiv" class="listbox">
			<dl></dl>
		</div>
		</div>
	</td>
	</tr>	
	<tr>
		<td colspan="4" class="editor">
			<!-- 에디터들어가는자리 -->
			<textarea class="editor ma_none" id="editor" style="height:360px;"></textarea>
		</td>
	</tr>
	<tr>
		<th scope="row">첨부</th>
		<td colspan="3" class="fileattach">
			<div id="movieImgformDiv">
				    <form id="apndFileform" name="apndFileform" enctype="multipart/form-data" method="post">
					<ul>
					    <li class="ma_bot5">
					    <input type="text" class="text" style="width:476px" readonly><span class="file_wrap">
								<button class="btn_style1_2" type="button">파일</button>
								<input type="file" name="upFile-" class="file_hidden" />
							</span><button type="button" class="btn_style1_2" onclick="fnAddFileList();">추가</button>
					    </li>	
					</ul>
					</form>
				</div>
				<div id="innoApDiv" class="listbox" style="display:none;">
					<dl></dl>
				</div>
				</div>
		</td>
	</tr>
	</tbody>
	</table>
	<div class="btn_board_sec">
		<div class="fl">
			<button type="button" class="btn_style2_4" onclick="javascript:fnWriteTempInsert();">임시저장</button>
			<button type="button" class="btn_style2_2" onclick="javascript:fnWriteCancel();">취소</button>
		</div>
		<div class="fr">
			<button type="button" class="btn_style3_2" onclick="javascript:fnWriteInsert();">등록</button>
			<button type="button" class="btn_style4_2" id="btn_item_list">목록</button>
		</div>
	</div>
</div>


<div style="display:none;">
	<input type="radio" name="apndKind" value="010" checked>일반
	<input type="radio" name="apndKind" value="020">이미지
	<input type="radio" name="apndKind" value="030">동영상
</div>
<div style="display:none;">
	<div id ="replyPrmsTR">
		<div>답글 허용</div>
		<div><input type="checkbox" id="replyPrmsYn" name="opnPrmsYN" class="ma_none" title="허용" checked><label for="replyPrmsYn">허용</label></div>
	</div>
	<div id ="opnPrmsTR">
		<div>의견 허용</div>
		<div><input type="checkbox" id="opnPrmsYN" name="opnPrmsYN" class="ma_none" title="허용" checked><label for="opnPrmsYN">허용</label><input type="radio" id="opnMarkRealNameYN_Y" name="opnMarkRealNameYN" value="Y" checked ></div>
	</div>
	<input type="checkbox"  id="chkReserveDate" title="예약게시사용" checked>
</div>

</body>

</html>		

