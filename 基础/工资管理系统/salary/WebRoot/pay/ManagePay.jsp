<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../Check.jsp"%>
<%			
	Vector listtrain = Pay.ListAll();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<title><%=title%></title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen">
<script language="javascript">
function confirmdel(a,b) 
{
if (confirm("真的要删除这条工资记录吗？") )
  top.location="DelPay.jsp?employeeid="+a+"&paytime="+b
}
</script>
</head>
<body>
<%@ include file="../incoming/Header.jsp"%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="PayLeft.jsp"%></td>
    <td width="660" align="center" valign="top">
	<p align="center" class="title1">管理工资信息</p>
    <table width="640"  border="1" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr bgcolor="#E7E7E7">
        <td width="50"><div align="center">员工编号</div></td>
        <td width="50"><div align="center">姓名</div></td>
        <td width="70"><div align="center">工资月份</div></td>
        <td width="55"><div align="center">加班工资</div></td>
        <td width="55"><div align="center">本月奖金</div></td>
        <td width="55"><div align="center">绩效工资</div></td>
        <td width="55"><div align="center">病假扣除</div></td>
        <td width="55"><div align="center">事假扣除</div></td>
        <td width="55"><div align="center">缺勤扣除</div></td>
        <td width="55"><div align="center">其它扣除</div></td>
        <td width="70"><div align="center">经手人</div></td>
        <td width="61"><div align="center">操作</div></td>
      </tr>
<%		
      for(int i=0;i<listtrain.size();i++) 
	  {
			Pay  pay = (Pay)listtrain.elementAt(i); 
%>			
	  <tr>
        <td><div align="center"><%=DataConvert.ViewStr(pay.getEmployeeID())%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(pay.getUserName())%></div></td>
        <td><div align="center"><%=pay.getPayTime()%></div></td>
        <td><div align="center"><%=pay.getOverTime()%></div></td>
        <td><div align="center"><%=pay.getBonus()%></div></td>
        <td><div align="center"><%=pay.getPerformance()%></div></td>
        <td><div align="center"><%=pay.getSickLeave()%></div></td>
        <td><div align="center"><%=pay.getPersonalLeave()%></div></td>
        <td><div align="center"><%=pay.getAbsence()%></div></td>
        <td><div align="center"><%=pay.getOthers()%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(pay.getHandle())%></div></td>
		<td><div align="center"><a href="ModifyPayStep1.jsp?employeeid=<%=pay.getEmployeeID()%>">修改</a> <a href="javascript:confirmdel('<%=pay.getEmployeeID()%>','<%=pay.getPayTime()%>')">删除</a></div></td>	 
	  </tr>
<%
	}
%>		
    </table>
    </td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>	
</body>
</html>
