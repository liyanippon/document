<%@ page language="java" pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<TABLE cellSpacing="0" cellPadding="0" border="0" width="100%">

	<TR class="caldate">
		<TD align="left">
				<font size="5"> <html:link action="/news" title="进入管理主页面">首页</html:link>
				</font>
		</td>
		<td align="right">
			<input class="input" type=button value="关闭系统"
				onClick="javascript:self.close();"
				onKeyPress="javascript:self.close();"
				style="border:1px ;solid:#666666; height:20px; width:120px; font-size:15pt; 
 background-color : #DFE6EF; color:#666666">
		</TD>
	</TR>
</TABLE>
