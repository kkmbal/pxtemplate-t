<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/jsp/portalxpert/common/inc/taglibs.jsp"%>
<%@ include file="/WEB-INF/jsp/portalxpert/common/inc/jsLibs.jsp"%>
</head>
<body>
	<!--header-->
	<div id="header">
		<div class="m_setarea">
			<div class="m_set">
				<a id="btnLogOut" class="btn_logout">로그아웃</a>
				<a id="btnAdmin" class="btn_logout" title="관리자버튼">관리자</a>
			</div>
		</div>
		<div class="head_con">
			<h1><a>LOGO</a></h1>
		</div>
		<div class="gnb_area">
			<ul class="clearfix" id="topMenu">
        		<li><a id="main">HOME</a></li>
        		<li><a id="board">게시판</a></li>
            </ul>
		</div>
    </div>
    <!--//header-->
    
<script type="text/javascript">
var topMenuAuthCd = '${sessionScope.pxLoginInfo.authCdStr}';
var menuConts = '${sessionScope.pxLoginInfo.menuConts}';
</script>           
<script type="text/javascript" src="${RES_HOME}/js/portal/common/header.js"></script>
 
</body>
</html>