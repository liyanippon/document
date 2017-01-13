<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>viewsnews.jsp</title>

</head>

<body>
	<TABLE border=1 cellSpacing=1 borderColor=#ffffff cellPadding=1
		width=642 bgColor=#6ebec7>
		<TBODY>


			<IMG src="../view/images/001.jpg">
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

			<TABLE border=1 cellSpacing=1 borderColor=#ffffff cellPadding=1
				width=642 bgColor=#6ebec7>
				<logic:iterate id="ff" collection="${requestScope.list_f}">
					<tr>
						<td align="right">
						<font color="#ffffff">每页15条&nbsp;</font>
						<a href='../vindex.do?method=news&sum=0&shang=${ff.shang}'>上一页</a>	|
						<a href='../vindex.do?method=news&sum=0&xia=${ff.xia}'>下一页</a>
						</td>
					</tr>
				</logic:iterate>
			</TABLE>

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

		</TBODY>
	</TABLE>
</body>
</html:html>
