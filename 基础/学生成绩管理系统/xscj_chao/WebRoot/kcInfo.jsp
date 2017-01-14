<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生成绩管理系统</title>
    
  </head>
  
  <body bgcolor="#d9DFAA">
    <table border="1" cellpadding="1" cellspacing="8" width="800">
      <tr align="center" bgcolor="silver">
        <th>课程号</th>
        <th>课程名</th>
        <th>开学学期</th>
        <th>学时</th>
        <th>学分</th>
        <th>详细信息</th>
        <th>操作</th>
        <th>操作</th>
      </tr>
      <s:iterator id="kc" value="#request.list">
      <tr align="center" bgcolor="silver">
        <td><s:property value="#kc.kch"/></td>
        <td><s:property value="#kc.kcm"/></td>
        <td><s:property value="#kc.kxxq"/></td>
        <td><s:property value="#kc.xs"/></td>
        <td><s:property value="#kc.xf"/></td>
        <td><a href="findKc.action?kc.kch=<s:property value="#kc.kch"/>">详细信息</a></td>
        <td><a href="deleteKc.action?kc.kch=<s:property value="#kc.kch"/>" onclick="if(!confirm('确定删除该信息吗？'))return false;else return true">删除</a></td>
        <td><a href="updateKcView.action?kc.kch=<s:property value="#kc.kch"/>">修改</a></td>
      </tr>
      </s:iterator>
      <tr>
        <s:set name="page" value="#request.page"></s:set>
        <s:if test="#page.hasFirst">
           <s:a href="kcInfo.action?pageNow=1">首页</s:a>
        </s:if>
        <s:if test="#page.hasPre">
           <a href="kcInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
        </s:if> 
        <s:if test="#page.hasPre">
           <a href="kcInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
        </s:if>
        <s:if test="#page.hasLast">
           <a href="kcInfo.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
        </s:if>
      </tr>
    </table>  
  </body>
</html>
