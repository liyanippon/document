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
  if (theForm.Basic.value == "")
  {
    alert("������������ʣ�");
    theForm.Basic.focus();
    return (false);
  }  
  if (theForm.Post.value == "")
  {
    alert("�������λ���ʣ�");
    theForm.Post.focus();
    return (false);
  }
  if (theForm.Year.value == "")
  {
    alert("�����빤�乤�ʣ�");
    theForm.Year.focus();
    return (false);
  }
  if (theForm.Life.value == "")
  {
    alert("�������������");
    theForm.Life.focus();
    return (false);
  }  
  if (theForm.House.value == "")
  {
    alert("������ס��������");
    theForm.House.focus();
    return (false);
  }
  if (theForm.Traffic.value == "")
  {
    alert("�����뽻ͨ������");
    theForm.Traffic.focus();
    return (false);
  }
    if (theForm.Accumulate.value == "")
  {
    alert("�����빫����");
    theForm.Accumulate.focus();
    return (false);
  }
      if (theForm.Handle.value == "")
  {
    alert("�����뾭�������֣�");
    theForm.Handle.focus();
    return (false);
  }
  
  return (true);
}

</script>
</head>
<%@ include file="../incoming/Header.jsp"%>
<%
	String employeeid = new String(request.getParameter("employeeid").getBytes("ISO8859_1"),"GBK");
	Basic basic = Basic.FindByNO(employeeid);
	
%>

<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="BasicLeft.jsp"%></td>
    <td width="660" valign="top">
	<p align="center" class="title1">�޸Ļ�������</p>
	 <form name="form1" method="post" action="ModifyBasicStep2.jsp?employeeid=<%=employeeid%>"" onsubmit="return check_input(this)">
	<table width="640" height="225" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
	<tr>
        <td width="93" height="40"><div align="right"> Ա�����:</div></td>
        <td width="209"><%String id = (String)basic.getEmployeeID();out.println(id);%></td>
        <td width="104"><div align="right"> ������</div></td>
        <td width="200"><%String username = (String)basic.getUserName();out.println(username);%></td>
      </tr>
      <tr>
        <td width="93" height="40"><div align="right"> ��������:</div></td>
        <td width="209"><input name="Basic" type="text"  class="data" id="Basic" size="18" value="<%=basic.getBasic()%>" >
          *</td>
        <td width="104"><div align="right"> ��λ����:</div></td>
        <td width="200"><input name="Post" type="text"  class="data" id="Post" size="18" value="<%=basic.getPost()%>" >
          *</td>
      </tr>
      <tr>
        <td height="41"><div align="right">���乤��:</div></td>
        <td><input name="Year" type="text"  class="data" id="Year" size="18" value="<%=basic.getYear()%>" >          
          *</td>
        <td><div align="right">�����: </div></td>
        <td><input name="Life" type="text"  class="data" id="Life" size="18" value="<%=basic.getLife()%>" >
          *</td>
      </tr>
      <tr>
        <td height="42"><div align="right">ס������: </div></td>
        <td><input name="House" type="text"  class="data" id="House" size="18" value="<%=basic.getHouse()%>" >    
          *</td>
        <td><div align="right">��ͨ����: </div></td>
        <td><input name="Traffic" type="text"  class="data" id="Traffic" size="18" value="<%=basic.getTraffic()%>" >
          *</td>
      </tr>
      <tr>
        <td height="38"><div align="right">������:</div></td>
        <td>            <input name="Accumulate" type="text"  class="data" id="Accumulate" size="18" value="<%=basic.getAccumulate()%>" >
          *      </td>
        <td><div align="right">������: </div></td>
        <td><input name="Handle" type="text"  class="data" id="Handle" size="18" value="<%=basic.getHandle()%>" >
          *</td>
      </tr>
      
      <tr>
        <td height="49" colspan="4"><div align="center">
          <input type="submit" name="Submit" value="�޸�">
          <input type="reset" name="Submit2" value="ȡ��">
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
