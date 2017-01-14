function calArea(){
	var text=document.getElementById("r");	//文本框控件
	var r=text.value;	//文本框的值
	var temp="圆面积："+3.14*r*r;
	document.getElementById("area").innerHTML=temp;
}

function gen(){
	var temp=new Array();	//定义集合保存生成的随即号码
	while(temp.length<7){
		var num=Math.ceil(Math.random()*35);	//生成1-35之间的随机数
		var bool=false;	//标志位变量，如果生成的数字跟数组中的某个数据重复，该变量的值就为true
		for(var i=0;i<temp.length;i++){
			if(temp[i]==num){
				bool=true;
				break;	//如果存在生成的数字跟数组某个元素重复，就结束循环
			}
		}
		if(bool!=true){
			temp.push(num);	//如果生成的数字不重复就保存到集合里
		}
	}
	temp.sort(function(a,b){
		return a-b;
	});
	document.getElementById("rs").innerHTML=temp;
}


function calDate(){
	var temp=document.getElementById("toDate").value;	//文本框输入的日期
	var d1=new Date(temp);	//目标日期对象
	var d2=new Date();		//当前日期对象
	var t=d1.getTime()-d2.getTime();	//两个日期间距的毫秒数
	var day=Math.floor(t/24/60/60/1000);
	var hour=Math.floor((t-day*24*60*60*1000)/60/60/1000);
	var minute=Math.floor((t-day*24*60*60*1000-hour*60*60*1000)/60/1000);
	document.getElementById("result").innerHTML="还剩"+day+"天，"+hour+"小时，"+minute+"分"
	setTimeout("calDate()",1000);
}

var p1=["辽宁","沈阳","大连","鞍山","锦州","抚顺","营口","本溪","丹东","朝阳","葫芦岛","辽阳"];
var p2=["吉林","长春","吉林","通化","四平","白山","延吉"];
var p3=["黑龙江","哈尔滨","漠河","完达山","公主岭","鸡西","大庆","齐齐哈尔"];
var p4=["北京"];
var p5=["上海"];
var p6=["天津"];

var china=[p1,p2,p3,p4,p5,p6];

function init(){
	var prov=document.getElementById("province");	//下拉列表对象
	for(var a=0;a<china.length;a++){
		var one=china[a];	//某个省份的数组
		var op=document.createElement("option");	//创建option对象
		op.text=one[0];
		op.value=one[0];
		prov.add(op,null);	//把省份名称加入到下拉列表
	}
}

function city(){
	var p=document.getElementById("province").value;	//选中的省份
	var ct=document.getElementById("city");	//城市下拉列表
	ct.length=1;	//保留第一个元素，其余内容清除
	for(var a=0;a<china.length;a++){
		//判断选中的省份名字属于哪一个省份数组
		if(china[a][0]==p){
			var temp=china[a];
			for(var b=1;b<temp.length;b++){
				var op=document.createElement("option");
				op.text=temp[b];
				op.value=temp[b];
				ct.add(op,null);
			}
		}			
	}
}

function test1(obj){
	obj.style.backgroundColor="#FFFFD0";
}
function test2(obj){
	obj.style.backgroundColor="#fff";
	if(obj.value==null||obj.value==""){
		alert("必须填写半径");
	}
}
function test3(){
	//alert(event.keyCode)
	if(event.keyCode==13){
		calArea();
	}
}
