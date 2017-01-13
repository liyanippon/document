<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生成绩管理系统</title>
    
  </head>
  
  <body bgcolor="#d9DFAA">
      <h3>请填写要修改或增加的学生成绩信息</h3>
      <s:form action="addCj.action" method="post">
          <table>
              <tr>
                  <td width="100">请选择学生</td>
                  <td>
                     <select name="cj.id.xsb.xh">
                         <s:iterator id="xs" value="#request.list1">
                             <option value="<s:property value="#xs.xh"/>">
                                 <s:property value="#xs.xm"/>
                             </option>
                         </s:iterator>
                     </select>
                  </td>
              </tr>
              <tr>
                  <td width="100">请选择课程</td>
                  <td>
                     <select name="cj.id.kcb.kch">
                         <s:iterator id="kc" value="#request.list2">
                             <option value="<s:property value="#kc.kch"/>">
                                <s:property value="#kc.kcm"/>
                             </option>
                         </s:iterator>
                     </select>
                  </td>
              </tr>
              <tr>
                  <s:textfield label="成绩" name="cj.cj" value="" size="15"></s:textfield>
              </tr>
              <s:submit value="确定" onclick="if(!confirm('确定添加该信息吗？'))return false;else return true"/>
              <s:reset value="重置"/>
          </table>
      </s:form>
  </body>
</html>
