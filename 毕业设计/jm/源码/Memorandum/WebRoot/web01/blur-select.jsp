<%@ page language="java" contentType="text/html; charset=GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html>
	<head>
		<title>查询</title>

	</head>

	<body>
		<html:form action="/articleselect?method=articleselectusers" method="post" onsubmit="return userlogin(articleselectForm)">
			<fieldset>
				<legend>
					日记搜索
				</legend>
				<TABLE style="WIDTH: 410px;" cellSpacing="0" cellPadding="0"
					border="0" align="left" >
					<TBODY>
					<font size="2" color="red">*请选择搜索日记类型或输入日记标题关键字：</font>
						<TR>
							<TD class="listitem33">
								<p>
									<html:radio property="olympicgameinternational" title="政策文件" value="1" >工作日记</html:radio>
									<html:radio property="olympicgameinternational" title="新闻公告" value="2" >心情日记</html:radio>
								</p>
							</TD>

						<TR>
							<TD colSpan="2" align="center"><br>
								<p>
									<html:text property="zhuti" size="115" maxlength="115"
										style="border:1px solid #666666; font-size:9pt; height:17px; 
												BACKGROUND-COLOR: #F4F4FF; color:#ff6600"
										title="查询内容" styleClass="tooltip" />
								</p>
							</TD>
							<TD align="right">
								<p><br><br>
									&nbsp;&nbsp;&nbsp;<input name="Submit" type="submit" class="input" value="搜 索"><br><br>
								</p>
							</TD>
						</TR>
							<!--  
							<TD class="listitem33" align="right">
								用户
							</TD>
							
							<TD class="listitem33" align="right">
								<P>
									<html:select property="userlist"
										style="border-style: solid; border-width: 0;BACKGROUND-COLOR: #F4F4FF; color:#ff6600">
										<logic:iterate id="users"
											collection="${requestScope.userselects}">
											<html:option value="${users.userName}">${users.userName}</html:option>
										</logic:iterate>
									</html:select>
								</P>
							</TD>
							 -->
						
					</TBODY>
				</TABLE>
			</fieldset>
		</html:form>
		<logic:notEmpty name="articleList">
			<TABLE style="WIDTH: 832px;" cellSpacing="2" cellPadding="2"
				border="0" id="mytable" class="sortable" align="left">

				<TR class="listrow1">
				<!-- 
					<TD width="11%">
						排序
					</TD>
				 -->	
					<TD width="37%">
						日记标题
					</TD>
					<TD width="15%">
						作者
					</TD>
					<TD width="15%">
						浏览次数
					</TD>
					<TD width="22%">
						发布时间
					</TD>
				</TR>
				<ol>
					<logic:iterate id="al" collection="${requestScope.articleList}">

						<TR class="listtitleborder">
						<!-- 
							<TD class="listline001">
								<br>
							</TD>
						 -->	
							<TD class="listline001">
								<a
									href='${requestScope.dom}.do?fenye_Id=${al.fenye_Id }&fwjilu=${al.fwjilu }'>${al.zhuti
									} </a>
							</TD>
							<TD class="listline001">
								${al.zuozhe }
								<br>
							</TD>
							<TD class="listline001">
								${al.fwjilu }
								<br>
							</TD>
							<TD class="listline001">
								<bean:write name="al" property="shijian" format="yyyy-MM-dd hh:mm:ss" />
							</TD>

						</TR>
					</logic:iterate>
			</TABLE>
		</logic:notEmpty>
	</body>
</html>
