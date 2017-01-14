<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:actionerror/>

<s:form action="login" method="post">
	<s:textfield name="name" label="Name"></s:textfield>
	<s:password name="password" label="Password"></s:password>
	<s:submit value="Login"></s:submit>
	
</s:form>
<a href="register.jsp">注册</a>
</body>
</html>