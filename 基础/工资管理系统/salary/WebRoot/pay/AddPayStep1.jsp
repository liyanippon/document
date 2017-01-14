<%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="../incoming/Common.jsp"%>
<%@ include file="../Check.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<title><%=title%></title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="../css/calendar-win2k-1.css" type="text/css" media="screen">
<script Language="JavaScript">
function check_input(theForm)
{

  if (theForm.paytime.value == "")
  {
    alert("请输入工资时间！");
    theForm.paytime.focus();
    return (false);
  }
      if (theForm.handle.value == "")
  {
    alert("请输入经手人名字！");
    theForm.handle.focus();
    return (false);
  }
  
  return (true);
}

var curRowSource=null;
var curRowTarget=null;
function selectRow(obj){
	if(curRowSource){
		curRowSource.style.backgroundColor="#FFFFFF";
		curRowSource.style.color="#000000";
	}
	obj.style.backgroundColor="#3366FF";
	obj.style.color="#FFFFFF";
	curRowSource=obj;
	var btns=document.getElementsByName("btn");
	btns[0].disabled=false;	
}
function selectRow1(obj){
	if(curRowTarget){
		curRowTarget.style.backgroundColor="#FFFFFF";
		curRowTarget.style.color="#000000";
	}
	obj.style.backgroundColor="#3366FF";
	obj.style.color="#FFFFFF";
	curRowTarget=obj;
	var btns=document.getElementsByName("btn");
    btns[2].disabled=false;
}
function Add(tbSou,tbTar){
	var rowSou=null;
	var newRow=tbTar.insertRow();
	if(tbSou.id=="tbSource"){
		rowSou=curRowSource;
		newRow.attachEvent("onclick",function(){selectRow1(newRow);});
		}
	else{
			rowSou=curRowTarget;
			newRow.attachEvent("onclick",function(){selectRow(newRow);});
		}
	for(var i=0;i<rowSou.cells.length;i++){
			var newCell=newRow.insertCell();
			newCell.innerHTML=rowSou.cells[i].innerHTML;
		}
	tbSou.deleteRow(rowSou.rowIndex);
	var btns=document.getElementsByName("btn");
	btns[0].disabled=true;
	btns[2].disabled=true;
	
}

function AddAll(tbSource,tbTarget){
	for(var i=1;;i++){
		if(tbSource.rows.length==1) return;
		tbSource.rows[1].click();
		Add(tbSource,tbTarget);
	}
	
}
function doSubmit(){

	if(tbTarget.rows.length<2)
	{
		alert("请选择要添加工资的员工!");
		return ;
	}
	
	if(!check_input(form1))
		return;

	var employeeid = new Array(tbTarget.cells.length/2-1);
	for(var i=0;i<(tbTarget.cells.length/2-1);i++)
	{
		employeeid[i]=tbTarget.cells[i*2+2].innerText;
	}
	self.location="AddPayStep2.jsp?employeeid="+employeeid+"&paytime="+form1.paytime.value+"&overtime="+form1.overtime.value+"&bonus="+form1.bonus.value+"&performance="+form1.performance.value+"&sickleave="+form1.sickleave.value+"&personalleave="+form1.personalleave.value+"&absence="+form1.absence.value+"&others="+form1.others.value+"&handle="+form1.handle.value;
}


</script>
</head>
<%@ include file="../incoming/Header.jsp"%>
<%
java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM");
java.util.Date currentTime = new java.util.Date();//得到当前系统时间
String str_date1 = formatter.format(currentTime); //将日期时间格式化
String str_date2 = currentTime.toString(); //将Date型日期时间转换成字符串形式  %>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="PayLeft.jsp"%></td>
    <td width="660" align="top">
	<p align="center" class="title1">发放工资</p>
	 <form name="form1" method="post" >
	<table width="640" height="551" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr>
        <td height="33" colspan="4"><div align="center">
          <table width="600" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000" style="border-collapse: collapse;" height="249">
            <tr>
              <td width="255" height="29" valign="middle"><div align="center">已添加基本工资的员工</div></td>
              <td width="76" valign="middle"><br>              </td>
              <td width="247" valign="middle"><div align="center">将要添加本月工资的员工</div></td>
            </tr>
            <tr>
              <td height="218" valign="top"><table id="tbSource" cellpadding="0" cellspacing="0" border="1" style="border-collapse:collapse;cursor:default" bordercolor="#CCCCCC" width="100%">
                  <tr>
                    <td align="center" width="43%">员工编号</td>
                    <td align="center" width="57%">姓名</td>
                  </tr>
  <%	
		Vector listemployee = Employee.ListForPay();
		for(int i=0;i<listemployee.size();i++) {
		Employee employee = (Employee)listemployee.elementAt(i);
	%>
                  <tr onClick="selectRow(this)">
                    <td><%=employee.getEmployeeID()%></td>
                    <td><%=employee.getUserName()%></td>
                  </tr>
                  <%}%>
              </table></td>
              <td valign="middle"><br>
                  <p style="width:100%" align="center">
                    <input name="btn" type="button" value="->" onClick="Add(document.all.tbSource,tbTarget)" title="选择" disabled>
                  </p>
                  <p style="width:100%" align="center">
                    <input name="btn" type="button" value="=>" onClick="AddAll(document.all.tbSource,tbTarget)" title="全部选择">
                  </p>
                  <p style="width:100%" align="center">
                    <input name="btn" type="button" value="<-" onClick="Add(tbTarget,document.all.tbSource)" title="取消" disabled>
                  </p>
                  <p style="width:100%" align="center">
                    <input name="btn" type="button" value="<=" onClick="AddAll(tbTarget,document.all.tbSource)" title="全部取消">
                  </p>
              <td valign="top"><table id="tbTarget" cellpadding="0" cellspacing="0" border="1" style="border-collapse:collapse" bordercolor="#CCCCCC" width="100%">
                  <tr>
                    <td align="center" width="61%">员工编号</td>
                    <td align="center" width="39%">姓名</td>
                  </tr>
              </table></td>
            </tr>
          </table>
        </div></td>
        </tr>
      <tr>
        <td width="93" height="37"><div align="right"> 工资月份:</div></td>
        <td width="209"><input name="paytime" type="text"  class="data" id="paytime" size="18"  value="<%=str_date1 %>">*</td>
        <td width="93" height="37">
        </td>
        </tr>
        <tr>
        <td width="104"><div align="right"> 加班工资:</div></td>
        <td width="200"><input name="overtime" type="text"  class="data" id="overtime" size="18"  onKeyUp="value=value.replace(/[^\d.]/g,'')">
          *</td>
        <td height="41"><div align="right">本月奖金:</div></td>
        <td><input name="bonus" type="text"  class="data" id="bonus" size="18" onKeyUp="value=value.replace(/[^\d.]/g,'')" >          
          *</td>
       </tr>
       <tr>
        <td><div align="right">绩效工资: </div></td>
        <td><input name="performance" type="text"  class="data" id="performance" size="18" onKeyUp="value=value.replace(/[^\d.]/g,'')" >
          *</td>
        <td height="33"><div align="right">病假扣除: </div></td>
        <td><input name="sickleave" type="text"  class="data" id="sickleave" size="18" onKeyUp="value=value.replace(/[^\d.]/g,'')" >    
          *</td>
          </tr>
          <tr>
        <td><div align="right">事假扣除: </div></td>
        <td><input name="personalleave" type="text"  class="data" id="personalleave" size="18" onKeyUp="value=value.replace(/[^\d.]/g,'')" >
          *</td>
        <td height="33"><div align="right">缺勤扣除:</div></td>
        <td>   <input name="absence" type="text"  class="data" id="absence" size="18" onKeyUp="value=value.replace(/[^\d.]/g,'')" >
          *      </td>
          </tr>
          <tr>
        <td><div align="right">其它扣除: </div></td>
        <td><input name="others" type="text"  class="data" id="others" size="18" onKeyUp="value=value.replace(/[^\d.]/g,'')">
          *</td>
          <td><div align="right">经手人: </div></td>
          <td><input name="handle" type="text"  class="data" id="handle" size="18">
          *</td>
      </tr>
      
      <tr>
        <td height="49" colspan="4"><div align="center">
          <input type="button" name="Submit" value="添加" onClick="doSubmit()">
          <input type="reset" name="Submit2" value="取消">
        </div></td>
      </tr>
    </table>
	
	</form>    
    </td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>
</body>
</html>