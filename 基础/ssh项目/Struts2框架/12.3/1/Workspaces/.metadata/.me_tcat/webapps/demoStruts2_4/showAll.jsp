<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    

  </head>
  
  <body>
    <table border="1" width="60%">
    <tr>
    <th>编号</th>
    <th>姓名</th>
    <th>密码</th>
    <th>地址</th>
    <th>操作</th>
    </tr>
    <c:forEach items="${requestScope.list}" var="person">
    <td>${person.pid}</td>
    <td>${person.name}</td>
    <td>${person.password}</td>
    <td>${person.address}</td>
    <td>修改  删除</td>
    </c:forEach>
    </table>
  </body>
</html>
