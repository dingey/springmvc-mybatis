<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user</title>
</head>
<body>
	<a href="add.do">新增</a>
	<a href="/springmvc-mybatis/">主页</a>
	<table>
		<tr>
			<td>seq</td>
			<td>id</td>
			<td>name</td>
		</tr>
		<c:forEach items="${list}" var="t" varStatus="seq">
			<tr>
				<td><a href="show.do?id=${t.userId}">${seq.index+1}</a></td>
				<td>${t.userId}</td>
				<td>${t.userName}</td>
			</tr>
		</c:forEach>
	</table>
	<span><a href="list.do?pageNum=${pageInfo.prePage}&pageSize=${pageInfo.pageSize}">上一页</a>&nbsp;
			<a href="list.do?pageNum=${pageInfo.nextPage}&pageSize=${pageInfo.pageSize}">下一页</a>&nbsp;
			当前显示${list.size()}条记录&nbsp;共${pageInfo.total}条,${pageInfo.pages}页</span>
</body>
</html>