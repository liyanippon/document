<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>系统管理</title>
<link href="../../css/backyard.css" rel="stylesheet" type="text/css" />
<!-- 可搜索的下拉列表CSS -->
<link href="../../js/chosen/chosen.css" rel="stylesheet" type="text/css" />
<script src="../../js/jquery-1.6.4.js"></script>
<!-- 可搜索的下俩列表JS -->
<script src="../../js/chosen/chosen.jquery.js"></script>
<script src="../../js/system.js"></script>
<script src="../../js/nav.js"></script>
<style>
.spe_div {
	overflow: auto;
	padding-left: 20px;
}

.spe_table {
	margin: 20px;
	border: 1px solid #ccc;
	border-collapse: collapse;
}

.spe_title {
	font-size: 24px;
	font-weight: bold;
	font-family: "新宋体", '宋体';
}
.class_select {
	width: 180px;
	height: 30px;
	padding-left:10px;
	font-family: 'Arial';
	font-size: 13px;
	letter-spacing: 1px;
}
.help_li{
	margin-bottom: 15px;
	line-height: 26px;
	letter-spacing: 1px;
}
</style>
</head>

<body class="body">
	<div class="main_div">
		<jsp:include page="left_nav.jsp"></jsp:include>
		<div class="right_div spe_div">
			<p class="spe_title">系统管理</p>
			<hr />
			<table width="700" border="0" cellpadding="0" cellspacing="0"
				class="spe_table">
				<tr>
					<td width="150" height="50" align="center" class="cell_title">对外开放报名</td>
					<td class="cell">
						<form id="form_1" method="post" action="">
							&nbsp;&nbsp; 
							<input type="radio" name="isOpenEnroll" value="true"/>是
							<input type="radio" name="isOpenEnroll" value="false" />否
							&nbsp;&nbsp;
							<input type="button" value="设置" id="btn_1" class="op_btn" onclick="" />
						</form>
					</td>
				</tr>
				<tr>
					<td width="150" align="center" class="cell_title">开放注册年届</td>
					<td class="cell">&nbsp;&nbsp;
						<form action="" method="post" id="form_2" style="position: relative;top:-5px;margin-bottom: 7px;">
						&nbsp;&nbsp; 
						<select name='yearEnroll' class="class_select chzn-select" tabindex="2">
							<option value="">-选择-</option>
    						<option value="2011" >2011届</option>
    						<option value="2012" >2012届</option>
						</select>
						&nbsp;&nbsp;
						<input type="button" value="设置" id="btn_1" class="op_btn" onclick="" />
						</form>
					</td>
				</tr>
				<tr>
					<td width="150"  height="50"  align="center" class="cell_title">删除预报名记录</td>
					<td class="cell">
						<form id="form_3" method="post" action="">
							&nbsp;&nbsp;当前有25条申报记录&nbsp;&nbsp;
							<input type="button" value="删除" id="btn_1" class="op_btn" onclick="" />
							<font color="red">请谨慎操作</font>
						</form>
					</td>
				</tr>
				<tr>
					<td width="150"  height="50"  align="center" class="cell_title">报名归档</td>
					<td class="cell">
						<form id="form_4" method="post" action="">
							&nbsp;&nbsp;当前状态：<font color='red'>已归档</font>&nbsp;&nbsp;
							<input type="button" value="归档" id="btn_1" class="op_btn" onclick="" />
						</form>
					</td>
				</tr>
				<tr>
					<td width="150"  height="50"  align="center" class="cell_title">导出花名册</td>
					<td class="cell" style="padding-top: 0px;">
						<form id="form_5" method="post" action="">
							&nbsp;
							<span>培训机构：</span>
							<select name="eduSchool" id="eduSchool" class="class_select chzn-select" tabindex="2" >
								<option value="">- 选择 -</option>
							</select>&nbsp;&nbsp;
							<span>年份：</span><input type="text"  name="y" id="year" value="0" maxlength="4" style="width: 40px;height: 25px;"/>
							&nbsp;
							<input type="button" value="导出" id="btn_2" class="op_btn" onclick="" />
						</form>
					</td>
				</tr>
				<tr>
					<td width="150"  height="50"  align="center" class="cell_title">本届数据统计</td>
					<td class="cell">
						<form id="form_4" method="post" action="">
							&nbsp;&nbsp;已报名：<font color='red'>1人</font>&nbsp;&nbsp;
							已归档：<font color='red'>23人</font>&nbsp;&nbsp;剩余名额：<font color='red'>6000人</font>
						</form>
					</td>
				</tr>
			</table>
			<hr/>
			<div style="font-size: 14px;color: red;width: 750px;">
			<p>注意事项：</p>
			<ul>
				<li class="help_li">
					“对外开放报名”用于是否开放报名功能，当选择“否”之后，学生和培训学校不允许任何形式的报名，报名网页将被禁用
					，但是已有报名的数据将会保留。
				</li>
				<li class="help_li">
					“开放注册年届”用于设置允许报名的年届。例如设置成2012年，那么将允许2012,2011,2010三个年度毕业的学生参加报名。
					添加年度可以在“年届管理”栏目中完成。
				</li>
				<li class="help_li">
					<b>“删除预报名”用于删除所有的报名信息，归档信息将不受影响，请谨慎操作。</b>
				</li>
				<li class="help_li">
					“报名归档”用于将所有审核通过（已经分班）的学生记录归档保存，同时所有预报名信息将被删除。
				</li>
				<li class="help_li">
					“报名归档”功能请在所有审核信息均完成的情况下再点击。
				</li>
				<li class="help_li">
					<b>点击“报名归档”按钮后，系统将会自动将每个班级的学生自动分配小序号。</b>
				</li>
			</ul>
		
			</div>
		</div>
	</div>
</body>
</html>