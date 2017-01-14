<%@ page language="java" pageEncoding="GBK"
	contentType="text/html; charset=GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>ltglinsert.jsp</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

</head>

<body>



	<TABLE style="WIDTH: 520px;" cellSpacing="0" cellPadding="0" border=""
		class="sortable" align="center">
		<tr>
			<td colSpan="7" align="center" class="listitem3">
				号码类别添加
			</td>
		</tr>
	</TABLE>
	<TABLE style="WIDTH: 520px;" cellSpacing="2" cellPadding="2" border="0"
		class="sortable" align="center">
		<html:form action="ltgl.do?method=insertoop">
			<TR class="listtitleborder">
				<TD width="6%">
					类别名称
				</TD>
				<TD width="12%" align="left">
					<html:text property="class_name"  size="20"
						style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
				</TD>
			</TR>
			<TR class="listtitleborder">
				<TD width="6%">
					类别说明
				</TD>
				<TD width="12%">
					<html:textarea property="class_intro" cols="50" rows="4" 
						style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
				</TD>
			</TR>
			<TR class="listtitleborder">
				<TD width="6%">
					<input name="Submit" type="submit" class="input" value="添加号码类别">
				</TD>
				<TD width="12%">
				</TD>
			</TR>
		</html:form>
	</TABLE>





</body>
</html:html>
