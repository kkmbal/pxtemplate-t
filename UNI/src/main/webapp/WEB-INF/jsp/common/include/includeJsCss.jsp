<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- CSS -->
<link type="text/css" href="<c:url value='/css/button.css' />" rel="stylesheet" />
<link type="text/css" href="<c:url value='/css/common.css' />" rel="stylesheet" />
<link type="text/css" href="<c:url value='/css/style.css' />" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/fullcalendar-2.0.0/fullcalendar.css' />">
<link rel="stylesheet" type="text/css" href="<c:url value='/css/jquery-ui-1.10.2.custom.css' />">
<link rel="stylesheet" type="text/css" href="<c:url value='/css/zTree/zTreeStyle.css' />"/>

<!-- JavaScript -->
<script type="text/javascript" src="<c:url value='/js/portal/common.js' />"></script>
<%-- <script type="text/javascript" src="<c:url value='/js/lib/jquery/jquery-1.9.1.min.js' />"></script> --%>
<script type="text/javascript" src="<c:url value='/js/lib/jquery/jquery-1.11.1.js' />"></script>
<% if(!"Y".equals(request.getAttribute("NO_JQUERY_UI"))){ %>
<script type="text/javascript" src="<c:url value='/js/lib/jquery/jquery_ui.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/jquery/jquery.ui.datepicker-ko.js' />"></script>
<% } %>
<script type="text/javascript" src="<c:url value='/js/lib/jquery/jquery.form.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/jquery/jquery.validate.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/jquery/jquery.validate.util.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/jquery/jquery.session.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/jquery/jquery.blockUI.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/jquery/jquery.cookie-2010.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/zTree/jquery.ztree.all-3.5.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/zTree/ztree.core-3.5.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/zTree/ztree.excheck-3.5.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/zTree/ztree.exedit-3.5.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/tinymce/jquery.tinymce.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/fullcalendar-2.0.0/lib/moment.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/fullcalendar-2.0.0/fullcalendar.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/lib/json2.js' />"></script>

