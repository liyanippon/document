<%@ page language="java" pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<jsp:useBean id="updateeForm"
	class="com.xinxi_Action.struts.form.UpdateForm" scope="request"></jsp:useBean>
	<TABLE cellSpacing="2" cellPadding="2" border="0" width="100%">

		<TR class="caldate">
			<TD>

				<p align="left">
					�ռ����ӳɹ�
				</p>
			</TD>
		</TR>
	</TABLE>



	<TABLE style="WIDTH: 670px;" cellSpacing="2" cellPadding="2" border="0">
	<!-- 
		<TR class="listrow1" align="left">
			<TD>
				�������
			</TD>
			<TD>
				<jsp:getProperty name="updateeForm" property="fwjilu" />

			</TD>
		</tr>
	 -->	
		<tr class="listrow1">
			<TD>
				�ռǱ���
			</TD>
			<TD>
				<jsp:getProperty name="updateeForm" property="zhuti" />

			</TD>
		</tr>
		<tr class="listrow1">
			<TD>
				������
			</TD>
			<TD>
				<jsp:getProperty name="updateeForm" property="zuozhe" />

			</TD>
		</tr>
		<tr class="listrow1">
			<TD>
				����
			</TD>
			<TD>
				<jsp:getProperty name="updateeForm" property="neigong" />

			</TD>
		</tr>
	</table>
