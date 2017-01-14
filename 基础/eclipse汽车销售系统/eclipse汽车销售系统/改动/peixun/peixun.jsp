<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>员工信息管理</title>
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
				<h2>培训信息管理</h2>
				<div class="span4">
					<s:a href="add.jsp" id="addbutton">增加新的培训</s:a>
				</div>
				<div class="span4">
					
						<form id="form"  action="search" method="post">
								<s:textfield name="queryText" id="queryText"></s:textfield>
							<button type="submit" class="btn btn-primary">搜索培训信息</button>
						</form>
				
				</div>
				<table class="table table-striped" width="800px">
					<tr>
						<td><strong>ID</strong></td>
						<td><strong>姓名</strong></td>
						<td><strong>培训时间</strong></td>
						<td><strong>培训科目</strong></td>
						<td><strong>状态</strong></td>
						<td><strong>操作</strong></td>
					</tr>
					<s:iterator value="peixun" id="peixunid">
						<tr>
							<td><s:property value="#id.peixunid"/> </td>
							<td><s:property value="#id.peixunname"/> </td>
							<td><s:property value="#id.peixundate"/></td>
							<td><s:property value="#id.peixunkemu"/></td>
							
							<td>
							<s:url id="edit" action="edit">
							   <s:param name="param"><s:property value="#id.peixunid"/></s:param>
							</s:url>
							<s:url id="delete" action="delete">
							   <s:param name="param"><s:property value="#id.peixunid"/></s:param>
							</s:url>
							<s:a href="%{edit}"><i class="icon-pencil"></i>修改</s:a>
							<s:a href="%{delete}"><i
									class="icon-remove"></i>删除</s:a>
							</td>
						</tr>
					</s:iterator>					
				</table>

						<ul class="pager">
						  <li><a href="list.action?pageNumber=<s:property value="pageNumber-1"/>">上一页</a></li>
						  <li><a href="list.action?pageNumber=<s:property value="pageNumber+1"/>">下一页</a></li>
						</ul>

			</div>
		</div>
	</div>

	<s:include value="../index/bottom.jsp"></s:include>
	<script type="text/javascript" src="<s:url value="/js/jquery-1.8.2.min.js"/>">
	</script>
	<script type="text/javascript" src="<s:url value="/js/bootstrap.min.js"/>">	
	</script>
	<script>
		$(".yuangong").addClass("active");//选中的添加acrive
		$("#addbutton").addClass("btn btn-primary");
		$(".table a").addClass("btn offset1");
		$("#form").addClass("form-search");
		$("#form input").addClass("input-medium search-query");
	</script>
</body>
</html>
