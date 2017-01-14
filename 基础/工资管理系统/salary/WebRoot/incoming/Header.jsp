<%@ page contentType="text/html;charset=gb2312" %>
<script Language="JavaScript">
function show1(){
	if (!document.all)
		return
	var Digital=new Date();
	var year=Digital.getYear();
	var month=Digital.getMonth()+1;
	var day=Digital.getDate();
	var hours=Digital.getHours();
	var minutes=Digital.getMinutes();
	var seconds=Digital.getSeconds();
	var dn="AM" 
	if (hours>12){
		dn="PM";
		hours=hours-12;
		}
	if (hours==0)
		hours=12;
	if (minutes<=9)
		minutes="0"+minutes;
	if (seconds<=9)
		seconds="0"+seconds;
	var ctime=year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds+" "+dn;
	tick2.innerHTML="<b style='font-family: Arial;font-size:14px;color:#990000;'>"+ctime+"</b>"
	setTimeout("show1()",1000);
}
window.onload=show1
</script> 
<body background="../images/bg.jpg">
<TABLE bgColor="#336699" border=0 cellPadding=0 cellSpacing=1 width=780 align=CENTER>
  <TR>
    <TD align=middle background="../images/in_top_bg.gif" height=10> </TD>
  </TR>
</TABLE>
<TABLE align=center border=0 cellPadding=6 cellSpacing=1 width=780>
	<TR bgcolor="#6699CC">
		<TD width="100%" align=center><table width="100%" height="11%" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="26%" rowspan="2"></td>
            <td width="51%" rowspan="2"><div align="center"><font class="title1">工资管理系统</font></div></td>
            <td width="23%">&nbsp;</td>
          </tr>
          <tr>
            <td height="30"><a id=tick2></a></td>
          </tr>
        </table></TD>
  </TR>
</TABLE>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#F4E193">
  <tr>
    <td width="780" height="13" class="td3"><div align="center"><a href="../index.jsp">系统管理</a></div></td>
    <td width="780"><div align="center"><a href="../user/User.jsp">用户管理</a></div></td>
    <td width="780"><div align="center"><a href="../employee/Employee.jsp">员工信息管理</a></div></td>
    <td width="780"><div align="center"><a href="../basic/Basic.jsp">基本工资管理</a></div></td>
    <td width="780"><div align="center"><a href="../pay/Pay.jsp">工资发放</a></div></td>
    <td width="780"><div align="center"><a href="../query/Query.jsp">工资查询</a></div></td>
  </tr>
</table>
