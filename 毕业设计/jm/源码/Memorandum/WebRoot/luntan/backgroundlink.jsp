<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>backgroundlink.jsp</title>

	<script language="javascript" type="text/javascript">
var mh = 20; //最小高度
var step = 1; //每次变化的px量
var ms = 5; //每隔多久循环一次
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
	border: solid 1px;
	border-width: 0 0 1px;
	padding: 0;
	margin: 0;
	height: 20px;
	line-height: 20px;
	width: 640px;
	background: #eee;
	text-align: left;
}
</style>

</head>

<body>

	<logic:notEmpty name="list_lb">
		<logic:iterate id="lb" collection="${requestScope.list_lb}">

			<div class="xx">
				<h5 onclick="toggle(this.parentNode)">
					${lb.wzmingcheng}
				</h5>
				${lb.dizhi}|
				<a href='./background.do?method=linkdele&lid=${lb.lid}'>删除</a>
			</div>

		</logic:iterate>
	</logic:notEmpty>


	<div class="xx">
		<h5 onclick="toggle(this.parentNode)">
			添加链接
		</h5>
		<html:form action="background.do?method=linkselectsql">


			<table border="1" width=640 bgcolor="#F9F9F9" cellspacing="0" cellpadding="0" bordercolor="lightgrey" rules="none" style="margin-top: 5">

				<tr height="45">
					<td align="right" width="35%">
						网站名称：&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="4">
						<html:text property="wzmingcheng" value=""
							size="30"
							style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
					</td>
				</tr>
				<tr>
					<td></td>
					<td colspan="4"></td>
				</tr>
				<tr height="45">
					<td align="right">
						网站地址：&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="4">

						<html:text property="dizhi" value="http://"
							size="30"
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

						<input name="Submit" type="submit" class="input" value="添加链接">
						<input name="Reset" type="reset" class="input" value="重新填写">
					</td>
				</tr>
			</table>

		</html:form>
	</div>











</body>
</html:html>
