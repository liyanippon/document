<%@ page language="java" pageEncoding="GBK"
	contentType="text/html; charset=GBK"%>
<%-- Sidebar bottom component --%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<td>
	<table>
		<TR>
			<td class="toolbarline">

				<p class="activeusers">
					<font size="3" color="336699">日记管理页面↓</font>
				</p>

				<html:link action="/fenye?method=select&id=dsf5413s130s32d1">心情日记预览页面</html:link>
				<br>
				&nbsp;
				<html:link action="/fenye?method=select&id=sdf456464s6df4wefs">→心情日记管理页面
					</html:link>
				<br>
				&nbsp;
				<a href="./tiles/titles-zhuanfa/addemd-title.jsp">→写心情日记
				</a>
				
				<br>
				<!-- 
				<html:link action="/votewenzhang?method=post">→心情日记报表统计</html:link>
				<br>
				 -->
				<html:link
					action="/olympicgamesfenye?method=olympicgamesselect&id=okdfe4s64f4n456e4f46">工作日志预览页面</html:link>
				<br>
				&nbsp;
				<html:link
					action="/olympicgamesfenye?method=olympicgamesselect&id=nfe487risl64g446drn">→工作日志管理页面
					</html:link>
				<br>
				&nbsp;
				<a
					href="./tiles/titles-zhuanfa/olympicgameaddemd.jsp">→写工作日志
				</a>
				<br>&nbsp;			
				<html:link action="/voteguojiwenzhang?method=post">→工作日志报表统计</html:link>

				<br>
				<html:link action="/ltgl?method=select">电话本分类管理</html:link>
				<br>
				&nbsp;
				<html:link action="/ltgl?method=insert">→号码类别添加</html:link>
				<br>
				&nbsp;
				<html:link action="/ltgl?method=lanmu">→号码管理</html:link>
				<br>
				&nbsp;
				<html:link action="/ltgl?method=luntantianjiavi">→电话号码添加</html:link>
				<!-- 
				<br>&nbsp;
				<html:link action="/article?method=luntanarticle">→论坛帖子管理</html:link>
				-->
				<br>
				<html:link action="/articleselect?method=userselect">日记搜索</html:link>
				<!-- 
				<br>
				<html:link action="/background?method=news">近期要闻</html:link>
				-->
				<br>
				<html:link action="/background?method=courses&sum=1">学习日记</html:link>
				<br>
				<html:link action="/background?method=affiche">最近心情</html:link>
				<!-- 
				<br>
				<html:link action="/background?method=link">相关链接</html:link>
				 -->
				
				<!-- <br>
				&nbsp;
				<html:link action="/article?method=luntanarticle">→论坛帖子发布</html:link>
 				-->
			</td>
		</tr>
	</table>
</td>
