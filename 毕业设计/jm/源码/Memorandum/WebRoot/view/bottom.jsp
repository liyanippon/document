<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<html:html lang="true">
<head>
	<html:base />
	<title>bottom.jsp</title>
	<meta http-equiv="pragma" content="no-cache">

</head>

<body>


<!-- 最近心情 -->
	<logic:notEmpty name="list_pb">
		<logic:iterate id="a1" collection="${requestScope.list_pb}">
		
		
	<TABLE border=0 cellSpacing=0 cellPadding=0 width=220>
		<TBODY>
		
		
			<TR>
				<TD height=30 align=left>
					<IMG src="../view/images/br_11(1).jpg" width=220 height=30>
				</TD>
			</TR>
			<TR>
				<TD>
					<TABLE border=1 cellSpacing=1 borderColor=#ffffff cellPadding=1
						width=220 bgColor=#6ebec7>
						<TBODY>
							<TR>
								<TD bgColor=#ffffff width=218 align=right>
									<DIV id=marquees>
										<TABLE border=0 cellSpacing=0 cellPadding=0 width=200
											align=center height=25>
											<TBODY>


												<TR>
													<TD
														style="PADDING-BOTTOM: 4px; PADDING-LEFT: 4px; PADDING-RIGHT: 4px; PADDING-TOP: 4px"
														height=25>
														<a> <font style="color: 9b00cc">${a1.neirong}</font>
														</a>
													</TD>
												</TR>

												<TR>
													<TD
														style="PADDING-BOTTOM: 4px; PADDING-LEFT: 4px; PADDING-RIGHT: 4px; PADDING-TOP: 4px"
														height=25>
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
															<bean:write name="a1" property="shijian" format="yyyy-MM-dd hh:mm:ss" />
													</TD>
												</TR>
												
											</TBODY>
										</TABLE>
									</DIV>
								</TD>
							</TR>
						</TBODY>
					</TABLE>
		</TBODY>
	</TABLE>
		</logic:iterate>
	</logic:notEmpty>




	<!-- 北京时间 -->
		
	<TABLE border=0 cellSpacing=0 cellPadding=0 width=220>
		<TBODY>

			<TR>
				<TD>
					<TABLE border=1 cellSpacing=1 borderColor=#ffffff cellPadding=1
						width=220 bgColor=#6ebec7>
						<TBODY>
		
							
					<tr><td>
					<TABLE border=0 cellSpacing=0 cellPadding=0 width=210 align=center>
							<TR>
								<TD height=30 align=left>
									<IMG src="../view/images/bjtime.jpg" width=210 height=30>
								</TD>
							</TR>
							<TR>
								<TD>
									<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0" width="210" height="179">
					                  <param name="movie" value="../view/images/8.swf" />
					                  <param name="quality" value="high" />
					                  <embed src="../view/images/8.swf" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" width="210" height="179"></embed>
						  			</object>
								</TD>
							</TR>
					</TABLE>	
				</td></tr>
							
							
							
							
						</TBODY>
					</TABLE>
		</TBODY>
	</TABLE>


</body>
</html:html>
