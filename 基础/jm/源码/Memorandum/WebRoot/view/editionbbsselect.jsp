<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>editionbbsselect.jsp</title>
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
	height: 35px;
	line-height: 35px;
	width: 480px;
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
						栏目图片
					</DIV>
				</TD>
			</TR>
			<TR>
				<TD bgColor=#666666>


					<TABLE border=0 cellSpacing=1 cellPadding=0 width=630 border="0"
						id="mytable" align="center">
						<TBODY>
							<TR>
								<TD bgColor=#ffffff height=45 width="380" align="right">
									<DIV align="left">
										标题
									</DIV>

								</TD>
								<TD bgColor=#ffffff width="200" align=center>
									<DIV align=center>
										作者

									</DIV>
								</TD>
								<TD bgColor=#ffffff width="150" align=center>
									<DIV align=center>
										回复

									</DIV>
								</TD>
								<TD bgColor=#ffffff width="200" align=center>
									<DIV align=center>
										发布时间

									</DIV>
								</TD>
							</TR>



							<!-- -->

							<logic:notEmpty name="bbsListselect">
								<logic:iterate id="bbs2"
									collection="${requestScope.bbsListselect}">

									<TR>

										<TD bgColor=#ffffff height=35>
											<div class="xx">
												<h5 onclick="toggle(this.parentNode)">
													<img align="top" src="../view/images/folder_hot.gif">
													<a
														href='../bbs.do?method=bbseditionbbsid&bbs_id=${bbs2.bbs_id}'>
														${bbs2.bbs_title}</a>
												</h5>

												<font style="color: 9b00cc"></font>

											</div>
										</TD>

										<TD bgColor=#ffffff height=35 align="center">

											${bbs2.bbs_user}

										</TD>
										<TD bgColor=#ffffff height=35 align="center">

											<font color="#ff1493">${bbs2.bbs_number}</font>
										</TD>

										<TD bgColor=#ffffff height=35 align="center">
											<bean:write name="bbs2" property="bbs_time"
												format="yyyy-MM-dd hh:mm:ss" />

										</TD>




									</TR>
								</logic:iterate>
							</logic:notEmpty>



						</TBODY>
					</TABLE>
		</TBODY>
	</TABLE>
	
	










</body>
</html:html>
