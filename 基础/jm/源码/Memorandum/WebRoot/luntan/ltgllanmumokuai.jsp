<%@ page language="java" pageEncoding="gbk"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html:html lang="true">
<head>
	<html:base />

	<title></title>


</head>

<body>
	<TABLE style="WIDTH: 520px;" cellSpacing="0" cellPadding="0" border=""
		class="sortable">
		<tr>
			<td colSpan="7" align="center" class="listitem3">
				号码分类管理
			</td>
		</tr>
	</TABLE>
	<TABLE style="WIDTH: 520px;" cellSpacing="2" cellPadding="2" border="0"
		id="mytable" class="sortable">

		<TR class="listrow1">
			<TD width="6%">
				排序
			</TD>
			<TD width="12%">
				号码类别
			</TD>
			<TD width="52%">
				查看详情
			</TD>
		</TR>
		<ol>
			<logic:iterate id="al" collection="${requestScope.Bankuai}">

				<TR class="listtitleborder">
					<TD class="listline001">
						${al.class_id}
						<br>
					</TD>
					<TD class="listline001">

						<a href='ltgl.do?method=lanmuselect&class_id=${al.class_id }'>${al.class_name}</a>




					</TD>
					<TD class="listline001"><a href='ltgl.do?method=lanmuselect&class_id=${al.class_id }'>
						${al.class_intro}</a>
						<br>
					</TD>
				</TR>

			</logic:iterate>
	</TABLE>








	<logic:notEmpty name="fanhui">







		<TABLE style="WIDTH: 520px;" cellSpacing="2" cellPadding="2">
			<TBODY>
				<TR>
					<TD bgColor=#ffcf60 height=20 class="listitem1">
						<DIV align=center>
							<logic:iterate id="aa" collection="${requestScope.biaoti}">
								${aa.biaoti}
							</logic:iterate>
							
						</DIV>
					</TD>
				</TR>
				<TR>
					<TD bgColor=#666666>

						<TABLE border=0 cellSpacing=1 cellPadding=0 width=520 border="0"
							id="mytable" class="sortable" align="center">
							<TBODY>
								<TR>
									<TD bgColor=#ffffff height=20 width="10%" align=center>
										<DIV align=center>
											排序
										</DIV>
									</TD>
									<TD bgColor=#ffffff width="30%" align=center>
										<DIV align=center>
											姓名
										</DIV>
									</TD>
									<TD bgColor=#ffffff width="30%" align=center>
										<DIV align=center>
											号码
										</DIV>
									</TD>
									<TD bgColor=#ffffff width="10%" align=center>
										<DIV align=center>
											修改
										</DIV>
									</TD>
									<TD bgColor=#ffffff width="10%" align=center>
										<DIV align=center>
											删除
										</DIV>
									</TD>
								</TR>
								<logic:iterate id="a2" collection="${requestScope.fanhui}">
									<TR>
										<TD bgColor=#ffffff height=20>
											<DIV align=left>
												${a2.board_id}
											</DIV>
										</TD>
										<TD bgColor=#ffffff height=20>
											<DIV align=left>
												${a2.board_name}
											</DIV>
										</TD>
										<TD bgColor=#ffffff height=20>
											<DIV align=left>
												${a2.board_pcard}
											</DIV>
										</TD>
										<TD bgColor=#ffffff height=20>
											<DIV align=center>
												<a href='ltgl.do?method=lanmuupdate&board_id=${a2.board_id}'>修改</a>
											</DIV>
										</TD>
										<TD bgColor=#ffffff height=20>
											<DIV align=center>
												<a href='ltgl.do?method=lanmuupdeletesql&board_id=${a2.board_id}'>删除</a>
											</DIV>
										</TD>
									</TR>

								</logic:iterate>

							</TBODY>
						</TABLE>


					</TD>
				</TR>
			</TBODY>
		</TABLE>



	</logic:notEmpty>






	<logic:notEmpty name="selectupdate">
		<logic:iterate id="a3" collection="${requestScope.selectupdate}">
		
		<html:form action="ltgl.do?method=lanmusqlupdate">
		
			<table border="1" width=520 bgcolor="#F9F9F9" cellspacing="0"
				cellpadding="0" bordercolor="lightgrey" rules="none"
				style="margin-top: 5">

				<tr height="80">
					<td colspan="5" style="text-indent: 20">
						■ 电话号码
					</td>
				</tr>
				<tr height="45">
					<td align="left" width="35%">
						id：&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="4">
					<html:hidden property="board_id" value="${a3.board_id}" />
							${a3.board_id}
					</td>
				</tr>
				<tr>
					<td></td>
					<td colspan="4"></td>
				</tr>
				<tr height="45">
					<td align="left">
						姓 名：&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="4">
					
					<html:text property="board_name" value="${a3.board_name}"
								size="20"
								style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
						
					</td>
				</tr>
				<tr>
					<td></td>
					<td colspan="4"></td>
				</tr>
				<!-- 
				<tr height="45">
					<td align="left">
						管 理 者：&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="3">
					<html:text property="board_master" value="${a3.board_master}"
								size="20"
								style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
						
					</td>
				</tr>
				 -->
				<tr height="45">
					<td align="left">
						电话号码：&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="3">
					<html:textarea property="board_pcard" value="${a3.board_pcard}" cols="60" rows="1" 
						style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
						
					</td>
				</tr>
				<tr>
					<td></td>
					<td colspan="4"></td>
				</tr>

				<tr>
					<td></td>
					<td colspan="4"></td>
				</tr>
				<tr height="80">
					<td align="center">
						
					</td>
					<td colspan="4">

						<input name="Submit" type="submit" class="input" value="号码更正">
						<input name="Reset" type="reset" class="input" value="重新填写">
					</td>
				</tr>
			</table>
			</html:form>
		</logic:iterate>
	</logic:notEmpty>










</body>
</html:html>
