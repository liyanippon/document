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

<s:form action="" method="post">
	<s:textfield name="p.pid" label="Id" readonly="true"></s:textfield>
	<s:textfield name="p.name" label="Name"></s:textfield>
	<s:password name="p.ps" label="Password"></s:password>
	<s:textfield name="p.address" label="Address"></s:textfield>
	<s:submit value="Update"></s:submit>
	
</s:form>

</body>
</html>