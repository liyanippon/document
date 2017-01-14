<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
  <head>
    <html:base />
    
    <title>viewsnewsselect.jsp</title>

  </head>
  
  <body>  
  
   	<logic:notEmpty name="list_FenyeSelect">
		<logic:iterate id="list_Game" collection="${requestScope.list_FenyeSelect}">
		 
			<TABLE width=642 height="450" cellSpacing="0" cellPadding="0"
				border="0" class="inputframemain" >
				 <IMG src="../view/images/xin.jpg" valign="top">
				<TR class="listtitleborder">
					<TD height="5%" colSpan=2 align="right">
						<input type="button" value="返回上一页"
							style="border: 1px; solid: #666666; height: 20px; width: 100px; font-size: 10pt; background-color: #8CAAE7; color: #666666"
							onClick="javascript: history.go(-1)" title="返回上一页">

					</TD>
				</TR>
				<TR>
					<TD align="center" height="3%">
						<font  size="5"><br>
							${list_Game.zhuti}</font>
					</TD>
					<TD align="right" width="8%">


					</TD>
				</TR>
				<TR>
					<TD colSpan="2" height="*" valign="top">
						${list_Game.neigong}


					</TD>
				</TR>

				<TR>
					<TD height="5%" colSpan=2 align="right">
						作者:${list_Game.zuozhe}&nbsp;&nbsp;发表时间:<bean:write name="list_Game" property="shijian" format="yyyy-MM-dd hh:mm:ss" />

					</TD>
				</TR>
			</TABLE>
		</logic:iterate>
	</logic:notEmpty>
   
   
   
   
   
   
   
   
  </body>
</html:html>
