<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>系统登录</title>
<style>
.body {
	background-color: #bfbfbf;
}

.login_div {
	width: 600px;
	height: 370px;
	background-color: #fcfcfc;
	border: #777 solid 1px;
	position: absolute;
	top:0;
	bottom:0;
	left:0;
	right:0;
	margin: auto;
}

.login_in {
	height: 30px;
	width: 220px;
	padding-left: 5px;
	font-size: 15px;
	letter-spacing: 1px;
	border: #cdcdcd solid 1px;
	-webkit-border-radius: 3px;;
	-moz-border-radius: 3px;;
	border-radius: 3px;
}

.login_table {
	font-size: 14px;
	font-family: '新宋体', '宋体';
	letter-spacing: 3px;
	color: #444;
	border-left: #CCC solid 1px;
}

.login_btn {
	background-image: url(../../pic/Login.png);
	width: 170px;
	height: 42px;
	border: none;
	background-color: #fcfcfc;
	cursor: pointer;
}

.login_btn:active {
	background-image: url(../../pic/Login.png);
	width: 170px;
	height: 42px;
	border: none;
	background-color: #fcfcfc;
	cursor: pointer;
	position: relative;
	left: 1px;
	top: 1px;
}
</style>
<script>
	function loginForm() {
		var username = document.getElementById("username").value;
		var password = document.getElementById("password").value;
		if (username != null && username != "" && password != null
				&& password != "") {
			document.getElementsByName("form_1")[0].submit();
		} else {
			alert("请正确填写用户名和密码！");
		}
	}
</script>
</head>

<body class="body">
	<form method="post" name="form_1"
		action="">
		<div class="login_div">
			<img src="../../pic/logo.jpg" width="600" height="86" />
			<div>
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td width="32%" height="54">&nbsp;</td>
						<td width="61%">&nbsp;</td>
						<td width="7%">&nbsp;</td>
					</tr>
					<tr>
						<td align="right"><img src="../../pic/hiro.png" width="154" />
						</td>
						<td><table width="100%" height="171" border="0"
								cellpadding="0" cellspacing="0" class="login_table">
								<tr>
									<td width="24%" height="67" align="right">用户名：</td>
									<td width="76%"><input name="username" type="text"
										class="login_in" id="username" />
									</td>
								</tr>
								<tr>
									<td height="52" align="right">密码：</td>
									<td><input name="password" type="password"
										class="login_in" id="password" />
									</td>
								</tr>
								<tr>
									<td height="52" colspan="2" align="left" valign="bottom">
										<input type="button" class="login_btn" value=" "
										style="margin-left: 80px;" onclick="" />
									</td>
								</tr>
							</table>
						</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
				</table>

			</div>
		</div>
	</form>
</body>
</html>
