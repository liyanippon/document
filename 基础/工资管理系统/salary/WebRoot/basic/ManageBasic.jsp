<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../Check.jsp"%>
<%			
	Vector listtrain = Basic.ListAll();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<title><%=title%></title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen">
</head>
<body>
<%@ include file="../incoming/Header.jsp"%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="BasicLeft.jsp"%></td>
    <td width="660" align="center" valign="top">
	<p align="center" class="title1">��������Ϣ</p>
    <table width="640"  border="1" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr bgcolor="#E7E7E7">
        <td width="66"><div align="center">Ա�����</div></td>
        <td width="60"><div align="center">����</div></td>
        <td width="60"><div align="center">��������</div></td>
        <td width="77"><div align="center">��λ����</div></td>
        <td width="69"><div align="center">���乤��</div></td>
        <td width="75"><div align="center">�����</div></td>
        <td width="60"><div align="center">ס������</div></td>
        <td width="38"><div align="center">��ͨ����</div></td>
        <td width="38"><div align="center">������</div></td>
        <td width="38"><div align="center">������</div></td>
        <td width="61"><div align="center">����</div></td>
      </tr>
<%		
      for(int i=0;i<listtrain.size();i++) 
	  {
			Basic  basic = (Basic)listtrain.elementAt(i);  
%>			
	  <tr>
        <td><div align="center"><%=DataConvert.ViewStr(basic.getEmployeeID())%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(basic.getUserName())%></div></td>
        <td><div align="center"><%=basic.getBasic()%></div></td>
        <td><div align="center"><%=basic.getPost()%></div></td>
        <td><div align="center"><%=basic.getYear()%></div></td>
        <td><div align="center"><%=basic.getLife()%></div></td>
        <td><div align="center"><%=basic.getHouse()%></div></td>
        <td><div align="center"><%=basic.getTraffic()%></div></td>
        <td><div align="center"><%=basic.getAccumulate()%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(basic.getHandle())%></div></td>
		<td><div align="center"><a href="ModifyBasicStep1.jsp?employeeid=<%=basic.getEmployeeID()%>">�޸�</a> </div></td>	 
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
