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
					日记增加成功
				</p>
			</TD>
		</TR>
	</TABLE>



	<TABLE style="WIDTH: 670px;" cellSpacing="2" cellPadding="2" border="0">
	<!-- 
		<TR class="listrow1" align="left">
			<TD>
				浏览次数
			</TD>
			<TD>
				<jsp:getProperty name="updateeForm" property="fwjilu" />

			</TD>
		</tr>
	 -->	
		<tr class="listrow1">
			<TD>
				日记标题
			</TD>
			<TD>
				<jsp:getProperty name="updateeForm" property="zhuti" />

			</TD>
		</tr>
		<tr class="listrow1">
			<TD>
				作成者
			</TD>
			<TD>
				<jsp:getProperty name="updateeForm" property="zuozhe" />

			</TD>
		</tr>
		<tr class="listrow1">
			<TD>
				内容
			</TD>
			<TD>
				<jsp:getProperty name="updateeForm" property="neigong" />

			</TD>
		</tr>
	</table>
