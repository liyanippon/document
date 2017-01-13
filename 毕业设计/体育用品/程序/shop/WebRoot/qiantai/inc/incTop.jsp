<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <style type="text/css">
        .Header {CLEAR: both; DISPLAY: block; FLOAT: left; BACKGROUND-IMAGE: url(<%=path %>/img/top.png); WIDTH: 972px; POSITION: relative; HEIGHT: 110px}
        .Header .HeaderTop {HEIGHT: 70px}
    </style>
    
    <script type="text/javascript" src="<%=path %>/js/public.js"></script>
    
    <script type="text/javascript">
        function myXinxi()
	        {
	            <s:if test="#session.user==null">
	                  alert("请先登录");
	            </s:if>
	            
	            <s:else>
	                var url="<%=path %>/qiantai/userinfo/userXinxi.jsp";
	                var n="";
	                var w="480px";
	                var h="500px";
	                var s="resizable:no;help:no;status:no;scroll:yes";
				    openWin(url,n,w,h,s);
	            </s:else>
	        }
	        function myCart()
	        {
	            <s:if test="#session.user==null">
	                  alert("请先登录");
	            </s:if>
	            
	            <s:else>
	                 var s="<%=path %>/myCart.action";
	                 window.location.href=s;
	            </s:else>
	        }
	        
	        function myOrder()
	        {
	            <s:if test="#session.user==null">
	                  alert("请先登录");
	            </s:if>
	            
	            <s:else>
	                 var s="<%=path %>/myOrder.action";
	                 window.location.href=s;
	            </s:else>
	        }
	        
	        function liuyanAll()
	        {
	            <s:if test="#session.user==null">
	                  alert("请先登录");
	            </s:if>
	            
	            <s:else>
	                 var url="<%=path %>/liuyanAll.action";
				     window.open(url,"_blank");
	            </s:else>
	        }
	        
	        
	        function gonggaoAll()
	        {
	            var  url="<%=path %>/gonggaoAll.action";
	            window.location.href=url;
	        }
        
    </script>
  </head>
  
  <body>
	 <div align="center" class="Wrapper" style="width=970:">
		 <div class="Header">
			    <div class="HeaderTop">
				    <br/>
				    
				</div>
				<div id="Menu" class="Menu"  >
					<div id="fstMenu" class="fstMenu"></div>
					<div class="secMenu" style="width=1000">
						<span id="secMenu0" class="secMenu-center">
						     <a href="<%=path %>/qiantai/default.jsp">系统首页</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
						     <a href="<%=path %>/goods_tejia.action">特价体育用品</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
						     <A href="#" onClick="myCart()">我的购物车</A>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
						     <A href="#" onClick="myOrder()">我的订单</A>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
							 <a href="#" onClick="myXinxi()">我的信息</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
							 <a href="#" onClick="gonggaoAll()">系统公告</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
							 <a href="#" onClick="liuyanAll()">网站论坛</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
							 <a target="_blank" href="<%=path %>/login.jsp">进入后台</a>
						</span>
					</div>
				</div>	
		 </div>
     </div>	
  </body>
</html>
