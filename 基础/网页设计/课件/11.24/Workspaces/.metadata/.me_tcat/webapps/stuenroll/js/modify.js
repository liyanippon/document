function submitUpdateEnroll() {
	if (!checkName() | !checkGraduteG() | !checkPid() | !checkAddress()
			| !checkHousehold() | !checkTel() | !checkEmail()
			| !checkHomeAddress() | !checkHomeTel() | !checkHealthy()
			| !checkStuNo()) {
		alert('请正确填写数据！');
		return;
	} else {
		var rs = confirm("确认修改申报信息？");

		if (rs) {
			document.getElementsByName("form_1")[0].submit();
		}
	}
}

function checkName() {
	var name = document.getElementById('name').value;
	var re = new RegExp("^[\\u4e00-\\u9fa5]{1,4}$", "");

	var yesorno = re.test(name);
	if (yesorno == false) {
		document.getElementById("name").style.backgroundColor = "#FFE8EF";
		document.getElementById("tr_name").style.backgroundColor = "#FFE8EF";
	} else {
		document.getElementById("name").style.backgroundColor = "#fcfcfc";
		document.getElementById("tr_name").style.backgroundColor = "#fcfcfc";
	}
	return yesorno;
}
function checkGraduteG() {
	var name = document.getElementById('gradute_g').value;
	// 正则表达式对象
	var re = new RegExp("^[\\u4e00-\\u9fa5]{1,30}$", "");

	// 验证是否刚好匹配
	var yesorno = re.test(name);
	if (yesorno == false) {
		document.getElementById("tr_gradute_g").style.backgroundColor = "#FFE8EF";
		document.getElementById('gradute_g').style.backgroundColor = "#FFE8EF";
	} else {
		document.getElementById("tr_gradute_g").style.backgroundColor = "#fcfcfc";
		document.getElementById('gradute_g').style.backgroundColor = "#fcfcfc";
	}
	return yesorno;
}
function checkPid() {
	var pid = document.getElementById("pid").value;
	if (pid == null || pid == '') {
		document.getElementById("tr_pid").style.backgroundColor = "#FFE8EF";
		document.getElementById("pid").style.backgroundColor = "#FFE8EF";
		return false;
	}
	var xmlhttp;
	if (window.XMLHttpRequest) {
		// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp = new XMLHttpRequest();
	} else {
		// code for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	var date = new Date();
	xmlhttp.open("GET", "/stuenroll/ajax/PidAjax?pid=" + pid + "&s="
			+ date.getMilliseconds(), false);
	xmlhttp.send();

	// document.getElementById("txtHint").innerHTML=xmlhttp.responseText;
	var rs = xmlhttp.responseText;
	if (rs == null || rs == "" || rs == "false") {
		// 身份证验证错误
		document.getElementById("tr_pid").style.backgroundColor = "#FFE8EF";
		document.getElementById("pid").style.backgroundColor = "#FFE8EF";
		return false;
	} else {
		document.getElementById("tr_pid").style.backgroundColor = "#fcfcfc";
		document.getElementById("pid").style.backgroundColor = "#fcfcfc";
		return true;
	}
}

function checkAddress() {

	var name = document.getElementById('address').value;
	// 正则表达式对象
	var re = new RegExp("^[0-9A-Za-z\\u4e00-\\u9fa5-,，]{1,30}$", "");

	// 验证是否刚好匹配
	var yesorno = re.test(name);
	if (yesorno == false) {
		document.getElementById("tr_address").style.backgroundColor = "#FFE8EF";
		document.getElementById('address').style.backgroundColor = "#FFE8EF";
	} else {
		document.getElementById("tr_address").style.backgroundColor = "#fcfcfc";
		document.getElementById('address').style.backgroundColor = "#fcfcfc";
	}
	return yesorno;
}

function checkHousehold() {
	var name = document.getElementById('household').value;
	// 正则表达式对象
	var re = new RegExp("^[0-9A-Za-z\\u4e00-\\u9fa5-,，]{1,30}$", "");

	// 验证是否刚好匹配
	var yesorno = re.test(name);
	if (yesorno == false) {
		document.getElementById("household").style.backgroundColor = "#FFE8EF";
		document.getElementById('tr_household').style.backgroundColor = "#FFE8EF";
	} else {
		document.getElementById("household").style.backgroundColor = "#fcfcfc";
		document.getElementById('tr_household').style.backgroundColor = "#fcfcfc";
	}
	return yesorno;

}

function checkTel() {
	var name = document.getElementById('tel').value;
	// 正则表达式对象
	var re = new RegExp("^[1-9][0-9]{10}$", "");

	// 验证是否刚好匹配
	var yesorno = re.test(name);
	if (yesorno == false) {
		document.getElementById("tr_tel").style.backgroundColor = "#FFE8EF";
		document.getElementById('tel').style.backgroundColor = "#FFE8EF";
	} else {
		document.getElementById("tr_tel").style.backgroundColor = "#fcfcfc";
		document.getElementById('tel').style.backgroundColor = "#fcfcfc";
	}
	return yesorno;
}

function checkEmail() {
	var email = document.getElementById("email").value;
	if (email == null || email == '') {
		document.getElementById("tr_email").style.backgroundColor = "#FFE8EF";
		document.getElementById('email').style.backgroundColor = "#FFE8EF";
		return false;
	}
	var xmlhttp;
	if (window.XMLHttpRequest) {
		// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp = new XMLHttpRequest();
	} else {
		// code for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	var s=new Date();
	xmlhttp.open("GET", "/stuenroll/ajax/EmailAjax?email=" + email+"&s="
			+ s.getMilliseconds(), false);
	xmlhttp.send();
	// document.getElementById("txtHint").innerHTML=xmlhttp.responseText;
	var rs = xmlhttp.responseText;

	if (rs == null || rs == "" || rs == "false") {
		// 身份证验证错误
		document.getElementById("tr_email").style.backgroundColor = "#FFE8EF";
		document.getElementById("email").style.backgroundColor = "#FFE8EF";
		return false;
	} else {
		document.getElementById("tr_email").style.backgroundColor = "#fcfcfc";
		document.getElementById("email").style.backgroundColor = "#fcfcfc";
		return true;
	}
	
	
	
}
function checkHomeAddress() {
	var name = document.getElementById('home_address').value;
	// 正则表达式对象
	var re = new RegExp("^[0-9A-Za-z\\u4e00-\\u9fa5-,，]{1,30}$", "");

	// 验证是否刚好匹配
	var yesorno = re.test(name);
	if (yesorno == false) {
		document.getElementById("home_address").style.backgroundColor = "#FFE8EF";
		document.getElementById('tr_home_address').style.backgroundColor = "#FFE8EF";
	} else {
		document.getElementById("home_address").style.backgroundColor = "#fcfcfc";
		document.getElementById('tr_home_address').style.backgroundColor = "#fcfcfc";
	}
	return yesorno;

}
function checkHomeTel() {
	var name = document.getElementById('home_tel').value;
	// 正则表达式对象
	var re = new RegExp("^[0-9a-zA-Z\\(\\)\\-\\—]{1,30}$", "");

	// 验证是否刚好匹配
	var yesorno = re.test(name);
	if (yesorno == false) {
		document.getElementById("home_tel").style.backgroundColor = "#FFE8EF";
		document.getElementById('tr_home_tel').style.backgroundColor = "#FFE8EF";
	} else {
		document.getElementById("home_tel").style.backgroundColor = "#fcfcfc";
		document.getElementById('tr_home_tel').style.backgroundColor = "#fcfcfc";
	}
	return yesorno;
}
function checkHealthy() {
	var healthy = document.getElementById("healthy").value;
	
	if (healthy != null && healthy != "" && healthy == "健康" || healthy == "残疾") {
		document.getElementById("tr_healthy").style.backgroundColor = "#fcfcfc";
		document.getElementById('healthy').style.backgroundColor = "#fcfcfc";
		return true;
	} else {
		document.getElementById("tr_healthy").style.backgroundColor = "#FFE8EF";
		document.getElementById('healthy').style.backgroundColor = "#FFE8EF";
		return false;
	}
}

function checkIntention() {
	var intention = document.getElementById("intention").value;
	// 正则表达式对象
	if (intention == null || intention == '') {
		document.getElementById("tr_intention").style.backgroundColor = "#FFE8EF";
		document.getElementById('intention').style.backgroundColor = "#FFE8EF";
		return false;
	} else {
		document.getElementById("tr_intention").style.backgroundColor = "#fcfcfc";
		document.getElementById('intention').style.backgroundColor = "#fcfcfc";
		return true;
	}
}
function checkStuNo() {
	var name = document.getElementById("stu_no").value;
	if(name==null||name==""){
		return true;
	}
	var re = new RegExp("^[0-9]*[1-9][0-9]*$", "");

	// 验证是否刚好匹配
	var yesorno = re.test(name);
	if (yesorno == false) {
		document.getElementById("tr_stu_no").style.backgroundColor = "#FFE8EF";
		document.getElementById('stu_no').style.backgroundColor = "#FFE8EF";
	} else {
		document.getElementById("tr_stu_no").style.backgroundColor = "#fcfcfc";
		document.getElementById('stu_no').style.backgroundColor = "#fcfcfc";
	}
	return yesorno;
}
