<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript">
	        function reg()
	        {
	                var url="<%=path %>/qiantai/userinfo/userReg.jsp";
	                var n="";
	                var w="480px";
	                var h="500px";
	                var s="resizable:no;help:no;status:no;scroll:yes";
				    openWin(url,n,w,h,s);
	        }
	        
	        function login()
	        {
	           if(document.userLogin.userName.value=="")
	           {
	               alert("请输入用户名");
	               return;
	           }
	           if(document.userLogin.userPw.value=="")
	           {
	               alert("请输入密码");
	               return;
	           }
	           document.userLogin.submit();
	        }
	</script>
  </head>
  
  <body>
      <div class="SquarelyGreenContainer">
		<div class="top">
			<div class="bgbtop-center">
				<span><a href="">用户登陆</a></span>
				<div class="WinRight"></div>
			</div>
		</div>
		<div class="Slot">
		    <s:if test="#session.user==null">
			<form action="<%=path %>/userLogin.action" name="userLogin" method="post">
		    <table cellspacing="0" cellpadding="0" width="98%" align="center" border="0">
		          <tr>
		            <td align="center" colspan="2" height="10"></td>
		          </tr>
		          <tr>
		            <td align="right" width="31%" height="30" style="font-size: 11px;">用户名：</td>
		            <td align="left" width="69%"><input style="width: 100px;" name="userName" type="text" /></td>
		          </tr>
		          <tr>
		            <td align="right" height="30" style="font-size: 11px;">密　码：</td>
		            <td align="left"><input type="password" style="width: 100px;" name="userPw"/></td>
		          </tr>
		          <tr>
		            <td align="center" colspan="2" height="10"><font color="red"><s:property value="#request.error"/></font></td>
		          </tr>
		          <tr>
		            <td align="center" colspan="2" height="30">
		               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		               <input type="button" value="登  录" onclick="login()" style="border:#ccc 1px solid; background-color:#FFFFFF; font-size:12px; padding-top:3px;" />
					   &nbsp;
					   <input type="button" value="注  册" onclick="reg()" style="border:#ccc 1px solid; background-color:#FFFFFF; font-size:12px; padding-top:3px;" />
		            </td>
		          </tr>
		    </table>
		    </form>
		    </s:if>
		    <s:else>
	        <br/>
		     欢迎您：<s:property value="#session.user.userName"/> &nbsp;&nbsp;&nbsp;&nbsp;
		    <a href="<%=path %>/userLogout.action">安全退出</a> &nbsp;&nbsp;&nbsp;&nbsp;
		    <br/><br/><br/>
	        </s:else>
		</div>
	 </div>
	 
	 <div class="SquarelyGreenContainer">
		<div class="top">
			<div class="bgbtop-center">
				<span><a href="">体育用品查询</a></span>
				<div class="WinRight"></div>
			</div>
		</div>
		<div class="Slot" style="height: 40px;">
		    <form action="<%=path %>/goodsSearch.action" name="from1" method="post">
		        <table>
		            <tr>
		                <td>
		                    <input type="text" name="goodsName" size="14"/>
		                </td>
		                <td>
		                    <input type="submit" value="查询" style="border:#ccc 1px solid; background-color:#FFFFFF; font-size:12px; padding-top:3px;"/>
		                </td>
		            </tr>
		        </table>
		    </form>
		</div>
	 </div>
	 
	
	 
	 <div class="SquarelyGreenContainer">
		<div class="top">
			<div class="bgbtop-center">
				<span><a href="">体育用品类别</a></span>
				<div class="WinRight"></div>
			</div>
		</div>
		<div class="Slot">
		    <s:action name="catelogAll" executeResult="true" flush="true"></s:action>
		</div>
	 </div>
	 <div class="SquarelyGreenContainer">
		<div class="top">
			<div class="bgbtop-center">
				<span><a href="">日历表</a></span>
				<div class="WinRight"></div>
			</div>
		</div>
		<div class="Slot" style="height: 170px;">
		    <jsp:include flush="true" page="/qiantai/rili/rili.jsp"></jsp:include>
		</div>
	 </div>
  </body>
</html>
