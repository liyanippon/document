<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../consumer/CheckIndex.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<title><%=title%></title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen">
</head>
<%@ include file="../consumer/Header.jsp"%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="Left.jsp"%></td>
    <td width="660" align="center">
        <p><font class="title2">欢迎使用工资管理系统</font></p>
        <p>本次登录用户：<%=(String)session.getValue("UserName") %></p>
        <p>权限 :<%=(String)session.getValue("Power") %></p>
    <p>&nbsp;</p></td>
  </tr>
</table>
<%@ include file="../consumer/Footer.jsp"%>
</body>
</html>
