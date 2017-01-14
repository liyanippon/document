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
<%
	String employeeid = new String(request.getParameter("employeeid").getBytes("ISO8859_1"),"GBK");
	Employee employee = Employee.FindByID(employeeid);
	
%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="EmployeeLeft.jsp"%></td>
    <td width="660" align="center">
	<p align="center" class="title1">�޸���Ա����</p>
	 <form name="form1" method="post" action="ModifyEmployeeStep2.jsp" onsubmit="return check_input(this)">
	<table width="640" height="513" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr>
        <td width="103" height="33"><div align="right"> Ա�����:</div></td>
        <td width="176"><input name="employeeid" type="text"  class="data" id="employeeid" size="6" maxlength="6" value="<%=employee.getEmployeeID()%>" readonly="true">
      *</td>
        <td width="78" height="33"><div align="right">����:</div></td>
        <td width="249"><input name="username" type="text"  class="data" id="username" size="8" maxlength="4" value="<%=employee.getUserName()%>">
  *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> �Ա�: </div></td>
        <td>          
		<select name="sex" id="sex">
          <%if (employee.getSex().equals("��")) {%>
            <option value="��" selected>��</option>
		   <%}else{%>
            <option value="��" >��</option>
		   <%}%>   
			
			<%if (employee.getSex().equals("Ů")) {%>
            <option value="Ů" selected>Ů</option>
		   <%}else{%>
            <option value="Ů" >Ů</option>
		   <%}%>   
          </select>
          *</td>
        <td width="78"><div align="right">��������:</div></td>
        <td><select name="branch" id="branch">
          <%if (employee.getBranch().equals("�ܾ�����")) {%>
            <option value="�ܾ�����" selected>�ܾ�����</option>
		   <%}else{%>
            <option value="�ܾ�����" >�ܾ�����</option>
		   <%}%>   
		  
		  <%if (employee.getBranch().equals("���ܾ�����")) {%>
            <option value="���ܾ�����" selected>���ܾ�����</option>
		   <%}else{%>
            <option value="���ܾ�����" >���ܾ�����</option>
		   <%}%>  
		   
		   <%if (employee.getBranch().equals("���۲�")) {%>
            <option value="���۲�" selected>���۲�</option>
		   <%}else{%>
            <option value="���۲�" >���۲�</option>
		   <%}%> 
		   
		   <%if (employee.getBranch().equals("������")) {%>
            <option value="������" selected>������</option>
		   <%}else{%>
            <option value="������" >������</option>
		   <%}%> 
		   
		   <%if (employee.getBranch().equals("�з���")) {%>
            <option value="�з���" selected>�з���</option>
		   <%}else{%>
            <option value="�з���" >�з���</option>
		   <%}%> 
		   
		   <%if (employee.getBranch().equals("�ɹ���")) {%>
            <option value="�ɹ���" selected>�ɹ���</option>
		   <%}else{%>
            <option value="�ɹ���" >�ɹ���</option>
		   <%}%> 
		   
		   <%if (employee.getBranch().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		   
		   <%if (employee.getBranch().equals("���²�")) {%>
            <option value="���²�" selected>���²�</option>
		   <%}else{%>
            <option value="���²�" >���²�</option>
		   <%}%>  		 
           </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> ��������: </div></td>
        <td><input name="birthday" type="text"  class="data" id="birthday" value="<%=employee.getBirthday()%>" size="10" maxlength="8" readonly="true">
          <input name="bir" type="button" id="bir" value="...">
      *</td>
        <td><div align="right">����: </div></td>
        <td><input name="nativeplace" type="text"  class="data" id="nativeplace" size="10" maxlength="10" value="<%=employee.getNativePlace()%>">
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right">����״��: </div></td>
        <td>      
		<select name="marriage" id="marriage">
          <%if (employee.getMarriage().equals("δ��")) {%>
            <option value="δ��" selected>δ��</option>
		   <%}else{%>
            <option value="δ��" >δ��</option>
		   <%}%>  		
		   
		   <%if (employee.getMarriage().equals("�ѻ�")) {%>
            <option value="�ѻ�" selected>�ѻ�</option>
		   <%}else{%>
            <option value="�ѻ�" >�ѻ�</option>
		   <%}%>  		
		   
		   <%if (employee.getMarriage().equals("ɥż")) {%>
            <option value="ɥż" selected>ɥż</option>
		   <%}else{%>
            <option value="ɥż" >ɥż</option>
		   <%}%>  		
		   
		   <%if (employee.getMarriage().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%>  				  
        </select>
          *</td>
        <td width="78"><div align="right">���֤��:</div></td>
        <td><input name="identityid" type="text"  class="data" id="identityid" size="18" maxlength="18" onKeyUp="value=value.replace(/[^\d]/g,'')" value="<%=employee.getIdentityID()%>">          
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> ������ò: </div></td>
        <td height="33">
		<select name="politics" id="politics">
           <%if (employee.getPolitics().equals("��Ա")) {%>
            <option value="��Ա" selected>��Ա</option>
		   <%}else{%>
            <option value="��Ա" >��Ա</option>
		   <%}%>  				
		
		   <%if (employee.getPolitics().equals("��Ա")) {%>
            <option value="��Ա" selected>��Ա</option>
		   <%}else{%>
            <option value="��Ա" >��Ա</option>
		   <%}%>  
		   
		   <%if (employee.getPolitics().equals("Ⱥ��")) {%>
            <option value="Ⱥ��" selected>Ⱥ��</option>
		   <%}else{%>
            <option value="Ⱥ��" >Ⱥ��</option>
		   <%}%>  
		   
		   <%if (employee.getPolitics().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%>  			

          </select>
      * </td>
        <td><div align="right">����: </div></td>
        <td><input name="folk" type="text"  class="data" id="folk" size="8" maxlength="4" value="<%=employee.getFolk()%>">
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right">ѧ��: </div></td>
        <td>
		<select name="education" id="education">
		 <%if (employee.getEducation().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%>  		
		  
		   <%if (employee.getEducation().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%>  		
		   
		    <%if (employee.getEducation().equals("��ר")) {%>
            <option value="��ר" selected>��ר</option>
		   <%}else{%>
            <option value="��ר" >��ר</option>
		   <%}%>  		
		   
		    <%if (employee.getEducation().equals("ר��")) {%>
            <option value="ר��" selected>ר��</option>
		   <%}else{%>
            <option value="ר��" >ר��</option>
		   <%}%>  		
		   
		    <%if (employee.getEducation().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%>  		
		   
		    <%if (employee.getEducation().equals("˶ʿ")) {%>
            <option value="˶ʿ" selected>˶ʿ</option>
		   <%}else{%>
            <option value="˶ʿ" >˶ʿ</option>
		   <%}%>  		
		   
		   <%if (employee.getEducation().equals("��ʿ")) {%>
            <option value="��ʿ" selected>��ʿ</option>
		   <%}else{%>
            <option value="��ʿ" >��ʿ</option>
		   <%}%>  		 
        </select>      
		</td>
        <td width="78"><div align="right">רҵ:</div></td>
        <td><input name="department" type="text"  class="data" id="department" size="20" maxlength="20" value="<%=employee.getDepartment()%>"></td>
      </tr>
      <tr>
        <td height="33"><div align="right">��ҵ����:</div></td>
        <td><input name="graduatedate" type="text"  class="data" id="graduatedate" value="<%=employee.getGraduateDate()%>" size="10" maxlength="8" readonly="true">
            <input name="graduate" type="button" id="graduate" value="...">
      </td>
        <td><div align="right">��ҵԺУ: </div></td>
        <td><input name="university" type="text"  class="data" id="university" size="30" maxlength="30" value="<%=employee.getUniversity()%>"></td>
      </tr>
      <tr>
        <td height="33"><div align="right">�������ʺ�:</div></td>
        <td><input name="accumulateid" type="text"  class="data" id="accumulateid" size="15" maxlength="15" onkeyup="value=value.replace(/[^\d]/g,'')" value="<%=employee.getAccumulateID()%>">
          *</td>
        <td width="78"><div align="right">��������:</div></td>
        <td>
		<select name="administrationlevel" id="administrationlevel">
          <%if (employee.getAdministrationLevel().equals("��Ա")) {%>
            <option value="��Ա" selected>��Ա</option>
		   <%}else{%>
            <option value="��Ա" >��Ա</option>
		   <%}%>  		 
		   
		   <%if (employee.getAdministrationLevel().equals("���Ƽ�")) {%>
            <option value="���Ƽ�" selected>���Ƽ�</option>
		   <%}else{%>
            <option value="���Ƽ�" >���Ƽ�</option>
		   <%}%>  		 
		  
		  <%if (employee.getAdministrationLevel().equals("�Ƽ�")) {%>
            <option value="�Ƽ�" selected>�Ƽ�</option>
		   <%}else{%>
            <option value="�Ƽ�" >�Ƽ�</option>
		   <%}%>  		 
		   
		   <%if (employee.getAdministrationLevel().equals("������")) {%>
            <option value="������" selected>������</option>
		   <%}else{%>
            <option value="������" >������</option>
		   <%}%>  		 
		   
		   <%if (employee.getAdministrationLevel().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%>  		 
		   
		   <%if (employee.getAdministrationLevel().equals("������")) {%>
            <option value="������" selected>������</option>
		   <%}else{%>
            <option value="������" >������</option>
		   <%}%>  		 
		   
		   <%if (employee.getAdministrationLevel().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%>  		 
		   
		   <%if (employee.getAdministrationLevel().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%>  		 
        </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> ְ��:</div></td>
        <td>      
		<select name="duty" id="duty">
		  <%if (employee.getDuty().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		  
		  <%if (employee.getDuty().equals("ְԱ")) {%>
            <option value="ְԱ" selected>ְԱ</option>
		   <%}else{%>
            <option value="ְԱ" >ְԱ</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("���")) {%>
            <option value="���" selected>���</option>
		   <%}else{%>
            <option value="���" >���</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("������")) {%>
            <option value="������" selected>������</option>
		   <%}else{%>
            <option value="������" >������</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("������")) {%>
            <option value="������" selected>������</option>
		   <%}else{%>
            <option value="������" >������</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("�ܾ���")) {%>
            <option value="�ܾ���" selected>�ܾ���</option>
		   <%}else{%>
            <option value="�ܾ���" >�ܾ���</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		   
        </select>
          *</td>
        <td><div align="right">ְ��: </div></td>
        <td>
		<select name="position" id="position">
		   <%if (employee.getPosition().equals("������ʦ")) {%>
            <option value="������ʦ" selected>������ʦ</option>
		   <%}else{%>
            <option value="������ʦ" >������ʦ</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("����ʦ")) {%>
            <option value="����ʦ" selected>����ʦ</option>
		   <%}else{%>
            <option value="����ʦ" >����ʦ</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("�߼�����ʦ")) {%>
            <option value="�߼�����ʦ" selected>�߼�����ʦ</option>
		   <%}else{%>
            <option value="�߼�����ʦ" >�߼�����ʦ</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("������ʦ")) {%>
            <option value="������ʦ" selected>������ʦ</option>
		   <%}else{%>
            <option value="������ʦ" >������ʦ</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("���ʦ")) {%>
            <option value="���ʦ" selected>���ʦ</option>
		   <%}else{%>
            <option value="���ʦ" >���ʦ</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("ע����ʦ")) {%>
            <option value="ע����ʦ" selected>ע����ʦ</option>
		   <%}else{%>
            <option value="ע����ʦ" >ע����ʦ</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("������ʦ")) {%>
            <option value="������ʦ" selected>������ʦ</option>
		   <%}else{%>
            <option value="������ʦ" >������ʦ</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("����ʦ")) {%>
            <option value="����ʦ" selected>����ʦ</option>
		   <%}else{%>
            <option value="����ʦ" >����ʦ</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("�߼�����ʦ")) {%>
            <option value="�߼�����ʦ" selected>�߼�����ʦ</option>
		   <%}else{%>
            <option value="�߼�����ʦ" >�߼�����ʦ</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
         
        </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> ��������: </div></td>
        <td height="33">
		<select name="foreignlanguage" id="foreignlanguage">
		   <%if (employee.getForeignLanguage().equals("Ӣ��")) {%>
            <option value="Ӣ��" selected>Ӣ��</option>
		   <%}else{%>
            <option value="Ӣ��" >Ӣ��</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("��������")) {%>
            <option value="��������" selected>��������</option>
		   <%}else{%>
            <option value="��������" >��������</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("��������")) {%>
            <option value="��������" selected>��������</option>
		   <%}else{%>
            <option value="��������" >��������</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
          </select>
      </td>
        <td width="78"><div align="right">����ˮƽ:</div></td>
        <td>
		<select name="fllevel" id="fllevel">
		  <%if (employee.getFLLevel().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		   
		   <%if (employee.getFLLevel().equals("�ļ�")) {%>
            <option value="�ļ�" selected>�ļ�</option>
		   <%}else{%>
            <option value="�ļ�" >�ļ�</option>
		   <%}%> 
		   
		   <%if (employee.getFLLevel().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		   
		   <%if (employee.getFLLevel().equals("�˼�")) {%>
            <option value="�˼�" selected>�˼�</option>
		   <%}else{%>
            <option value="�˼�" >�˼�</option>
		   <%}%> 
        </select></td>
      </tr>
      <tr>
        <td height="33"><div align="right">�����ˮƽ: </div></td>
        <td height="33">      
		<select name="computerlevel" id="computerlevel">
		  <%if (employee.getComputerLevel().equals("�˽�")) {%>
            <option value="�˽�" selected>�˽�</option>
		   <%}else{%>
            <option value="�˽�" >�˽�</option>
		   <%}%> 
		   
		   <%if (employee.getComputerLevel().equals("��Ϥ")) {%>
            <option value="��Ϥ" selected>��Ϥ</option>
		   <%}else{%>
            <option value="��Ϥ" >��Ϥ</option>
		   <%}%> 
		   
		   <%if (employee.getComputerLevel().equals("��ͨ")) {%>
            <option value="��ͨ" selected>��ͨ</option>
		   <%}else{%>
            <option value="��ͨ" >��ͨ</option>
		   <%}%> 
        </select></td>
        <td><div align="right">��ϵ�绰: </div></td>
        <td><input name="phone" type="text"  class="data" id="phone" size="13" maxlength="13" value="<%=employee.getPhone()%>"></td>
      </tr>
      <tr>
        <td height="33"><div align="right"> �ֻ�����: </div></td>
        <td><input name="mobilephone" type="text"  class="data" id="mobilephone" size="11" maxlength="11" onkeyup="value=value.replace(/[^\d]/g,'')" value="<%=employee.getMobilePhone()%>">
        </td>
        <td width="78"><div align="right">��ͥסַ:</div></td>
        <td><input name="address" type="text"  class="data" id="address" size="30" maxlength="30" value="<%=employee.getAddress()%>"></td>
      </tr>
      <tr>
        <td height="33"><div align="right"> ��ְ���: </div></td>
        <td>
		<select name="incumbency" id="incumbency">
		  <%if (employee.getIncumbency().equals("��Ϥ")) {%>
            <option value="��ְ" selected>��ְ</option>
		   <%}else{%>
            <option value="��ְ" >��ְ</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbency().equals("��ְ")) {%>
            <option value="��ְ" selected>��ְ</option>
		   <%}else{%>
            <option value="��ְ" >��ְ</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbency().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbency().equals("��Ƹ")) {%>
            <option value="��Ƹ" selected>��Ƹ</option>
		   <%}else{%>
            <option value="��Ƹ" >��Ƹ</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbency().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
        </select>
          *        </td>
        <td><div align="right">�ù���ʽ: </div></td>
        <td>
		<select name="incumbencytype" id="incumbencytype">
          <%if (employee.getIncumbencyType().equals("��ʽ��")) {%>
            <option value="��ʽ��" selected>��ʽ��</option>
		   <%}else{%>
            <option value="��ʽ��" >��ʽ��</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbencyType().equals("��ͬ��")) {%>
            <option value="��ͬ��" selected>��ͬ��</option>
		   <%}else{%>
            <option value="��ͬ��" >��ͬ��</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbencyType().equals("��ʱ��")) {%>
            <option value="��ʱ��" selected>��ʱ��</option>
		   <%}else{%>
            <option value="��ʱ��" >��ʱ��</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbencyType().equals("��ϰ��")) {%>
            <option value="��ϰ��" selected>��ϰ��</option>
		   <%}else{%>
            <option value="��ϰ��" >��ϰ��</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbencyType().equals("����")) {%>
            <option value="����" selected>����</option>
		   <%}else{%>
            <option value="����" >����</option>
		   <%}%> 
        </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> ���˼���: </div></td>
        <td colspan="3"><textarea name="resume" cols="60" rows="4" id="resume"><%=employee.getResume()%></textarea></td>
        </tr>
      <tr>
        <td height="49" colspan="4"><div align="center">
          <input type="submit" name="Submit" value="�޸�">
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
