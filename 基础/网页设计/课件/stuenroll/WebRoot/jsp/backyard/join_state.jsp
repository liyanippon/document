<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>参与状态管理</title>
<link href="../../css/backyard.css" rel="stylesheet" type="text/css" />
<script src="../../js/jquery-1.6.4.js"></script>
<script src="../../js/backyard.js"></script>
<script src="../../js/nav.js"></script>
<style>
.spe_div{
	overflow:auto;padding-left: 20px;
}
.spe_table {
	margin: 20px;
	border: 1px solid #ccc;
	border-collapse: collapse;
}
.spe_title{
	font-size:24px;
	font-weight:bold;
	font-family:"新宋体",'宋体';
}

</style>
</head>

<body class="body">
<div class="main_div">
  <jsp:include page="left_nav.jsp"></jsp:include>
  <div class="right_div spe_div">
    <p class="spe_title">参与状态管理</p>
    <hr />
    <form id="form_1" method="post" action="/stuenroll/jsp/backyard/JoinStateAction!delete.action">
    <table width="700" border="0" cellpadding="0" cellspacing="0" class="spe_table">
      <tr>
        <td width="41" height="35" align="center" class="cell_title">
        </td>
        <td width="111" align="center" class="cell_title">序&nbsp;&nbsp;号</td>
        <td width="289" align="center" class="cell_title">状&nbsp;&nbsp;态</td>
        <td width="157" align="center" class="cell_title">操&nbsp;&nbsp;作</td>
      </tr>
     
      <tr style="background-color: '#fcfcfc'">
      	<td height="32" align="center" class="cell">
        	<input name="joinStateId" id="" type="checkbox" value="" />
        </td>
        <td align="center" class="cell_num">1</td>
        <td align="center" class="cell" name="stateName">sd</td>
        <td align="center" class="cell"><img src="../../pic/delete.png" width="22" onclick=""/></td>
      </tr>
      <tr style="background-color:'#E3FAE3'">
      	<td height="32" align="center" class="cell">
        	<input name="joinStateId" id="" type="checkbox" value="" />
        </td>
        <td align="center" class="cell_num">2</td>
        <td align="center" class="cell" name="stateName">sd</td>
        <td align="center" class="cell"><img src="../../pic/delete.png" width="22" onclick=""/></td>
      </tr>
      <!-- 
      	<tr style="background-color:rgb(217,249,255)">
			<td colspan="4" align="center" height="30" style="font-size: 15px;letter-spacing: 5px;">无数据</td>
		</tr>
      -->
    </table>
    <input type="hidden" name="state" id="st" value=""/>
    </form>
    <div class="spe_div">
      	<input type="button" value="全选" id="btn_1" class="op_btn" onclick=""/>
      	<input type="button" value="删除" class="op_btn" onclick=""/>
      	<input type="button" value="添加" class="op_btn" onclick=""/>
     </div>
  </div>
</div>
</body>
</html>