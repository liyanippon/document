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
  if (theForm.Basic.value == "")
  {
    alert("������������ʣ�");
    theForm.Basic.focus();
    return (false);
  }  
  if (theForm.Post.value == "")
  {
    alert("�������λ���ʣ�");
    theForm.Post.focus();
    return (false);
  }
  if (theForm.Year.value == "")
  {
    alert("�����빤�乤�ʣ�");
    theForm.Year.focus();
    return (false);
  }
  if (theForm.Life.value == "")
  {
    alert("�������������");
    theForm.Life.focus();
    return (false);
  }  
  if (theForm.House.value == "")
  {
    alert("������ס��������");
    theForm.House.focus();
    return (false);
  }
  if (theForm.Traffic.value == "")
  {
    alert("�����뽻ͨ������");
    theForm.Traffic.focus();
    return (false);
  }
    if (theForm.Accumulate.value == "")
  {
    alert("�����빫����");
    theForm.Accumulate.focus();
    return (false);
  }
      if (theForm.Handle.value == "")
  {
    alert("�����뾭�������֣�");
    theForm.Handle.focus();
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
		alert("��ѡ��Ҫ��ӻ������ʵ�Ա��");
		return ;
	}
	
	if(!check_input(form1))
		return;

	var employeeid = new Array(tbTarget.cells.length/2-1);
	for(var i=0;i<(tbTarget.cells.length/2-1);i++)
	{
		employeeid[i]=tbTarget.cells[i*2+2].innerText;
	}
	self.location="AddBasicStep2.jsp?employeeid="+employeeid+"&basic="+form1.Basic.value+"&post="+form1.Post.value+"&year="+form1.Year.value+"&life="+form1.Life.value+"&house="+form1.House.value+"&traffic="+form1.Traffic.value+"&accumulate="+form1.Accumulate.value+"&handle="+form1.Handle.value;
}
</script>
</head>
<%@ include file="../incoming/Header.jsp"%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="BasicLeft.jsp"%></td>
    <td width="660" align="top">
	<p align="center" class="title1">��ӻ�������</p>
	 <form name="form1" method="post" >
	<table width="640" height="551" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr>
        <td height="33" colspan="4"><div align="center">
          <table width="600" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000" style="border-collapse: collapse;" height="249">
            <tr>
              <td width="255" height="29" valign="middle"><div align="center">����ӻ������ʵ�Ա��</div></td>
              <td width="76" valign="middle"><br>              </td>
              <td width="247" valign="middle"><div align="center">����ӻ������ʵ�Ա��</div></td>
            </tr>
            <tr>
              <td height="218" valign="top"><table id="tbSource" cellpadding="0" cellspacing="0" border="1" style="border-collapse:collapse;cursor:default" bordercolor="#CCCCCC" width="100%">
                  <tr>
                    <td align="center" width="43%">Ա�����</td>
                    <td align="center" width="57%">����</td>
                  </tr>
  <%	
		Vector listemployee = Employee.ListForBasic();
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
                    <input name="btn" type="button" value="->" onClick="Add(document.all.tbSource,tbTarget)" title="ѡ��" disabled>
                  </p>
                  <p style="width:100%" align="center">
                    <input name="btn" type="button" value="=>" onClick="AddAll(document.all.tbSource,tbTarget)" title="ȫ��ѡ��">
                  </p>
                  <p style="width:100%" align="center">
                    <input name="btn" type="button" value="<-" onClick="Add(tbTarget,document.all.tbSource)" title="ȡ��" disabled>
                  </p>
                  <p style="width:100%" align="center">
                    <input name="btn" type="button" value="<=" onClick="AddAll(tbTarget,document.all.tbSource)" title="ȫ��ȡ��">
                  </p>
              <td valign="top"><table id="tbTarget" cellpadding="0" cellspacing="0" border="1" style="border-collapse:collapse" bordercolor="#CCCCCC" width="100%">
                  <tr>
                    <td align="center" width="61%">Ա�����</td>
                    <td align="center" width="39%">����</td>
                  </tr>
              </table></td>
            </tr>
          </table>
        </div></td>
        </tr>
      <tr>
        <td width="93" height="37"><div align="right"> ��������:</div></td>
        <td width="209"><input name="Basic" type="text"  class="data" id="Basic" size="18"  onKeyUp="value=value.replace(/[^\d.]/g,'')">
          *</td>
        <td width="104"><div align="right"> ��λ����:</div></td>
        <td width="200"><input name="Post" type="text"  class="data" id="Post" size="18"  onKeyUp="value=value.replace(/[^\d.]/g,'')">
          *</td>
      </tr>
      <tr>
        <td height="41"><div align="right">���乤��:</div></td>
        <td><input name="Year" type="text"  class="data" id="Year" size="18" onKeyUp="value=value.replace(/[^\d.]/g,'')" >          
          *</td>
        <td><div align="right">�����: </div></td>
        <td><input name="Life" type="text"  class="data" id="Life" size="18" onKeyUp="value=value.replace(/[^\d.]/g,'')" >
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right">ס������: </div></td>
        <td><input name="House" type="text"  class="data" id="House" size="18" onKeyUp="value=value.replace(/[^\d.]/g,'')" >    
          *</td>
        <td><div align="right">��ͨ����: </div></td>
        <td><input name="Traffic" type="text"  class="data" id="Traffic" size="18" onKeyUp="value=value.replace(/[^\d.]/g,'')" >
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right">������:</div></td>
        <td>            <input name="Accumulate" type="text"  class="data" id="Accumulate" size="18" onKeyUp="value=value.replace(/[^\d.]/g,'')" >
          *      </td>
        <td><div align="right">������: </div></td>
        <td><input name="Handle" type="text"  class="data" id="Handle" size="18" >
          *</td>
      </tr>
      
      <tr>
        <td height="49" colspan="4"><div align="center">
          <input type="button" name="Submit" value="���" onClick="doSubmit()">
          <input type="reset" name="Submit2" value="ȡ��">
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
