<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
    	ArrayList list=new ArrayList();
    
    	String[] one={"谢逊","金毛狮王","男"};
    	list.add(one);
    	
    	String[] two={"殷天正","白眉鹰王","男"};
    	list.add(two);
    	
    	String[] three={"黛姬丝","紫衫龙王","女"};
    	list.add(three);
    	
    	String[] four={"韦一笑","青翼蝠王","男"};
    	list.add(four);
    	
    	request.setAttribute("abc",list);
    %>
	<table border="1" width="300" height="200">
    <c:forEach items="${abc}" var="obj" varStatus="st">
    	<tr align="center">
    		<td>${st.count}</td>
    		<td>${obj[0]}</td>
    		<td>${obj[1]}</td>
    		<td>${obj[2]}</td>
    	</tr>
    </c:forEach>
    </table>
  </body>
</html>
