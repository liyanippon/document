<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html:html lang="true">
<head>
	<html:base />
	<title>viewsplacard.jsp</title>
</head>

<body>


	<TABLE border=1 cellSpacing=1 borderColor=#ffffff cellPadding=1
		width=642 bgColor=#6ebec7>
		<TBODY>

			<IMG src="../view/images/002.jpg">

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
									format="yyyy-MM-dd hh:mm:ss" /><FONT color="#336699">
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
						<font color="#ffffff">ÿҳ15��&nbsp;</font>
							<a href='../vindex.do?method=placard&sum=0&shang=${ff.shang}'>��һҳ</a>	|
						<a href='../vindex.do?method=placard&sum=0&xia=${ff.xia}'>��һҳ</a>
						</td>
					</tr>
				</logic:iterate>
			</TABLE>



			<script language="javascript">
var rows = document.getElementsByTagName('tr');
for (var i=0;i<rows.length;i++){
 rows[i].onmouseover = function(){  //������������ʱ��
  this.className += 'altrow';
 }
 rows[i].onmouseout = function(){  //����뿪ʱ
  this.className = this.className.replace('altrow','');
 }
}
</script>



		</TBODY>
	</TABLE>








</body>
</html:html>
