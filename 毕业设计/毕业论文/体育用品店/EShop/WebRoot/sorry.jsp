<%@ page contentType="text/html; charset=gb2312" %>
<%@ taglib uri="/struts-bean" prefix="bean" %>
<html>
<head>
<title><bean:message key="website.title"/></title>
<link href="CSS/stylesheet.css" rel="stylesheet" type="text/css">
</head>
<body>
<table width="500" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="148"><img src="images/sorry.gif" width="128" height="128"></td>
    <td class="itemTitle">
		对不起，您尚未登录！<br>
		如果您尚未注册，请先注册后<a href="http://localhost:8080/EShop/mer.do?method=browseIndexMer" onmouseover="textcolor" style="blueText">登录</a>
		！<br>
		谢谢合作！
    </td>
  </tr>
</table>
</body>
</html>
