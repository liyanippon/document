<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>备忘录首页</title>
	<link href="../view/main.css" rel="stylesheet" type="text/css">
	<SCRIPT src="../view/sorttable.js" type="text/javascript"></SCRIPT>




	<style>
body,td,th {
	font-family: Tahoma, Verdana, Arial, sans-serif;
	font-size: 12px;
	color: #333333;
}

body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

a {
	color: #333333;
	text-decoration: none;
}

a:hover {
	color: #FF0000;
	text-decoration: none;
}

a:active {
	color: #FF0000;
	text-decoration: none;
}

#menu {
	height: 3px;
	margin-top: 8px;
	background-color: #CCFF66;
}

#menu ul {
	margin: auto;
	width: 778px;
	height: 3px;
	list-style-type: none;
	padding: 0px;
	margin-top: 0px;
	margin-bottom: 0px;
}

.m_li {
	float: left;
	width: 114px;
	line-height: 30px;
	text-align: center;
	margin-right: -2px;
	margin-left: -2px;
}

.m_li a {
	display: block;
	color: #FFFFFF;
	width: 114px;
}

.m_line {
	float: left;
	width: 1px;
	height: 3px;
	line-height: 3px; /*ff下有效(图片垂直居中)*/
}

.m_line img {
	margin-top: expression((             3 -             this .           height)/
		2 );
	/*ie下有效(图片垂直居中)*/
}

.m_li_a {
	float: left;
	width: 114px;
	line-height: 32px;
	text-align: center;
	padding-top: 3px;
	font-weight: bold;
	background: transparent url(../view/images/menu_bg2.jpg);
	position: relative;
	height: 3px;
	margin-top: -3px;
	margin-right: -2px;
	margin-left: -2px;
}

.m_li_a a {
	display: block;
	color: #FF0000;
	width: 114px;
}

.smenu {
	width: 774px;
	margin: 0px auto 0px auto;
	padding: 0px;
	list-style-type: none;
	height: 3px;
}

.s_li {
	line-height: 3px;
	width: auto;
	display: none;
	height: 3px;
}

.s_li_a {
	line-height: 3px;
	width: auto;
	display: block;
	height: 3px;
}
</style>
	<script>
//初始化
var def="1";
function mover(object){
  //主菜单
  var mm=document.getElementById("m_"+object);
  mm.className="m_li_a";
  //初始主菜单隐藏效果
  if(def!=0){
    var mdef=document.getElementById("m_"+def);
    mdef.className="m_li";
  }
  //子菜单
  var ss=document.getElementById("s_"+object);
  ss.style.display="block";
  //初始子菜单隐藏效果
  if(def!=0){
    var sdef=document.getElementById("s_"+def);
    sdef.style.display="none";
  }
}

function mout(object){
  //主菜单
  var mm=document.getElementById("m_"+object);
  mm.className="m_li";
  //初始主菜单
  if(def!=0){
    var mdef=document.getElementById("m_"+def);
    mdef.className="m_li_a";
  }
  //子菜单
  var ss=document.getElementById("s_"+object);
  ss.style.display="none";
  //初始子菜单
  if(def!=0){
    var sdef=document.getElementById("s_"+def);
    sdef.style.display="block";
  }
}
</script>
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



</head>

<!-- 数据载入 -->
	<body >

	<TABLE cellSpacing=0 cellPadding=0 width="750" height="100%"
		align="center" border="0" >
		<TBODY>
			<TR>
				<TD colSpan=2 height="100">

					<img src="../view/images/top1.jpg" align="top" width="870" height="282">

					<div id="menu">
						<ul>
						
							<li id="m_1" class='m_li_a'>
								<a href="../vindex.do?method=vhtml">备忘录首页</a>
							</li>
							<li class="m_line">
								|
							</li>
							<li id="m_2" class='m_li' onmouseover='mover(2);'
								onmouseout='mout(2);'>
								<a href="../vindex.do?method=news&sum=1">心情日志</a>
							</li>



							<li class="m_line">
								|
							</li>
							<li id="m_3" class='m_li' onmouseover='mover(3);'
								onmouseout='mout(3);'>
								<a href="../vindex.do?method=placard&sum=1">工作日志</a>
							</li>
							<li class="m_line">
								|
							</li>
							<li id="m_4" class='m_li' onmouseover='mover(4);'
								onmouseout='mout(4);'>
								<a href="../vindex.do?method=academy&sum=1">学习日志</a>
							</li>
							<li class="m_line">
								|
							</li>
							<li id="m_5" class='m_li' onmouseover='mover(5);'
								onmouseout='mout(5);'>
								<a href="../bbs.do?method=bbs">电 话 本</a>
							</li>
							<li class="m_line">
								|
							</li>
							 
							<li id="m_6" class='m_li' onmouseover='mover(6);'
								onmouseout='mout(6);'>
								<a href="../views/zhuce.jsp">更改口令</a>
							</li>
						</ul>
					</div>
					<div style="height: 32px; background-color: #F1F1F1;">
						<ul class="smenu">
							<li style="padding-left: 29px;" id="s_1" class='s_li_a'></li>
							<li style="padding-left: 141px;" id="s_2" class='s_li'
								onmouseover='mover(2);' onmouseout='mout(2);'></li>
							<li style="padding-left: 252px;" id="s_3" class='s_li'
								onmouseover='mover(3);' onmouseout='mout(3);'></li>
							<li style="padding-left: 362px;" id="s_4" class='s_li'
								onmouseover='mover(4);' onmouseout='mout(4);'></li>
							<li style="padding-left: 474px;" id="s_5" class='s_li'
								onmouseover='mover(5);' onmouseout='mout(5);'></li>
							<li style="padding-left: 447px;" id="s_6" class='s_li'
								onmouseover='mover(6);' onmouseout='mout(6);'></li>
							<li style="padding-left: 696px;" id="s_7" class='s_li'
								onmouseover='mover(7);' onmouseout='mout(7);'></li>
						</ul>
					</div>



				</TD>
			</TR>
			<TR>
				<TD width="250" height="500" valign="top">
					<!-- 侧栏 -->
						<tiles:insert attribute="bottom"/>
				</TD>
				<TD width="500" height="500" valign="top">
				<!-- 中间数据 -->
				<tiles:insert attribute="content" />




				</TD>
			</TR>
			<TR>

				<TD colSpan=2>
					<TABLE border=0 cellSpacing=0 cellPadding=0 width=870 align=center>
						<TBODY>
							<TR>
								<TD>
									<IMG src="../view/images/bg_11(11).jpg" width=870 height=60>
								</TD>
							</TR>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
		</TBODY>
	</TABLE>



</body>
</html:html>
