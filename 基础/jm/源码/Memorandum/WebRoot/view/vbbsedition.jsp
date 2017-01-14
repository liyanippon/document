<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>vbbsedition.jsp</title>

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
	width: 630px;
	background: #eee;
	text-align: left;
}
</style>
</head>

<body>





	<TABLE style="WIDTH: 650px;" cellSpacing="2" cellPadding="2">
		<TBODY>
			<TR>
				<TD bgColor=#ffcf60 height=20 class="listitem1">
					<DIV align=center>
						备忘录电话本
					</DIV>
				</TD>
			</TR>
			<TR>
				<TD bgColor=#666666>


					<TABLE border=0 cellSpacing=1 cellPadding=0 width=630 border="0"
						id="mytable" align="center">
						<TBODY>
							<TR>
							<!--  
								<TD bgColor=#ffffff height=45 width="480" align="right">
									<DIV align="left">
										版块
									</DIV>

								</TD>
							
								<TD bgColor=#ffffff width="200" align=center>
									<DIV align=center>
										管理

									</DIV>
								</TD>
								-->
								<!--  
								<TD bgColor=#ffffff width="200" align=center>
									<DIV align=center>
										贴数

									</DIV>
								</TD>
								-->
							</TR>



							<!-- -->

							<logic:notEmpty name="bbsList">
								<logic:iterate id="bbs1" collection="${requestScope.bbsList}">




									<TR>

										<TD bgColor=#ffffff height=80>
											<div class="xx">
												<h5 onclick="toggle(this.parentNode)">
													<img align="top" src="../view/images/forum_new.gif">
														${bbs1.board_name}
														<font style="color: 9b00cc"> : ${bbs1.board_pcard}</font>
												</h5>
											</div>
										</TD>

										<!-- 
										<TD bgColor=#ffffff height=35 align="center">

											${bbs1.board_master}

										</TD>
										
										<TD bgColor=#ffffff height=35 align="center">

											<font color="#ff1493">${bbs1.count}:贴</font>
										</TD>
										 -->


									</TR>
								</logic:iterate>
							</logic:notEmpty>



						</TBODY>
					</TABLE>
		</TBODY>
	</TABLE>






</body>
</html:html>
