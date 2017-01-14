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
<script language="javascript">
function check_input(theForm)
{
  if (theForm.newuser.value == "")
  {
    alert("请输入用户名!");
        theForm.newuser.focus();
    return (false);
  }
  if (theForm.password1.value =="")
  {
    alert("请输入密码!");
    theForm.password1.focus();
    return (false);
  }
    if (theForm.password2.value =="")
  {
    alert("请再次确认密码!");
    theForm.password2.focus();
    return (false);
  }
  
  if (theForm.password1.value != theForm.password2.value)
  {
    alert("两次输入密码不一致.");
    theForm.password2.focus();
    return (false);
  }
}
</script>
<%@ include file="../incoming/Header.jsp"%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" background="../images/in_left_bg.gif"><%@ include file="UserLeft.jsp"%></td>
    <td width="648" align="center" valign="top">	
    	<form name="form1" method="post" action="AddUser2.jsp" onSubmit="return check_input(this)">
      <br>
      <p class="title1">添加用户</p>
      <table width="389" height="177" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
        <tr>
          <td width="135" height="29"><div align="right">新用户名: </div></td>
          <td width="236"><input name="newuser" type="text"  class="data" id="newuser" size="23" maxlength="16" ></td>
        </tr>
        <tr>
          <td height="29"><div align="right">输入密码: 
            </div>
            <div align="right"></div></td>
          <td height="29"><input name="password1" type="password"  class="data" id="password1" size="25" maxlength="16" ></td>
        </tr>
        <tr>
          <td height="29"><div align="right">确认密码: 
            </div>
            <div align="right"></div></td>
          <td height="29"><input name="password2" type="password"  class="data" id="password2" size="25" maxlength="16" ></td>
        </tr>
        <tr>
				  <td height=29> <div align="right"><strong> 权限 : </strong> </div></td>
				  <td height=29><select name="newpower">
                    <option value="普通用户" selected>普通用户</option>
                    <option value="管理员">管理员</option>
                  </select></td>
				</tr>
        <tr>
          <td height="44" colspan="2"><div align="center">
            <input type="submit" name="Submit" value="添加">
            <input type="reset" name="Submit2" value="重置">
</div></td>
        </tr>
      </table>
    </form></td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>
</body>
</html>