<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>销售记录管理</title>
<link rel="stylesheet" href="<s:url value="/css/bootstrap.min.css"/>" />
<link rel="stylesheet" href="<s:url value="/css/bootstrap.res.css"/>" />
<link rel="stylesheet" href="<s:url value="/css/base.css"/>" />
</head>
<body>

	<s:include value="../index/top.jsp"></s:include>

	<div class="container-fluid" id="main">
		<div class="row-fluid">
			<div class="span2">
				<s:include value="../index/left.jsp"></s:include>
			</div>
			<div class="span10">
				<h2>销售记录管理</h2>
				<div class="span4">
					<s:a href="add.jsp" id="addbutton">增加新销售</s:a>
				</div>

				<table class="table table-striped">
					<tr>
						<td><strong>发动机号</strong></td>
						<td><strong>销售时间</strong></td>
						<td><strong>车型ID</strong></td>
						<td><strong>车型名称</strong></td>
						<td><strong>销售人员ID</strong></td>
						<td><strong>销售人员</strong></td>
						<td><strong>操作</strong></td>
					</tr>
					<s:iterator value="sell" id="id">
						<tr>
							<td><s:property value="#id.engineid" /></td>
							<td><s:property value="#id.selldate" /> </td>
							<td><s:property value="#id.car.carid" /></td>
							<td><s:property value="#id.car.carname" /></td>
							<td><s:property value="#id.employee.userid" /></td>
							<td><s:property value="#id.employee.username" /></td>
							<td><s:url id="delete" action="delete">
									<s:param name="param">
										<s:property value="#id.engineid" />
									</s:param>
								</s:url> <s:a href="%{delete}">
									<i class="icon-remove"></i>删除</s:a></td>
						</tr>
					</s:iterator>

				</table>

			</div>
		</div>
	</div>

	<s:include value="../index/bottom.jsp"></s:include>
	<script type="text/javascript"
		src="<s:url value="/js/jquery-1.8.2.min.js"/>">
		
	</script>
	<script type="text/javascript"
		src="<s:url value="/js/bootstrap.min.js"/>">
		
	</script>
	<script>
		$(".xiaoshou").addClass("active");//选中的添加acrive
		$("#addbutton").addClass("btn btn-primary");
		$(".table a").addClass("btn");
		$("#form").addClass("form-search");
		$("#form input").addClass("input-medium search-query");
	</script>
</body>
</html>
