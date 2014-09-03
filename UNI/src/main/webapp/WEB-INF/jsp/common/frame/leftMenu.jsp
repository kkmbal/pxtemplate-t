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

 		<!--//left-->
 		<div id="left" class="lnb_area">
            
			<div class="bbs_board">
				<div class="tree">
					<div class="content_wrap">
						<div id="menuListDiv">
							<ul id="menuTreeObj" class="ztree"></ul>
						</div>	
					</div>
				</div>
			</div>            
            
            
		</div>
 		<!--//left-->
 
<script type="text/javascript">
var menuId = '${param.menuId}';
var authCd = '${sessionScope.pxLoginInfo.authCdStr}';
var menuConts = '${sessionScope.pxLoginInfo.menuConts}';
</script>           
<script type="text/javascript" src="${RES_HOME}/js/portal/common/leftTree.js"></script>
 

</body>
</html>