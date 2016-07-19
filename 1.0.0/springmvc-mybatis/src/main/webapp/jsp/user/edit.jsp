<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit</title>
</head>
<body>
	<a href="/springmvc-mybatis/">主页</a>
	<form action="edit.do" method="post">
		<input type="hidden" name="userId" value="${t.userId}"> <input
			type="text" name="userName" value="${t.userName}"> <input
			type="text" name="password" value="${t.password}"> <input
			type="submit" value="提交">
	</form>
</body>
</html>