<%@ page language="java" pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>select.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

</head>

<body>




	<logic:iterate id="sele" name="select" scope="request">
		<TABLE width="100%" height="100%" cellSpacing="0" cellPadding="0"
			border="0" class="ptableframe">

			<TR>
				<TD height="5%" colSpan=2 class="left" align="right">
					发表时间:
					<bean:write name="sele" property="shijian"
						format="yyyy-MM-dd hh:mm:ss" />
					<br>
					访问记录:
					<bean:write name="sele" property="fwjilu" />

				</TD>
			</TR>
			<TR class="listtitleborder">
				<TD align="center" height="2%">
					文章标题:
					<bean:write name="sele" property="zhuti" />
				</TD>
				<TD align="right" width="8%">
					<form>
						<input type="button" value="返回新闻列表"
							style="border:1px ;solid:#666666; height:20px; width:100px; font-size:10pt; 
 background-color : #8CAAE7; color:#666666"
							onClick="javascript: history.go(-1)"  title="返回新闻列表">
					</form>

				</TD>
			</TR>
			<TR>
				<TD colSpan="2" class="listcelltitle" height="*" valign="top">
					<bean:write name="sele" property="neigong" filter="false" />
				</TD>
			</TR>

		</TABLE>
	</logic:iterate>
</body>
</html:html>
