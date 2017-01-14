<%
  if((String)session.getValue("IsLogin")!="true")
   {
     String loginmsg="loginfirst";
     response.sendRedirect("login.jsp?loginmsg="+loginmsg);
   }
%>
