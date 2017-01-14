<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../consumer/Check.jsp"%>
<%
	String employeeidd = new String(request.getParameter("employeeidd").getBytes("ISO8859_1"),"GBK");
								
	Vector listquery = Query.ViewPay(employeeidd);
%>

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
        printdetail.document.write("<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;��ѯ���</h3>"); 
        printdetail.document.write(value); 
        printdetail.document.write("</PRE>");
        printdetail.document.close("</BODY></HTML>");
      }
</script>




</head>

<body>
<%@ include file="../consumer/Header.jsp"%> 

<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="../consumer/Left.jsp"%></td>
    <td width="660" align="center" valign="top">
	<p align="center" class="title1">������ʷ����    </p>
    <DIV id="block">
    <table width="640"  border="1" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr bgcolor="#E7E7E7">
        <td width="80"><div align="center">Ա�����</div></td>
        <td width="80"><div align="center">����</div></td>
        <td width="80"><div align="center">��������</div></td>
        <td width="80"><div align="center">�̶�����</div></td>
        <td width="80"><div align="center">��������</div></td>
        <td width="80"><div align="center">Ӧ������</div></td>
        <td width="80"><div align="center">���¿۳�</div></td>
        <td width="80"><div align="center">ʵ������</div></td>
         <td width="80"><div align="center">����</div></td>
      </tr>
<%		
      for(int i=0;i<listquery.size();i++) 
	  {
			Query query = (Query)listquery.elementAt(i);  
%>			
	  <tr>
        <td><div align="center"><%=employeeidd%></a></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(query.getUserName())%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(query.getPayTime())%></div></td>
        <td><div align="center"><%=query.getBasicSum()%></div></td>
        <td><div align="center"><%=query.getFloatPay()%></div></td>
        <td><div align="center"><%=query.getPaySum()%></div></td>
        <td><div align="center"><%=query.getDeduction()%></div></td>
        <td><div align="center"><%=query.getActual()%></div></td>
        <td><div align="center"><a href="../consumer/ViewQuery.jsp?employeeidd=<%=query.getEmployeeID()%>&paytime=<%=query.getPayTime()%>">��ϸ</a></div></td>
	  </tr>
<%
	}
%>	
      
   

   </table>
   </div> 
   <p align="right"><input type=button  style= "height:23px;width:100px " value=��ӡ��ѯ��� onclick="printScreen('block')"><input name="back" style= "height:23px;width:70px " type="button" id="back" value="����" onClick="javascript:history.back()"></p>
    </td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>	
</body>
</html>
