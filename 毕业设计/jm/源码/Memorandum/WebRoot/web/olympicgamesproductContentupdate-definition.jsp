<%@ page language="java" pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<TABLE style="WIDTH: 670px;" cellSpacing="2" cellPadding="2" border="0">
	<TR>
		<TD colSpan="7" align="center" class="listitem3">

			�޸������ļ�����
		</TD>
	</TR>
	<!-- productupdate fenye_Id,zhuti, zuozhe, fwjilu-->
	<logic:iterate id="p" name="productupdate" scope="request">
	
		<html:form action="/olympicgamesproductContentupdatedelete.do?method=updateok">
			<TR class="listtitleborder" align="left">
				<TD>
					ϵͳID
				</TD>
				<TD align="left">
					<bean:write name="p" property="fenye_Id" />
					<html:hidden name="p" property="fenye_Id" />
				</TD>
			</tr>
			<TR class="listtitleborder" align="left">
				<TD>
					�������
				</TD>
				<TD align="left">
					<input name="fwjilu" type="text" class="input" size="20" style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600"
						maxlength="20" value=<bean:write name="p" property="fwjilu" /> />
				</TD>
			</tr>
			<tr class="listtitleborder">
				<TD>
					����
				</TD>
				<TD align="left">
					<input name="zuozhe" type="text" class="input" size="20" style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600"
						maxlength="20" value=<bean:write name="p" property="zuozhe" /> />
				</TD>
			</tr>
			<tr class="listtitleborder">
				<TD>
					���±���
				</TD>
				<TD align="left">
					<input name="zhuti" type="text" class="input" size="50" style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600"
						maxlength="50" value=<bean:write name="p" property="zhuti" /> />
				</TD>
			</tr>
			<tr>
				<td class="bottom">
					<input name="Submit" type="submit" class="input" value="����">

				</td>
				<td class="bottom">
					<input name="Reset" type="reset" class="input" value="ȡ��">
				</td>
			</tr>
		</html:form>
	</logic:iterate>
</table>



