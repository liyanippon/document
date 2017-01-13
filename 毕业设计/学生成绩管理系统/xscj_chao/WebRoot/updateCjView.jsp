<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生成绩管理系统</title>
    
  </head>
  
  <body bgcolor="#d9DFAA">
    <s:set name="cj" value="#request.cjInfo"></s:set>
    <s:form action="updateXscj.action" method="post">
    <table border="0" cellpadding="1" cellspacing="8" width="500">
      <tr>
        <td width="80">学号</td>
        <td><input type="text" name="cj.id.xsb.xh" value="<s:property value="#cj.id.xsb.xh"/>" readonly="readonly"/></td>
      </tr>
      <tr>
        <td>课程号</td>
        <td><input type="text" name="cj.id.kcb.kch" value="<s:property value="#cj.id.kcb.kch"/>" readonly="readonly"/></td>
      </tr>
      <tr>
        <td>成绩</td>
        <td><input type="text" name="cj.cj" value="<s:property value="#cj.cj"/>"/></td>
      </tr>
      <tr>
        <td cols="2"><input type="submit" value="修改" onclick="if(!confirm('确定修改该信息吗？'))return false;else return true"/></td>
      </tr>
    </table> 
    </s:form> 
  </body>
</html>
