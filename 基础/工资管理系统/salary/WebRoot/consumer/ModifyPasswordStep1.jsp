<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../consumer/CheckIndex.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<title><%=title%></title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen">
<script language="javascript">
function check_input(theForm)
{
  if (theForm.oldpassword.value == "")
  {
    alert("请输入旧密码.");
    theForm.oldpassword.focus();
    return (false);
  }
  if (theForm.newpassword.value != theForm.confirmpassword.value)
  {
    alert("两次输入密码不一致.");
    theForm.confirmpassword.focus();
    return (false);
  }
}
</script>
</head>
<%@ include file="../consumer/Header.jsp"%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" background="../images/in_left_bg.gif"><%@ include file="../consumer/Left.jsp"%></td>
    <td width="648" align="center" valign="top">	
    	<form name="form1" method="post" action="../consumer/ModifyPasswordStep2.jsp" onSubmit="return check_input(this)">
      <br>
      <p class="title1">修改密码</p>
      <table width="389" height="177" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
        <tr>
          <td width="135" height="29"><div align="right">用户名: </div></td>
          <td width="236"><%String username = (String)session.getValue("UserName");out.println(username);%></td>
        </tr>
        <tr>
          <td height="29"><div align="right">输入旧密码: 
            </div>
            <div align="right"></div></td>
          <td height="29"><input name="oldpassword" type="password"  class="data" id="oldpassword2" size="25" maxlength="16" ></td>
        </tr>
        <tr>
          <td height="29"><div align="right">输入新密码: 
            </div>
            <div align="right"></div></td>
          <td height="29"><input name="newpassword" type="password"  class="data" id="newpassword2" size="25" maxlength="16" ></td>
        </tr>
        <tr>
          <td height="44"><div align="right">确认密码: 
            </div></td>
          <td height="44"><input name="confirmpassword" type="password"  class="data" id="confirmpassword2" size="25" maxlength="16" ></td>
        </tr>
        <tr>
          <td height="44" colspan="2"><div align="center">
            <input type="submit" name="Submit" value="修改">
            <input type="reset" name="Submit2" value="取消">
</div></td>
        </tr>
      </table>
    </form></td>
  </tr>
</table>
<%@ include file="../consumer/Footer.jsp"%>
</body>
</html>
