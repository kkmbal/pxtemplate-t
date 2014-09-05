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
				<div class="non_tree">
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
var menuId = '1';
var authCd = '${sessionScope.pxLoginInfo.authCdStr}';
var menuConts = '${sessionScope.pxLoginInfo.menuConts}';

var left_menu_setting = {
		edit: {
				enable: false,
				showRemoveBtn: false,
				showRenameBtn: false
		},	
		view: {
			dblClickExpand: false,
			showLine : false,
			showIcon : false,
			showTitle : false,
			selectedMulti:false,
			addDiyDom: addDiyDom
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
			onClick: zTreeOnClick,
			beforeClick: beforeClick
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
			if(page.match(/^\//g)) page = page.substring(1);
			parent.document.getElementById("contentfrm").src = WEB_HOME+"/"+page;
		}
		
	};
	
	function addDiyDom(treeId, treeNode) {
		var spaceWidth = 5;
		var switchObj = $("#" + treeNode.tId + "_switch"),
		icoObj = $("#" + treeNode.tId + "_ico");
		switchObj.remove();
		icoObj.before(switchObj);

		if (treeNode.level > 1) {
			var spaceStr = "<span style='display: inline-block;width:" + (spaceWidth * treeNode.level)+ "px'></span>";
			switchObj.before(spaceStr);
		}
	}
	
	function beforeClick(treeId, treeNode) {
		if (treeNode.level == 0 ) {
			var zTree = $.fn.zTree.getZTreeObj("menuTreeObj");
			zTree.expandNode(treeNode);
			return false;
		}
		return true;
	}
	
	
	
$(function(){
	
	$("body").remove('menuTreeObj');
	$("body").append("<div id='menuTreeObj' style='display:none'></div>");
	
	
	var treeObjMenu = $("#menuTreeObj");

	var zNodes = $.parseJSON(menuConts);
	var treeObj = $.fn.zTree.init($("#menuTreeObj"), left_menu_setting, PortalCommon.getChildZMenuById(zNodes, menuId));
	treeObj.expandAll(true);
	
	
	var zTree_Menu = $.fn.zTree.getZTreeObj("menuTreeObj");
	var curMenu = zTree_Menu.getNodes()[0].children[0].children[0];
	zTree_Menu.selectNode(curMenu);

	treeObjMenu.hover(function () {
		if (!treeObjMenu.hasClass("showIcon")) {
			treeObjMenu.addClass("showIcon");
		}
	}, function() {
		treeObjMenu.removeClass("showIcon");
	});
	
	/*
	PortalCommon.getJson({
		url : WEB_HOME+"/adm/sys/getAuthMenu.do?format=json",
		data : 'authCd='+authCd,
		success : function(data) {
			if (data.jsonResult.success === true) {
				var treeObjMenu = $("#menuTreeObj");

				var zNodes = $.parseJSON(data.menuList);
				var treeObj = $.fn.zTree.init($("#menuTreeObj"), left_menu_setting, PortalCommon.getChildZMenuById(zNodes, menuId));
				treeObj.expandAll(true);
				
				
				var zTree_Menu = $.fn.zTree.getZTreeObj("menuTreeObj");
				var curMenu = zTree_Menu.getNodes()[0].children[0].children[0];
				zTree_Menu.selectNode(curMenu);

				treeObjMenu.hover(function () {
					if (!treeObjMenu.hasClass("showIcon")) {
						treeObjMenu.addClass("showIcon");
					}
				}, function() {
					treeObjMenu.removeClass("showIcon");
				});

			};
		}
	});	
	*/
	
	
});
</script>           
	      
</body>
</html>    