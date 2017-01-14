<%@ page language="java" pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>

<TABLE cellSpacing="0" cellPadding="0" width="825" border="0" heihgt=""
	class="tabletoolbar">
	<TR class="caldate">
		<TD colSpan="15" align="center">
			日记页面
		</TD>
	</TR>
	<TR>
		<TD>
			<!-- 心 情 日 记 -->
			<TABLE cellSpacing="1" cellPadding="1" heihgt="" class="tabletoolbar"
				width="400" border="0" frame="hsides" rules="none">

				<TR>
					<TD rowSpan="12" class="tbButtonMouseOverDown">
						<font color="#1394B2">心 情 日 记 浏 览 页 面 显 示</font>
					</TD>
					<TD class="listitem4">
						标题
					</TD>
					<TD class="listitem4">
						作者
					</TD>
					<TD class="listitem4">
						记录
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
			<!-- 中间条幅 -->

		<TD width="5"
			style="filter:shadow(color=#336699,direction=120);width:300;padding-right:10;padding-bottom:10">
			<p class="inputframe">
				我 的 备 忘 录
			</p>
		</TD>

		<!-- </TD> -->

		<TD>
			<!-- 工作日记 -->
			<TABLE cellSpacing="1" cellPadding="1" heihgt="" class="tabletoolbar"
				width="400" border="0" frame="hsides" rules="none">
				<TR>
					<TD class="listitem4">
						标题
					</TD>
					<TD class="listitem4">
						作者
					</TD>
					<TD class="listitem4">
						记录
					</TD>
					<TD rowSpan="12" class="tbButtonMouseOverDown">
						<font color="#1394B2">工 作 日 记 浏 览 页 面 显 示</font>
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















