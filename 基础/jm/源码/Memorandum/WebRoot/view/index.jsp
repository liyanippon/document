<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html:html lang="true">
<head>
	<html:base />

	<title>index.jsp</title>


</head>

<body>
	<TABLE border=1 cellSpacing=1 borderColor=#ffffff cellPadding=1
		width=642 bgColor=#6ebec7>
		<TBODY>

			<TR>
				<TD height=30 width=642>
					<IMG src="../view/images/bg_11(3).jpg" width=642 height=30>
				</TD>
			</TR>

			<TR>
				<TD bgColor=#ffffff height=0 align="left">




					<a href="../vindex.do?method=news&sum=1"><IMG
							src="../view/images/bg_11(4).jpg">
					</a>
					<TABLE border=0 cellSpacing=0 borderColor=#ffffff cellPadding=0
						width=642 class="datalist">
						<logic:notEmpty name="list_pb">
							<logic:iterate id="aa1" collection="${requestScope.list_fy}">
								<tr>
									<td width=500>
										<a href="../vindex.do?method=newsselect&fenye_Id=${aa1.fenye_Id}">${aa1.zhuti}</a>
									</td>
									<td width=142>
										<FONT color="#336699"><bean:write name="aa1" property="shijian"
											format="yyyy-MM-dd hh:mm:ss" /></FONT>
									</td>
								</tr>

							</logic:iterate>
						</logic:notEmpty>
					</table>




					<a href="../vindex.do?method=placard&sum=1"><IMG
							src="../view/images/bg_11(5).jpg">
					</a>
					<TABLE border=0 cellSpacing=0 borderColor=#ffffff cellPadding=0
						width=642 class="datalist">

						<logic:notEmpty name="list_og">
							<logic:iterate id="aa2" collection="${requestScope.list_og}">
								<tr>
									<td width=500>
										<a href="../vindex.do?method=placardselect&fenye_Id=${aa2.fenye_Id}">${aa2.zhuti}</a>
									</td>
									<td width=142>
										<FONT color="#336699"><bean:write name="aa2" property="shijian"
											format="yyyy-MM-dd hh:mm:ss" /></FONT>
									</td>
								</tr>

							</logic:iterate>
						</logic:notEmpty>
					</table>

					<script language="javascript">
var rows = document.getElementsByTagName('tr');
for (var i=0;i<rows.length;i++){
 rows[i].onmouseover = function(){  //鼠标在行上面的时候
  this.className += 'altrow';
 }
 rows[i].onmouseout = function(){  //鼠标离开时
  this.className = this.className.replace('altrow','');
 }
}
</script>







				</TD>
			</TR>

		</TBODY>
	</TABLE>

</body>
</html:html>
