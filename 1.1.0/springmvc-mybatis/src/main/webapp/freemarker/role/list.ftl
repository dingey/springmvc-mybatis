<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>role</title>
</head>
<body>
	<a href="add.do">新增</a>  <a href="/springmvc-mybatis/">主页</a>
	<table>
		<tr>
			<td>seq</td>
			<td>id</td>
			<td>name</td>
			<td>desc</td>
		</tr>
		<#list list as t>
			<tr>
				<td><a href="show.do?id=${t.roleId}">${t_index+1}</a></td>
				<td>${t.roleId}</td>
				<td>${t.roleName}</td>
				<td>${t.roleDesc}</td>
			</tr>
		</#list>
	</table>
	<span><a href="list.do?pageNum=${pageInfo.prePage}&pageSize=${pageInfo.pageSize}">上一页</a>&nbsp;
			<a href="list.do?pageNum=${pageInfo.nextPage}&pageSize=${pageInfo.pageSize}">下一页</a>&nbsp;
			当前显示${list?size}条记录&nbsp;共${pageInfo.total}条,${pageInfo.pages}页</span>
</body>
</html>