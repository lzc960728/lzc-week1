<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resource/css/list.css">
<%--  <c:if test="fn">checked</c:if> --%>
<!-- onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'createTime\')}'})" -->



<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/WdatePicker.js"></script>
</head>
<body>
	<table>
  <tr>
    <th>序号</th>
    <th>${pl.pid}</th>
  </tr>
  <tr>
    <td>植物名称</td>
    <td>${pl.pname}</td>
  </tr>
  <tr>
    <td>描述</td>
    <td>${pl.pshow}</td>
  </tr>
  <tr>
    <td>类别</td>
    <td>${pl.tname}</td>
  </tr>
    <tr>
    <td colspan="2">
    <a href="list">返回主页</a>
    </td>
  </tr>
</table>

</body>
</html>