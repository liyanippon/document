function importRecord(){
	var path=document.getElementById("path").value;
	if(path==null||path==""){
		alert("请输入文件夹地址！");
	}
	else{
		document.getElementById("form_1").submit();
	}
}