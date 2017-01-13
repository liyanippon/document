<%@ page language="java" pageEncoding="gbk"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>bbsid.jsp</title>

	<!--�����´������HTML��<Body></Body>֮��-->
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
var timeValue = "" +((hours >= 12) ? "���� " : "���� " )
timeValue += ((hours >12) ? hours -12 :hours)
timeValue += ((minutes < 10) ? ":0" : ":") + minutes
timeValue += ((seconds < 10) ? ":0" : ":") + seconds
document.clock.thetime.value = timeValue;
timerID = setTimeout("showtime()",1000);
timerRunning = true;}
</SCRIPT>
	<script language="javascript" type="text/javascript">
var mh = 35; //��С�߶�
var step = 1; //ÿ�α仯��px��
var ms = 10; //ÿ�����ѭ��һ��
//�۵��ٶȵ����÷���
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
  window.toggler[o.tid].timer = setTimeout("anim('"+o.tid+"')",ms );//ע���ʱ�����÷�
}
//ͨ���������С�߶Ⱥ����߶ȣ��ж��۵��Ƿ�ֹͣ
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
	height: 35px;
	line-height: 35px;
	width: 640px;
	background: #eee;
	text-align: left;
}
</style>
</head>

<body>
	<logic:notEmpty name="bbsListbid">
		<logic:iterate id="bbsid" collection="${requestScope.bbsListbid}">
			<TABLE style="WIDTH: 643px;" cellSpacing="0" cellPadding="0"
				height="200">
				<TBODY>
					<TR>
						<TD align="left" width="100" bgColor="#f0f8ff">
							�û�:${bbsid.bbs_user}|
						</TD>
						<TD align="center" width="543" bgColor="#f0f8ff" height="50">
							����:${bbsid.bbs_title}
							<bean:write name="bbsid" property="bbs_time"
								format="yyyy-MM-dd hh:mm:ss" />
							<hr color="#faf0e6">
						</TD>
					</TR>
					<TR>
						<TD bgColor="#f0f8ff">
							�ظ�:${bbsid.bbs_number}
						</TD>
						<TD rowSpan=2 valign="top" bgColor="#f0f8ff">

							${bbsid.bbs_content}
						</TD>
					</TR>
					<TR>
						<TD bgColor="#f0ffff">

						</TD>
					</TR>
				</TBODY>
			</TABLE>

		</logic:iterate>
	</logic:notEmpty>














	<logic:notEmpty name="list_hui">
		<logic:iterate id="bbshui" collection="${requestScope.list_hui}">
			${bbshui.user}<br>
			${bbshui.neirong}<br>
			${bbshui.shijian}<br>
			<hr>
		</logic:iterate>
	</logic:notEmpty>














	<div class="xx">
		<h5 onclick="toggle(this.parentNode)">
			�ظ�
		</h5>





		<html:form action="bbs.do?method=bbseditionbbsidhuifu">


			<table border="1" width=640 bgcolor="#F9F9F9" cellspacing="0"
				cellpadding="0" bordercolor="lightgrey" rules="none"
				style="margin-top: 5">

				<tr height="45">




					<%
				if (session.getAttribute("login") == null
				|| session.getAttribute("login").equals("")) {
	%>
					<p class="inputframe">
						��½����ܻظ�����!!!
						<a href='../bbs.do?method=login'>��½</a>
					</p>
					<%

		} else {
	%>

					<td align="right" width="35%">
						�û���&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="4">
						${sessionScope.login}


						<html:hidden property="bbs_id" value="${bbsid.bbs_id}" />
					</td>
				</tr>
				<%
	}
	%>
				<tr>
					<td></td>
					<td colspan="4"></td>
				</tr>
				<tr height="45">
					<td align="right">
						�ظ���&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="4">

						<html:textarea property="huifu" cols="50" rows="15"
							style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />


					</td>
				</tr>

				<tr>
					<td></td>
					<td colspan="4"></td>
				</tr>

				<tr>
					<td></td>
					<td colspan="4"></td>
				</tr>
				<tr height="80">
					<td align="center">

					</td>
					<td colspan="4">

						<input name="Submit" type="submit" class="input" value="�ظ�">
					</td>
				</tr>
			</table>



		</html:form>




















	</div>

</body>
</html:html>
