<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user</title>
</head>
<body>
	<a href="add.do">新增</a> ${list.size()}<a href="/springmvc-mybatis/">主页</a>
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
</body>
</html>