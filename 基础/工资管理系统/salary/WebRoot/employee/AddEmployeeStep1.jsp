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
<script type="text/javascript" src="../js/calendar.js"></script>
<script type="text/javascript" src="../js/calendar-en.js"></script>
<script type="text/javascript" src="../js/calendar-setup.js"></script>
<script Language="JavaScript">
function check_input(theForm)
{
  if (theForm.employeeid.value.length != 6)
  {
    alert("Ա����ű���Ϊ6λ��");
    theForm.employeeid.focus();
    return (false);
  }  
  if (theForm.username.value == "")
  {
    alert("������������");
    theForm.username.focus();
    return (false);
  }
  if (theForm.birthday.value == "")
  {
    alert("������������ڡ�");
    theForm.birthday.focus();
    return (false);
  }
  if (theForm.nativeplace.value == "")
  {
    alert("�����뼮�ᡣ");
    theForm.nativeplace.focus();
    return (false);
  }  
  if (theForm.identityid.value == "")
  {
    alert("���������֤�š�");
    theForm.identityid.focus();
    return (false);
  }
  if (theForm.accumulateid.value == "")
  {
    alert("�����빫����š�");
    theForm.accumulateid.focus();
    return (false);
  }  
}
</script>
</head>
<%@ include file="../incoming/Header.jsp"%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="EmployeeLeft.jsp"%></td>
    <td width="660" align="center">
	<p align="center" class="title1">�����Ա����</p>
	 <form name="form1" method="post" action="AddEmployeeStep2.jsp" onsubmit="return check_input(this)">
	<table width="640" height="513" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr>
        <td width="103" height="33"><div align="right"> Ա�����:</div></td>
        <td width="176"><input name="employeeid" type="text"  class="data" id="employeeid" size="6" maxlength="6" onkeyup="value=value.replace(/[^\d]/g,'')">
      *</td>
        <td width="78" height="33"><div align="right">����:</div></td>
        <td width="249"><input name="username" type="text"  class="data" id="username" size="8" maxlength="4" >
  *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> �Ա�: </div></td>
        <td>          
        	<select name="sex" id="sex">
            <option value="��" selected>��</option>
            <option value="Ů">Ů</option>
          </select>
          *</td>
        <td width="78"><div align="right">��������:</div></td>
        <td><select name="branch" id="branch">
          <option value="�ܾ�����" selected>�ܾ�����</option>
          <option value="���ܾ�����">���ܾ�����</option>
		  <option value="���۲�">���۲�</option>
          <option value="������">������</option>
		  <option value="�з���">�з���</option>
          <option value="�ɹ���">�ɹ���</option>
		  <option value="����">����</option>
          <option value="���²�">���²�</option>
           </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> ��������: </div></td>
        <td><input name="birthday" type="text"  class="data" id="birthday" value="1975-01-01" size="10" maxlength="8" readonly="true">
          <input name="bir" type="button" id="bir" value="...">
      *</td>
        <td><div align="right">����: </div></td>
        <td><input name="nativeplace" type="text"  class="data" id="nativeplace" size="10" maxlength="10" >
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right">����״��: </div></td>
        <td>      <select name="marriage" id="marriage">
          <option value="δ��" selected>δ��</option>
          <option value="�ѻ�">�ѻ�</option>
          <option value="ɥż">ɥż</option>
          <option value="����">����</option>
        </select>
          *</td>
        <td width="78"><div align="right">���֤��:</div></td>
        <td><input name="identityid" type="text"  class="data" id="identityid" size="18" maxlength="18" onKeyUp="value=value.replace(/[^\d]/g,'')">          
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> ������ò: </div></td>
        <td height="33"><select name="politics" id="politics">
            <option value="��Ա" selected>��Ա</option>
            <option value="��Ա">��Ա</option>
			<option value="Ⱥ��">Ⱥ��</option>
			<option value="����">����</option>
          </select>
      * </td>
        <td><div align="right">����: </div></td>
        <td><input name="folk" type="text"  class="data" id="folk" size="8" maxlength="4" >
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right">ѧ��: </div></td>
        <td><select name="education" id="education">
          <option value="����">����</option>
          <option value="����">����</option>
		  <option value="��ר">��ר</option>
          <option value="ר��">ר��</option>
          <option value="����" selected>����</option>
		  <option value="˶ʿ">˶ʿ</option>
		  <option value="��ʿ">��ʿ</option>
        </select>      </td>
        <td width="78"><div align="right">רҵ:</div></td>
        <td><input name="department" type="text"  class="data" id="department" size="20" maxlength="20" ></td>
      </tr>
      <tr>
        <td height="33"><div align="right">��ҵ����:</div></td>
        <td><input name="graduatedate" type="text"  class="data" id="graduatedate" value="1980-01-01" size="10" maxlength="8" readonly="true">
            <input name="graduate" type="button" id="graduate" value="...">
      </td>
        <td><div align="right">��ҵԺУ: </div></td>
        <td><input name="university" type="text"  class="data" id="university" size="30" maxlength="30" ></td>
      </tr>
      <tr>
        <td height="33"><div align="right">�������ʺ�:</div></td>
        <td><input name="accumulateid" type="text"  class="data" id="accumulateid" size="15" maxlength="15" onkeyup="value=value.replace(/[^\d]/g,'')">
          *</td>
        <td width="78"><div align="right">��������:</div></td>
        <td><select name="administrationlevel" id="administrationlevel">
          <option value="��Ա" selected>��Ա</option>
		  <option value="���Ƽ�">���Ƽ�</option>
          <option value="�Ƽ�">�Ƽ�</option>
          <option value="������">������</option>
		  <option value="����">����</option>
          <option value="������">������</option>
		  <option value="����">����</option>
		  <option value="����">����</option>
        </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> ְ��:</div></td>
        <td>      <select name="duty" id="duty">
          <option value="����" selected>����</option>
          <option value="ְԱ">ְԱ</option>
          <option value="���">���</option>
		  <option value="����">����</option>
          <option value="������">������</option>
		  <option value="����">����</option>
		  <option value="������">������</option>
		  <option value="����">����</option>
		  <option value="�ܾ���">�ܾ���</option>
		  <option value="����">����</option>
        </select>
          *</td>
        <td><div align="right">ְ��: </div></td>
        <td><select name="position" id="position">
          <option value="������ʦ" selected>������ʦ</option>
          <option value="����ʦ">����ʦ</option>
          <option value="�߼�����ʦ">�߼�����ʦ</option>
		  <option value="������ʦ">������ʦ</option>
          <option value="���ʦ">���ʦ</option>
		  <option value="ע����ʦ">ע����ʦ</option>
		  <option value="������ʦ">������ʦ</option>
		  <option value="����ʦ">����ʦ</option>
		  <option value="�߼�����ʦ">�߼�����ʦ</option>
		  <option value="����">����</option>
        </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> ��������: </div></td>
        <td height="33"><select name="foreignlanguage" id="foreignlanguage">
            <option value="Ӣ��" selected>Ӣ��</option>
            <option value="����">����</option>
            <option value="����">����</option>
            <option value="����">����</option>
            <option value="����">����</option>
			<option value="��������">��������</option>
			<option value="��������">��������</option>
			<option value="����">����</option>
          </select>
      </td>
        <td width="78"><div align="right">����ˮƽ:</div></td>
        <td><select name="fllevel" id="fllevel">
          <option value="����" selected>����</option>
          <option value="�ļ�">�ļ�</option>
          <option value="����">����</option>
          <option value="�˼�">�˼�</option>
        </select></td>
      </tr>
      <tr>
        <td height="33"><div align="right">�����ˮƽ: </div></td>
        <td height="33">      <select name="computerlevel" id="computerlevel">
          <option value="�˽�" selected>�˽�</option>
          <option value="��Ϥ">��Ϥ</option>
          <option value="��ͨ">��ͨ</option>
        </select></td>
        <td><div align="right">��ϵ�绰: </div></td>
        <td><input name="phone" type="text"  class="data" id="phone" size="13" maxlength="13" ></td>
      </tr>
      <tr>
        <td height="33"><div align="right"> �ֻ�����: </div></td>
        <td><input name="mobilephone" type="text"  class="data" id="mobilephone" size="11" maxlength="11" onkeyup="value=value.replace(/[^\d]/g,'')">
        </td>
        <td width="78"><div align="right">��ͥסַ:</div></td>
        <td><input name="address" type="text"  class="data" id="address" size="30" maxlength="30" ></td>
      </tr>
      <tr>
        <td height="33"><div align="right"> ��ְ���: </div></td>
        <td><select name="incumbency" id="incumbency">
          <option value="��ְ" selected>��ְ</option>
          <option value="��ְ">��ְ</option>
          <option value="����">����</option>
		  <option value="��Ƹ">��Ƹ</option>
		  <option value="����">����</option>
        </select>
          *        </td>
        <td><div align="right">�ù���ʽ: </div></td>
        <td><select name="incumbencytype" id="incumbencytype">
          <option value="��ʽ��" selected>��ʽ��</option>
          <option value="��ͬ��">��ͬ��</option>
          <option value="��ʱ��">��ʱ��</option>
          <option value="��ϰ��">��ϰ��</option>
		  <option value="����">����</option>
        </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> ���˼���: </div></td>
        <td colspan="3"><textarea name="resume" cols="60" rows="4" id="resume"></textarea></td>
        </tr>
      <tr>
        <td height="49" colspan="4"><div align="center">
          <input type="submit" name="Submit" value="���">
          <input type="reset" name="Submit2" value="ȡ��">
        </div></td>
      </tr>
    </table>
	
	</form>    
    </td>
  </tr>
</table>
<%@ include file="../incoming/Footer.jsp"%>
<script language="JavaScript" type="text/JavaScript">
	Calendar.setup(
	{
      inputField  : "birthday",         // ID of the input field
      ifFormat    : "%Y-%m-%d",    // the date format
      button      : "bir"       // ID of the button
    }
	);	
	Calendar.setup(
	{
      inputField  : "graduatedate",         // ID of the input field
      ifFormat    : "%Y-%m-%d",    // the date format
      button      : "graduate"       // ID of the button
    }
	);		
</script>
</body>
</html>
