
<%@ page contentType="text/html;charset=gb2312" %>
<%
  String name = (String)session.getValue("Power");
  if((String)session.getValue("IsLogin")!="true")
   {
     String loginmsg="loginfirst";
     response.sendRedirect("../login.jsp?loginmsg="+loginmsg);
   }
   
   
  else if(name.equals("ÆÕÍ¨ÓÃ»§"))
   {
     session.putValue("IsLogin","false");
     String loginmsg="loginwrong";
     response.sendRedirect("../login.jsp?loginmsg="+loginmsg);
   }
   
   
%>
