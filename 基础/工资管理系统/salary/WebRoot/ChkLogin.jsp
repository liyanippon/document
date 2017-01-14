<%@page contentType="text/html;charset=gb2312"%>
<%request.setCharacterEncoding("gb2312"); %>
<%@ include file="incoming/Common.jsp"%>

<%
 String username = request.getParameter("username");
 String password = request.getParameter("password");
 String power = request.getParameter("power");
 String loginmsg;
 

 if(!User.ChkLogin(username,password,power))
 {
 	loginmsg="userwrong";
	response.sendRedirect("login.jsp?loginmsg="+loginmsg);
	return;
 } 
  if(power.equals("管理员"))
  {
 request.getSession(true);
 session.putValue("IsLogin","true");
 session.putValue("UserName",username);
 session.putValue("Power",power);
 response.sendRedirect("index.jsp");}
	
	else if(power.equals("普通用户"))
	{ 
	request.getSession(true);
    session.putValue("IsLogin","true");
    session.putValue("UserName",username);
    session.putValue("Power",power);
    response.sendRedirect("consumer/index.jsp");
	
	
	
	}
	
	
	
	
%>
