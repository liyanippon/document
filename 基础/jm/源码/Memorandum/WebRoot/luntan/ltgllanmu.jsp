<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<html:html lang="true">
<head>
	<html:base />
	<title>�������</title>
</head>

<body>

	<TABLE style="WIDTH: 820px;" cellSpacing="0" cellPadding="0" border=""
		class="sortable">
		<tr>
			<td colSpan="7" align="center" class="listitem3">
				����������
			</td>
		</tr>
	</TABLE>
	<TABLE style="WIDTH: 820px;" cellSpacing="2" cellPadding="2" border="0"
		id="mytable" class="sortable">

		<TR class="listrow1">
			<TD width="6%">
				����
			</TD>
			<TD width="12%">
				�������
			</TD>
			<TD width="52%">
				���˵��
			</TD>
			<td width="6%">
				�� ��
			</td>
			<td width="6%">
				ɾ ��
			</td>
		</TR>
		<ol>
			<logic:iterate id="al" collection="${requestScope.Bankuai}">

				<TR class="listtitleborder">
					<html:form action="ltgl.do?method=update">
						<TD class="listline001">
							<html:hidden property="class_id" value="${al.class_id}" />
							${al.class_id}
							<br>
						</TD>
						<TD class="listline001">
							<html:text property="class_name" value="${al.class_name}"
								size="20"
								style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
						</TD>
						<TD class="listline001">
							<html:text property="class_intro" value="${al.class_intro}"
								size="68"
								style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
							<br>
						</TD>
						<td class="listline001">
							<input name="Submit" type="submit" class="input" value="�޸�">
						</td>
					</html:form>
					<td width="5%">
						<html:form action="ltgl.do?method=delete">
							<html:hidden property="class_id" value="${al.class_id}" />
							<input name="Submit" type="submit" class="input" value="ɾ��">
						</html:form>
					</td>
				</TR>

			</logic:iterate>
	</TABLE>





</body>
</html:html>
