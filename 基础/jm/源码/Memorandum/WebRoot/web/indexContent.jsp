<%@ page language="java" pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>

<TABLE cellSpacing="0" cellPadding="0" width="825" border="0" heihgt=""
	class="tabletoolbar">
	<TR class="caldate">
		<TD colSpan="15" align="center">
			�ռ�ҳ��
		</TD>
	</TR>
	<TR>
		<TD>
			<!-- �� �� �� �� -->
			<TABLE cellSpacing="1" cellPadding="1" heihgt="" class="tabletoolbar"
				width="400" border="0" frame="hsides" rules="none">

				<TR>
					<TD rowSpan="12" class="tbButtonMouseOverDown">
						<font color="#1394B2">�� �� �� �� � �� ҳ �� �� ʾ</font>
					</TD>
					<TD class="listitem4">
						����
					</TD>
					<TD class="listitem4">
						����
					</TD>
					<TD class="listitem4">
						��¼
					</TD>
				</TR>
				<logic:iterate id="internationalnews" name="internationalnews"
					scope="request">
					<TR>
						<TD class="codemain">
								<a
									href='select.do?fenye_Id=<bean:write name="internationalnews" property="fenye_Id"/>&fwjilu=<bean:write name="internationalnews" property="fwjilu" />'><bean:write
										name="internationalnews" property="zhuti" /> </a>
						</TD>
						<TD class="codemain">
							<bean:write name="internationalnews" property="zuozhe" />
						</TD>
						<TD class="codemain">
							<bean:write name="internationalnews" property="fwjilu" />
						</TD>
					</TR>
				</logic:iterate>
				<TR>
					<TD class="listitem4">

					</TD>
					<TD class="listitem4">

					</TD>
					<TD class="listitem4">
						<html:link action="/fenye?method=select&id=dsf5413s130s32d1">more</html:link>
					</TD>
				</TR>
			</TABLE>


		</TD>
		<TD>
			<!-- �м����� -->

		<TD width="5"
			style="filter:shadow(color=#336699,direction=120);width:300;padding-right:10;padding-bottom:10">
			<p class="inputframe">
				�� �� �� �� ¼
			</p>
		</TD>

		<!-- </TD> -->

		<TD>
			<!-- �����ռ� -->
			<TABLE cellSpacing="1" cellPadding="1" heihgt="" class="tabletoolbar"
				width="400" border="0" frame="hsides" rules="none">
				<TR>
					<TD class="listitem4">
						����
					</TD>
					<TD class="listitem4">
						����
					</TD>
					<TD class="listitem4">
						��¼
					</TD>
					<TD rowSpan="12" class="tbButtonMouseOverDown">
						<font color="#1394B2">�� �� �� �� � �� ҳ �� �� ʾ</font>
					</TD>
				</TR>
				<logic:iterate id="olympicgames" name="olympicgames" scope="request">
					<TR>
						<TD class="codemain">
							<a
								href='selectolympicgames.do?fenye_Id=<bean:write name="olympicgames" property="fenye_Id"/>&fwjilu=<bean:write name="olympicgames" property="fwjilu" />'><bean:write
									name="olympicgames" property="zhuti" /> </a>
						</TD>
						<TD class="codemain">
							<bean:write name="olympicgames" property="zuozhe" />
						</TD>
						<TD class="codemain">
							<bean:write name="olympicgames" property="fwjilu" />
						</TD>
					</TR>
				</logic:iterate>
				<TR>
					<TD class="listitem4">

					</TD>
					<TD class="listitem4">

					</TD>
					<TD class="listitem4">
						<html:link action="/olympicgamesfenye?method=olympicgamesselect&id=okdfe4s64f4n456e4f46">more</html:link>
					</TD>
				</TR>



			</TABLE>




		</TD>
	</TR>
</TABLE>















