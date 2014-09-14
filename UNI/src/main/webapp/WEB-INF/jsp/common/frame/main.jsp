<%@ page language="java" session="false" contentType="text/html;charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<HTML>
<HEAD>

<TITLE>통일부</TITLE>
<meta />
</head>
<frameset rows="98,*" cols="*">
	<frame src="<c:url value="/common/frame/top.do"/>" name="topfrm" noresize="noresize" scrolling="no" frameborder="1">
	<frameset id="menudynamic" rows="*" cols="225,*">
		<frame src="<c:url value="/common/frame/leftMenu.do"/>" name="menufrm" id="menufrm" noresize="noresize" scrolling="auto" frameborder="1" >
		<frame src="" name="contentfrm" id="contentfrm"  scrolling="auto" frameborder="1">
	</frameset>
<%-- 	<frame src="<c:url value="/common/frame/footer.do"/>" name="topfrm"  scrolling="no" frameborder="1"> --%>
</frameset>
</html>
