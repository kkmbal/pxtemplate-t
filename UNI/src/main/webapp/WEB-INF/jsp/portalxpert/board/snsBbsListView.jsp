<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
<head>
<title></title>
<%@ include file="/WEB-INF/jsp/portalxpert/common/inc/taglibs.jsp"%>
<%@ include file="/WEB-INF/jsp/portalxpert/common/inc/jsLibs.jsp"%>

<script type="text/javascript">

if('${btnViewYn}' == "X"){
	alert('접근권한이 없습니다.');
	history.back();
}

var frameHeight = '${fh}'==''?'700':'${fh}';
var pageId = 'boardList';
var makrDispDiv = '${makrDispDiv}';
var agrmOppUseYn = '${agrmOppUseYn}';//찬성_반대_사용_여부
var likeUseYn = '${likeUseYn}';//좋아요_사용_여부
var superAdmin = '${superAdmin}';
var boardId = '${boardId}';

var pageIndex = '${pageIndex}';
var pageUnit = '${pageUnit}';
var boardName = '${boardName}';
var favoYn = '${favoYn}';
var boardKind = '${boardKind}';
var btnViewYn = '${btnViewYn}';
var host = '${host}';
var userId = '${userId}';
var eamAdminYn = '${eamAdminYn}';
var nickUseYn = '${nickUseYn}';
var boardForm = '${boardForm}';
var searchKeyword = decodeURIComponent("${fn:replace(searchKeyword,'"', '&quot;')}");
var searchCondition = '${searchCondition}';	
var regrId = null;


var notiList = ${notiList};
var opnList = ${opnList};
var apndList = ${apndList};			 

var moreData = "Y";
var searchData = "N";
var write_apnd_kind = '010';
var jsonAppendImgList = [];  //이미지 리스트
var jsonAppendFileList = [];  //첨부 리스트
//var jsonAppendFileList = [];//설문 보기 리스트



var lastSortSeq = "${lastSortSeq}";		
var userId = "${userId}";
var viewMode = "${viewMode}";  //ALL
var myImg = "${myImg}";
if (myImg == '') myImg = '${RES_HOME}/images/img/img_me.jpg';

var tmpNotiSeq;
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
var notiId = '';
var basicCloseDttm = '${basicCloseDttm}';
var boardForm;
var boardFormSpec;
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

var upNotiId = '${upNotiId}';

var apndFileSz = '${apndFileSz}';  //파일 업로드 제한사이즈

if (boardId == 'BBS999999')
{
	apndFileSz = 50000;
}

var boardExplUseYn = '${boardExplUseYn}';
var boardExpl = '${boardExpl}';

</script>
<script type="text/javascript" src="${RES_HOME}/js/portal/board/snsBbsListView.js"></script>
</head>

<body>


	<div id="my_list" class="container sns_list">
		<div class="header">
			<div class="h1">${boardName}</div>
			<div class="loc">
			<a href="#" class="home"><img src="${RES_HOME}/images/ico_home.png" alt="홈" /></a>
			<a href="#">커뮤니티</a>
			<strong class="str">${boardName}</strong>
		</div>
		</div>
		<div class="tab_7">

			<div class="tab_post">

				<div class="mysns_btn">

<!-- 					<a id="pageRefresh" class="ico_ref" title="새로고침">새로고침</a> -->
				</div>

				<!--sns_area-->
				<div class="sns_area">
					<textarea id="id_sns_write" class="sns_write"
						style="width: 97%; ime-mode: active;" cols="3" rows="5">글을 작성해주세요</textarea>
					<div id="div_img_view" style="display: none">
						<form id="fileform" name="fileform" enctype="multipart/form-data"
							method="post">
							<div class="sns_form">
								<div class="sns_tbl_form clearfix">
									<ul id="id_add_image">
										<li class="sns_imgadd">
											<input type="file" size="1" title="이미지추가" id="apndFile" name="upFile" class="img_file">
										</li>
									</ul>
								</div>
								<a class="ico_sredel" style="cursor: pointer;"
									onclick="javascript:fnAppendMenuRemove();"
									title="첨부없이 일반쓰기로 돌아갑니다."></a>
							</div>
						</form>
					</div>
					<div id="div_file_view" style="display: none">
						<div class="sns_form">
							<span style="margin-left:5px;"><strong>파일첨부</strong></span>
							<div class="sns_fileadd">
								<form id="apndFileform" name="apndFileform"
									enctype="multipart/form-data" method="post">
									<ul>
										<li class="ma_bot5">
										    <input type="text" class="text" style="width:476px" readonly>
											<span class="file_wrap">
												<button class="btn_style1_2" type="button">파일</button>
												<input type="file" id="apndFileAddw" name="upFile" class="file_hidden" />
											</span>	
											<button type="button" class="btn_style1_2" onclick="fnAddFileList();">추가</button>									
										</li>
									</ul>
								</form>
							</div>
							<a class="ico_sredel" style="cursor: pointer;"
								onclick="javascript:fnAppendMenuRemove();"
								title="첨부없이 일반쓰기로 돌아갑니다.">
								<!--삭제-->
							</a>
						</div>
					</div>



					<!--btn_area-->
					<div class="btn_area">
						<div class="fl_left ma_lef5">
							<!-- <span class="nick">닉네임</span> -->
							<a id="btn_img" href="#" class="btn_img" title="이미지"></a> <a
								id="btn_file" href="#" class="btn_file3" title="파일"></a>
						</div>
						<div class="fl_right">
							<span class="fl_left"
								style="vertical-align: middle; margin-top: 5px; margin-right: 5px; display: none">공개설정</span>
							<select name="notiOpenDiv" id="notiOpenDiv" class="fl_left"
								style="display: none">
								<option value="010" selected>전체공개
							</select> <a href="#" class="btn_reg" id="btn_context_write"></a>
						</div>
					</div>
					<!--//btn_area-->
					<span class="sch_tl">
						<!--top,left-->
					</span> <span class="sch_tr">
						<!--top,right-->
					</span> <span class="sch_br">
						<!--bottom,right-->
					</span> <span class="sch_bl">
						<!--bottom,left-->
					</span>
				</div>

				<div id="div_sns_read"></div>



			</div>
		</div>
		<div class="title_add" id="ajax_indicator" style="display: none;">
			<span><img src="${RES_HOME}/images/img/loadinfo.gif" />로딩중입니다.
				잠시만 기다려주세요...</span>
		</div>
	</div>

	<div id="show_dialog"></div>

	<iframe id="dummy" name="dummy" width=0 height=0></iframe>

</body>
</html>				
			 
			 
<%--



 --%>			 