function calArea(){
	
	var text=document.getElementById("r");
	var r=text.value;
	var temp="圆面积:"+3.14*r*r;
	document.getElementById("area").innerHTML=temp;
}

function gen(){
	var temp=new Array();
	while(temp.length<7){
		var num=Math.ceil(Math.random()*35);
		var bool=false;
		for(var i=0;i<temp.length;i++){
			if(temp[i]==num){
				bool=true;
				break;
			}
		}
		if(bool!=true){
			temp.push(num);
		}
	}
	temp.sort(function(a,b){
		return b-a;
	});
	document.getElementById("rs").innerHTML=temp;
}

function calDate(){
	var temp=document.getElementById("toDate").value;
	var d1=new Date(temp);
	var d2=new Date();
	var t=d1.getTime()-d2.getTime();
	var day=Math.floor(t/24/60/60/1000);
	var hour=Math.floor((t-day*24*60*60*1000)/60/60/1000);
	var minute=Math.floor((t-day*24*60*60*1000-hour*60*60*1000)/60/1000);
	document.getElementById(result).innerHTML="还剩"+day+"天,"+hour+"小时，"+minute+"分"
	setTimeout("calDate()",1000);
}

var p1=["辽宁","沈阳","大连","鞍山","抚顺","本溪"];
var p2=["吉林","长春","吉林","通化","四平","延吉"];
var p3=["黑龙江","哈尔滨","漠河","大庆","鸡西","齐齐哈尔"];
var p4=["北京"];
var p5=["上海"];
var p6=["天津"];
var china=[p1,p2,p3,p4,p5,p6];
function init(){

	var prov=document.getElementById("province");
	for(var a=0;a<china.length;a++){
		var one=china[a];
		var op=document.createElement("option")
		op.text=one[0];
		op.value=one[0];
		prov.add(op,null);
	}
}

function city(){
	var p=document.getElementById("province").value;
	var ct=document.getElementById("city");
	ct.length=1;
	for(var a=0;a<china.length;a++){
		if(china[a][0]==p){
			var temp=china[a];
			for(var b=0;b<temp.length;b++){
				var op=document.createElement("option");
				op.text=temp[b];
				op.value=temp[b];
				ct.add(op,null);
			}
		}
	}
	
}



function test1(obj){
	obj.style.backgroundColor="#ffffd0";
}
function test2(obj){
	obj.style.backgroundColor="fff";
	if(obj.value==null||obj.value==''){
		alert("必须填写半径");
	}
}








