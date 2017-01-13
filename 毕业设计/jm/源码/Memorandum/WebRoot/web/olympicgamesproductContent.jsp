<%@ page language="java" pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>
<SCRIPT src="sorttable1.js" type="text/javascript"></SCRIPT>
<SCRIPT language="JavaScript">   
  var   now1   =new   Date()   
  StarTime_S=now1.getTime()   
 </SCRIPT>

<TABLE style="WIDTH: 750px;" cellSpacing="2" cellPadding="2" border="0">
	<TR >
		<TD colSpan="7" align="center" class="listitem3">
			工作日记预览页面
		</TD>
	</TR>

	<logic:iterate id="li" name="list" scope="request">
		<html:hidden name="li" property="pageCount" />
		<html:hidden name="li" property="next" />
		<TR class="caldate">
			<TD>
				<bean:write name="li" property="curPageNO" />
				页&nbsp;&nbsp;
			</TD>
			<TD class="listcellrow" align="right">
				SQL访问时间:
				<%=request.getAttribute("sqlceshi")%>
				秒&nbsp;
				<bean:write name="li" property="pageCount" />
				页&nbsp;&nbsp;&nbsp;&nbsp;

			</TD>
			<TD>
				<a class="button"
					href="./olympicgamesfenye.do?method=olympicgamesselect&id=okdfe4s64f4n456e4f46&previous=<bean:write name="li" property="previous" />">
					上一页</a>&nbsp;&nbsp;
			</TD>
			<TD>
				<a class="button"
					href="./olympicgamesfenye.do?method=olympicgamesselect&id=okdfe4s64f4n456e4f46&next=<bean:write name="li" property="next" />">
					下一页</a>&nbsp;&nbsp;
			</TD>
			<TD>
				<a class="button"
					href="./olympicgamesfenye.do?method=olympicgamesselect&id=okdfe4s64f4n456e4f46&first=<bean:write name="li" property="first" />">
					首页</a>&nbsp;&nbsp;
				<a class="button"
					href="./olympicgamesfenye.do?method=olympicgamesselect&id=okdfe4s64f4n456e4f46&pageCount=<bean:write name="li" property="pageCount" />">
					最后一页</a>&nbsp;&nbsp;&nbsp;
			</TD>
			<TD align="center">

				<html:form action="/olympicgamesfenye?method=olympicgamesselect&id=okdfe4s64f4n456e4f46">
			页数<html:text property="next" size="6" maxlength="6"  style="border:1px solid #666666; font-size:9pt; height:17px; BACKGROUND-COLOR: #F4F4FF; color:#ff6600">
					</html:text>Enter
			   
				</html:form>
			</TD>
		</TR>

	</logic:iterate>
</TABLE>
<TABLE style="WIDTH: 750px;" cellSpacing="2" cellPadding="2" border="0"
	id="mytable" class="sortable">

	<TR class="listrow1">
		<TD width="11%">
			排序
		</TD>
		<TD width="37%">
			工作日记标题
		</TD>
		<TD width="15%">
			作者
		</TD>
		<TD width="15%">
			浏览次数
		</TD>
		<TD width="22%">
			写作时间
		</TD>
	</TR>
	<ol>
		<logic:iterate id="item" name="fenye" scope="request">
			<TR class="listtitleborder">
				<TD class="listline001">
					<!--<img src="web/image/Arrow1.gif" border="0" align="left"> -->
					<bean:write name="item" property="fenye_Id" />
				</TD>
				<TD class="listline001">
					<DIV
						STYLE="width: 300px; height: 20px;  
            overflow: hidden; text-overflow:ellipsis">
						<NOBR>
							<a
								href='selectolympicgames.do?fenye_Id=<bean:write name="item" property="fenye_Id"/>&fwjilu=<bean:write name="item" property="fwjilu" />'><bean:write
									name="item" property="zhuti" /> </a>
						</NOBR>
					</DIV>
				</TD>
				<TD class="listline001">
					<bean:write name="item" property="zuozhe" />
				</TD>
				<TD class="listline001">
					<bean:write name="item" property="fwjilu" />
				</TD>
				<TD class="listline001">
					<bean:write name="item" property="shijian"
						format="yyyy-MM-dd hh:mm:ss" />
				</TD>

			</TR>
		</logic:iterate>
</table>
<TABLE style="WIDTH: 750px;" cellSpacing="2" cellPadding="2" border="0">
	<logic:iterate id="li" name="list" scope="request">

		<TR class="caldate">
			<TD>
				<bean:write name="li" property="curPageNO" />
				页&nbsp;&nbsp;&nbsp;&nbsp;
			</TD>
			<TD class="listcellrow" align="right">

				<SCRIPT language="JavaScript">   
   		        var   now1   =new   Date()   
    EndTime_S=now1.getTime()      
     document.write   (" "+ ((EndTime_S-StarTime_S)/300)+"秒 ");   
  </SCRIPT>



				<bean:write name="li" property="pageCount" />
				页

			</TD>
			<TD>
				<a class="button"
					href="./olympicgamesfenye.do?method=olympicgamesselect&id=okdfe4s64f4n456e4f46&previous=<bean:write name="li" property="previous" />">
					上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
			</TD>
			<TD>
				<a class="button"
					href="./olympicgamesfenye.do?method=olympicgamesselect&id=okdfe4s64f4n456e4f46&next=<bean:write name="li" property="next" />">
					下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
			</TD>
			<TD>
				<a class="button"
					href="./olympicgamesfenye.do?method=olympicgamesselect&id=okdfe4s64f4n456e4f46&first=<bean:write name="li" property="first" />">
					首页</a>&nbsp;&nbsp;
				<a class="button"
					href="./olympicgamesfenye.do?method=olympicgamesselect&id=okdfe4s64f4n456e4f46&pageCount=<bean:write name="li" property="pageCount" />">
					最后一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</TD>
		</TR>
	</logic:iterate>
</TABLE>


