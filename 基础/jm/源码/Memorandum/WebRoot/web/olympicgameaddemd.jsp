<%@ page language="java" pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>

<TABLE style="WIDTH: 670px;" cellSpacing="2" cellPadding="2" border="0">
	<TR>
		<TD colSpan="7" align="center" class="listitem3">

			�����ռ�
		</TD>
	</TR>
	<html:form action="/updateolympicgames">
	
		<TR class="listtitleborder" align="left">
			<TD>
				�������
			</TD>
			<TD align="left">
				<html:text property="fwjilu" size="20" style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
				[
				<font color="red">�������д���ֽ�Ĭ��Ϊ0</font>]
			</TD>
		</tr>
	 
		<tr class="listtitleborder">
			<TD>
				�ռǱ���
			</TD>
			<TD align="left">
				<html:text property="zhuti" size="50" style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
			</TD>
		</tr>
		<tr class="listtitleborder">
			<TD>
				������
			</TD>
			<TD align="left">
				<html:hidden property="zuozhe" value="${sessionScope.login}"
					write="true" />
			</TD>
		</tr>
		<tr class="listtitleborder">
			<TD>
				����
			</TD>
			<TD align="left">
				<html:textarea property="neigong" rows="25" cols="100" style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
			</TD>
		</tr>
		<tr>
			<td class="bottom">
				<input name="Submit" type="submit" class="input" value="����ռ�">

			</td>
			<td class="bottom">
				<input name="Reset" type="reset" class="input" value="ȡ ��">
			</td>
		</tr>
	</html:form>
</table>



