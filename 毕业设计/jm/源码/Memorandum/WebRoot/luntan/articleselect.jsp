<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>articleselect.jsp</title>

</head>

<body>






	<TABLE style="WIDTH: 820px;" cellSpacing="0" cellPadding="0" border=""
		class="sortable">
		<tr>
			<td colSpan="7" align="center" class="listitem3">
				��̳������333
			</td>
		</tr>
	</TABLE>
	<TABLE style="WIDTH: 820px;" cellSpacing="2" cellPadding="2" border="0"
		id="mytable" class="sortable">

		<TR class="listrow1">
			<TD width="6%">
				����
			</TD>
			<TD width="12%">
				��Ŀ����
			</TD>
			<TD width="52%">
				��Ŀ˵��
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

						<a
							href='article.do?method=lanmuarticleselect&class_id=${al.class_id }'>${al.class_name}</a>




					</TD>
					<TD class="listline001">
						${al.class_intro}
						<br>
					</TD>
				</TR>

			</logic:iterate>
	</TABLE>









	<logic:notEmpty name="fanhui">







		<TABLE style="WIDTH: 820px;" cellSpacing="2" cellPadding="2">
			<TBODY>
				<TR>
					<TD bgColor=#ffcf60 height=20 class="listitem1">
						<DIV align=center>
							<logic:iterate id="aa" collection="${requestScope.biaoti}">
								${aa.biaoti}
							</logic:iterate>
							��Ŀ����
						</DIV>
					</TD>
				</TR>
				<TR>
					<TD bgColor=#666666>

						<TABLE border=0 cellSpacing=1 cellPadding=0 width=800 border="0"
							id="mytable" class="sortable" align="center">
							<TBODY>
								<TR>
									<TD bgColor=#ffffff height=20 width="10%" align=center>
										<DIV align=center>
											����
										</DIV>
									</TD>
									<TD bgColor=#ffffff width="30%" align=center>
										<DIV align=center>
											��Ŀ����
										</DIV>
									</TD>
									<TD bgColor=#ffffff width="30%" align=center>
										<DIV align=center>
											������
										</DIV>
									</TD>
									<TD bgColor=#ffffff width="10%" align=center>
										<DIV align=center>
											����
										</DIV>
									</TD>
									<TD bgColor=#ffffff width="10%" align=center>
										<DIV align=center>
											������
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
												${a2.board_master}
											</DIV>
										</TD>
										<TD bgColor=#ffffff height=20>
											<DIV align=center>
												<a
													href='article.do?method=lanmuarticleselectsql&board_id=${a2.board_id}'>��������</a>
											</DIV>
										</TD>
										<TD bgColor=#ffffff height=20>
											<DIV align=center>
												<a
													href='article.do?method=lanmuarticleissue&board_id=${a2.board_id}&board_name=${a2.board_name}'>������</a>
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











	<logic:notEmpty name="tiezi">



		<TABLE border=0 cellSpacing=1 cellPadding=0 width=800 border="0"
			id="mytable" class="sortable" align="left">
			<TBODY>
				<img src="./luntan/ban.jpg" width="820" align="left">
				<TR>
					<TD bgColor=#ffffff height=20 width="10%" align=center>
						<DIV align=center>
							����
						</DIV>
					</TD>
					<TD bgColor=#ffffff width="35%" align=center>
						<DIV align=center>
							����
						</DIV>
					</TD>
					<TD bgColor=#ffffff width="15%" align=center>
						<DIV align=center>
							������
						</DIV>
					</TD>
					<TD bgColor=#ffffff width="10%" align=center>
						<DIV align=center>
							�ظ�
						</DIV>
					</TD>
					<TD bgColor=#ffffff width="20%" align=center>
						<DIV align=center>
							����ʱ��
						</DIV>
					</TD>
					<TD bgColor=#ffffff width="20%" align=center>
						<DIV align=center>
							״̬
						</DIV>
					</TD>
				</TR>
				<logic:iterate id="a3" collection="${requestScope.tiezi}">


					<TR>
						<TD bgColor=#ffffff height=20>
							<DIV align=left>
								${a3.bbs_id}
							</DIV>
						</TD>
						<TD bgColor=#ffffff height=20>
							<DIV align=left>
								<a
									href='article.do?method=lanmuarticlebbstitle&bbs_id=${a3.bbs_id}'>${a3.bbs_title}</a>
							</DIV>
						</TD>
						<TD bgColor=#ffffff height=20>
							<DIV align=left>
								${a3.bbs_user}
							</DIV>
						</TD>
						<TD bgColor=#ffffff height=20>
							<DIV align=center>
								${a3.bbs_number}
								<br>
							</DIV>
						</TD>
						<TD bgColor=#ffffff height=20>
							<DIV align=center>
								${a3.bbs_time}
								<br>
							</DIV>
						</TD>
						<TD bgColor=#ffffff height=20>
							<DIV align=center>
								<logic:equal name="a3" property="onoff" value="1">
									<a
										href='article.do?method=luntanarticleonoff&bbs_id=${a3.bbs_id}&onoff=0'>����</a>
								</logic:equal>
								<logic:equal name="a3" property="onoff" value="0">
									<a
										href='article.do?method=luntanarticleonoff&bbs_id=${a3.bbs_id}&onoff=1'>���</a>
								</logic:equal>
							</DIV>
						</TD>

					</TR>
				</logic:iterate>


			</TBODY>
		</TABLE>

	</logic:notEmpty>



	<logic:notEmpty name="tiezizhuti">
		<logic:iterate id="a4" collection="${requestScope.tiezizhuti}">
			<TABLE width=820 height="100%" cellSpacing="0" cellPadding="0"
				border="0" class="ptableframe" >
				
				<img src="./luntan/ban01.jpg" width="820" align="left">
				<TR>
					<TD height="5%" colSpan=2 bgColor=#ffffff align="right">
						����ʱ��:${a4.bbs_time}

					</TD>
				</TR>
				<TR class="listtitleborder">
					<TD align="center" height="2%">
						${a4.bbs_title}
					</TD>
					<TD align="right" width="8%">
						<form>
							<input type="button" value="���������б�"
								style="border: 1px; solid: #666666; height: 20px; width: 100px; font-size: 10pt; background-color: #8CAAE7; color: #666666"
								onClick="javascript: history.go(-1)" title="���������б�">
						</form>

					</TD>
				</TR>
				<TR>
					<TD colSpan="2" class="listcelltitle" height="*" valign="top">
						${a4.bbs_content}
					</TD>
				</TR>

			</TABLE>
		</logic:iterate>
	</logic:notEmpty>



































</body>
</html:html>
