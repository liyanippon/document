<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html:html lang="true">
<head>
	<html:base />

	<title>号码添加</title>

</head>

<body>
	<html:form action="ltgl.do?method=lanmusqlupdateok">

		<table border="1" width=520 bgcolor="#F9F9F9" cellspacing="0"
			cellpadding="0" bordercolor="lightgrey" rules="none"
			style="margin-top: 5">

			<tr height="80">
				<td colspan="5" style="text-indent: 20">
					■ 电话本号码添加 
				</td>
			</tr>

			<tr>
				<td></td>
				<td colspan="4"></td>
			</tr>
			<tr height="45">
				<td align="right">
					号码类别：&nbsp;&nbsp;&nbsp;
				</td>
				<td colspan="4">

					<html:select property="bankuai" 
						style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600">
						<logic:iterate id="vi" collection="${requestScope.jihe}">
							<html:option value="${vi.class_id}">${vi.class_name}</html:option>
						</logic:iterate>
					</html:select>

				</td>
			</tr>
			<tr height="45">
					<td align="right">
						姓 名：&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="4">
					
					<html:text property="board_name" value="${a3.board_name}"
								size="20"
								style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
						
					</td>
				</tr>
				<td></td>
				<td colspan="4"></td>
				<!-- 
			<tr height="45">
				<td align="right">
					管理者：&nbsp;&nbsp;&nbsp;
				</td>
				<td colspan="3">
					<html:text property="board_master" size="20"
						style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />

				</td>
			</tr>
			 -->
			<tr height="45">
				<td align="right">
					号 码：&nbsp;&nbsp;&nbsp;
				</td>
				<td colspan="3">
					<html:textarea property="board_pcard" cols="40" rows="1"
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
				<td align="center">

				</td>
				<td colspan="4">

					<input name="Submit" type="submit" class="input" value="号码添加">
					<input name="Reset" type="reset" class="input" value="重新填写">
				</td>
			</tr>
		</table>

	</html:form>

</body>
</html:html>