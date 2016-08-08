<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit</title>
</head>
<body>
	<form action="edit.do" method="post">
		<input type="hidden" name="roleId" value="${t.roleId}"> <input
			type="text" name="roleName" value="${t.roleName}"> <input
			type="text" name="roleDesc" value="${t.roleDesc}"> <input
			type="submit" value="提交">
	</form>
</body>
</html>