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


	<form action="">
	序号:<input type="hidden" name="pid" ><br><br>
	植物名称:<input type="text" name="pname" ><br><br>
	描述:<input type="text" name="pshow" ><br><br>
	类别:
	<select name="tid">
	<option value="0">请选择类型</option>
	<c:forEach items="${types}" var="t">
	<option value="${t.tid}">${t.tname}</option>
	</c:forEach>
	</select>
	<br><br>
	<input type="button" value="添加" onclick="add()">	
	</form>
	
	<script type="text/javascript">
	function add() {
		
		$.post("add", $("form").serialize(), function(data) {
			if(data>0){
				alert("添加成功")
				location.href="list"
			}else {
				alert("添加失败")
			}
		}, "json")
	}
	</script>
</body>
</html>