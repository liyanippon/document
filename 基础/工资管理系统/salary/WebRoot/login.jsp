<%@page contentType="text/html;charset=gb2312"%>
<%@ include file="incoming/Common.jsp"%>
<%
 String loginmsg = request.getParameter("loginmsg");
 request.getSession(true);
 session.putValue("IsLogin","false");
%>
<html>
<head>
<title><%=title%></title>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=gb2312">
<link href="css/style.css" rel="stylesheet" type="text/css">
<script language="JavaScript">
function check_input() 
{
	if( form.username.value.length<1 || form.username.value.length>16 ) 
	{
		alert("�������û���!")
		return false;
	}
	if( form.password.value.length<1 || form.password.value.length>16 ) 
	{
		alert("����������!")
		return false;
	}
}
</script>
</head>
<body>
<p>&nbsp;</p>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<table width="403" height="208" border="2" align="center" cellpadding="2" cellspacing="2" bordercolor="#878080">
  <tr>
    <td width="403" height="208"><div align="center">
      <table width="100%" border=0 cellpadding=0 cellspacing=0 background="images/login_bg.jpg" bgcolor="#FFFFFF" class=bg>
        <form action=ChkLogin.jsp method=post name=form onSubmit="return check_input()">
          <tr>
            <td width="402" height=40 align=left bgcolor="#CCCCCC"><div align="center"><a class="title1">���ʹ���ϵͳ</a></div></td>
          </tr>
          <tr>
            <td align=center valign=top>
              <table width=210 border=0 cellspacing=0 cellpadding=0>
                <input type=hidden name=url value="">
                <tr>
                  <td width="98" height=29><div align="right"><strong> �û��� : </strong> </div></td>
                  <td width="112" height=29><input name=username class=data size=16 maxlength=16 value=""></td>
                </tr>
                <tr>
                  <td height=29> <div align="right"><strong> ���� : </strong> </div></td>
                  <td height=29><input name=password type=password class=data size=16 maxlength=16></td>
                </tr>
				<tr>
				  <td height=29> <div align="right"><strong> Ȩ�� : </strong> </div></td>
				  <td height=29><select name="power">
                    <option value="��ͨ�û�" selected>��ͨ�û�</option>
                    <option value="����Ա">����Ա</option>
                  </select></td>
				</tr>
              </table>
              <table width=210 border=0 cellspacing=0 cellpadding=0>
                <tr>
                  <td height="41" colspan="2" align=right><div align="center"><font color=fe8c14>
                    </font>
                    <font color=fe8c14>
                      <input name="submit" type=submit value="��¼" class=button>
                      <input name=reset type=reset class=button id="reset2"  value="ȡ��">
                      </font></div>
                      <div align="center"><font color=fe8c14>
                    </font></div></td>
                  </tr>
                </table></td>
          </tr>
          <tr>
            <td align="center" >
              <table width="75%" height="36%" cellpadding="0" cellspacing="0">
                <tr>
                  <td height="5"><img src="images/login_line.gif" width="300" height="4"></td>
                </tr>
                <tr>
                  <td height="37" align="center"> <font color="#CC0000">
                    <%
 					if(loginmsg != null && loginmsg.equals("userwrong"))
 					 	out.print("�û��������벻��ȷ��");
					 else if(loginmsg != null && loginmsg.equals("loginfirst"))
 					 	out.print("���ȵ�¼��");
 					 	 else if(loginmsg != null && loginmsg.equals("loginwrong"))
 					 	out.print("��û��Ȩ��ʹ�ô˹��ܣ������µ�¼��");
 					 else if(loginmsg != null && loginmsg.equals("logout"))
 					 	out.print("�Ѿ��ɹ��˳�ϵͳ��");	
					%>
                  </font></td>
                </tr>
              </table>
            </td>
          </tr>
        </form>
      </table>
    </div></td>
  </tr>
</table>
</body>
</html>
