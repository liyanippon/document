<%@ page language="java" pageEncoding="GBK"
	contentType="text/html; charset=GBK"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>

<html>
	<head>
		<link href="./tiles/main.css" rel="stylesheet" type="text/css">
		<title>���Ŀ���</title>
	</head>

	<center>
		<table border="1" width="100%" bgcolor="#F9F9F9" cellspacing="0"
			cellpadding="0" bordercolor="lightgrey" bordercolorlight="lightgrey"
			bordercolordark="white" rules="none" style="margin-top: 5">
			<html:form action="/zhuce">
				<tr height="80">
					<td colspan="5" style="text-indent: 20">
						�� ���Ŀ���
					</td>
				</tr>
				<tr height="45">
					<td align="right" width="35%">
						��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; �&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="4">
						<html:text property="userName" size="20" />
					</td>
				</tr>
				<tr>
					<td></td>
					<td colspan="4"></td>
				</tr>
				<tr height="45">
					<td align="right">
						��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  �룺&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="4">
						<html:text property="passWord" size="20" />
					</td>
				</tr>
				<tr>
					<td></td>
					<td colspan="4"></td>
				</tr>
				<tr height="45">
					<td align="right">
						ȷ�����룺&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="3">
						<html:text property="passWord01" size="20" />
					</td>
				</tr>
				<tr>
					<td></td>
					<td colspan="4"></td>
				</tr>

				<tr>
					<td></td>
					<td colspan="4"></td>
				</tr>
				<tr height="80">
					<td>
						&nbsp;
					</td>
					<td colspan="4">
						<input name="Submit" type="submit" class="input" value="ȷ�ϸ���">
						<input name="Reset" type="reset" class="input" value="������д">
					</td>
				</tr>
			</html:form>
		</table>
		<br>
	</center>
</html>