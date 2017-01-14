<%@ include file="incoming/Common.jsp"%>
<% 
  Enumeration names = session.getAttributeNames();

  while (names.hasMoreElements()) 
	{
		String element =(String)names.nextElement();
		session.removeAttribute(element);
	}
  
  String loginmsg="logout";
  response.sendRedirect("login.jsp?loginmsg="+loginmsg);
  
%>
