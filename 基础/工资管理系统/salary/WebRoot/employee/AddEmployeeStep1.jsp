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
    alert("员工编号必须为6位。");
    theForm.employeeid.focus();
    return (false);
  }  
  if (theForm.username.value == "")
  {
    alert("请输入姓名。");
    theForm.username.focus();
    return (false);
  }
  if (theForm.birthday.value == "")
  {
    alert("请输入出生日期。");
    theForm.birthday.focus();
    return (false);
  }
  if (theForm.nativeplace.value == "")
  {
    alert("请输入籍贯。");
    theForm.nativeplace.focus();
    return (false);
  }  
  if (theForm.identityid.value == "")
  {
    alert("请输入身份证号。");
    theForm.identityid.focus();
    return (false);
  }
  if (theForm.accumulateid.value == "")
  {
    alert("请输入公积金号。");
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
	<p align="center" class="title1">添加人员档案</p>
	 <form name="form1" method="post" action="AddEmployeeStep2.jsp" onsubmit="return check_input(this)">
	<table width="640" height="513" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr>
        <td width="103" height="33"><div align="right"> 员工编号:</div></td>
        <td width="176"><input name="employeeid" type="text"  class="data" id="employeeid" size="6" maxlength="6" onkeyup="value=value.replace(/[^\d]/g,'')">
      *</td>
        <td width="78" height="33"><div align="right">姓名:</div></td>
        <td width="249"><input name="username" type="text"  class="data" id="username" size="8" maxlength="4" >
  *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 性别: </div></td>
        <td>          
        	<select name="sex" id="sex">
            <option value="男" selected>男</option>
            <option value="女">女</option>
          </select>
          *</td>
        <td width="78"><div align="right">所属部门:</div></td>
        <td><select name="branch" id="branch">
          <option value="总经理室" selected>总经理室</option>
          <option value="副总经理室">副总经理室</option>
		  <option value="销售部">销售部</option>
          <option value="生产部">生产部</option>
		  <option value="研发部">研发部</option>
          <option value="采购部">采购部</option>
		  <option value="财务部">财务部</option>
          <option value="人事部">人事部</option>
           </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 出生日期: </div></td>
        <td><input name="birthday" type="text"  class="data" id="birthday" value="1975-01-01" size="10" maxlength="8" readonly="true">
          <input name="bir" type="button" id="bir" value="...">
      *</td>
        <td><div align="right">籍贯: </div></td>
        <td><input name="nativeplace" type="text"  class="data" id="nativeplace" size="10" maxlength="10" >
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right">婚姻状况: </div></td>
        <td>      <select name="marriage" id="marriage">
          <option value="未婚" selected>未婚</option>
          <option value="已婚">已婚</option>
          <option value="丧偶">丧偶</option>
          <option value="离异">离异</option>
        </select>
          *</td>
        <td width="78"><div align="right">身份证号:</div></td>
        <td><input name="identityid" type="text"  class="data" id="identityid" size="18" maxlength="18" onKeyUp="value=value.replace(/[^\d]/g,'')">          
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 政治面貌: </div></td>
        <td height="33"><select name="politics" id="politics">
            <option value="党员" selected>党员</option>
            <option value="团员">团员</option>
			<option value="群众">群众</option>
			<option value="其他">其他</option>
          </select>
      * </td>
        <td><div align="right">民族: </div></td>
        <td><input name="folk" type="text"  class="data" id="folk" size="8" maxlength="4" >
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right">学历: </div></td>
        <td><select name="education" id="education">
          <option value="初中">初中</option>
          <option value="高中">高中</option>
		  <option value="中专">中专</option>
          <option value="专科">专科</option>
          <option value="本科" selected>本科</option>
		  <option value="硕士">硕士</option>
		  <option value="博士">博士</option>
        </select>      </td>
        <td width="78"><div align="right">专业:</div></td>
        <td><input name="department" type="text"  class="data" id="department" size="20" maxlength="20" ></td>
      </tr>
      <tr>
        <td height="33"><div align="right">毕业日期:</div></td>
        <td><input name="graduatedate" type="text"  class="data" id="graduatedate" value="1980-01-01" size="10" maxlength="8" readonly="true">
            <input name="graduate" type="button" id="graduate" value="...">
      </td>
        <td><div align="right">毕业院校: </div></td>
        <td><input name="university" type="text"  class="data" id="university" size="30" maxlength="30" ></td>
      </tr>
      <tr>
        <td height="33"><div align="right">公积金帐号:</div></td>
        <td><input name="accumulateid" type="text"  class="data" id="accumulateid" size="15" maxlength="15" onkeyup="value=value.replace(/[^\d]/g,'')">
          *</td>
        <td width="78"><div align="right">行政级别:</div></td>
        <td><select name="administrationlevel" id="administrationlevel">
          <option value="科员" selected>科员</option>
		  <option value="副科级">副科级</option>
          <option value="科级">科级</option>
          <option value="副处级">副处级</option>
		  <option value="处级">处级</option>
          <option value="副部级">副部级</option>
		  <option value="部级">部级</option>
		  <option value="其他">其他</option>
        </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 职务:</div></td>
        <td>      <select name="duty" id="duty">
          <option value="工人" selected>工人</option>
          <option value="职员">职员</option>
          <option value="领班">领班</option>
		  <option value="主管">主管</option>
          <option value="副主任">副主任</option>
		  <option value="主任">主任</option>
		  <option value="副经理">副经理</option>
		  <option value="经理">经理</option>
		  <option value="总经理">总经理</option>
		  <option value="其他">其他</option>
        </select>
          *</td>
        <td><div align="right">职称: </div></td>
        <td><select name="position" id="position">
          <option value="助理工程师" selected>助理工程师</option>
          <option value="工程师">工程师</option>
          <option value="高级工程师">高级工程师</option>
		  <option value="助理会计师">助理会计师</option>
          <option value="会计师">会计师</option>
		  <option value="注册会计师">注册会计师</option>
		  <option value="助理经济师">助理经济师</option>
		  <option value="经济师">经济师</option>
		  <option value="高级经济师">高级经济师</option>
		  <option value="其他">其他</option>
        </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 外语语种: </div></td>
        <td height="33"><select name="foreignlanguage" id="foreignlanguage">
            <option value="英语" selected>英语</option>
            <option value="日语">日语</option>
            <option value="德语">德语</option>
            <option value="法语">法语</option>
            <option value="俄语">俄语</option>
			<option value="阿拉伯语">阿拉伯语</option>
			<option value="西班牙语">西班牙语</option>
			<option value="其他">其他</option>
          </select>
      </td>
        <td width="78"><div align="right">外语水平:</div></td>
        <td><select name="fllevel" id="fllevel">
          <option value="三级" selected>三级</option>
          <option value="四级">四级</option>
          <option value="六级">六级</option>
          <option value="八级">八级</option>
        </select></td>
      </tr>
      <tr>
        <td height="33"><div align="right">计算机水平: </div></td>
        <td height="33">      <select name="computerlevel" id="computerlevel">
          <option value="了解" selected>了解</option>
          <option value="熟悉">熟悉</option>
          <option value="精通">精通</option>
        </select></td>
        <td><div align="right">联系电话: </div></td>
        <td><input name="phone" type="text"  class="data" id="phone" size="13" maxlength="13" ></td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 手机号码: </div></td>
        <td><input name="mobilephone" type="text"  class="data" id="mobilephone" size="11" maxlength="11" onkeyup="value=value.replace(/[^\d]/g,'')">
        </td>
        <td width="78"><div align="right">家庭住址:</div></td>
        <td><input name="address" type="text"  class="data" id="address" size="30" maxlength="30" ></td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 在职情况: </div></td>
        <td><select name="incumbency" id="incumbency">
          <option value="在职" selected>在职</option>
          <option value="离职">离职</option>
          <option value="退休">退休</option>
		  <option value="待聘">待聘</option>
		  <option value="其他">其他</option>
        </select>
          *        </td>
        <td><div align="right">用工形式: </div></td>
        <td><select name="incumbencytype" id="incumbencytype">
          <option value="正式工" selected>正式工</option>
          <option value="合同工">合同工</option>
          <option value="临时工">临时工</option>
          <option value="见习生">见习生</option>
		  <option value="其他">其他</option>
        </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 个人简历: </div></td>
        <td colspan="3"><textarea name="resume" cols="60" rows="4" id="resume"></textarea></td>
        </tr>
      <tr>
        <td height="49" colspan="4"><div align="center">
          <input type="submit" name="Submit" value="添加">
          <input type="reset" name="Submit2" value="取消">
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
