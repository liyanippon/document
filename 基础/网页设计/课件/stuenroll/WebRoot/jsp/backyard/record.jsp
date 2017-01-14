<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>归档记录管理</title>
		<link href="../../css/backyard.css" rel="stylesheet" type="text/css" />
		<!-- 可搜索的下拉列表CSS -->
		<link href="../../js/chosen/chosen.css" rel="stylesheet" type="text/css" />
		<!-- 弹出对话框CSS -->
		<link href="../../css/popup.css" rel="stylesheet" type="text/css" />
		<script src="../../js/jquery-1.6.4.js"></script>
		<!-- 可搜索的下俩列表JS -->
		<script src="../../js/chosen/chosen.jquery.js"></script>
		<script src="../../js/backyard.js"></script>
		<script src="../../js/index.js"></script>
		
		<script type="text/javascript">
			function exportRecord(){
				var answer=confirm("Excel形式导出全部数据？");
				if(answer){
					//全部导出数据
					document.getElementById("y").value=0;
				}
				else{
					//导出某年数据
					var year=prompt("输入需要导出的年份");
					document.getElementById("y").value=year;
				}
				document.getElementById("form_4").submit();
			}
			$(document).ready(function() {			
				//设置下俩列表
				$(".chzn-select").chosen(); 
				$(".chzn-select-deselect").chosen({allow_single_deselect:true});
			});
		</script>
</head>

<body class="body">
<form id="form_4" method="post" action="" >
	<input name="y" id="y" value="" type="hidden">
</form>
	<div class="main_div">
		<jsp:include page="left_nav.jsp"></jsp:include>
		<div class="right_div">
			<form action="" name="searchForm" method="post" id="searchForm">
				<input type="hidden" name="order" value="" id="order">
				<input type="hidden" name="stype" id="stype"> 
				<input type="hidden" name="toPage" id="to">
				<fieldset class="set" onmouseover="inSearch()" onmouseout="outSearch()">
					<legend class="leg">检索条件</legend>
					<table width="100%" border="0" cellpadding="0" cellspacing="0"
						class="search_table">
						<tr>
							<td width="9%" height="39" align="center">学生姓名：</td>
							<td width="23%">
								<input name="name" type="text" class="input" id="textfield" value="" maxlength="4" title="点击回车键搜索记录"/>
							</td>
							<td width="10%" align="center">身份证号：</td>
							<td width="23%">
								<input name="pid" type="text" class="input" id="textfield3" value="" title="点击回车键搜索记录"/>
							</td>
							<td width="11%" align="center">申报专业：</td>
							<td width="24%">
								<select name="specialtySubmit" class="class_select chzn-select" tabindex="2" style="width:210px;">
									<option value="">- 选择 -</option>
									
								</select>
							</td>
						</tr>
						<tr>
							<td height="45" align="center">培训机构：</td>
							<td>
								<select name="eduSchool" class="class_select chzn-select" tabindex="2" style="width:210px;">
									<option value="">- 选择 -</option>
									
								</select>
							</td>
							<td align="center">班级编号：</td>
							<td>
								<select name="classNo" class="class_select chzn-select" tabindex="2" style="width:210px;">
									<option value="">- 选择 -</option>
									
								</select>
							</td>
							<td align="center">参与状态：</td>
							<td>
								<select name="joinState" class="class_select chzn-select" tabindex="2" style="width:210px;">
									<option value="">- 选择 -</option>
									
								</select>
							</td>
						</tr>
					</table>
				</fieldset>
			</form>
			<table width="1050" border="0" cellpadding="0" cellspacing="0"
				class="info_table">
				<tr>
					<td width="89" height="30" id="daxuhao" align="center" class="cell cell_title" onclick="orderDaXuHao()" style="cursor: pointer;background-color: #D9007E">
					</td>
					<td width="95" align="center" class="cell cell_title" style="background-color: #D9007E">参与状态</td>
					<td width="140" align="center" class="cell cell_title" style="background-color: #D9007E">培训机构</td>
					<td width="86" align="center" class="cell cell_title" style="background-color: #D9007E">班级编号</td>
					<td width="75" align="center" id='xiaoxuhao' class="cell cell_title" onclick="orderXiaoXuHao()" style="cursor: pointer;background-color: #D9007E">
					</td>
					<td width="105" align="center" class="cell cell_title" style="background-color: #D9007E">姓名</td>
					<td width="171" align="center" class="cell cell_title" style="background-color: #D9007E">身份证号</td>
					<td width="143" align="center" class="cell cell_title" style="background-color: #D9007E">电话</td>
					<td width="144" align="center" class="cell cell_title" style="background-color: #D9007E">申报专业</td>
				</tr>
				
					<tr class="row" id="" name='rw' onclick="" style="background-color:'#fcfcfc'">
						<td height="30" align="center" name="t" class="cell cell_num"></td>
						<td align="center" id='' class="cell" style="letter-spacing: 1px;"></td>
						<td align="center" class="cell" style="letter-spacing: 1px;"></td>
						<td class="cell cell_num" align="center"></td>
						<td class="cell cell_num" align="center"></td>
						<td class="cell" align="center" style="letter-spacing: 2px;"></td>
						<td align="center" class="cell cell_num"></td>
						<td class="cell cell_num" align="center"></td>
						<td class="cell" align="center"></td>
					</tr>
					<tr class="row" id="" name='rw' onclick="" style="background-color: '#E3FAE3'">
						<td height="30" align="center" name="t" class="cell cell_num"></td>
						<td align="center" id='' class="cell" style="letter-spacing: 1px;"></td>
						<td align="center" class="cell" style="letter-spacing: 1px;"></td>
						<td class="cell cell_num" align="center"></td>
						<td class="cell cell_num" align="center"></td>
						<td class="cell" align="center" style="letter-spacing: 2px;"></td>
						<td align="center" class="cell cell_num"></td>
						<td class="cell cell_num" align="center"></td>
						<td class="cell" align="center"></td>
					</tr>
				<!-- 
					<tr style="background-color: rgb(217, 249, 255)">
						<td colspan="9" align="center" height="590"
							style="font-size: 100px; letter-spacing: 5px;">无数据</td>
					</tr>
				 -->
			</table>

			<diV>

					<table width="100%" height="50" border="0" cellpadding="0"
						cellspacing="0">
						<tr>
							<td width="29%">
								<!-- 
								<input type="button" class="op_btn" id="bt1" value="全选" /> 
								 -->
								<input type="button" class="op_btn" id="bt4" style="background-color:#B0DEF8" value="单选" title="单选/多选切换"/>
								<input type="button" class="op_btn" id="bt2" value="删除" title="删除记录"/> 
								<input type="button" class="op_btn" id="bt6" value="修改" title='修改一条记录'/> 
								<!--
								<button class="op_btn" id="bt5" title="popup_name" value="#?w=400" style="background-color: #FFB5CA">批量</button> 
								  -->
								  <!-- 
								<input type="button" class="op_btn" id="bt10" onclick="exportRecord()" value="导出" title="导出记录"/> 
								 -->
							</td>
							<td width="55%">
								
									<input name="button5" type="submit" class="page_btn" id="button5" value="首页" onclick="toPageNow('1')"/>
								
								
									<input name="button11" type="submit" class="page_btn" onclick="toPageNow('${pageBean.currentPage-1}')" value="上一页" />
								
								
									<input name="button6" type="submit" class="page_btn" id="button6" value="${pageBean.currentPage-2}" onclick="toPageNow('${pageBean.currentPage-2}')" />
								 
								
									<input name="button6" type="submit" class="page_btn" id="button6" value="${pageBean.currentPage-1}" onclick="toPageNow('${pageBean.currentPage-1}')" />
								
								
								<input name="button8" type="submit" class="page_btn_now" id="button8" value="${pageBean.currentPage}" /> 
								
									<input name="button6" type="submit" class="page_btn" id="button6" value="${pageBean.currentPage+1}" onclick="toPageNow('${pageBean.currentPage+1}')"/>
								
								
									<input name="button6" type="submit" class="page_btn" id="button6" value="${pageBean.currentPage+2}"  onclick="toPageNow('${pageBean.currentPage+2}')"/>
								
								
									<input name="button12" type="submit" class="page_btn" onclick="toPageNow('${pageBean.currentPage+1}')" value="下一页" />
								
									<input name="button13" type="submit" class="page_btn" id="button13" onclick="toPageNow('${pageBean.totalPage}')" value="尾页" />

							</td>
							<td class="go">
								跳转
								<input id="toPage" type="text" class="page_in" value="" onmouseover="inToPageArea=true;" onmouseout="inToPageArea=false;" title='输入页码按回车'/>
								/<span id="totlePage">111</span>页
							</td>
						</tr>
					</table>
			</diV>

		</div>
	</div>
	<form name="option" id="option" method="post" action="">
		<input type="hidden" name="type" id="type_1"> 
		<input type="hidden" name="ids" id="ids">
	</form>
	 <div id="popup_name" class="popup_block">
		<p style="font-size: 28px;font-weight: bold;margin: 0px 0 10px 0">报名信息维护</p>
		<form method="post" id="form_3" action="">
  			<table border="0" cellpadding="0" cellspacing="0" style="font-size: 14px;letter-spacing: 2px;">
  			<tr>
  				<td height="50" width="85">申报专业：</td>
  				<td>
  					<select name="specialtySubmit" id='type' style="width:280px;height:32px;" onchange="">
						<option value="-1">- 选择 -</option>
						
					</select>
  				</td>
  			</tr>
  			<tr>
  				<td height="50" width="85">培训学校</td>
  				<td>
  					<select name="eduSchool" id="edu"  style="width:280px;height:32px;" onchange="">
						<option value="-1">- 选择 -</option>
					</select>
  				</td>
  			</tr>
  			<tr>
  				<td height="50" width="85">班级编号：</td>
  				<td>
  					<select name="classNo" id='class'  style="width:280px;height:32px;">
						<option value="">- 选择 -</option>
						
					</select>
  				</td>
  			</tr>
  			<tr>
  				<td height="50" width="85">参与状态：</td>
  				<td>
  					<select name="joinState" style="width:280px;height:32px;">
						<option value="">- 选择 -</option>
						
					</select>
  				</td>
  			</tr>
  			</table>
  			<input type="hidden" name="ids" id="ids_update">
  		</form>
  		<center>
	 	<input type="button" value="修改" onclick="" class="btn_1" style="margin: 10px 0 10px 0"/>
  		<input type="button" id="cancel" value="取消" class="btn_1"/>
  		</center>
	 </div>
</body>

</html>