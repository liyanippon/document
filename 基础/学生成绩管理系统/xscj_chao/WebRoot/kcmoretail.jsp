<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生成绩管理系统</title>
    
  </head>
  
  <body bgcolor="#d9DFAA">
    <h3>该课程信息如下</h3>
    <s:set name="kc" value="#request.kc"></s:set>
    <s:form action="kcInfo.action" method="post">
    <table border="0" cellpadding="5">
      <tr>
        <td>课程号</td>
        <td><s:property value="#kc.kch"/></td>
      </tr>
      <tr>
        <td>课程名</td>
        <td><s:property value="#kc.kcm"/></td>
      </tr>
      <tr>
        <td>开学学期</td>
        <td><s:property value="#kc.kxxq"/></td>
      </tr>
      <tr>
        <td>学时</td>
        <td><s:property value="#kc.xs"/></td>
      </tr>
      <tr>
        <td>学分</td>
        <td><s:property value="#kc.xf"/></td>
      </tr>
      <tr>
        <td cols="2"><input type="submit" value="返回"/></td>
      </tr>
    </table> 
    </s:form> 
  </body>
</html>
