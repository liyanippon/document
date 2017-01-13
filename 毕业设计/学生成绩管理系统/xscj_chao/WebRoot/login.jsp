<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生成绩管理系统</title>
    
  </head>
  
  <body bgcolor="#d9DFAA">
     <table width="700" align="center">
       <tr>
         <td>
           <s:form action="login.action" method="post">
             <s:textfield name="dl.xh" label="学号" size="20"/>
             <s:password name="dl.kl" label="口令" size="20"/>
             <s:submit value="登录"/>
           </s:form>
         </td>
       </tr>
     </table>  
  </body>
</html>
