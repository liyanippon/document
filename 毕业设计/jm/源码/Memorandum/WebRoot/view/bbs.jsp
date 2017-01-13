<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>bbs.jsp</title>
	<!--将以下代码加入HTML的<Body></Body>之间-->
	<script language=JavaScript>
var timerID = null;
var timerRunning = false;
function stopclock (){
if(timerRunning)
clearTimeout(timerID);
timerRunning = false;}
function startclock () {
stopclock();
showtime();}
function showtime () {
var now = new Date();
var hours = now.getHours();
var minutes = now.getMinutes();
var seconds = now.getSeconds()
var timeValue = "" +((hours >= 12) ? "下午 " : "上午 " )
timeValue += ((hours >12) ? hours -12 :hours)
timeValue += ((minutes < 10) ? ":0" : ":") + minutes
timeValue += ((seconds < 10) ? ":0" : ":") + seconds
document.clock.thetime.value = timeValue;
timerID = setTimeout("showtime()",1000);
timerRunning = true;}
</SCRIPT>
	<script language="javascript" type="text/javascript">
var mh = 35; //最小高度
var step = 1; //每次变化的px量
var ms = 10; //每隔多久循环一次
//折叠速度的设置方法
function toggle(o){
  if (!o.tid)o.tid = "_" + Math.random() * 10;
  if (!window.toggler)window.toggler = {};
  if (!window.toggler[o.tid]){
    window.toggler[o.tid]={
      obj:o,
      maxHeight:o.offsetHeight,
      minHeight:mh,
      timer:null,
      action:1
    };  }
  o.style.height = o.offsetHeight + "px";
  if (window.toggler[o.tid].timer)clearTimeout(window.toggler[o.tid].timer);
  window.toggler[o.tid].action *= -1;
  window.toggler[o.tid].timer = setTimeout("anim('"+o.tid+"')",ms );//注意计时器的用法
}
//通过对象的最小高度和最大高度，判断折叠是否停止
function anim(id){
  var t = window.toggler[id];
  var o = window.toggler[id].obj;
  if (t.action < 0){
    if (o.offsetHeight <= t.minHeight){
      clearTimeout(t.timer);
      return;
    }
  }
  else{
    if (o.offsetHeight >= t.maxHeight){
      clearTimeout(t.timer);
      return;
    }
  }
  o.style.height = (parseInt(o.style.height, 10) + t.action * step * 5) + "px";
  window.toggler[id].timer = setTimeout("anim('"+id+"')",ms );
}
</script>
	<style type="text/css">
div.xx {
	border: solid 1px;
	overflow: hidden;
}

div.xx h5 {
	border: solid 10px;
	border-width: 0 0 1px;
	padding: 0;
	margin: 0;
	height: 45px;
	line-height: 45px;
	width: 643px;
	background: #eee;
	text-align: left;
}
</style>
</head>

<body onload=startclock()>











	<img align="top" src="../view/images/bbs1.jpg" height="30" width="648">

	<TABLE border=0 id="mytable" align="center" style="WIDTH: 643px;"
		cellSpacing="1" cellPadding="1">
		<TBODY>

			<TR>
				<TD bgColor=#a9a9a9 height=45 width="480" align="right">
					<DIV align="left">
						<font color="1e90ff"> 当前时间&nbsp;:
							<form name=clock>
								<input name=thetime
									style="font-size: 9pt; color: #6495ed; border: 0px none;"
									size=12>
						
						</form>
						</font>
					</DIV>

				</TD>
				<!-- 
				<TD bgColor=#a9a9a9 width="200" align=center>
					<DIV align=center>
						版块

					</DIV>
				</TD>
				 -->
			</TR>




			<logic:notEmpty name="bbs">
				<logic:iterate id="b1" collection="${requestScope.bbs}">
					<TR>

						<TD bgColor=#ffffff height=100>
							<div class="xx">
								<h5 onclick="toggle(this.parentNode)">
									<img align="top" src="../view/images/forumlink.gif">
									<a href='../bbs.do?method=bbsedition&class_id=${b1.class_id}'>${b1.class_name}</a>
								</h5>
								<a href='../bbs.do?method=bbsedition&class_id=${b1.class_id}'>
									<font style="color: 9b00cc" size="2"> ${b1.class_intro}</font>
								</a>
							</div>
						</TD>

						<!-- 
						<TD bgColor=#eeeeee height=35 align="center">
							<font color="#ff1493">${b1.board_classID}:版块</font>
						</TD>
						 -->


					</TR>
				</logic:iterate>
			</logic:notEmpty>



		</TBODY>
	</TABLE>



</body>
</html:html>
