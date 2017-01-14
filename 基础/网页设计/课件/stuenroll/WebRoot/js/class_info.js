var isSelectAll = false;
var inSearchArea = false;
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
$(document)
		.ready(
				function(e) {
					$(document).keyup(function(e) {
						key = e.which;
						if (key == 13 && inSearchArea == true) {
							// 提交表单
							document.getElementById("form_2").submit();
						}
					});
					$('#btn_1')
							.click(
									function() {
										var popID = $(this).attr('title'); // Get
										// Popup
										// Name
										var popURL = $(this).attr('value'); // Get
										// Popup
										// href
										// to
										// define
										// size

										// Pull Query & Variables from href URL
										var query = popURL.split('?');
										var dim = query[1].split('&');
										var popWidth = dim[0].split('=')[1]; // Gets
										// the
										// first
										// query
										// string
										// value

										// Fade in the Popup and add close
										// button
										$('#' + popID)
												.fadeIn()
												.css({
													'width' : Number(popWidth)
												})
												.prepend(
														'<a href="#" class="close"><img style="border:none" src="../../pic/close_pop.png" class="btn_close" title="关闭" alt="Close" /></a>');

										// Define margin for center alignment
										// (vertical horizontal) - we add 80px
										// to the height/width to accomodate for
										// the padding and border width defined
										// in the css
										var popMargTop = ($('#' + popID)
												.height() + 80) / 2;
										var popMargLeft = ($('#' + popID)
												.width() + 80) / 2;

										// Apply Margin to Popup
										$('#' + popID).css({
											'margin-top' : -popMargTop,
											'margin-left' : -popMargLeft
										});

										// Fade in Background
										$('body').append(
												'<div id="fade"></div>'); // Add
										// the
										// fade
										// layer
										// to
										// bottom
										// of
										// the
										// body
										// tag.
										$('#fade').css({
											'filter' : 'alpha(opacity=80)'
										}).fadeIn(); // Fade in the fade
										// layer -
										// .css({'filter' :
										// 'alpha(opacity=80)'})
										// is used to fix the IE
										// Bug on fading
										// transparencies

										return false;
									});
					// Close Popups and Fade Layer
					$('a.close, #fade,#cancel').live('click', function() { // When
						// clicking
						// on
						// the
						// close
						// or
						// fade
						// layer...
						$('#fade , .popup_block').fadeOut(function() {
							$('#fade, a.close').remove(); // fade them both
							// out
						});
						return false;
					});
					$('#classSchool').change(function(){
						var shcool=document.getElementById("classSchool").value.split("#")[0];
						//document.getElementById("classType").length=0;
						
						var selectObj = $("#classType_chzn"); 
						selectObj.remove();
						
						
						
						
						if(shcool==null||shcool==null){
							return;
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
						var url = "/stuenroll/ajax/RefAjax?s=" + date.getMilliseconds();
						xmlhttp.open("POST", url, false);
						xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
						xmlhttp.send("school="+shcool);
						var rs = xmlhttp.responseText;
						//alert(rs);
						var array=rs.split('#');
						var bf="<select name='type' id='classType' class='class_select chzn-select' tabindex='2' style='width: 298px;'>";
						bf+="<option value=''>-选择-</option>";
						for(i=0;i<array.length;i++){
							bf+="<option value='"+array[i]+"'>"+array[i]+"</option>";
							
						}
						bf+="</select>";
						$('#sp').html('');
						$('#sp').append(bf);
						//alert(bf)
						$(".chzn-select").chosen(); 
						$(".chzn-select-deselect").chosen({allow_single_deselect:true});
							
					});
				});

function selectAll() {
	isSelectAll = !isSelectAll;
	document.getElementById("btn_1").value = (isSelectAll == true ? '取消' : '全选');
	var array = document.getElementsByName("classId");
	for (i = 0; i < array.length; i++) {
		array[i].checked = isSelectAll;
	}
}

function addClass() {
	document.getElementById("sh").value=document.getElementById("classSchool").value.split('#')[1];
	var name = document.getElementById("className").value;
	var school = document.getElementById("sh").value;
	var type = document.getElementById("classType").value;
	//alert(school+"@"+type);
	if (name == null || name == "" || school == null || school == ""
			|| type == null || type == "") {
		alert("请核对班级信息");
		return;
	} else {
		var array = document.getElementsByName("className");
		// 判断专业是否存在，否则不予添加
		for (i = 0; i < array.length; i++) {
			if (array[i].innerHTML == name) {
				alert("该班级已经存在！");
				return;
			}
		}
		document.getElementById("form_3").submit();
	}
}
function deleteClass(id) {
	var s = confirm("确认要删除这些记录吗?");
	if (s == true) {
		if (id != null && id != "") {
			var array = document.getElementsByName("classId");
			for (i = 0; i < array.length; i++) {
				array[i].checked = false;
			}
			document.getElementById("classId_" + id).checked = true;
		}
		document.getElementById("form_1").submit();
	} else {
		return;
	}
}

function submitFormArchives(classNo){
	alert(classNo);
	document.getElementById("classNo").value=classNo;
	document.getElementById("form_4").submit();
}
