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
.Noprint{display:none;}<!--用本样式在打印时隐藏非打印项目--> 
.PageNext{page-break-after: always;}<!--控制分页--> 
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
font-family: "宋体"; 
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
        printdetail.document.write("<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查询结果</h3>"); 
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
	<p align="center" class="title1">个人历史工资    </p>
    <DIV id="block">
    <table width="640"  border="1" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr bgcolor="#E7E7E7">
        <td width="80"><div align="center">员工编号</div></td>
        <td width="80"><div align="center">姓名</div></td>
        <td width="80"><div align="center">工资年月</div></td>
        <td width="80"><div align="center">固定工资</div></td>
        <td width="80"><div align="center">浮动工资</div></td>
        <td width="80"><div align="center">应发工资</div></td>
        <td width="80"><div align="center">本月扣除</div></td>
        <td width="80"><div align="center">实发工资</div></td>
         <td width="80"><div align="center">操作</div></td>
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
        <td><div align="center"><a href="../consumer/ViewQuery.jsp?employeeidd=<%=query.getEmployeeID()%>&paytime=<%=query.getPayTime()%>">详细</a></div></td>
	  </tr>
<%
	}
%>	
      
   

   </table>
   </div> 
   <p align="right"><input type=button  style= "height:23px;width:100px " value=打印查询结果 onclick="printScreen('block')"><input name="back" style= "height:23px;width:70px " type="button" id="back" value="返回" onClick="javascript:history.back()"></p>
    </td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>	
</body>
</html>
