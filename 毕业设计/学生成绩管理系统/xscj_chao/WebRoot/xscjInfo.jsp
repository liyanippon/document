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
        <th>学号</th>
        <th>姓名</th>
        <th>课程名</th>
        <th>成绩</th>
        <th>学分</th>
        <th>详细信息</th>
        <th>操作</th>
        <th>操作</th>
      </tr>
      <s:iterator id="cj" value="#request.list">
      <tr align="center" bgcolor="silver">
        <td><a href="findXscj.action?cj.id.xsb.xh=<s:property value="#cj.id.xsb.xh"/>"><s:property value="#cj.id.xsb.xh"/></a></td>
        <td><s:property value="#cj.id.xsb.xm"/></td>
        <td><s:property value="#cj.id.kcb.kcm"/></td>
        <td><s:property value="#cj.cj"/></td>
        <td><s:property value="#cj.xf"/></td>
        <td><a href="findCj.action?cj.id.xsb.xh=<s:property value="#cj.id.xsb.xh"/>&cj.id.kcb.kch=<s:property value="#cj.id.kcb.kch"/>">详细信息</a></td>
        <td><a href="deleteCj.action?cj.id.xsb.xh=<s:property value="#cj.id.xsb.xh"/>&cj.id.kcb.kch=<s:property value="#cj.id.kcb.kch"/>" onclick="if(!confirm('确定删除该信息吗？'))return false;else return true">删除</a></td>
        <td><a href="updateCjView.action?cj.id.xsb.xh=<s:property value="#cj.id.xsb.xh"/>&cj.id.kcb.kch=<s:property value="#cj.id.kcb.kch"/>">修改</a></td>
      </tr>
      </s:iterator>
      <tr>
        <s:set name="page" value="#request.page"></s:set>
        <s:if test="#page.hasFirst">
           <s:a href="xscjInfo.action?pageNow=1">首页</s:a>
        </s:if>
        <s:if test="#page.hasPre">
           <a href="xscjInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
        </s:if> 
        <s:if test="#page.hasPre">
           <a href="xscjInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
        </s:if>
        <s:if test="#page.hasLast">
           <a href="xscjInfo.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
        </s:if>
      </tr>
    </table>  
  </body>
</html>
