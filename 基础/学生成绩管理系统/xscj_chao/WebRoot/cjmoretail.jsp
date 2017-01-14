<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生成绩管理系统</title>
    
  </head>
  
  <body bgcolor="#d9DFAA">
    <h3>该信息如下</h3>
    <s:form action="xscjInfo.action" method="post">
    <s:set name="cj" value="#request.stucj"></s:set>
    <table border="0" cellpadding="5">
      <tr>
        <td>学号</td>
        <td><s:property value="#cj.id.xsb.xm"/></td>
      </tr>
      <tr>
        <td>课程号</td>
        <td><s:property value="#cj.id.kcb.kcm"/></td>
      </tr>
      <tr>
        <td>成绩</td>
        <td><s:property value="#cj.cj"/></td>
      </tr>
      <tr>
        <td>学分</td>
        <td><s:property value="#cj.xf"/></td>
      </tr>
      <tr>
        <td cols="2"><input type="submit" value="返回"/></td>
      </tr>
    </table> 
    </s:form>
  </body>
</html>
