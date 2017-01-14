<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>数据导入</title>
<link href="../../css/backyard.css" rel="stylesheet" type="text/css" />
<script src="../../js/jquery-1.6.4.js"></script>
<script src="../../js/import.js"></script>
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
.import_li{
	margin-top:10px;
	font-size: 18px;
	font-family: '华文楷体','楷体','楷体_GB2312';
	letter-spacing: 1px;
	color: red;
}
.import_remark{
	margin-top:10px;
	font-size: 22px;
	font-family: '华文楷体','楷体','楷体_GB2312';
	letter-spacing: 1px;
	color: red;
	font-weight: bold;
	margin-top: 20px;
}

</style>
</head>

<body class="body">
<div class="main_div">
  <jsp:include page="left_nav.jsp"></jsp:include>
  <div class="right_div spe_div">
    <p class="spe_title">数据导入</p>
    <hr />
    <form id="form_1" method="post" action="">
    	<p>
    		请输入导入数据文件夹地址：
    		<input type="text" id="path" name="floderPath" value="" class='input'/>
    		&nbsp;
    		<input type="button" value="导入" id="btn_1" class="op_btn" onclick="importRecord()"/>
    	</p>
    </form>
    	<hr/>
          <p class="import_remark">注意事项：</p>
    <ul>
    	<li class="import_li">数据导入请慎重操作，应由专业人员负责操作，否则后果将非常严重，切记！</li>
    	<li class="import_li">本系统不支持上传文件导入数据，请正确写出需要导入的Excel文件夹地址，例如D:\backup\record"。</li>
    	<li class="import_li">需要导入的Excel文件必须放在服务器的硬盘下。</li>
    	<li class="import_li">请保证Excel文件夹的地址正确，否则导入将会失败。</li>
    	<li class="import_li">如果导入数据失败，意味着所有的原始数据全部没有导入到数据库中，请核对后重新导入。</li>
    </ul>
  </div>
</div>
</body>
</html>