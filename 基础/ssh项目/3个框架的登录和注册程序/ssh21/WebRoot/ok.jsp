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
欢迎,${param.name }登陆成功！
<br>
<a href="getAll!getAll">显示所有的用户信息</a>
<br>
<a href="showPerson.jsp">显示个人信息</a>
<br>
<br>

<s:form action="All" method="post">
	<s:submit value="显示所有的用户信息"></s:submit>
</s:form>

<s:form action="Person" method="post">
	<s:submit value="显示个人信息"></s:submit>
</s:form>

<s:form action="Back" method="post">
	<s:submit value="返回登录"></s:submit>
</s:form>
</body>
</html>