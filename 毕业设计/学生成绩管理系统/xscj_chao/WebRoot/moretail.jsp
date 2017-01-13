<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生成绩管理系统</title>
    
  </head>
  
  <body bgcolor="#d9DFAA">
    <h3>该学生信息如下</h3>
    <s:set name="xs" value="#request.xs"></s:set>
    <s:form action="xsInfo.action" method="post">
    <table border="0" cellpadding="5">
      <tr>
        <td>学号</td>
        <td><s:property value="#xs.xh"/></td>
        <td rowspan="7"><img src="getImage.action?xs.xh=<s:property value="#xs.xh"/>" width="120" height="150" title="<s:property value="#xs.xm"/>"/></td>
      </tr>
      <tr>
        <td>姓名</td>
        <td><s:property value="#xs.xm"/></td>
      </tr>
      <tr>
        <td>性别</td>
        <td><s:if test="#xs.xb==true">男</s:if><s:else>女</s:else></td>
      </tr>
      <tr>
        <td>专业</td>
        <td><s:property value="#xs.zyb.zym"/></td>
      </tr>
      <tr>
        <td>出生时间</td>
        <td><s:date name="#xs.cssj" format="yyyy-MM-dd"/></td>
      </tr>
      <tr>
        <td>总学分</td>
        <td><s:property value="#xs.zxf"/></td>
      </tr>
      <tr>
        <td>备注</td>
        <td><s:property value="#xs.bz"/></td>
      </tr>
      <tr>
        <td cols="2"><input type="submit" value="返回"/></td>
      </tr>
    </table> 
    </s:form> 
  </body>
</html>
