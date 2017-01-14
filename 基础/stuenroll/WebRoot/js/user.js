var isSelectAll = false;
function selectAll() {
	isSelectAll = !isSelectAll;
	document.getElementById("btn_1").value = (isSelectAll == true ? '取消' : '全选');
	var array = document.getElementsByName("userId");
	for (i = 0; i < array.length; i++) {
		array[i].checked = isSelectAll;
	}
}
function deleteUser(id) {
	var s = confirm("确认要删除这些记录吗?");
	if (s == true) {
		if (id != null && id != "") {
			var array = document.getElementsByName("userId");
			for (i = 0; i < array.length; i++) {
				array[i].checked = false;
			}
			document.getElementById("userId_" + id).checked = true;
		}
		document.getElementById("form_1").submit();
	} else {
		return;
	}
}

function addUser() {
	var name = prompt("输入需要添加的用户名称");
	if (name == null || name == '') {
		alert("请填写用户名称");

	} else {
		var array = document.getElementsByName("username");
		// 判断专业是否存在，否则不予添加
		for (i = 0; i < array.length; i++) {
			if (array[i].innerHTML == name) {
				alert("该用户已经存在！");
				return;
			}
		}
	}
	var password = prompt("输入需要添加的密码");
	if (password == null || password == '') {
		alert("请填写密码");
	}
	else{
		document.getElementById("st1").value = name;
		document.getElementById("st2").value = password;
		document.getElementById("form_1").action = "/stuenroll/jsp/backyard/UserAction!insert.action";
		document.getElementById("form_1").submit();
	}

}