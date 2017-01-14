<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../Check.jsp"%>
<%
	String IsSucceed = "";
	String employeeid = new String(request.getParameter("employeeid").getBytes("ISO8859_1"),"GBK");
%>
<%try{	
	String username = new String(request.getParameter("username").getBytes("ISO8859_1"),"GBK");
	String sex = new String(request.getParameter("sex").getBytes("ISO8859_1"),"GBK");
	String branch = new String(request.getParameter("branch").getBytes("ISO8859_1"),"GBK");
	String birthday = new String(request.getParameter("birthday").getBytes("ISO8859_1"),"GBK");
	String nativeplace = new String(request.getParameter("nativeplace").getBytes("ISO8859_1"),"GBK");
	String marriage = new String(request.getParameter("marriage").getBytes("ISO8859_1"),"GBK");
	String identityid = new String(request.getParameter("identityid").getBytes("ISO8859_1"),"GBK");
	String politics = new String(request.getParameter("politics").getBytes("ISO8859_1"),"GBK");
	String folk = new String(request.getParameter("folk").getBytes("ISO8859_1"),"GBK");
	String education = new String(request.getParameter("education").getBytes("ISO8859_1"),"GBK");
	String department = new String(request.getParameter("department").getBytes("ISO8859_1"),"GBK");
	String graduatedate = new String(request.getParameter("graduatedate").getBytes("ISO8859_1"),"GBK");
	String university = new String(request.getParameter("university").getBytes("ISO8859_1"),"GBK");
	String accumulateid = new String(request.getParameter("accumulateid").getBytes("ISO8859_1"),"GBK");
	String administrationlevel = new String(request.getParameter("administrationlevel").getBytes("ISO8859_1"),"GBK");
	String duty = new String(request.getParameter("duty").getBytes("ISO8859_1"),"GBK");
	String position = new String(request.getParameter("position").getBytes("ISO8859_1"),"GBK");
	String foreignlanguage = new String(request.getParameter("foreignlanguage").getBytes("ISO8859_1"),"GBK");
	String fllevel = new String(request.getParameter("fllevel").getBytes("ISO8859_1"),"GBK");
	String computerlevel = new String(request.getParameter("computerlevel").getBytes("ISO8859_1"),"GBK");
	String phone = new String(request.getParameter("phone").getBytes("ISO8859_1"),"GBK");
	String mobilephone = new String(request.getParameter("mobilephone").getBytes("ISO8859_1"),"GBK");
	String address = new String(request.getParameter("address").getBytes("ISO8859_1"),"GBK");
	String incumbency = new String(request.getParameter("incumbency").getBytes("ISO8859_1"),"GBK");
	String incumbencytype = new String(request.getParameter("incumbencytype").getBytes("ISO8859_1"),"GBK");
	String resume = new String(request.getParameter("resume").getBytes("ISO8859_1"),"GBK");

    IsSucceed = Employee.Modify(employeeid,username,sex,branch,nativeplace,marriage,identityid,politics,folk,education,department,university,
			accumulateid, administrationlevel,duty,position,foreignlanguage,fllevel,computerlevel,phone,mobilephone,address,incumbency,incumbencytype,
			resume,birthday,graduatedate);

	}
	catch(Exception e){
		out.println("error:"+e.getMessage());
	}
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
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="EmployeeLeft.jsp"%></td>
    <td width="660" align="center" valign="top"><br><br><br><br>
   <a class="title2">
  <%
	if(IsSucceed.equals("1"))
		out.println("修改人员档案成功！");
	else
	{
		out.println("修改人员档案失败!");	
  %> 
              <br>
  <%		
		out.println("错误 : "+IsSucceed);	
	}	
  %>
      </a></p>	
	<form name="form2" method="post" action="Employee.jsp">
      		<a class="title2"><input name="back" type="submit" id="back" value="返回" >
      		</a>	
    </form>
    </td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>	
</body>
</html>
