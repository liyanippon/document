<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>viewsacademyselect.jsp</title>
</head>

<body>


			
			<logic:notEmpty name="list_cbsql">
				<logic:iterate id="cbsql" collection="${requestScope.list_cbsql}">
					<TABLE width=642 height="428" cellSpacing="0" cellPadding="0"
						border="0" class="inputframemain">
<IMG src="../view/images/yuan.jpg">
						<TR class="listtitleborder">
							<TD height="5%" colSpan=2 align="right">
								<input type="button" value="返回上一页"
									style="border: 1px; solid: #666666; height: 20px; width: 100px; font-size: 10pt; background-color: #8CAAE7; color: #666666"
									onClick="javascript: history.go(-1)" title="返回上一页">

							</TD>
						</TR>
						<TR>
							<TD align="center" height="3%">
								<font size="5"><br> ${cbsql.zhuti}</font>
							</TD>
							<TD align="right" width="8%">


							</TD>
						</TR>
						<TR>
							<TD colSpan="2" height="*" valign="top">
								${cbsql.neirong}


							</TD>
						</TR>

						<TR>
							<TD height="5%" colSpan=2 align="right">
								作者:${cbsql.zuozhe}&nbsp;&nbsp;发表时间:
								<bean:write name="cbsql" property="shijian"
									format="yyyy-MM-dd hh:mm:ss" />

							</TD>
						</TR>
					</TABLE>
				</logic:iterate>
			</logic:notEmpty>


</body>
</html:html>
