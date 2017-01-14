<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../Check.jsp"%>
<%
	String IsSucceed = "";	
%>
<%
try{	
	String employeeid = new String(request.getParameter("employeeid").getBytes("ISO8859_1"),"GBK");
	Double basic = new Double(request.getParameter("basic"));
	Double post = new Double(request.getParameter("post"));
	Double year = new Double(request.getParameter("year"));
	Double life = new Double(request.getParameter("life"));
	Double house = new Double(request.getParameter("house"));
	Double traffic = new Double(request.getParameter("traffic"));
    Double accumulate = new Double(request.getParameter("accumulate"));
	String handle = new String(request.getParameter("handle").getBytes("ISO8859_1"),"GBK");

	StringTokenizer st=new StringTokenizer(employeeid,",");  
	Vector v = new Vector()  ;  
	while(st.hasMoreTokens())  
     v.add(st.nextToken())  ;  
	String[] employeeidarray = new String[v.size()];  
	v.copyInto(employeeidarray);  

	for(int i=0;i<v.size();i++)
		{			
			IsSucceed = Basic.Add(employeeidarray[i],basic,post,year,life,house,traffic,accumulate,handle);
			if(!IsSucceed.equals("1"))
				break;
		}  
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
		out.println("添加基本工资成功！");
	else
	{
		out.println("添加基本工资失败!");	
  %> 
              <br>
  <%		
		out.println("错误 : "+IsSucceed);	
	}	
  %>
      </a></p>	
	<form name="form2" method="post" action="Basic.jsp">
	 <input type="button" name="yourhiddeninfo" value="继续添加" onclick="window.open('AddBasicStep1.jsp')">
      		<a class="title2"><input name="back" type="submit" id="back" value="返回" ></a>	
    </form>
    </td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>	
</body>
</html>
