<%@ page language="java"  contentType="text/html; charset=GBK" isELIgnored="false"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>report-Stat.jsp</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <TABLE style="WIDTH: 750px;" cellSpacing="2" cellPadding="2" border="0">
	<TR >
		<TD colSpan="7" align="center" class="listitem3">
			统计页面
		</TD>
	</TR>
	<tr class="listrow1">
	<td width=20% align="center">
	作者
	</td>
	<td width=80% align="center">
	文章数
	</td>
	</tr>

	<logic:iterate id="s" collection="${requestScope.newsvotelist}" indexId="ind" >
<tr>
	<td width=20% align="center">
	
	${s.zuozhe}
	</td>
	<td width=80% align="center">
	<img border="0" src="./web01/BAR.JPG"
			alt="${s.zuozhe}:【${s.count}】"
			width="${s.count * 10}" height=10 />
	
	
	${s.count}
	</td>
	</tr>
	</logic:iterate>
</TABLE>
  </body>
</html:html>



