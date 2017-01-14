<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生成绩管理系统</title>
    
  </head>
  
  <body bgcolor="#d9DFAA">
    <s:set name="xs" value="#request.xsInfo"></s:set>
    <s:form action="updateXs.action" method="post" enctype="multipart/form-data">
    <table border="0" cellpadding="1" cellspacing="8" width="500">
      <tr>
        <td width="80">学号</td>
        <td><input type="text" name="xs.xh" value="<s:property value="#xs.xh"/>" readonly="readonly"/></td>
      </tr>
      <tr>
        <td>姓名</td>
        <td><input type="text" name="xs.xm" value="<s:property value="#xs.xm"/>"/></td>
      </tr>
      <tr>
        <td>性别</td>
        <td>
           <s:radio list="#{true:'男',false:'女'}" value="#xs.xb" name="xs.xb"/>
        </td>
      </tr>
      <tr>
        <td>专业</td>
        <td>
            <select name="xs.zyb.id">
                <s:iterator id="zy" value="#request.zys">
                    <option value="<s:property value="#zy.id"/>">
                         <s:property value="#zy.zym"/>
                    </option>
                </s:iterator>
            </select>
        </td>
      </tr>
      <tr>
        <td>出生时间</td>
        <td><input type="text" name="xs.cssj" value="<s:date name="#xs.cssj" format="yyyy-MM-dd"/>"/></td>
      </tr>
      <tr>
        <td>总学分</td>
        <td><input type="text" name="xs.zxf" value="<s:property value="#xs.zxf"/>"/></td>
      </tr>
      <tr>
        <td>备注</td>
        <td><input type="text" name="xs.bz" value="<s:property value="#xs.bz"/>"/></td>
      </tr>
      <tr>
        <td>备注</td>
        <td><input type="file" name="zp"/></td>
      </tr>
      <tr>
        <td cols="2"><input type="submit" value="修改" onclick="if(!confirm('确定修改该信息吗？'))return false;else return true"/></td>
      </tr>
    </table> 
    </s:form> 
  </body>
</html>
