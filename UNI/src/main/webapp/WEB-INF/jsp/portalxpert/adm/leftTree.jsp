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
				<div class="lnb_clop">
					<a href="#" class="ma_rig10" id="btn_all_close_cm"><span class="ico_allcl"></span>모두닫음</a>|
					<a href="#" class="ma_lef10" id="btn_all_open_cm"><span class="ico_allop"></span>모두펼침</a>
				</div>
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
var left_menu_setting = {
		edit: {
				enable: false,
				showRemoveBtn: false,
				showRenameBtn: false
		},	
		view: {
			dblClickExpand: false,
			showLine : true,
			showTitle : false,
			selectedMulti:true
		},
		data: {
			simpleData: { 
				enable: true
			}
		},
		check: {
			enable: false
		},
		callback: {
			onClick: zTreeOnClick 
		}
		
	};
	
	function zTreeOnClick(event, treeId, treeNode) {
		if(treeId == 'menuTreeObj'){
			if(treeNode.page != ""){				   
				doPage(treeId, treeNode.page);
			}
		}
	};	
	
	var doPage = function(treeId, page){

		if(treeId == 'menuTreeObj'){
			//parent.document.getElementById("admFrame").src = "${pageContext.request.contextPath}/"+page;
			parent.document.getElementById("contentfrm").src = "${pageContext.request.contextPath}/"+page;
		}
		
	};
	
	function expandNodes(nodes) {
		if (!nodes)
			return;
		var zTree = $.fn.zTree.getZTreeObj("menuTreeObj");
		for ( var i = 0, l = nodes.length; i < l; i++) {
			zTree.expandNode(nodes[i], false, false, false);
		}
	}	
	
$(function(){
	
	var zNodes = $.parseJSON('${sessionScope.pxLoginInfo.menuConts}');
	var treeObj = $.fn.zTree.init($("#menuTreeObj"), left_menu_setting, PortalCommon.getChildZMenuById(zNodes, "1")); //관리자메뉴
	treeObj.expandAll(true);		
	
	/*
	PortalCommon.getJson({
		url : "${pageContext.request.contextPath}/adm/sys/getAuthMenu.do?format=json",
		data : 'authCd=${sessionScope.pxLoginInfo.authCdStr}',
		success : function(data) {
			if (data.jsonResult.success === true) {

				var zNodes = $.parseJSON(data.menuList);
				var treeObj = $.fn.zTree.init($("#menuTreeObj"), left_menu_setting, PortalCommon.getChildZMenuById(zNodes, "1")); //관리자메뉴
				treeObj.expandAll(true);					
				
			};
		}
	});		
	*/
	
	
	
	
	$("#btn_all_open_cm").click(function() {//모두열림
		var treeObj = $.fn.zTree.getZTreeObj("menuTreeObj");
		treeObj.expandAll(true);
	});
	$("#btn_all_close_cm").click(function() {//모두닫힘
		var treeObj = $.fn.zTree.getZTreeObj("menuTreeObj");
		expandNodes(treeObj.getNodes());
	});
	
});
</script>           
	      
</body>
</html>    