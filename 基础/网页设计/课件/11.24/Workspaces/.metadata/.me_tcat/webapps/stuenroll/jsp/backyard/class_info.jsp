<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>班级状态管理</title>
<link href="../../css/backyard.css" rel="stylesheet" type="text/css" />
<!-- 可搜索的下拉列表CSS -->
<link href="../../js/chosen/chosen.css" rel="stylesheet" type="text/css" />
<!-- 弹出对话框CSS -->
<link href="../../css/popup.css" rel="stylesheet" type="text/css" />
<script src="../../js/jquery-1.6.4.js"></script>
<!-- 可搜索的下俩列表JS -->
<script src="../../js/chosen/chosen.jquery.js"></script>
<script src="../../js/nav.js"></script>
<script src="../../js/class_info.js"></script>
<style>
.class_div{
	overflow:auto;padding-left: 20px;
}
.class_table {
	margin: 20px;
	border: 1px solid #ccc;
	border-collapse: collapse;
}
.class_title{
	font-size:24px;
	font-weight:bold;
	font-family:"新宋体",'宋体';
}
.class_select {
	width: 180px;
	height: 30px;
	padding-left:10px;
	font-family: 'Arial';
	font-size: 13px;
	letter-spacing: 1px;
}
</style>
<script>
	$(document).ready(
		function() {			
			//设置下俩列表
			$(".chzn-select").chosen(); 
			$(".chzn-select-deselect").chosen({allow_single_deselect:true});
		});
</script>
</head>

<body class="body">
<div class="main_div">
  <jsp:include page="left_nav.jsp"></jsp:include>
  <div class="right_div class_div">
    <p class="class_title">班级信息管理</p>
    <hr />
    <form id="form_2" method="post" action="">
    	<table class='search_table' style="margin:20px;" onmouseover="inSearchArea=true;" onmouseout="inSearchArea=false;">
    		<tr>
    			<td width="70">班级名称：</td>
    			<td width="250">
    				
    				<select name='name' class="class_select chzn-select" tabindex="2">
    					<option value="">-选择-</option>
    					
    				</select>
    			</td>
    			<td width="70">学校名称：</td>
    			<td width="250">
    				
    				<select name='school' class="class_select chzn-select" tabindex="2">
    					<option value="">-选择-</option>
    					
    				</select>
    			</td>
    			<td width="70">专业方向：</td>
    			<td>
    				<select name='type' class="class_select chzn-select" tabindex="2">
    					<option value="">-选择-</option>
    					
    				</select>
    			</td>
    		</tr>
    	</table>
    </form>
    <hr />
    <form id="form_1" method="post" action="">
    <table width="950" border="0" cellpadding="0" cellspacing="0" class="class_table">
      <tr>
        <td width="60" height="35" align="center" class="cell_title">
        </td>
        <td width="8%" align="center" class="cell_title">序&nbsp;&nbsp;号</td>
        <td width="15%" align="center" class="cell_title">班级名称</td>
        <td width="15%" align="center" class="cell_title">专业方向</td>
        <td width="20%" align="center" class="cell_title">培训学校</td>
        <td width="10%" align="center" class="cell_title">状&nbsp;&nbsp;态</td>
        <td width="10%" align="center" class="cell_title">人&nbsp;&nbsp;数</td>
        <td width="250" align="center" class="cell_title">操&nbsp;&nbsp;作</td>
      </tr>
      
      	<tr style="background-color:'#fcfcfc'">
      		<td height="32" align="center" class="cell">
        		<input name="classId" id="" type="checkbox" value="" />
        	</td>
        	<td align="center" class="cell_num">1</td>
        	<td align="center" class="cell" name="className"></td>
        	<td align="center" class="cell" name="classType"></td>
        	<td align="center" class="cell" name="classSchool"></td>
        	<td align="center" class="cell" name="classSchool"></td>
        	<td align="center" class="cell" name="classSchool">
        	</td>
        	<td align="center" class="cell">
        		<img src="../../pic/delete.png" width="22" onclick=""/>
        	</td>
      	</tr>
      	<tr style="background-color:'#E3FAE3'">
      		<td height="32" align="center" class="cell">
        		<input name="classId" id="" type="checkbox" value="" />
        	</td>
        	<td align="center" class="cell_num">2</td>
        	<td align="center" class="cell" name="className"></td>
        	<td align="center" class="cell" name="classType"></td>
        	<td align="center" class="cell" name="classSchool"></td>
        	<td align="center" class="cell" name="classSchool"></td>
        	<td align="center" class="cell" name="classSchool">
        	</td>
        	<td align="center" class="cell">
        		<img src="../../pic/delete.png" width="22" onclick=""/>
        	</td>
      	</tr>
      	<!-- 
      	<tr style="background-color:rgb(217,249,255)">
			<td colspan="6" align="center" height="30" style="font-size: 15px;letter-spacing: 5px;">无数据</td>
		</tr>
      	 -->
    </table>
    <input type="hidden" name="state" id="st" value=""/>
    </form>
    <div class="class_div">
      	<input type="button" value="全选" class="op_btn" onclick=""/>
      	<input type="button" value="删除" class="op_btn" onclick=""/>
      	<button class="op_btn" id="btn_1" title="popup_name" value="#?w=420">添加</button>
     </div>
  </div>
  <!-- 添加班级对话框 -->
  <div id="popup_name" class="popup_block">
  	<p style="font-size: 28px;font-weight: bold;margin: 0px 0 10px 0">班级信息添加</p>
  	<form method="post" id="form_3" action="">
  	<table border="0" cellpadding="0" cellspacing="0" style="font-size: 14px;letter-spacing: 2px;">
  		<tr>
  			<td height="50" width="85">班级编号：</td>
  			<td><input name="name" id='className' class="input" style="width: 290px;"/></td>
  		</tr>
  		<tr>
  			<td height="50">培训机构：</td>
  			<td>
  				<select id="classSchool" class="class_select chzn-select" tabindex="2" style="width: 286px;" >
    				<option value="">-选择-</option>
    				
    			</select>
    			<input type="hidden" name="school" id='sh'/>
  			</td>
  		</tr>
  		<tr>
  			<td height="50">专业方向：</td>
  			<td id="sp">
  				<select name='type' id="classType" class="class_select chzn-select" tabindex="2" style="width: 286px;">
    					<option value="">-选择-</option>
    					
    			</select>
  			</td>
  		</tr>
  		<tr>
  			<td height="60"></td>
  			<td>
  				<input type="button" value="添加" onclick="" class="btn_1"/>
  				<input type="button" id="cancel" value="取消" class="btn_1"/>
  			</td>
  		</tr>
  	</table>
  	</form>
  </div>
</div>
<form action="" method="post" id="form_4">
	<input type="hidden" name="classNo" value="" id="classNo"/>
</form>
</body>
</html>