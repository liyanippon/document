var ck_1=(navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion .split(";")[1].replace(/[ ]/g,"")=="MSIE8.0");
var ck_2=(navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion .split(";")[1].replace(/[ ]/g,"")=="MSIE9.0");
if(ck_1==false&&ck_2==false){
	alert("请使用IE浏览器8.0以上版本访问本网站！浏览器将自动跳转，请安装IE浏览器！");
	location.href="http://www.iefans.net/";
}
