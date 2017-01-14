var isSelectAll = false;
function selectAll() {
	isSelectAll = !isSelectAll;
	document.getElementById("btn_1").value = (isSelectAll == true ? '取消' : '全选');
	var array = document.getElementsByName("eduId");
	for (i = 0; i < array.length; i++) {
		array[i].checked = isSelectAll;
	}
}
function deleteEdu(id) {
	var s = confirm("确认要删除这些记录吗?");
	if (s == true) {
		if (id != null && id != "") {
			var array = document.getElementsByName("eduId");
			for (i = 0; i < array.length; i++) {
				array[i].checked = false;
			}
			document.getElementById("eduId_" + id).checked = true;
		}
		document.getElementById("form_1").submit();
	} else {
		return;
	}
}
function addEdu() {
	var name = prompt("输入需要添加的学校名称");
	if (name == null || name == '') {
		alert("请填写学校名称");
	} else {
		var array = document.getElementsByName("eduName");
		// 判断专业是否存在，否则不予添加
		for (i = 0; i < array.length; i++) {
			if (array[i].innerHTML == name) {
				alert("该专业已经存在！");
				return;
			}
		}
		document.getElementById("st").value = name;
		document.getElementById("form_1").action = "/stuenroll/jsp/backyard/EduSchoolAction!insert.action";
		document.getElementById("form_1").submit();
	}

}