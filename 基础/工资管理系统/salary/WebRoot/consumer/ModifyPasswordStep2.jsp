<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../consumer/Check.jsp"%>
<%
	String IsSucceed = "";
%>
<%
try{
	String username = (String)session.getValue("UserName");
	String power = (String)session.getValue("Power");
	String oldpassword = new String(request.getParameter("oldpassword").getBytes("ISO8859_1"),"GBK");
	String newpassword = new String(request.getParameter("newpassword").getBytes("ISO8859_1"),"GBK");

	if(!(User.ChkLogin(username,oldpassword,power)))
		{
			%>
			<script>
			alert("旧密码输入错误，请重新输入.");
			window.history.back();
			</script>
	<%	} 
	else
		{
			IsSucceed = User.ModifyPassword(username,newpassword);
		}
	}
	catch(Exception e){
		out.println("error:"+e.getMessage());
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<title><%=title%></title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen">
</head>
<body>
<%@ include file="Header.jsp"%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="../consumer/Left.jsp"%></td>
    <td width="660" align="center" valign="top"><br><br><br><br>
   <a class="title2">
  <%
	if(IsSucceed.equals("1"))
		out.println("修改密码成功!");
	else
	{
		out.println("修改密码失败!");	
  %> 
              <br>
  <%		
		out.println("错误 : "+IsSucceed);	
	}	
  %>
      </a></p>	
	<form name="form2" method="post" action="../consumer/index.jsp">
      		<a class="title2"><input name="back" type="submit" id="back" value="返回" >
      		</a>	
    </form>
    </td>
  </tr>
</table>
<%@ include file="../consumer/Footer.jsp"%>	
</body>
</html>
