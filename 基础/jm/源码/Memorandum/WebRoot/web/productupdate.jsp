<%@ page language="java" pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<TABLE style="WIDTH: 670px;" cellSpacing="2" cellPadding="2" border="0">
	<TR>
		<TD colSpan="7" align="center" class="listitem1">

			修改日记
		</TD>
	</TR>
	<logic:iterate id="p" name="productupdate" scope="request">
		<html:form action="/productupdatedelete?method=updateok">
			<TR class="listtitleborder" align="left">
				<TD>
					系统ID
				</TD>
				<TD align="left">
					<bean:write name="p" property="fenye_Id"  />
					<html:hidden name="p" property="fenye_Id" />
				</TD>
			</tr>
			<TR class="listtitleborder" align="left">
				<TD>
					浏览次数
				</TD>
				<TD align="left">
					<input name="fwjilu" type="text"  size="20" style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600"
						maxlength="20" value=<bean:write name="p" property="fwjilu" /> />
				</TD>
			</tr>
			<tr class="listtitleborder">
				<TD>
					作成者
				</TD>
				<TD align="left">
					<input name="zuozhe" type="text" size="20" style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600"
						maxlength="20" value=<bean:write name="p" property="zuozhe" /> />
				</TD>
			</tr>
			<tr class="listtitleborder">
				<TD>
					日记标题
				</TD>
				<TD align="left">
					<input name="zhuti" type="text" class="input" size="50" style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600"
						maxlength="50" value=<bean:write name="p" property="zhuti" /> />
				</TD>
			</tr>
			<tr>
				<td class="bottom">
					<input name="Submit" type="submit" class="input" value="更 新">

				</td>
				<td class="bottom">
					<input name="Reset" type="reset" class="input" value="取 消">
				</td>
			</tr>
		</html:form>
	</logic:iterate>
</table>



