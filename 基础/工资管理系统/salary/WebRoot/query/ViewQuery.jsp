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


<style media=print> 
.Noprint{display:none;}<!--�ñ���ʽ�ڴ�ӡʱ���طǴ�ӡ��Ŀ--> 
.PageNext{page-break-after: always;}<!--���Ʒ�ҳ--> 
</style>

<style> 
.style_td 
{ 
border-bottom: 1 solid #000000; 
border-left: 1 solid #000000; 
border-right: 0 solid #ffffff; 
border-top: 0 solid #ffffff; 
} 
.style_tab 
{ 
border-color: #000000 #000000 #000000 #000000; 
border-style: solid; 
border-top-width: 2px; 
border-right-width: 2px; 
border-bottom-width: 1px; 
border-left-width: 1px; 
} 
.NOPRINT { 
font-family: "����"; 
font-size: 9pt; 
}

</style>

<script language="javascript"> 
      function printScreen(block)
      {        
        var value = document.all.block.innerHTML;
        var printdetail = window.open("","printDetail","");
        printdetail.document.open();
        printdetail.document.write("<HTML><head></head><BODY onload='window.print()'>"); 
        printdetail.document.write("<PRE>"); 
        printdetail.document.write("<div align='center'valign='top' >"); 
        printdetail.document.write("<h1>���˹�����ϸ</h1>"); 
        printdetail.document.write("</div>"); 
        printdetail.document.write(value); 
        printdetail.document.write("</PRE>");
        printdetail.document.close("</BODY></HTML>");
      }
</script>




<style type="text/css">
<!--
.STYLE3 {font-size: 10pt}
.STYLE7 {font-size: 12pt; font-weight: bold; color: #000000; }
.STYLE8 {
	color: #000000;
	font-size: 12pt;
}
.STYLE9 {font-size: 12pt; font-weight: bold; }
.STYLE12 {
	font-size: 16pt;
	color: #000000;
	font-weight: bold;
}
.STYLE14 {font-size: 16pt; font-weight: bold; }
-->
</style>
</head>

<%@ include file="../incoming/Header.jsp"%>
<%
	String employeeid = new String(request.getParameter("employeeid").getBytes("ISO8859_1"),"GBK");
	String paytime = new String(request.getParameter("paytime").getBytes("ISO8859_1"),"GBK");
	Query query=Query.FindByID(employeeid,paytime); 

%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" id="table1">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="QueryLeft.jsp"%></td>
    <td width="660" align="center">
	<p align="center" class="title1" valign="top">���˹�����ϸ</p>
	<DIV id="block">
	<table width="640" height="415" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr>
        <td width="95"><div align="right">Ա����ţ�</div></td>
        <td width="80"><input name="employeeid" type="text"  class="data" id="employeeid" size="8" maxlength="4" value="<%=query.getEmployeeID()%>" readonly="true"/></td>
        <td width="100"><div align="right">������</div></td>
        <td width="90"><input name="username" type="text"  class="data" id="username" size="8" maxlength="4" value="<%=query.getUserName()%>" readonly="true"/></td>
        <td width="145"><div align="right">�����·ݣ�</div></td>
        <td height="35"><input name="paytime" type="text"  class="data" id="paytime" size="8" maxlength="4" value="<%=query.getPayTime()%>" readonly="true"/></td>
      </tr>
      <tr>
        <td height="35"><div align="right">���ţ�</div></td>
        <td height="35"><input name="branch2" type="text"  class="data" id="branch2" size="8" maxlength="4" value="<%=query.getBranch()%>" readonly="true"/></td>
        <td height="35"><div align="right">ְ��</div></td>
        <td height="35"><input name="duty" type="text"  class="data" id="duty" size="8" maxlength="4" value="<%=query.getDuty()%>" readonly="true"/></td>
        <td height="35" colspan="2">&nbsp;</td>
        </tr>
      <tr>
        <td height="26" colspan="6">
          <div align="center" class="STYLE12">�̶����� </div>        </td>
      </tr>
      <tr>
        <td><div align="right">�������ʣ�</div></td>
        <td><input name="basic" type="text"  class="data" id="basic" size="8" maxlength="4" value="<%=query.getBasic()%>" readonly="true"/></td>
        <td><div align="right">��λ���ʣ�</div></td>
        <td><input name="post" type="text"  class="data" id="post" size="8" maxlength="4" value="<%=query.getPost()%>" readonly="true"/></td>
        <td><div align="right">���乤�ʣ�</div></td>
        <td><input name="year" type="text"  class="data" id="year" size="8" maxlength="4" value="<%=query.getYear()%>" readonly="true"/></td>
        </tr>
      <tr>
        <td><div align="right">�������</div></td>
        <td><input name="life" type="text"  class="data" id="life" size="8" maxlength="4" value="<%=query.getLife()%>" readonly="true"/></td>
        <td><div align="right">ס��������</div></td>
        <td><input name="house" type="text"  class="data" id="house" size="8" maxlength="4" value="<%=query.getHouse()%>" readonly="true"/></td>
        <td><div align="right">��ͨ������</div></td>
        <td height="34"><input name="traffic" type="text"  class="data" id="traffic" size="8" maxlength="4" value="<%=query.getTraffic()%>" readonly="true"/></td>
      </tr>
      <tr>
        <td><div align="right">������</div></td>
        <td colspan="3"><input name="accumulate" type="text"  class="data" id="accumulate" size="8" maxlength="4" value="<%=query.getAccumulate()%>" readonly="true"/></td>
        <td><div align="right" class="title2 STYLE8 STYLE3"><strong>�̶����ʺϼƣ�</strong></div></td>
        <td height="31"><input name="basicsum" type="text"  class="data" id="basicsum" size="8" maxlength="4" value="<%=query.getBasicSum()%>" readonly="true"/></td>
      </tr>
      <tr>
        <td height="26" colspan="6"><div align="center" class="STYLE14">��������</div></td>
      </tr>
      <tr>
        <td><div align="right">�Ӱ๤�ʣ�</div></td>
        <td><input name="overtime" type="text"  class="data" id="overtime" size="8" maxlength="4" value="<%=query.getOverTime()%>" readonly="true"/></td>
        <td><div align="right">��Ч���ʣ�</div></td>
        <td><input name="performance" type="text"  class="data" id="performance" size="8" maxlength="4" value="<%=query.getPerformance()%>" readonly="true"/></td>
        <td><div align="right">���½���</div></td>
        <td height="35"><input name="bonus" type="text"  class="data" id="bonus" size="8" maxlength="4" value="<%=query.getBonus()%>" readonly="true"/></td>
      </tr>
      <tr>
        <td height="31" colspan="4">&nbsp;</td>
        <td><div align="right" class="title2 STYLE8 STYLE3"><strong>�������ʺϼƣ�</strong></div></td>
        <td><input name="floatpay" type="text"  class="data" id="floatpay" size="8" maxlength="4" value="<%=query.getFloatPay()%>" readonly="true"/></td>
      </tr>
      <tr>
        <td height="26" colspan="6"><div align="center" class="STYLE14">�۳�</div></td>
      </tr>
      <tr>
        <td><div align="right">���ٿ۳���</div></td>
        <td><input name="sickleave" type="text"  class="data" id="sickleave" size="8" maxlength="4" value="<%=query.getSickLeave()%>" readonly="true"/></td>
        <td><div align="right">�¼ٿ۳���</div></td>
        <td><input name="personalleave" type="text"  class="data" id="personalleave" size="8" maxlength="4" value="<%=query.getPersonalLeave()%>" readonly="true"/></td>
        <td><div align="right">ȱ�ڿ۳���</div></td>
        <td><input name="absence" type="text"  class="data" id="absence" size="8" maxlength="4" value="<%=query.getAbsence()%>" readonly="true"/></td>
        </tr>
      <tr>
        <td height="31"><div align="right">�����۳���</div></td>
        <td><input name="others" type="text"  class="data" id="others" size="8" maxlength="4" value="<%=query.getOthers()%>" readonly="true"/></td>
        <td><div align="right">��������˰��</div></td>
        <td><input name="tax" type="text"  class="data" id="tax" size="8" maxlength="4" value="<%=query.getTax()%>" readonly="true"/></td>
        <td><div align="right" class="title2 STYLE8 STYLE3"><strong>�۳��ϼƣ�</strong></div></td>
        <td><input name="deduction2" type="text"  class="data" id="deduction2" size="8" maxlength="4" value="<%=query.getDeduction()%>" readonly="true"/></td>
        </tr>
      <tr>
        <td height="31"><div align="right" class="STYLE9"><strong>Ӧ���ϼƣ�</strong></div></td>
        <td><input name="paysum" type="text"  class="data" id="paysum" size="8" maxlength="4" value="<%=query.getPaySum()%>" readonly="true"/></td>
        <td><div align="right" class="STYLE7"><strong>Ӧ�ۺϼƣ�</strong></div></td>
        <td><input name="deduction" type="text"  class="data" id="deduction" size="8" maxlength="4" value="<%=query.getDeduction()%>" readonly="true"/></td>
        <td><div align="right">
            <div align="right" class="STYLE7"><strong>ʵ�����ʣ�</strong></div>
        </div></td>
        <td width="80"><input name="actual" type="text"  class="data" id="actual" size="8" maxlength="4" value="<%=query.getActual()%>" readonly="true"/></td>
        </tr>
    </table>
	</div> 
   <p align="right"><input type=button  style= "height:23px;width:100px " value=��ӡ��ѯ��� onClick="printScreen('block')"><input name="back" style= "height:23px;width:70px " type="button" id="back" value="����" onClick="javascript:history.back()"></p>
	<p>&nbsp;</p>
	<p>&nbsp;</p></td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>
</body>
</html>
