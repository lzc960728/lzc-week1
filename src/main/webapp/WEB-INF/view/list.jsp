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
	
	<form action="list">
	查询内容:<input type="text" name="pname" value="${plant.pname}">
	<input type="submit" value="搜索">
	</form>
	<a href="toadd"><input type="button" value="添加" ></a>
		<input type="button" value="批量删除" onclick="ps()" >
	<table>
		<tr>
			<td><input type="checkbox" id="qx" >全选/反选</td>
			<td>序号</td>
			<td>植物名称</td>
			<td>描述</td>
			<td>类别</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${pg.list}" var="l">
		<tr>
			<td><input type="checkbox" class="cb" value="${l.pid}"></td>
			<td>${l.pid}</td>
			<td>${l.pname}</td>
			<td>${l.pshow}</td>
			<td>${l.tname}</td>
			<td>
			<a href="look?pid=${l.pid}"><input type="button" value="查看"></a>
			<a href="toupdate?pid=${l.pid}"><input type="button" value="修改"></a>
			<input type="button" value="删除" onclick=" delALL(${l.pid})">
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="10">当前页${pg.pageNum} <a
				href="list?pageNum=1"><input type="button"
					value="首页"></a> <a
				href="list?pageNum=${pg.prePage==0?1:pg.prePage}"><input
					type="button" value="上一页"></a> <a
				href="list?pageNum=${pg.nextPage==0?pg.pages:pg.nextPage}"><input
					type="button" value="下一页"></a> <a
				href="list?pageNum=${pg.pages}"><input
					type="button" value="尾页"></a> 总页数${pg.pages}
			</td>
		</tr>
	</table>
	<script type="text/javascript">
		$("#qx").click(function() {
			$(".cb").prop("checked",this.checked)
		})
		
		function ps() {
			var pids = $(".cb:checked").map(function() {
				return this.value;
			}).get().join(",")
			alert(pids)
			if(pids!=''){
				delALL(pids);
			}else{
				alert("至少选择一个")
			}
		}
		
		function delALL(pids) {
			if(confirm("确认删除?")){
			$.post("delALL", {pids:pids}, function(data) {
				if(data>0){
					alert("删除成功")
					location.href="list"
				}else {
					alert("删除失败")
				}
			}, "json")
			}
		}
	</script>
</body>
</html>