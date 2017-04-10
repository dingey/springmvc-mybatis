<#-- 引入布局指令的命名空间 -->
<#import "layout/layout_table.ftl" as webLayout>
<#-- 调用布局指令 -->
<@webLayout.layout>
	<div class="container-fluid">
		<div class="row">
			<form class="form-horizontal" id="commentForm" method="get" action="page.htm">
				<div class="form-group">
					<label for="cname" class="col-sm-1 control-label">Name</label>
					<div class="col-sm-1">
						<input id="cname" name="name" minlength="2" type="text" required
							class="form-control" title="不能为空" placement="bottom">
					</div>
					<label for="address" class="col-sm-1 control-label">address</label>
					<div class="col-sm-2">
						<input id="address" name="address" minlength="2" type="text"
							class="form-control" required="required" title="不能为空">
					</div>
					<label for="phone" class="col-sm-1 control-label">电话</label>
					<div class="col-sm-2">
						<input id="phone" name="phone" minlength="2" type="text" required
							class="form-control" data-content="不能为空">
					</div>
					<label for="remark" class="col-sm-1 control-label">备注</label>
					<div class="col-sm-2">
						<input id="remark" name="remark" minlength="2" type="text"
							class="form-control" required data-content="不能为空">
					</div>
				</div>
				<div class="form-group">
					<label for="ename" class="col-sm-1 control-label">ename</label>
					<div class="col-sm-5">
						<input id="ename" name="ename" minlength="2" type="text" required
							class="form-control" data-content="不能为空">
					</div>
					<div class="col-sm-2">
						<button type="button" class="btn btn-primary" onclick="query()">查询</button>
						<a href="edit.html" class="btn btn-info">新建</a>
					</div>
				</div>
			</form>
		</div>
		<div class="row" id="data-container">
			<div class="col-md-12" id="data-content">
			<table
				class="table table-striped table-bordered table-hover table-condensed">
				<thead>
					<tr>
						<th style="width: 60px;"><input type="checkbox"></th>
						<th>ID</th>
						<th>NAME</th>
					</tr>
				</thead>
				<tbody>
					<#list pageInfo.list as t>
					<tr>
						<td><input type="checkbox" value="${t.id}"></td>
						<td>${t.id}</td>
						<td>${t.userName}</td>
					</tr>
					</#list>
				</tbody>
			</table>
			<#include "layout/page_full.ftl">
			</div>
		</div>
	</div>
	<script>
	$(function() {
		initTableCheck();	
	});
	</script>
</@webLayout.layout>