<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../Check.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<title><%=title%></title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="../css/calendar-win2k-1.css" type="text/css" media="screen">
<script Language="JavaScript">
function check_input(theForm)
{
      if (theForm.handle.value == "")
  {
    alert("请输入经手人名字！");
    theForm.handle.focus();
    return (false);
  }
  
  return (true);
}
</script>
</head>
<%@ include file="../incoming/Header.jsp"%>
<%
	String employeeid = new String(request.getParameter("employeeid").getBytes("ISO8859_1"),"GBK");
	Pay pay = Pay.FindByNO(employeeid);	
	String paytime = (String)pay.getPayTime();
%>

<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="PayLeft.jsp"%></td>
    <td width="660" valign="top">
	<p align="center" class="title1">修改工资信息</p>
	 <form name="form1" method="post" action="ModifyPayStep2.jsp?employeeid=<%=employeeid%>&paytime=<%=paytime%>"   " onsubmit="return check_input(this)">
	<table width="640" height="225" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
	<tr>
        <td width="93" height="40"><div align="right"> 员工编号:</div></td>
        <td width="209"><%String id = (String)pay.getEmployeeID();out.println(id);%></td>
        <td width="104"><div align="right"> 姓名：</div></td>
        <td width="200"><%String username = (String)pay.getUserName();out.println(username);%></td>
      </tr>
      <tr>
        <td width="104"><div align="right">固定工资:</div></td>
        <td width="200"><%Double basicsum = (Double)pay.getBasicSum();out.println(basicsum);%></td>
        <td width="93" height="40"><div align="right"> 工资月份:</div></td>
        <td width="200"><%out.println(paytime);%></td>
      </tr>
      <tr>
        <td width="104"><div align="right"> 加班工资:</div></td>
        <td width="200"><input name="overtime" type="text"  class="data" id="overtime" size="18" value="<%=pay.getOverTime()%>" onKeyUp="value=value.replace(/[^\d.]/g,'')"></td>
        <td height="41"><div align="right">本月奖金:</div></td>
        <td><input name="bonus" type="text"  class="data" id="bonus" size="18" value="<%=pay.getBonus()%>" onKeyUp="value=value.replace(/[^\d.]/g,'')">          </td>
      </tr>
      <tr>
        <td><div align="right">绩效工资: </div></td>
        <td><input name="performance" type="text"  class="data" id="performance" size="18" value="<%=pay.getPerformance()%>" onKeyUp="value=value.replace(/[^\d.]/g,'')"></td>
        <td height="42"><div align="right">病假扣除: </div></td>
        <td><input name="sickleave" type="text"  class="data" id="sickleave" size="18" value="<%=pay.getSickLeave()%>" onKeyUp="value=value.replace(/[^\d.]/g,'')">    </td>
      </tr>
      <tr>
        <td><div align="right">事假扣除: </div></td>
        <td><input name="personalleave" type="text"  class="data" id="personalleave" size="18" value="<%=pay.getPersonalLeave()%>" onKeyUp="value=value.replace(/[^\d.]/g,'')"></td>
        <td height="38"><div align="right">缺勤扣除:</div></td>
        <td><input name="absence" type="text"  class="data" id="absence" size="18" value="<%=pay.getAbsence()%>" onKeyUp="value=value.replace(/[^\d.]/g,'')"></td>
      </tr>
      <tr>
      <td height="38"><div align="right">其它扣除:</div></td>
        <td><input name="others" type="text"  class="data" id="others" size="18" value="<%=pay.getOthers()%>" onKeyUp="value=value.replace(/[^\d.]/g,'')"></td>
      <td><div align="right">经手人: </div></td>
        <td><input name="handle" type="text"  class="data" id="handle" size="18" value="<%=pay.getHandle()%>" ></td>
        </tr>
      <tr>
        <td height="49" colspan="4"><div align="center">
          <input type="submit" name="Submit" value="修改">
          <input type="button" name="yourhiddeninfo" value="返回" onclick="window.open('ManagePay.jsp')">
        </div></td>
      </tr>
    </table>
	
	</form>    
    </td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>
</body>
</html>






