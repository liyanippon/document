<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生成绩管理系统</title>
    
  </head>
  
  <body bgcolor="#d9DFAA">
    <h3>该学生成绩如下：</h3>
    <hr width="700" align="left"/>
    <s:form action="xscjInfo.action" method="post">
    <table border="1" cellpadding="1" cellspacing="8" width="700">
      <tr align="center" bgcolor="silver">
        <th>课程名</th>
        <th>成绩</th>
        <th>学分</th>
      </tr>
      <s:iterator id="xscj" value="#request.list">
      <tr align="center" bgcolor="silver">
        <td><s:property value="#xscj.id.kcb.kcm"/></td>
        <td><s:property value="#xscj.cj"/></td>
        <td><s:property value="#xscj.xf"/></td>
      </tr>
      </s:iterator>
    </table> 
    <input type="submit" value="返回"/> 
    </s:form>
  </body>
</html>
