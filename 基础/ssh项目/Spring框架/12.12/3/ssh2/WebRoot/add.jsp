<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="addAction" method="post">
	<s:textfield name="pid" label="Pid"></s:textfield>
	<s:textfield name="name" label="Name"></s:textfield>
	<s:password name="password" label="Password"></s:password>
	<s:textfield name="address" label="Address"></s:textfield>
	<s:submit value="Add"></s:submit>
</s:form>
</body>
</html>