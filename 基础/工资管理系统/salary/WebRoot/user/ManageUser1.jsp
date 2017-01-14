<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../Check.jsp"%>
<%			
	Vector listassess = User.ListAll();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<title><%=title%></title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen">
<script language="javascript">
function confirmdel(a) 
{
if (confirm("真的要删除这个用户吗？") )
  top.location="DeleteUser.jsp?userid="+a
}
</script>
</head>
<body>
<%@ include file="../incoming/Header.jsp"%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="UserLeft.jsp"%></td>
    <td width="660" align="center" valign="top">
	<p align="center" class="title1">用户管理</p>
    <table width="640"   border="1" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr bgcolor="#E7E7E7">
        <td ><div align="center"><strong>用户ID</strong></div></td>
        <td ><div align="center"><strong>密码</strong></div></td>
        <td ><div align="center"><strong>权限</strong></div></td>
        <td ><div align="center"><strong>操作</strong></div></td>
      </tr>
<%		
      for(int i=0;i<listassess.size();i++) 
	  {
			User  user = (User)listassess.elementAt(i);  
%>			
	  <tr>
        <td><div align="center"><%=DataConvert.ViewStr(user.getUserName())%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(user.getPassword())%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(user.getPower())%></div></td>
        <td><div align="center"><a href="ModifyUser1.jsp?userid=<%=user.getUserName()%>">修改</a> <a href="javascript:confirmdel('<%=user.getUserName()%>')">删除</a></div></td>
	  </tr>
<%
	}
%>		
    </table>
    </td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>	
</body>
</html>
