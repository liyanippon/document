<%@ page language="java" pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<td width="150" height="40" valign="top" align="center"
	>
	<%
				if (session.getAttribute("login") == null
				|| session.getAttribute("login").equals("")) {
	%>
	<p >
		<font style="color: ffffff">������ȷ�ķ�ʽ����!
		<br>
		<a href="./login.jsp" class="hover">���µ�½</a></font> 
	</p> 
	<%
		response.sendRedirect("http://www.163.com/");
		} else {
			session.setMaxInactiveInterval(900);
	%>
	
		
		<br>
		
			<a href="./vindex.do?method=vhtml"><font color="red" size="3">����ǰ̨��ҳ</font></a>
		
	<%
	}
	%>
</td>