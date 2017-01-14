$(document).ready(function(){
	$(".option").click(function(){
		if($(this).attr("class")=="option"){
			$(this).attr("class","select");
		}
		else{
			$(this).attr("class","option");
		}
	});
	$("#bt1").click(function(){
		$("#right").append($("#left .select"));
		$(".select").attr("class","option");
	});
	$("#bt2").click(function(){
		$("#left").append($("#right .select"));
		$(".select").attr("class","option");
	});
	$("#left p,#right p").dblclick(function(){
		if($(this).parent().attr("id")=="left"){
			$("#right").append($(this));
		}
		else{
			$("#left").append($(this));
		}
	});
});