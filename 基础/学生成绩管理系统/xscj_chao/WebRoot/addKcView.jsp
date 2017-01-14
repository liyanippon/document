<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生成绩管理系统</title>
    
  </head>
  
  <body bgcolor="#d9DFAA">
    <s:form action="addKc.action" method="post">
    <table border="0" cellpadding="1" cellspacing="8" width="500">
      <tr>
        <td width="80">课程号</td>
        <td><input type="text" name="kc.kch"/></td>
      </tr>
      <tr>
        <td>课程名</td>
        <td><input type="text" name="kc.kcm"/></td>
      </tr>
      <tr>
        <td>开课学期</td>
        <td><input type="text" name="kc.kxxq"/></td>
      </tr>
      <tr>
        <td>学时</td>
        <td><input type="text" name="kc.xs"/></td>
      </tr>
      <tr>
        <td>学分</td>
        <td><input type="text" name="kc.xf"/></td>
      </tr>
      <tr>
        <td cols="2">
            <input type="submit" value="添加" onclick="if(!confirm('确定添加该信息吗？'))return false;else return true"/>
            <input type="reset" value="重置"/>
        </td>
      </tr>
    </table> 
    </s:form> 
  </body>
</html>
