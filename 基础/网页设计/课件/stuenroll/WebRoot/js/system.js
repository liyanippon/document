//鼠标右键
$(document).bind("contextmenu", function() {
	return false;
});//

$(document).keydown(function(event) {
	if ((event.altKey) && ((event.keyCode == 37) || // 屏蔽 Alt+ 方向键 ←
	(event.keyCode == 39))) // 屏蔽 Alt+ 方向键 →
	{
		event.returnValue = false;
		return false;
	}

	if (event.keyCode == 8) {
		return false; // 屏蔽退格删除键
	}

	if (event.keyCode == 116) {
		return false; // 屏蔽F5刷新键
	}
	if ((event.ctrlKey) && (event.keyCode == 82)) {
		return false; // 屏蔽alt+R
	}

});

$(document).ready(function() {
	// 设置下俩列表
	$(".chzn-select").chosen();
	$(".chzn-select-deselect").chosen({
		allow_single_deselect : true
	});
});
/**
 * 设置是否开放报名
 */
function setIsOpenEnroll() {
	document.getElementById("form_1").submit();

}

function setYearEnroll() {
	document.getElementById("form_2").submit();

}
function deleteStuEnrollAll() {
	if (confirm("是否要删除预报名记录")) {
		document.getElementById("form_3").submit();
	}

}
function insertEnrollToRecord() {
	if (confirm("是否要归档报名记录")) {
		document.getElementById("form_4").submit();
	}

}
function exportRecordCondition() {
	var eduSchool=document.getElementById("eduSchool").value;
	var year=document.getElementById("year").value;
	var bool=false;
	// 正则表达式对象
	var re = new RegExp("^2[0-9]{3}$", "");

	// 验证是否刚好匹配
	var yesorno = re.test(year);
	if(yesorno==false&&year!=0){
		alert("年份格式错误!");
		return;
	}
	if(year==null||year==""){
		year=0;
	}
	if((eduSchool==null||eduSchool=="")&&(year==0||year=="")){
		bool=confirm("是否要全部导出所有数据？");
	}
	document.getElementById("form_5").submit();
	

}