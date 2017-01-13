<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>articleissuetiezi.jsp</title>

</head>

<body>

	<logic:iterate id="articleissue" collection="${requestScope.viwe}">
		<html:form action="/article.do?method=lanmuarticleissuesql">
			<center>
				<table border="1" width="80%" bgcolor="#F9F9F9" cellspacing="0"
					cellpadding="0" bordercolor="lightgrey"
					bordercolorlight="lightgrey" bordercolordark="white" rules="none"
					style="margin-top: 5">

					<tr height="80">
						<td colspan="5" style="text-indent: 20">
							■ 帖子发布
						</td>
					</tr>
					<tr height="45">
						<td align="right" width="35%">
							栏目名称：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</td>
						<td colspan="4">
							${articleissue.board_name}
							<html:hidden property="board_id" value="${articleissue.board_id}" />
						</td>
					</tr>
					<tr>
						<td></td>
						<td colspan="4"></td>
					</tr>
					<tr height="45">
						<td align="right">
							用户：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</td>
						<td colspan="4">
							${sessionScope.login}
						</td>
					</tr>
					<tr>
						<td></td>
						<td colspan="4"></td>
					</tr>
					<tr height="45">
						<td align="right">
							帖子主题：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</td>
						<td colspan="4">
							<html:text property="bbs_title" size="20"
								style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
						</td>
					</tr>
					<tr height="45">
						<td align="right">
							帖子内容：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</td>
						<td colspan="4">
							<html:textarea property="bbs_content" cols="50" rows="10" 
						style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
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
							<input name="Submit" type="submit" class="input" value="用户注册">
							<input name="Reset" type="reset" class="input" value="重新填写">
						</td>
					</tr>

				</table>
				<br>
			</center>

		</html:form>

	</logic:iterate>



</body>
</html:html>