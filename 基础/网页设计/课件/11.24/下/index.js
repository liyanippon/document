$(document)
		.ready(
				function(e) {
					
					$("[name='button5'],[name='button11'],[name='button12'],[name='button13'],").click(function(){
						//获得当前页数文本框里面的内容
						var now=new Number($("#now").val());
						var totlePage=new Number($("#totlePage").html());
						if(this.name=="button12"){
							$("#to").val(now+1);	//给隐藏字段跳转页数+1
						}
						else if(this.name=="button11"){
							if(now==1){
								return;
							}
							$("#to").val(now-1);	//给隐藏字段跳转页数-1
						}
						else if(this.name=="button5"){
							$("#to").val(1);
						}
						else{
							$("#to").val(totlePage);
						}
						
						$("#searchForm").submit();//提交表单
					});


					$('#bt5')
							.click(
									function() {
										if (array == null || array == "") {
											alert('请选择记录');
											return;
										}
										if (array.charAt(0) == '#') {
											array = array.substring(1,
													array.length);
										}

										var ids = array.split("#");
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

				});

function changeType() {
	var xmlhttp;
	if (window.XMLHttpRequest) {
		// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp = new XMLHttpRequest();
	} else {
		// code for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	var date = new Date();
	var url = "/stuenroll/ajax/StuEnrollBatchAjax?s=" + date.getMilliseconds()
			+ "&t=edu&typeId=" + document.getElementById("type").value;
	xmlhttp.open("POST", url, false);
	xmlhttp.send();
	var rs = xmlhttp.responseText;
	var edu = document.getElementById("edu");
	edu.length = 0;
	var classObj = document.getElementById("class");
	classObj.length = 1;
	if (rs != null && rs != '') {
		var y = document.createElement('option');
		y.text = "-选择-";
		y.value = "-1";
		try {
			edu.add(y, null); // standards compliant
		} catch (ex) {
			edu.add(y); // IE only
		}
		var temp = rs.split("#");
		for (i = 0; i < temp.length; i++) {
			var y = document.createElement('option');
			var s = temp[i].split('@');
			y.text = s[0];
			y.value = s[1];
			try {
				edu.add(y, null); // standards compliant
			} catch (ex) {
				edu.add(y); // IE only
			}
		}
	} else {

		var y = document.createElement('option');
		y.text = "没有对应的培训学校";
		y.value = "-1";
		try {
			edu.add(y, null); // standards compliant
		} catch (ex) {
			edu.add(y); // IE only
		}
	}

}

function changeEdu(bool) {
	var xmlhttp;
	if (window.XMLHttpRequest) {
		// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp = new XMLHttpRequest();
	} else {
		// code for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	var date = new Date();
	var url = "/stuenroll/ajax/StuEnrollBatchAjax?s=" + date.getMilliseconds()
			+ "&t=class&typeId=" + document.getElementById("type").value
			+ "&eduId=" + document.getElementById("edu").value + "&archives="
			+ bool;
	xmlhttp.open("POST", url, false);
	xmlhttp.send();
	var rs = xmlhttp.responseText;
	var classObj = document.getElementById("class");
	classObj.length = 0;
	if (rs != null && rs != '') {
		var y = document.createElement('option');
		y.text = "-选择-";
		y.value = "-1";
		try {
			classObj.add(y, null); // standards compliant
		} catch (ex) {
			classObj.add(y); // IE only
		}
		var temp = rs.split("#");

		for (i = 0; i < temp.length; i++) {
			var y = document.createElement('option');
			var s = temp[i].split('@');
			y.text = s[0];
			y.value = s[1];
			try {
				classObj.add(y, null); // standards compliant
			} catch (ex) {
				classObj.add(y); // IE only
			}
		}
	} else {

		var y = document.createElement('option');
		y.text = "没有对应的班级";
		y.value = "";
		try {
			classObj.add(y, null); // standards compliant
		} catch (ex) {
			classObj.add(y); // IE only
		}
	}
}
function submitUpdate() {
	var type = document.getElementById("type").value;
	var edu = document.getElementById("edu").value;
	var cc = document.getElementById("class").value;
	var joinState = document.getElementById("joinState").value;

	if (type == null || type == "" || edu == null || edu == '' || cc == null
			|| cc == "" || joinState == null || joinState == '') {
		alert("请选择具体内容");
	}
	else{
		document.getElementById("ids_update").value = array;
		document.getElementById("form_3").submit();
	}

}
