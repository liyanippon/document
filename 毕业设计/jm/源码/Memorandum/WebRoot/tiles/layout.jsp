<%@ page language="java" pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<SCRIPT LANGUAGE="JavaScript">
//容错代码
          <!--

          function stopError() {
            return true;
          }

          window.onerror = stopError;

          // -->
          

</SCRIPT>
<script type="text/javascript">

//禁止选择

//form tags to omit in NS6+:
var omitformtags=["input", "textarea", "select"]

omitformtags=omitformtags.join("|")

function disableselect(e){
if (omitformtags.indexOf(e.target.tagName.toLowerCase())==-1)
return false
}

function reEnable(){
return true
}

if (typeof document.onselectstart!="undefined")
document.onselectstart=new Function ("return false")
else{
document.onmousedown=disableselect
document.onmouseup=reEnable
}

</script>
<script>
        function loadBar(fl)
//fl is show/hide flag
{
  var x,y;
  if (self.innerHeight)
  {// all except Explorer
    x = self.innerWidth;
    y = self.innerHeight;
  }
  else 
  if (document.documentElement && document.documentElement.clientHeight)
  {// Explorer 6 Strict Mode
   x = document.documentElement.clientWidth;
   y = document.documentElement.clientHeight;
  }
  else
  if (document.body)
  {// other Explorers
   x = document.body.clientWidth;
   y = document.body.clientHeight;
  }

    var el=document.getElementById('loader');
        if(null!=el)
        {
                var top = (y/2) - 50;
                var left = (x/2) - 150;
                if( left<=0 ) left = 10;
                el.style.position="absolute";
                el.style.visibility = (fl==1)?'visible':'hidden';
                el.style.display = (fl==1)?'block':'none';
                el.style.left = left + "px"
                el.style.top = top + "px";
                el.style.zIndex = 88;
        }
}
</script>
<html>
	<head>
		<base href="<%=basePath%>">
		<title>个人备忘录管理系统</title>
		<link href="./tiles/main.css" rel="stylesheet"
			type="text/css">
		<SCRIPT src="./web/sorttable.js" type="text/javascript"></SCRIPT>
	</head>
	<!-- 数据载入 -->
	<body onload="loadBar(0)" >
		<div id="loader">
			<table style="FILTER: Alpha(opacity=90);" 
				summary="Loader Layout" border="0" cellpadding="5" cellspacing="1"
				bgcolor="#bbbbb" align="center">
				<tr>
					<td bgcolor="#FFFFFF" align="left">
						<p>
							<img src="tiles/0612160917132358.gif" align="left" style="margin:3px"
								alt="请等待" width="94" height="17" />
							<strong>数据载入中...</strong>
							<br />
							<span style="font-size:8pt;">Struts+Hibernate+Spring技术摇篮大杂烩<br>
							Please wait until this screen is completely loaded.</span>
						</p>
					</td>
				</tr>
			</table>
		</div>
		<script type="text/javascript" language="javascript">
    loadBar(1);
</script>

		<%-- One table lays out all of the content --%>
		<table width="100%" height="100%" align="center">
			<%-- Sidebar section --%>
			<tr>
				<td width="150" valign="top" align="left" class="row2">
					<tiles:insert attribute="sidebar" />
				</td>
				<%-- Main content section --%>
				<td valign="top" height="100%" width="*">
					<table width="100%" height="100%">
						<tr >
							<%-- Header section --%>
							<td height="5%"
								style="filter:shadow(color=#336699,direction=130)">
								<tiles:insert attribute="header" />
							</td>
						<tr>
						<tr>
							<%-- Content section --%>
							<td valign="top" height="650%" class="listcellrow">
								<tiles:insert attribute="content" />

							</td>
						</tr>
						<tr>
							<%-- Footer section --%>
							<td valign="bottom" height="5%" class="left">
								<tiles:insert attribute="footer" />
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
