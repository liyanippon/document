<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border = "1" width="60%">
	<tr>
		<th>编号</th>
		<th>姓名</th>
		<th>密码</th>
		<th>地址</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${requestScope.list}" var="person">
		<tr>
			<td>${person.pid }</td>
			<td>${person.name }</td>
			<td>${person.password }</td>
			<td>${person.address }</td>
			<td>
			修改 
			<a href="delet!delete?pid=${person.pid}">删除</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>