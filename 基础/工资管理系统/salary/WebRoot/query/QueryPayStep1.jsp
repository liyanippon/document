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
</head>
<%@ include file="../incoming/Header.jsp"%>
<%
java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM");
java.util.Date currentTime = new java.util.Date();//�õ���ǰϵͳʱ��
String str_date1 = formatter.format(currentTime); //������ʱ���ʽ��
String str_date2 = currentTime.toString(); //��Date������ʱ��ת�����ַ�����ʽ  %>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="QueryLeft.jsp"%></td>
    <td width="660" align="center" valign="top">
	<p align="center" class="title1">��ѯ������Ϣ</p>
	 <form name="form1" method="post" action="QueryPayStep2.jsp">
	   <table width="640" height="282" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
         <tr>
           <td width="113" height="33"><div align="right"> Ա�����:</div></td>
           <td width="164"><input name="employeeid" type="text"  class="data" id="employeeid" size="6" maxlength="6" onkeyup="value=value.replace(/[^\d]/g,'')">
           </td>
           <td width="98" height="33"><div align="right">����:</div></td>
           <td width="231"><input name="username" type="text"  class="data" id="username" size="8" maxlength="4" >
           </td>
         </tr>
         <tr>
           <td height="33"><div align="right"> �Ա�: </div></td>
           <td><select name="sex" id="sex">
               <option value="" selected>����</option>
               <option value="��">��</option>
               <option value="Ů">Ů</option>
             </select>
           </td>
           <td><div align="right">��������:</div></td>
           <td><select name="branch" id="branch">
               <option value="" selected>����</option>
               <option value="�ܾ�����">�ܾ�����</option>
               <option value="���ܾ�����">���ܾ�����</option>
               <option value="���۲�">���۲�</option>
               <option value="������">������</option>
               <option value="�з���">�з���</option>
               <option value="�ɹ���">�ɹ���</option>
               <option value="����">����</option>
               <option value="���²�">���²�</option>
             </select>
           </td>
         </tr>
         <tr>
           <td><div align="right">�����·ݣ� </div></td>
           <td><input name="paytime" type="text"  class="data" id="paytime" size="18"  value="<%=str_date1 %>">
           </td>
           <td height="33"><div align="right">����״��: </div></td>
           <td><select name="marriage" id="marriage">
               <option value="" selected>����</option>
               <option value="δ��">δ��</option>
               <option value="�ѻ�">�ѻ�</option>
               <option value="ɥż">ɥż</option>
               <option value="����">����</option>
             </select>
           </td>
         </tr>
         <tr>
           <td height="33"><div align="right">ѧ��: </div></td>
           <td><select name="education" id="education">
               <option value="" selected>����</option>
               <option value="����">����</option>
               <option value="����">����</option>
               <option value="��ר">��ר</option>
               <option value="ר��">ר��</option>
               <option value="����">����</option>
               <option value="˶ʿ">˶ʿ</option>
               <option value="��ʿ">��ʿ</option>
             </select>
           </td>
           <td><div align="right">��������:</div></td>
           <td><select name="administrationlevel" id="administrationlevel">
               <option value="" selected>����</option>
               <option value="��Ա">��Ա</option>
               <option value="���Ƽ�">���Ƽ�</option>
               <option value="�Ƽ�">�Ƽ�</option>
               <option value="������">������</option>
               <option value="����">����</option>
               <option value="������">������</option>
               <option value="����">����</option>
               <option value="����">����</option>
           </select></td>
         </tr>
         <tr>
           <td height="33"><div align="right"> ְ��:</div></td>
           <td><select name="duty" id="duty">
               <option value="" selected>����</option>
               <option value="����">����</option>
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
           </td>
           <td><div align="right">ְ��: </div></td>
           <td><select name="position" id="position">
               <option value="" selected>����</option>
               <option value="������ʦ">������ʦ</option>
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
           <td height="33"><div align="right"> ��ְ���: </div></td>
           <td><select name="incumbency" id="incumbency">
               <option value="" selected>����</option>
               <option value="��ְ">��ְ</option>
               <option value="��ְ">��ְ</option>
               <option value="����">����</option>
               <option value="��Ƹ">��Ƹ</option>
               <option value="����">����</option>
             </select>
      * </td>
           <td><div align="right">�ù���ʽ: </div></td>
           <td><select name="incumbencytype" id="incumbencytype">
               <option value="" selected>����</option>
               <option value="��ʽ��">��ʽ��</option>
               <option value="��ͬ��">��ͬ��</option>
               <option value="��ʱ��">��ʱ��</option>
               <option value="��ϰ��">��ϰ��</option>
               <option value="����">����</option>
             </select>
      *</td>
         </tr>
         <tr>
           <td height="49" colspan="4"><div align="center">
               <input type="submit" name="Submit" value="��ѯ">
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
