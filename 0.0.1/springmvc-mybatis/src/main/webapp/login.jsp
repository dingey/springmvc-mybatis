<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
	<h1>login page</h1>
	<form id="" action="login.htm" method="post">
		<label>User Name</label> <input tyep="text" name="userName"
			maxLength="40" /> <label>Password</label><input type="password"
			name="password" /> <input type="submit" value="login" />
	</form>
	<P>${msg}</P>
</body>
</html>