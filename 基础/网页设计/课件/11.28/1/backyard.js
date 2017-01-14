// JavaScript Document
var inSearchArea = false;
var inToPageArea = false;
var selectAll = false;
var selectMore = false;// 是否多选
var array = "";
var isAll_1 = false;
var isAll_2 = false;
//鼠标右键
$(document).bind("contextmenu", function() {
	//return false;
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

function inSearch() {
	inSearchArea = true;
}
function outSearch() {
	inSearchArea = false;
}

$(document)
		.ready(
				function(e) {
					$(document)
							.keyup(
									function(e) {
										key = e.which;
										if (key == 13 && inSearchArea == true) {
											var reg = new RegExp(
													"^[\\u4e00-\\u9fa5]{1,4}$");
											var name = document
													.getElementsByName("name")[0].value;
											if (name.length > 0
													&& reg.test(name) == false) {
												alert("请正确填写姓名");
												return;
											}

											$('#toPage').val(1);
											$('#stype').val('search');
											$("[name='searchForm']")[0]
													.submit();
										} else if (key == 13
												&& inToPageArea == true) {
											var num = $('#now').val();
											var reg = new RegExp("^[0-9]{1,}$");
											if (num == 0
													|| reg.test(num) == false) {
												alert("请填写数字");
												return;
											}
											$('#to').val(num);
											$('#stype').val('to');
											$("[name='searchForm']")[0]
													.submit();
											return;

										}
									});
					// 全部选中记录的时候
					$("#bt1").click(function() {
						selectAll = !selectAll;
						if (selectAll) {
							$('.row').css("background-color", "#e0fcfc");
							var array = $('[name="t"]'); // 页面所有记录
							var temp = "";
							for (i = 0; i < array.length; i++) {
								if (i == 0) {
									temp = array[i].innerHTML; // 某条记录的主键值
								} else {
									temp = temp + "#" + array[i].innerHTML;
								}
							}
							// temp的格式为1#2#3
							array = temp; // 选中记录的id设置到隐藏变量里面去
							$("#bt1").val('取消');
						} else {
							$('.row').css("background-color", "#fcfcfc");
							$("#bt1").val('全选');
							array == "";
						}
					});
					// 点击删除按钮
					$('#bt2').click(function() {
						$("#deleteForm").submit();
					});
					// 点击单选/多选按钮
					$('#bt4').click(function() {
						selectMore = !selectMore;
						if (selectMore) {
							$('#bt4').val('多选');
						} else {
							$('#bt4').val('单选');
						}
					});
					// 点击修改按钮
					$('#bt3')
							.click(
									function() {
										if (array == null || array == "") {
											alert("请选择要修改的记录");
											return;
										} else {
											document.getElementById("option").action = "/stuenroll/jsp/backyard/ManageAction!modify.action"; // 更换Form提交路径
											$('#type_1').val("modify");
											$('#ids').val(array);
											$('#option').submit(); // 提交删除表单
										}
									});
					$('#bt6')
							.click(
									function() {
										if (array == null || array == "") {
											alert("请选择要修改的记录");
											return;
										} else {
											document.getElementById("option").action = "/stuenroll/jsp/backyard/StuRecordAction!modify.action"; // 更换Form提交路径
											$('#type_1').val("modify");
											$('#ids').val(array);
											$('#option').submit(); // 提交删除表单
										}
									});
				});
function clickRow(id) {
	if (selectMore == false) {
		$('[name="rw"]').css("background-color", "#fcfcfc");
		array = id; // 单选状态下只记录某条id
		var temp = $('[name="rw"]');
		for (i = 0; i < temp.length; i++) {
			temp[i].style.backgroundColor = i % 2 == 0 ? "#E3FAE3" : "#fcfcfc";

		}
	} else if ($('#pid_' + id).css("background-color") == "rgb(254, 226, 241)") {
		$('#pid_' + id).css("background-color", "#fcfcfc");
		// 需要从字符串中删除id;
		var temp = array.split("#");
		var rs = "";
		for ( var i = 0; i < temp.length; i++) {
			if (temp[i] != id) {
				if (i == 0) {
					rs = temp[i];
				} else {
					rs = rs + "#" + temp[i];
				}
			}
		}
		array = rs;
		return;
	}

	else {

		if (array.indexOf("#") == 0) {
			array = array.substring(1);
		}
		array = array + "#" + id;

	}
	$('#pid_' + id).css("background-color", "#FEE2F1");

}

// 大序号排列
function orderDaXuHao() {
	var daxuhao = document.getElementById("order").value;// 大序号默认升序排列
	if (daxuhao == "0" || daxuhao == null || daxuhao == '3' || daxuhao == '4') {
		daxuhao = "1";
	}
	if (daxuhao == "2") {

		document.getElementById("order").value = "1";
	} else if (daxuhao == "1") {
		document.getElementById("order").value = "2";
	}
	document.getElementById("stype").value = 'search';
	document.getElementById("searchForm").submit();
}
// 小序号排列
function orderXiaoXuHao() {
	var daxuhao = document.getElementById("order").value;// 大序号默认升序排列
	if (daxuhao == '1' || daxuhao == '2') {
		document.getElementById("order").value = "3";
		// document.getElementById('xiaoxuhao').innerHTML = "小序号↑";
	} else if (daxuhao == '3') {
		document.getElementById("order").value = "4";
	} else {
		document.getElementById("order").value = "3";
		// document.getElementById('xiaoxuhao').innerHTML = "小序号↓";
	}
	document.getElementById("stype").value = 'search';
	document.getElementById("searchForm").submit();
}

/**
 * 全选中申报专业
 */
function checkAll_1() {
	isAll_1 = !isAll_1;
	var array = document.getElementsByName("specialtyReportId");
	for (i = 0; i < array.length; i++) {
		array[i].checked = isAll_1;
	}
	if (isAll_1 == true) {
		document.getElementById("btn_1").value = "取消";
	} else {
		document.getElementById("btn_1").value = "全选";
	}
}
function checkAll_2() {
	isAll_2 = !isAll_2;
	var array = document.getElementsByName("joinStateId");
	for (i = 0; i < array.length; i++) {
		array[i].checked = isAll_2;
	}
	if (isAll_2 == true) {
		document.getElementById("btn_1").value = "取消";
	} else {
		document.getElementById("btn_1").value = "全选";
	}
}

/**
 * 删除申报专业
 */
function deleteAll_1() {
	var temp = false;
	var array = document.getElementsByName("specialtyReportId");

	for (i = 0; i < array.length; i++) {
		if (array[i].checked == true) {
			temp = true;
			break;
		}
	}
	if (temp == false) {
		alert("请选择删除的专业");
		return;
	}
	var s = confirm("确认要删除这些记录吗?");
	if (s == true) {
		document.getElementById("form_1").submit();
	} else {
		return;
	}
}
/**
 * 删除参与状态
 */
function deleteAll_2() {
	var temp = false;
	var array = document.getElementsByName("joinStateId");

	for (i = 0; i < array.length; i++) {
		if (array[i].checked == true) {
			temp = true;
			break;
		}
	}
	if (temp == false) {
		alert("请选择删除的状态");
		return;
	}
	var s = confirm("确认要删除这些记录吗?");
	if (s == true) {
		document.getElementById("form_1").submit();
	} else {
		return;
	}
}
/**
 * 删除单个申报专业
 */
function delete_1(id) {
	var s = confirm("确认要删除这些记录吗?");
	if (s == true) {
		var array = document.getElementsByName("specialtyReportId");
		for (i = 0; i < array.length; i++) {
			array[i].checked = false;
		}
		document.getElementById("speId_" + id).checked = true;
		;
		document.getElementById("form_1").submit();
	} else {
		return;
	}
}
/**
 * 删除单个参与状态
 * 
 * @param id
 */
function delete_2(id) {
	var s = confirm("确认要删除这些记录吗?");
	if (s == true) {
		var array = document.getElementsByName("joinStateId");
		for (i = 0; i < array.length; i++) {
			array[i].checked = false;
		}
		document.getElementById("stateId_" + id).checked = true;
		;
		document.getElementById("form_1").submit();
	} else {
		return;
	}
}

/**
 * 插入申报专业记录
 */
function insert_1() {
	var name = prompt("输入需要添加的专业名称");
	if (name == null || name == '') {
		alert("请填写专业名称");
	} else {
		var array = document.getElementsByName("specialtyReportName");
		// 判断专业是否存在，否则不予添加
		for (i = 0; i < array.length; i++) {
			if (array[i].innerHTML == name) {
				alert("该专业已经存在！");
				return;
			}
		}
		document.getElementById("sname").value = name;
		document.getElementById("form_1").action = "/stuenroll/jsp/backyard/SpecialtyReporAction!insert.action";
		document.getElementById("form_1").submit();
	}
}
/**
 * 插入参与状态
 */
function insert_2() {
	var name = prompt("输入需要添加的状态名称");
	if (name == null || name == '') {
		alert("请填写状态名称");
	} else {
		var array = document.getElementsByName("stateName");
		// 判断专业是否存在，否则不予添加
		for (i = 0; i < array.length; i++) {
			if (array[i].innerHTML == name) {
				alert("该状态已经存在！");
				return;
			}
		}
		document.getElementById("st").value = name;
		document.getElementById("form_1").action = "/stuenroll/jsp/backyard/JoinStateAction!insert.action";
		document.getElementById("form_1").submit();
	}
}
function toPageNow(num) {

	document.getElementById("to").value = num;
	document.getElementById("stype").value = "to";
	document.getElementsByName("searchForm")[0].submit();
}
