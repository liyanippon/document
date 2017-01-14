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

<a href="test?request_locale=zh_CN"><s:text name="zhname"></s:text></a>
<a href="test?request_locale=en_US"><s:text name="enname"></s:text></a>
<s:form method="method" action="">
	<s:textfield name="name" key="label.name"></s:textfield>
	<s:password name="ps" key="label.ps"></s:password>
	<s:submit key="label.submit"></s:submit>
	
</s:form></body>
</html>