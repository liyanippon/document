<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />

	<title>backgroundcourses.jsp</title>
	<script language="javascript" type="text/javascript">
var mh = 20; //��С�߶�
var step = 1; //ÿ�α仯��px��
var ms = 5; //ÿ�����ѭ��һ��
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
	border: solid 0px;
	overflow: hidden;
}

div.xx h5 {
	border: solid 1px;
	border-width: 0 0 1px;
	padding: 0;
	margin: 0;
	height: 20px;
	line-height: 20px;
	width: 830px;
	background: #eee;
	text-align: left;
}
</style>

</head>

<body>

<div class="xx">
		<h5 onclick="toggle(this.parentNode)">
			дѧϰ�ռ�
		</h5>


	<html:form action="background.do?method=coursesinsert">
		<table border="0" width=830 bgcolor="#F9F9F9" cellspacing="0"
			cellpadding="0" bordercolor="lightgrey" rules="none"
			style="margin-top: 5" >

			<tr height="25">
				<td align="left" width="10%">
					�ռǱ��⣺&nbsp;&nbsp;&nbsp;
				</td>
				<td colspan="4">
					<html:text property="zhuti" value=""
							size="30"
							style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
				</td>
			</tr>
			
			
			<tr height="25">
				<td align="left" width="10%">
					���ߣ�&nbsp;&nbsp;&nbsp;
				</td>
				<td colspan="4">
				<html:hidden property="zuozhe" value="${sessionScope.login}" write="true"/>
					
				</td>
			</tr>
			
			
			<tr height="25">
				<td align="left" width="10%">
					���ݣ�&nbsp;&nbsp;&nbsp;
				</td>
				<td colspan="4">
					<html:textarea property="neirong"  cols="90" rows="20"
						style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600" />
				</td>
			</tr>
			
			<tr height="40">
				<td align="center">
					
				</td>
				<td colspan="4">

						<input name="Submit" type="submit" class="input" value="����ռ�">
						<input name="Reset" type="reset" class="input" value="������д">
				</td>
			</tr>
		</table>
		</html:form>
		</div>


	




	<TABLE border=1 cellSpacing=1 borderColor=#ffffff cellPadding=1
		width=830 bgColor=#6ebec7>
		<TBODY>


			<TABLE border=0 cellSpacing=0 borderColor=#ffffff cellPadding=0
				width=642 class="datalist">
				<logic:notEmpty name="list_cb">
					<logic:iterate id="cbsql" collection="${requestScope.list_cb}">
						<tr>
							<td width=500>
								${cbsql.zhuti}
							</td>
							<td width=142>
								<FONT color="#336699"><bean:write name="cbsql"
										property="shijian" format="yyyy-MM-dd hh:mm:ss" /> </FONT>
							</td>
							<td width=40>
								<a href="./background.do?method=academydelete&cid=${cbsql.cid}">ɾ��</a>
							</td>
						</tr>

					</logic:iterate>
				</logic:notEmpty>
			</table>

			<TABLE border=1 cellSpacing=1 borderColor=#ffffff cellPadding=1
				width=830 bgColor=#6ebec7>
				<logic:iterate id="ff" collection="${requestScope.list_f}">
					<tr>
						<td align="right">
							<font color="#ffffff">ÿҳ15��&nbsp;</font>
							<a href='./background.do?method=courses&sum=0&shang=${ff.shang}'>��һҳ</a>
							|
							<a href='./background.do?method=courses&sum=0&xia=${ff.xia}'>��һҳ</a>
						</td>
					</tr>
				</logic:iterate>
			</TABLE>


		</TBODY>
	</TABLE>





		
</body>
</html:html>
