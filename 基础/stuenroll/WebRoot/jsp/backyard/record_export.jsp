<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html"
    pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
数据导出${url=="none"?"失败":"成功"}
</h1>

<p>该条件下没有数据可以导出</p>


<p>文件下载：<a href="#">下载</a></p>

<a href="#">返回</a>
</body>
</html>