<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Pragma" content="no-cache"></meta>  
<meta http-equiv="Cache-Control" content="no-cache"></meta>  
<meta http-equiv="Expires" content="0"></meta> 
<title>培训学校专业方向</title>
<link href="../../css/backyard.css" rel="stylesheet" type="text/css" />
<script src="../../js/jquery-1.6.4.js"></script>
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
<script>
	var isAll=false;
	function checkAll(){
		isAll=!isAll;
		var spec=document.getElementsByName("spec");
		for(i=0;i<spec.length;i++){
			spec[i].checked=isAll;
		}
	}
	function submitForm(){
		var spec=document.getElementsByName("spec");
		var isNull=false;
		for(i=0;i<spec.length;i++){
			//alert(spec[i].checked);
			if(spec[i].checked==true){
				isNull=true;
				break;
			}
		}
		if(isNull==false){
		//	alert(1);
			document.getElementById("del").value=true;
		}
		else{
		//	alert(2);
			document.getElementById("del").value=false;
		}
		document.getElementById("form_1").submit();
	}
</script>
</head>

<body class="body">
<div class="main_div">
  <jsp:include page="left_nav.jsp"></jsp:include>
  <div class="right_div spe_div">
    <p class="spe_title">培训学校专业方向管理</p>
    <hr />
    <form id="form_1" method="post" action="">
    <table width="700" border="0" cellpadding="0" cellspacing="0" class="spe_table">
      <tr>
        <td width="41" height="35" align="center" class="cell_title">
        </td>
        <td width="30" align="center" class="cell_title">序&nbsp;&nbsp;号</td>
        <td width="289" align="center" class="cell_title">专业名称</td>
      </tr>

      <tr style="background-color:'#fcfcfc'}">
      	<td height="32" align="center" class="cell">
        	<input name="spec" type="checkbox" value="" />
        </td>
        <td align="center" class="cell_num">1</td>
        <td align="center" class="cell">sdsd</td>
      </tr>
      
      <tr style="background-color:'#E3FAE3'">
      	<td height="32" align="center" class="cell">
        	<input name="spec" type="checkbox" value="" />
        </td>
        <td align="center" class="cell_num">2</td>
        <td align="center" class="cell">sdsd</td>
      </tr>

      <!-- 
      	<tr style="background-color:rgb(217,249,255)">
			<td colspan="4" align="center" height="30" style="font-size: 15px;letter-spacing: 5px;">无数据</td>
		</tr>
       -->
    </table>
    <input type="hidden" name="school" id="st" value=""/>
        <div class="spe_div">
        <!-- 
      	<input type="button" value="全选" id="btn_1" class="op_btn" onclick="checkAll()"/>
      	 -->
      	<input type="button" value="保存" class="op_btn" onclick="" />
  
     </div>
     <input type="hidden" name='del' id='del'/>
    </form>
	<input type="hidden" id="bf" value="${bf}"/>
	<script>
		var bf=document.getElementById("bf").value;

		var spec=document.getElementsByName("spec");
		for(var i=0;i<spec.length;i++){
			var temp=spec[i].value;
			if(bf.indexOf(temp)!=-1){
				spec[i].checked=true;
			}
		}
	</script>
  </div>
</div>
</body>
</html>