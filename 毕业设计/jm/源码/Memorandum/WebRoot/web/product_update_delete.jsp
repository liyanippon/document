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

<TABLE style="WIDTH: 800px;" cellSpacing="2" cellPadding="2" border="0">
	<TR>
		<TD colSpan="12" align="center" class="listitem1">
			�����ռǹ���ҳ��
		</TD>
	</TR>

	<logic:iterate id="li" name="list" scope="request">
		<html:hidden name="li" property="pageCount" />
		<html:hidden name="li" property="next" />
		<TR class="caldate">
			<TD>
				<bean:write name="li" property="curPageNO" />
				ҳ&nbsp;&nbsp;
			</TD>
			<TD class="listcellrow" align="right">
				SQL����ʱ��:
				<%=request.getAttribute("sqlceshi")%>
				��&nbsp;
				<bean:write name="li" property="pageCount" />
				ҳ&nbsp;&nbsp;&nbsp;&nbsp;

			</TD>
			<TD>
				<a class="button"
					href="./fenye.do?method=select&id=dsf5454543hkj13s130s32d1&previous=<bean:write name="li" property="previous" />">
					��һҳ</a>&nbsp;&nbsp;
			</TD>
			<TD>
				<a class="button"
					href="./fenye.do?method=select&id=dsf54fds8979s13s130s32d1&next=<bean:write name="li" property="next" />">
					��һҳ</a>&nbsp;&nbsp;
			</TD>
			<TD>
				<a class="button"
					href="./fenye.do?method=select&id=dsf541fgdrgf3s130s32d1&first=<bean:write name="li" property="first" />">
					��ҳ</a>&nbsp;&nbsp;
				<a class="button"
					href="./fenye.do?method=select&id=dsf54hh564dfg513s130s32d1&pageCount=<bean:write name="li" property="pageCount" />">
					���һҳ</a>&nbsp;&nbsp;&nbsp;
			</TD>
			<TD align="center">

				<html:form
					action="/fenye?method=select&id=dsf5413srtret456dhdgd6575dgd130s32d1">
			ҳ��<html:text property="next" size="6" maxlength="6"  style="border:1px solid #666666; font-size:9pt; height:17px; BACKGROUND-COLOR: #F4F4FF; color:#ff6600">
					</html:text>Enter
			   
				</html:form>
			</TD>
		</TR>

	</logic:iterate>
</TABLE>
<TABLE style="WIDTH: 800px;" cellSpacing="2" cellPadding="2" border="0"
	id="mytable" class="sortable">

	<TR class="listrow1">
		<TD width="8%">
			����
		</TD>
		<TD width="35%">
			�����ռǱ���
		</TD>
		<TD width="10%">
			����
		</TD>
		<TD width="10%">
			�������
		</TD>
		<TD width="20%">
			����ʱ��
		</TD>
		<TD width="8%">
			�޸�
		</TD>
		<TD width="8%">
			ɾ��
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
							<bean:write name="item" property="zhuti" />
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
				<TD class="listline001">

					<a
						href="productupdatedelete.do?method=update&
						fenye_Id=<bean:write name="item" property="fenye_Id" />&
						zhuti=<bean:write name="item" property="zhuti" />&
						zuozhe=<bean:write name="item" property="zuozhe" />&
						fwjilu=<bean:write name="item" property="fwjilu" />">
						�޸�</a>
				</TD>
				<TD class="listline001">
					<a
						href="productupdatedelete.do?method=delete&
						fenye_Id=<bean:write name="item" property="fenye_Id" />">
						ɾ��</a>
				</TD>

			</TR>
		</logic:iterate>
</table>
<TABLE style="WIDTH: 800px;" cellSpacing="2" cellPadding="2" border="0">
	<logic:iterate id="li" name="list" scope="request">

		<TR class="caldate">
			<TD>
				<bean:write name="li" property="curPageNO" />
				ҳ&nbsp;&nbsp;&nbsp;&nbsp;
			</TD>
			<TD class="listcellrow" align="right">

				<SCRIPT language="JavaScript">   
   		        var   now1   =new   Date()   
    EndTime_S=now1.getTime()      
     document.write   (" "+ ((EndTime_S-StarTime_S)/300)+"�� ");   
  </SCRIPT>



				<bean:write name="li" property="pageCount" />
				ҳ

			</TD>
			<TD>
				<a class="button"
					href="./fenye.do?method=select&id=dsf5413s13tghrdhhdhd0s32d1&previous=<bean:write name="li" property="previous" />">
					��һҳ</a>&nbsp;&nbsp;&nbsp;&nbsp;
			</TD>
			<TD>
				<a class="button"
					href="./fenye.do?method=select&id=dsf5413s1gdy56bdgh30s32d1&next=<bean:write name="li" property="next" />">
					��һҳ</a>&nbsp;&nbsp;&nbsp;&nbsp;
			</TD>
			<TD>
				<a class="button"
					href="./fenye.do?method=select&id=dsf5413sjty7574dfg130s32d1&first=<bean:write name="li" property="first" />">
					��ҳ</a>&nbsp;&nbsp;
				<a class="button"
					href="./fenye.do?method=select&id=dsf5413s13fs453gdhdsr34670s32d1&pageCount=<bean:write name="li" property="pageCount" />">
					���һҳ</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</TD>
		</TR>
	</logic:iterate>
</TABLE>


