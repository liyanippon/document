<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生成绩管理系统</title>
    
  </head>
  
  <body bgcolor="#d9DFAA">
    <s:set name="kc" value="#request.kcInfo"></s:set>
    <s:form action="updateKc.action" method="post">
    <table border="0" cellpadding="1" cellspacing="8" width="500">
      <tr>
        <td width="80">课程号</td>
        <td><input type="text" name="kc.kch" value="<s:property value="#kc.kch"/>" readonly="readonly"/></td>
      </tr>
      <tr>
        <td>课程名</td>
        <td><input type="text" name="kc.kcm" value="<s:property value="#kc.kcm"/>"/></td>
      </tr>
      <tr>
        <td>开学学期</td>
        <td><input type="text" name="kc.kxxq" value="<s:property value="#kc.kxxq"/>"/></td>
      </tr>
       <tr>
        <td>学时</td>
        <td><input type="text" name="kc.xs" value="<s:property value="#kc.xs"/>"/></td>
      </tr>
      <tr>
        <td>学分</td>
        <td><input type="text" name="kc.xf" value="<s:property value="#kc.xf"/>"/></td>
      </tr>
      <tr>
        <td cols="2"><input type="submit" value="修改" onclick="if(!confirm('确定修改该信息吗？'))return false;else return true"/></td>
      </tr>
    </table> 
    </s:form> 
  </body>
</html>
