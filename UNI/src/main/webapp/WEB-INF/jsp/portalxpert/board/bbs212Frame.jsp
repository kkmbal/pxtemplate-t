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
<script type="text/javascript">
	$(window).scroll(function(){
		var url = $("#bbsFrame").attr("src");
		if (url.indexOf("getBbsSnsBoardList") > 0) {
			if  ($(window).scrollTop() == $(document).height() - $(window).height()){
				bbsFrame.fnResizeWindow();
			}
		}
	});
</script> 
<iframe src="${pageContext.request.contextPath}/board212/getBbsVideoBoardNotiList.do?boardId=${boardId}" frameborder="0"  id="bbsFrame" name="bbsFrame" width="100%" height="700" scrolling="no"></iframe>

</body>
</html>
