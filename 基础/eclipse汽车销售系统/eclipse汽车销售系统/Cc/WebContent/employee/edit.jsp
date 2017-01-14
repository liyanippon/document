<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>修改员工</title>
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
				<h2>修改员工</h2>
				<form id="form" action="editsave" method="post">
					<div class="control-group">
						<label class="control-label" for="username">姓名</label>
						<div class="controls">
							 <s:textfield id="username" name="employeeinfo.username" ></s:textfield>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="loginname">登录名</label>
						<div class="controls">
								 <s:textfield id="loginname" name="employeeinfo.loginname" readonly="true"></s:textfield>						 
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="password">密码</label>
						<div class="controls">
							<s:password id="password" name="employeeinfo.password" ></s:password>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="sex">性别</label>
						<div class="controls">
							<s:radio list="{'男','女'}" name="employeeinfo.sex" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="age">年龄</label>
						<div class="controls">
							<s:textfield name="employeeinfo.age" id="age" min="18" max="55"></s:textfield>	
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="department">部门</label>
						<div class="controls">
							<s:select list="{'销售','维修','经理'}" name="employeeinfo.department" id="department"></s:select>
						</div>
					</div>
					<div class="control-group">
						<div class="controls">
							<button type="submit" class="btn btn-primary">保存</button>
							<s:a href="list.action" id="cancle">取消</s:a>
							
						</div>
					</div>
					<s:textfield name="employeeinfo.userid" id="userid" style="display: none"></s:textfield>
					
				</form>

			</div>
		</div>
	</div>

	<s:include value="../index/bottom.jsp"></s:include>
	<script type="text/javascript" src="<s:url value="/js/jquery-1.8.2.min.js"/>">
	</script>
	<script type="text/javascript" src="<s:url value="/js/bootstrap.min.js"/>">	
	</script>
	<script type="text/javascript" src="<s:url value="/js/jquery.validate.min.js"/>">	
	</script>
	<script type="text/javascript" src="<s:url value="/js/messages_zh.js"/>">	
	</script>
	<script>
	$(document).ready(function(){
		$(".yuangong").addClass("active");//选中的添加acrive
		$("#cancle").addClass("btn");
		$('#form').addClass("form-horizontal");// 表单格式化
		document.getElementsByTagName("select")[0].value = "${employeeinfo.department}";
		// 下拉菜单默认选择
		// 客户端验证
		// 客户端验证
		 $('#form').validate(
		 {
		  highlight: function(element) {
		    $(element).closest('.control-group').removeClass('success').addClass('error');
		  },
		  success: function(element) {
		    element
		    .text('OK!').addClass('valid')
		    .closest('.control-group').removeClass('error').addClass('success');
		  }
		 });
		$("#username").rules("add", { 
			  required:true,  
			  minlength:2
		});
		
		$("#password").rules("add", { 
			  required:true,  
			  minlength:2,
		});
		$("#age").rules("add", { 
			  required:true,  
			  range:[18,55]
		});
		$("#sex").rules("add", { 
			  required:true,  
		});
		$("#department").rules("add", { 
			  required:true,  
		});
		}); 
	</script>
</body>
</html>
