<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../Check.jsp"%>
<%
	String employeeid = new String(request.getParameter("employeeid").getBytes("ISO8859_1"),"GBK");
	String username = new String(request.getParameter("username").getBytes("ISO8859_1"),"GBK");
	String sex = new String(request.getParameter("sex").getBytes("ISO8859_1"),"GBK");
	String branch = new String(request.getParameter("branch").getBytes("ISO8859_1"),"GBK");
	String nativeplace = new String(request.getParameter("nativeplace").getBytes("ISO8859_1"),"GBK");
	String marriage = new String(request.getParameter("marriage").getBytes("ISO8859_1"),"GBK");
	String politics = new String(request.getParameter("politics").getBytes("ISO8859_1"),"GBK");
	String folk = new String(request.getParameter("folk").getBytes("ISO8859_1"),"GBK");
	String education = new String(request.getParameter("education").getBytes("ISO8859_1"),"GBK");
	String administrationlevel = new String(request.getParameter("administrationlevel").getBytes("ISO8859_1"),"GBK");
	String duty = new String(request.getParameter("duty").getBytes("ISO8859_1"),"GBK");
	String position = new String(request.getParameter("position").getBytes("ISO8859_1"),"GBK");
	String incumbency = new String(request.getParameter("incumbency").getBytes("ISO8859_1"),"GBK");
	String incumbencytype = new String(request.getParameter("incumbencytype").getBytes("ISO8859_1"),"GBK");
										
	Vector listemployee = Employee.Search(employeeid,username,sex,branch,nativeplace,marriage,politics,folk,education,administrationlevel,
						duty,position,incumbency,incumbencytype);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<title><%=title%></title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen">
<script language="javascript">
function confirmdel(a) 
{
if (confirm("真的要删除员工编号为 "+a+" 的人员档案吗?") )
  top.location="DelEmployeeStep1.jsp?employeeid="+a
}
</script>
</head>
<body>
<%@ include file="../incoming/Header.jsp"%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="EmployeeLeft.jsp"%></td>
    <td width="660" align="center" valign="top">
	<p align="center" class="title1">管理人员档案</p>
    <table width="640"  border="1" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr bgcolor="#E7E7E7">
        <td width="62"><div align="center">员工编号</div></td>
        <td width="42"><div align="center">姓名</div></td>
        <td width="38"><div align="center">性别</div></td>
        <td width="74"><div align="center">所属部门</div></td>
        <td width="43"><div align="center">籍贯</div></td>
        <td width="68"><div align="center">婚姻状况</div></td>
        <td width="66"><div align="center">政治面貌</div></td>
        <td width="55"><div align="center">学历</div></td>
        <td width="118"><div align="center">操作</div></td>
      </tr>
<%		
      for(int i=0;i<listemployee.size();i++) 
	  {
			Employee  employee = (Employee)listemployee.elementAt(i);  
%>			
	  <tr>
        <td><div align="center"><%=DataConvert.ViewStr(employee.getEmployeeID())%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(employee.getUserName())%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(employee.getSex())%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(employee.getBranch())%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(employee.getNativePlace())%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(employee.getMarriage())%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(employee.getPolitics())%></div></td>
        <td><div align="center"><%=DataConvert.ViewStr(employee.getEducation())%></div></td>
        <td><div align="center"><a href="ModifyEmployeeStep1.jsp?employeeid=<%=employee.getEmployeeID()%>">修改</a> <a href="javascript:confirmdel('<%=employee.getEmployeeID()%>')">删除</a></div></td>
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
