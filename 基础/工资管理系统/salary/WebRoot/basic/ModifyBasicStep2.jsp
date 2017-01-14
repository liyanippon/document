<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../Check.jsp"%>
<%
	String IsSucceed = "";
%>
<%
try{	
	String employeeid = new String(request.getParameter("employeeid").getBytes("ISO8859_1"),"GBK");
	Double basic = new Double(request.getParameter("Basic"));
	Double post = new Double(request.getParameter("Post"));
	Double year = new Double(request.getParameter("Year"));
	Double life = new Double(request.getParameter("Life"));
	Double house = new Double(request.getParameter("House"));
	Double traffic = new Double(request.getParameter("Traffic"));
    Double accumulate = new Double(request.getParameter("Accumulate"));
	String handle = new String(request.getParameter("Handle").getBytes("ISO8859_1"),"GBK");

    IsSucceed = Basic.Modify(employeeid,basic,post,year,life,house,traffic,accumulate,handle);

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
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="BasicLeft.jsp"%></td>
    <td width="660" align="center" valign="top"><br><br><br><br>
   <a class="title2">
  <%
	if(IsSucceed.equals("1"))
		out.println("修改基本工资成功！");
	else
	{
		out.println("修改基本工资失败!");	
  %> 
              <br>
  <%		
		out.println("错误 : "+IsSucceed);	
	}	
  %>
      </a></p>	
	<form name="form2" method="post" action="ManageBasic.jsp">
      		<a class="title2"><input name="back" type="submit" id="back" value="返回" >
      		</a>	
    </form>
    </td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>	
</body>
</html>
