<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../Check.jsp"%>
<%request.setCharacterEncoding("gb2312"); %>
<%
	String IsSucceed = "";
	String employeeid = request.getParameter("newuser");
%>
<%try{	
	String username = request.getParameter("newuser");
	String password = request.getParameter("password2");
	String power = request.getParameter("newpower");

	
	if(User.IsExist(employeeid))
		{
			%>
			<script>
			alert("已存在该用户信息");
			window.history.back();
			</script>
	<%	} 
	else
		{
			IsSucceed = User.Add(username,password,power);
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
<%@ include file="../incoming/Header.jsp"%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="UserLeft.jsp"%></td>
    <td width="660" align="center" valign="top"><br><br><br><br>
   <a class="title2">
  <%
	if(IsSucceed.equals("1"))
		out.println("添加用户成功!");
	else
	{
		out.println("添加用户失败!");	
  %> 
              <br>
  <%		
		out.println("错误 : "+IsSucceed);	
	}	
  %>
      </a></p>	
	<form name="form2" method="post" action="ManageUser1.jsp">
	    <input type="button" name="yourhiddeninfo" value="继续添加" onclick="window.open('AddUser1.jsp')">	
   		<a class="title2"><input name="back" type="submit" id="back" value="返回" >
   		</a>
    </form>
    </td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>	
</body>
</html>
