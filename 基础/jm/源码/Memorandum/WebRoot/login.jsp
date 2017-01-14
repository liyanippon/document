<%@ page language="java" pageEncoding="GBK"
	contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean"
	prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
  <head>
    <title>前台登录</title>
    <base href="<%=basePath%>">
    <link style="text/css" rel="stylesheet" href="./tiles/style.css">
  </head>
  <body bgcolor="#AA8D60">
    <center>
			<html:form action="/login">
          <input type="hidden" name="method" value="login">
          <table background="./tiles/images/login/loginB.jpg" width="500" height="300" border="0" cellspacing="0" cellpadding="0" style="margin-top:90">
              <tr height="175">
                  <td colspan="2" style="text-indent:145">
                    
                  </td>
              </tr>
              <tr height="45">
                  <td align="right" width="35%">口&nbsp;&nbsp;令：</td>
                  <td>&nbsp;&nbsp;<input name="userName" type="text" class="input" size="20"
									maxlength="25"
									style="border-style: solid; border-width: 0; BACKGROUND-COLOR: #F4F4FF; color: #ff6600" />
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
              </tr>
              <tr height="30">
                  <td align="right">密&nbsp;&nbsp;码：</td>
                  <td>&nbsp;&nbsp;
				  <input name="passWord" type="password" class="input" size="20" maxlength="27"
					style="border-style: solid; border-width: 0; BACKGROUND-COLOR: #F4F4FF; color: #ff6600" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
              </tr>              
              <tr>
                  <td></td>
                  <td>
                      &nbsp;
                      <html:image src="./tiles/images/login/bsup.gif" onmousedown="this.src='./tiles/images/login/bsdown.gif'" onmouseup="this.src='./tiles/images/login/bsup.gif'"/>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      
                  </td>                  
              </tr>
          </table>
          <table width="500" border="0" width="350" cellspacing="0" cellpadding="0">
              <tr><td colspan="2"><img src="./tiles/images/login/loginE.jpg"></td></tr>                               
          </table>
      </html:form>
    </center>
  </body>
</html>







<!--<html>
	<head>
		<base href="<%=basePath%>">
		<link href="./tiles/main.css" rel="stylesheet" type="text/css">
		<title>网络新闻系统</title>
	</head>
	<body>

		<table width="100%" border="0" cellspacing="0" cellpadding="4"
			class="tabletoolbar">

			<tr class="listtitleborder">

				<td>

					<table width="100%" border="0" cellspacing="0" cellpadding="4">

						<tr>


							<td width="100%">
								<font size="5">网络新闻系统</font>

							</td>

						</tr>

					</table>
				</td>

			</tr>

			<tr>
				<td width="100%" bgcolor="#EAEAEA" colspan="2" class="listrow1">
					<html:form action="/login">
						<div align="left">
							<p class="boxborder">
								请用正确的方式访问
								<br>
								用户名：
								<input name="userName" type="text" class="input" size="20"
									maxlength="20"
									style="border-style: solid; border-width: 0; BACKGROUND-COLOR: #F4F4FF; color: #ff6600" />
								<br>
								密&nbsp;&nbsp;码：
								<input name="passWord" type="password" class="input" size="20"
									maxlength="20"
									style="border-style: solid; border-width: 0; BACKGROUND-COLOR: #F4F4FF; color: #ff6600" />
								<br>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input name="Submit" type="submit" class="input" value="登陆"
									style="border: 1px solid : #666666; height: 17px; width: 25pt; font-size: 9pt; BACKGROUND-COLOR: #E8E8FF; color: #666666">
								&nbsp;
								<input name="Reset" type="reset" class="input" value="取消"
									style="border: 1px solid : #666666; height: 17px; width: 25pt; font-size: 9pt; BACKGROUND-COLOR: #E8E8FF; color: #666666">
								&nbsp;
								<html:link href="./zhuce.jsp">注册</html:link>
						</div>
					</html:form>
				</td>
			</tr>
		</table>
	</body>
</html>
-->
