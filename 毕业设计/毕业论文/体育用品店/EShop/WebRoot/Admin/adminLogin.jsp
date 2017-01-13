<%@ page contentType="text/html; charset=gb2312" %>
<%@ taglib uri="/struts-bean" prefix="bean" %>
<%@ taglib uri="/struts-html" prefix="html" %>
<html>
<head>
<title><bean:message key="admin.pageTitle"/></title>
<link href="../CSS/stylesheet.css" rel="stylesheet" type="text/css">
</head>
<body>
<html:form action="/Admin/login.do?method=login">
	<table width="551" height="350" border="0" align="center" cellpadding="0" cellspacing="0" background="../images/login_back.jpg">
	  <tr>
		<td height="203">&nbsp;</td>
	  </tr>
	  <tr>
		<td><table width="80%"  border="0" align="center" cellpadding="0" cellspacing="0">
		  <tr>
			<td width="50" class="blackTitle">
				<bean:message key="admin.loginName"/>��
			</td>
			<td>
				<html:text property="loginName" size="15" styleClass="textBox"/>
			</td>
			<td width="50" class="blackTitle">
				<bean:message key="admin.loginPwd"/>��
			</td>
			<td>
				<html:password property="loginPwd" size="15" styleClass="textBox"/>
			</td>
			<td width="80">
				<div align="right">				
					<input type="image" src="../images/login_button.jpg" border="0">
				</div>
			</td>
		  </tr>
		  <tr>
		  <td height="20" colspan="5" class="redText">
			<html:errors/>
		  </td>
		</tr>
		</table></td>
	  </tr>
	</table>
</html:form>
<h5 align="center"> 
<a href="http://localhost:8080/EShop/" target="_blank">������ҳ</a>
</h5>
</body>
</html>
