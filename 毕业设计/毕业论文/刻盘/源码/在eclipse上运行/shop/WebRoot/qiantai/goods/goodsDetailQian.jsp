<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title></title>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	<link href="css/Common.css" rel="stylesheet" type="text/css" />
    <link href="css/sitegeneric08.css" rel="stylesheet" type="text/css" />
    <script language="javascript">
        function buy1()
        {
            <s:if test="#session.user==null">
                  alert("请先登录");
            </s:if>
            <s:else>
                 document.buy.submit();
            </s:else>
        }
    </script>
  </head>
  
  <body>
<!-- head如果图片高度不合适。请修改Common.ces里面的".Header .HeaderTop"的高度。和".Header"的高度-->
<jsp:include flush="true" page="/qiantai/inc/incTop.jsp"></jsp:include>    
<!-- head-->
	
	
	
	
<!--body-->
<div align="center" class="Wrapper">
<div id="MainCenter" align="center" class="MainCenter">
	     <div id="navigation" class="naivgation">
				<jsp:include flush="true" page="/qiantai/inc/incLeft.jsp"></jsp:include>
		 </div>
		 <div id="content" class="Sub">
				<div class="NewContainer771">
					<div class="BoxHeader">
						<div class="BoxHeader-center MarginTop10">体育用品详细信息</div>
					</div>
					<div class="Slot">
						<form action="<%=path %>/addToCart.action" method="post" name="buy">
						<table width="100%" border="0">
						    <tr>
						       <td align="center"><img style="border:1px solid #ccc; padding:3px;" src="<%=path %>/<s:property value="#request.goods.goodsPic"/>" width="140" height="120"/><hr/></td>
						    </tr>
						    <tr>
						       <td align="center">体育用品名称：<s:property value="#request.goods.goodsName"/><hr/></td>
						    </tr>
						    <tr>
						       <td align="center">体育用品介绍:<s:property value="#request.goods.goodsMiaoshu" escape="false"/><hr/></td>
						    </tr>
						    <tr>
						       <td align="center">购买价格:<s:property value="#request.goods.goodsTejia"/><hr/></td>
						    </tr>
						    <tr>
						       <td align="center">预订数量：<input type="text" name="quantity" value="1" size="8" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"/><hr/></td>
						    </tr>
						    <tr>
						       <td align="center"><input type="hidden" name="goodsId" value="<s:property value="#request.goods.goodsId"/>"/><img onclick="buy1()" src="<%=path %>/img/goumai.jpg"/><hr/></td>
						    </tr>
						</table>
						</form>
                    </div>
				</div>
		 </div>
</div>
</div>
<!--body-->
	
	
	
<!--foot -->	
<div align="center" class="Wrapper">
	<div id="footer" align="center" class="Footer">
		 <jsp:include flush="true" page="/qiantai/inc/incFoot.jsp"></jsp:include>
	</div>
</div>
<!--foot -->	
</body>
</html>
