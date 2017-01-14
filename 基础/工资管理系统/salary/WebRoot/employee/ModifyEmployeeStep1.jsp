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
<%
	String employeeid = new String(request.getParameter("employeeid").getBytes("ISO8859_1"),"GBK");
	Employee employee = Employee.FindByID(employeeid);
	
%>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="EmployeeLeft.jsp"%></td>
    <td width="660" align="center">
	<p align="center" class="title1">修改人员档案</p>
	 <form name="form1" method="post" action="ModifyEmployeeStep2.jsp" onsubmit="return check_input(this)">
	<table width="640" height="513" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr>
        <td width="103" height="33"><div align="right"> 员工编号:</div></td>
        <td width="176"><input name="employeeid" type="text"  class="data" id="employeeid" size="6" maxlength="6" value="<%=employee.getEmployeeID()%>" readonly="true">
      *</td>
        <td width="78" height="33"><div align="right">姓名:</div></td>
        <td width="249"><input name="username" type="text"  class="data" id="username" size="8" maxlength="4" value="<%=employee.getUserName()%>">
  *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 性别: </div></td>
        <td>          
		<select name="sex" id="sex">
          <%if (employee.getSex().equals("男")) {%>
            <option value="男" selected>男</option>
		   <%}else{%>
            <option value="男" >男</option>
		   <%}%>   
			
			<%if (employee.getSex().equals("女")) {%>
            <option value="女" selected>女</option>
		   <%}else{%>
            <option value="女" >女</option>
		   <%}%>   
          </select>
          *</td>
        <td width="78"><div align="right">所属部门:</div></td>
        <td><select name="branch" id="branch">
          <%if (employee.getBranch().equals("总经理室")) {%>
            <option value="总经理室" selected>总经理室</option>
		   <%}else{%>
            <option value="总经理室" >总经理室</option>
		   <%}%>   
		  
		  <%if (employee.getBranch().equals("副总经理室")) {%>
            <option value="副总经理室" selected>副总经理室</option>
		   <%}else{%>
            <option value="副总经理室" >副总经理室</option>
		   <%}%>  
		   
		   <%if (employee.getBranch().equals("销售部")) {%>
            <option value="销售部" selected>销售部</option>
		   <%}else{%>
            <option value="销售部" >销售部</option>
		   <%}%> 
		   
		   <%if (employee.getBranch().equals("生产部")) {%>
            <option value="生产部" selected>生产部</option>
		   <%}else{%>
            <option value="生产部" >生产部</option>
		   <%}%> 
		   
		   <%if (employee.getBranch().equals("研发部")) {%>
            <option value="研发部" selected>研发部</option>
		   <%}else{%>
            <option value="研发部" >研发部</option>
		   <%}%> 
		   
		   <%if (employee.getBranch().equals("采购部")) {%>
            <option value="采购部" selected>采购部</option>
		   <%}else{%>
            <option value="采购部" >采购部</option>
		   <%}%> 
		   
		   <%if (employee.getBranch().equals("财务部")) {%>
            <option value="财务部" selected>财务部</option>
		   <%}else{%>
            <option value="财务部" >财务部</option>
		   <%}%> 
		   
		   <%if (employee.getBranch().equals("人事部")) {%>
            <option value="人事部" selected>人事部</option>
		   <%}else{%>
            <option value="人事部" >人事部</option>
		   <%}%>  		 
           </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 出生日期: </div></td>
        <td><input name="birthday" type="text"  class="data" id="birthday" value="<%=employee.getBirthday()%>" size="10" maxlength="8" readonly="true">
          <input name="bir" type="button" id="bir" value="...">
      *</td>
        <td><div align="right">籍贯: </div></td>
        <td><input name="nativeplace" type="text"  class="data" id="nativeplace" size="10" maxlength="10" value="<%=employee.getNativePlace()%>">
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right">婚姻状况: </div></td>
        <td>      
		<select name="marriage" id="marriage">
          <%if (employee.getMarriage().equals("未婚")) {%>
            <option value="未婚" selected>未婚</option>
		   <%}else{%>
            <option value="未婚" >未婚</option>
		   <%}%>  		
		   
		   <%if (employee.getMarriage().equals("已婚")) {%>
            <option value="已婚" selected>已婚</option>
		   <%}else{%>
            <option value="已婚" >已婚</option>
		   <%}%>  		
		   
		   <%if (employee.getMarriage().equals("丧偶")) {%>
            <option value="丧偶" selected>丧偶</option>
		   <%}else{%>
            <option value="丧偶" >丧偶</option>
		   <%}%>  		
		   
		   <%if (employee.getMarriage().equals("离异")) {%>
            <option value="离异" selected>离异</option>
		   <%}else{%>
            <option value="离异" >离异</option>
		   <%}%>  				  
        </select>
          *</td>
        <td width="78"><div align="right">身份证号:</div></td>
        <td><input name="identityid" type="text"  class="data" id="identityid" size="18" maxlength="18" onKeyUp="value=value.replace(/[^\d]/g,'')" value="<%=employee.getIdentityID()%>">          
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 政治面貌: </div></td>
        <td height="33">
		<select name="politics" id="politics">
           <%if (employee.getPolitics().equals("党员")) {%>
            <option value="党员" selected>党员</option>
		   <%}else{%>
            <option value="党员" >党员</option>
		   <%}%>  				
		
		   <%if (employee.getPolitics().equals("团员")) {%>
            <option value="团员" selected>团员</option>
		   <%}else{%>
            <option value="团员" >团员</option>
		   <%}%>  
		   
		   <%if (employee.getPolitics().equals("群众")) {%>
            <option value="群众" selected>群众</option>
		   <%}else{%>
            <option value="群众" >群众</option>
		   <%}%>  
		   
		   <%if (employee.getPolitics().equals("其他")) {%>
            <option value="其他" selected>其他</option>
		   <%}else{%>
            <option value="其他" >其他</option>
		   <%}%>  			

          </select>
      * </td>
        <td><div align="right">民族: </div></td>
        <td><input name="folk" type="text"  class="data" id="folk" size="8" maxlength="4" value="<%=employee.getFolk()%>">
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right">学历: </div></td>
        <td>
		<select name="education" id="education">
		 <%if (employee.getEducation().equals("初中")) {%>
            <option value="初中" selected>初中</option>
		   <%}else{%>
            <option value="初中" >初中</option>
		   <%}%>  		
		  
		   <%if (employee.getEducation().equals("高中")) {%>
            <option value="高中" selected>高中</option>
		   <%}else{%>
            <option value="高中" >高中</option>
		   <%}%>  		
		   
		    <%if (employee.getEducation().equals("中专")) {%>
            <option value="中专" selected>中专</option>
		   <%}else{%>
            <option value="中专" >中专</option>
		   <%}%>  		
		   
		    <%if (employee.getEducation().equals("专科")) {%>
            <option value="专科" selected>专科</option>
		   <%}else{%>
            <option value="专科" >专科</option>
		   <%}%>  		
		   
		    <%if (employee.getEducation().equals("本科")) {%>
            <option value="本科" selected>本科</option>
		   <%}else{%>
            <option value="本科" >本科</option>
		   <%}%>  		
		   
		    <%if (employee.getEducation().equals("硕士")) {%>
            <option value="硕士" selected>硕士</option>
		   <%}else{%>
            <option value="硕士" >硕士</option>
		   <%}%>  		
		   
		   <%if (employee.getEducation().equals("博士")) {%>
            <option value="博士" selected>博士</option>
		   <%}else{%>
            <option value="博士" >博士</option>
		   <%}%>  		 
        </select>      
		</td>
        <td width="78"><div align="right">专业:</div></td>
        <td><input name="department" type="text"  class="data" id="department" size="20" maxlength="20" value="<%=employee.getDepartment()%>"></td>
      </tr>
      <tr>
        <td height="33"><div align="right">毕业日期:</div></td>
        <td><input name="graduatedate" type="text"  class="data" id="graduatedate" value="<%=employee.getGraduateDate()%>" size="10" maxlength="8" readonly="true">
            <input name="graduate" type="button" id="graduate" value="...">
      </td>
        <td><div align="right">毕业院校: </div></td>
        <td><input name="university" type="text"  class="data" id="university" size="30" maxlength="30" value="<%=employee.getUniversity()%>"></td>
      </tr>
      <tr>
        <td height="33"><div align="right">公积金帐号:</div></td>
        <td><input name="accumulateid" type="text"  class="data" id="accumulateid" size="15" maxlength="15" onkeyup="value=value.replace(/[^\d]/g,'')" value="<%=employee.getAccumulateID()%>">
          *</td>
        <td width="78"><div align="right">行政级别:</div></td>
        <td>
		<select name="administrationlevel" id="administrationlevel">
          <%if (employee.getAdministrationLevel().equals("科员")) {%>
            <option value="科员" selected>科员</option>
		   <%}else{%>
            <option value="科员" >科员</option>
		   <%}%>  		 
		   
		   <%if (employee.getAdministrationLevel().equals("副科级")) {%>
            <option value="副科级" selected>副科级</option>
		   <%}else{%>
            <option value="副科级" >副科级</option>
		   <%}%>  		 
		  
		  <%if (employee.getAdministrationLevel().equals("科级")) {%>
            <option value="科级" selected>科级</option>
		   <%}else{%>
            <option value="科级" >科级</option>
		   <%}%>  		 
		   
		   <%if (employee.getAdministrationLevel().equals("副处级")) {%>
            <option value="副处级" selected>副处级</option>
		   <%}else{%>
            <option value="副处级" >副处级</option>
		   <%}%>  		 
		   
		   <%if (employee.getAdministrationLevel().equals("处级")) {%>
            <option value="处级" selected>处级</option>
		   <%}else{%>
            <option value="处级" >处级</option>
		   <%}%>  		 
		   
		   <%if (employee.getAdministrationLevel().equals("副部级")) {%>
            <option value="副部级" selected>副部级</option>
		   <%}else{%>
            <option value="副部级" >副部级</option>
		   <%}%>  		 
		   
		   <%if (employee.getAdministrationLevel().equals("部级")) {%>
            <option value="部级" selected>部级</option>
		   <%}else{%>
            <option value="部级" >部级</option>
		   <%}%>  		 
		   
		   <%if (employee.getAdministrationLevel().equals("其他")) {%>
            <option value="其他" selected>其他</option>
		   <%}else{%>
            <option value="其他" >其他</option>
		   <%}%>  		 
        </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 职务:</div></td>
        <td>      
		<select name="duty" id="duty">
		  <%if (employee.getDuty().equals("工人")) {%>
            <option value="工人" selected>工人</option>
		   <%}else{%>
            <option value="工人" >工人</option>
		   <%}%> 
		  
		  <%if (employee.getDuty().equals("职员")) {%>
            <option value="职员" selected>职员</option>
		   <%}else{%>
            <option value="职员" >职员</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("领班")) {%>
            <option value="领班" selected>领班</option>
		   <%}else{%>
            <option value="领班" >领班</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("主管")) {%>
            <option value="主管" selected>主管</option>
		   <%}else{%>
            <option value="主管" >主管</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("副主任")) {%>
            <option value="副主任" selected>副主任</option>
		   <%}else{%>
            <option value="副主任" >副主任</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("主任")) {%>
            <option value="主任" selected>主任</option>
		   <%}else{%>
            <option value="主任" >主任</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("副经理")) {%>
            <option value="副经理" selected>副经理</option>
		   <%}else{%>
            <option value="副经理" >副经理</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("经理")) {%>
            <option value="经理" selected>经理</option>
		   <%}else{%>
            <option value="经理" >经理</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("总经理")) {%>
            <option value="总经理" selected>总经理</option>
		   <%}else{%>
            <option value="总经理" >总经理</option>
		   <%}%> 
		   
		   <%if (employee.getDuty().equals("其他")) {%>
            <option value="其他" selected>其他</option>
		   <%}else{%>
            <option value="其他" >其他</option>
		   <%}%> 
		   
        </select>
          *</td>
        <td><div align="right">职称: </div></td>
        <td>
		<select name="position" id="position">
		   <%if (employee.getPosition().equals("助理工程师")) {%>
            <option value="助理工程师" selected>助理工程师</option>
		   <%}else{%>
            <option value="助理工程师" >助理工程师</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("工程师")) {%>
            <option value="工程师" selected>工程师</option>
		   <%}else{%>
            <option value="工程师" >工程师</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("高级工程师")) {%>
            <option value="高级工程师" selected>高级工程师</option>
		   <%}else{%>
            <option value="高级工程师" >高级工程师</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("助理会计师")) {%>
            <option value="助理会计师" selected>助理会计师</option>
		   <%}else{%>
            <option value="助理会计师" >助理会计师</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("会计师")) {%>
            <option value="会计师" selected>会计师</option>
		   <%}else{%>
            <option value="会计师" >会计师</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("注册会计师")) {%>
            <option value="注册会计师" selected>注册会计师</option>
		   <%}else{%>
            <option value="注册会计师" >注册会计师</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("助理经济师")) {%>
            <option value="助理经济师" selected>助理经济师</option>
		   <%}else{%>
            <option value="助理经济师" >助理经济师</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("经济师")) {%>
            <option value="经济师" selected>经济师</option>
		   <%}else{%>
            <option value="经济师" >经济师</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("高级经济师")) {%>
            <option value="高级经济师" selected>高级经济师</option>
		   <%}else{%>
            <option value="高级经济师" >高级经济师</option>
		   <%}%> 
		   
		   <%if (employee.getPosition().equals("其他")) {%>
            <option value="其他" selected>其他</option>
		   <%}else{%>
            <option value="其他" >其他</option>
		   <%}%> 
         
        </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 外语语种: </div></td>
        <td height="33">
		<select name="foreignlanguage" id="foreignlanguage">
		   <%if (employee.getForeignLanguage().equals("英语")) {%>
            <option value="英语" selected>英语</option>
		   <%}else{%>
            <option value="英语" >英语</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("日语")) {%>
            <option value="日语" selected>日语</option>
		   <%}else{%>
            <option value="日语" >日语</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("德语")) {%>
            <option value="德语" selected>德语</option>
		   <%}else{%>
            <option value="德语" >德语</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("法语")) {%>
            <option value="法语" selected>法语</option>
		   <%}else{%>
            <option value="法语" >法语</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("俄语")) {%>
            <option value="俄语" selected>俄语</option>
		   <%}else{%>
            <option value="俄语" >俄语</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("阿拉伯语")) {%>
            <option value="阿拉伯语" selected>阿拉伯语</option>
		   <%}else{%>
            <option value="阿拉伯语" >阿拉伯语</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("西班牙语")) {%>
            <option value="西班牙语" selected>西班牙语</option>
		   <%}else{%>
            <option value="西班牙语" >西班牙语</option>
		   <%}%> 
		   
		   <%if (employee.getForeignLanguage().equals("其他")) {%>
            <option value="其他" selected>其他</option>
		   <%}else{%>
            <option value="其他" >其他</option>
		   <%}%> 
          </select>
      </td>
        <td width="78"><div align="right">外语水平:</div></td>
        <td>
		<select name="fllevel" id="fllevel">
		  <%if (employee.getFLLevel().equals("三级")) {%>
            <option value="三级" selected>三级</option>
		   <%}else{%>
            <option value="三级" >三级</option>
		   <%}%> 
		   
		   <%if (employee.getFLLevel().equals("四级")) {%>
            <option value="四级" selected>四级</option>
		   <%}else{%>
            <option value="四级" >四级</option>
		   <%}%> 
		   
		   <%if (employee.getFLLevel().equals("六级")) {%>
            <option value="六级" selected>六级</option>
		   <%}else{%>
            <option value="六级" >六级</option>
		   <%}%> 
		   
		   <%if (employee.getFLLevel().equals("八级")) {%>
            <option value="八级" selected>八级</option>
		   <%}else{%>
            <option value="八级" >八级</option>
		   <%}%> 
        </select></td>
      </tr>
      <tr>
        <td height="33"><div align="right">计算机水平: </div></td>
        <td height="33">      
		<select name="computerlevel" id="computerlevel">
		  <%if (employee.getComputerLevel().equals("了解")) {%>
            <option value="了解" selected>了解</option>
		   <%}else{%>
            <option value="了解" >了解</option>
		   <%}%> 
		   
		   <%if (employee.getComputerLevel().equals("熟悉")) {%>
            <option value="熟悉" selected>熟悉</option>
		   <%}else{%>
            <option value="熟悉" >熟悉</option>
		   <%}%> 
		   
		   <%if (employee.getComputerLevel().equals("精通")) {%>
            <option value="精通" selected>精通</option>
		   <%}else{%>
            <option value="精通" >精通</option>
		   <%}%> 
        </select></td>
        <td><div align="right">联系电话: </div></td>
        <td><input name="phone" type="text"  class="data" id="phone" size="13" maxlength="13" value="<%=employee.getPhone()%>"></td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 手机号码: </div></td>
        <td><input name="mobilephone" type="text"  class="data" id="mobilephone" size="11" maxlength="11" onkeyup="value=value.replace(/[^\d]/g,'')" value="<%=employee.getMobilePhone()%>">
        </td>
        <td width="78"><div align="right">家庭住址:</div></td>
        <td><input name="address" type="text"  class="data" id="address" size="30" maxlength="30" value="<%=employee.getAddress()%>"></td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 在职情况: </div></td>
        <td>
		<select name="incumbency" id="incumbency">
		  <%if (employee.getIncumbency().equals("熟悉")) {%>
            <option value="在职" selected>在职</option>
		   <%}else{%>
            <option value="在职" >在职</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbency().equals("离职")) {%>
            <option value="离职" selected>离职</option>
		   <%}else{%>
            <option value="离职" >离职</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbency().equals("退休")) {%>
            <option value="退休" selected>退休</option>
		   <%}else{%>
            <option value="退休" >退休</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbency().equals("待聘")) {%>
            <option value="待聘" selected>待聘</option>
		   <%}else{%>
            <option value="待聘" >待聘</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbency().equals("其他")) {%>
            <option value="其他" selected>其他</option>
		   <%}else{%>
            <option value="其他" >其他</option>
		   <%}%> 
        </select>
          *        </td>
        <td><div align="right">用工形式: </div></td>
        <td>
		<select name="incumbencytype" id="incumbencytype">
          <%if (employee.getIncumbencyType().equals("正式工")) {%>
            <option value="正式工" selected>正式工</option>
		   <%}else{%>
            <option value="正式工" >正式工</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbencyType().equals("合同工")) {%>
            <option value="合同工" selected>合同工</option>
		   <%}else{%>
            <option value="合同工" >合同工</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbencyType().equals("临时工")) {%>
            <option value="临时工" selected>临时工</option>
		   <%}else{%>
            <option value="临时工" >临时工</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbencyType().equals("见习生")) {%>
            <option value="见习生" selected>见习生</option>
		   <%}else{%>
            <option value="见习生" >见习生</option>
		   <%}%> 
		   
		   <%if (employee.getIncumbencyType().equals("其他")) {%>
            <option value="其他" selected>其他</option>
		   <%}else{%>
            <option value="其他" >其他</option>
		   <%}%> 
        </select>
          *</td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 个人简历: </div></td>
        <td colspan="3"><textarea name="resume" cols="60" rows="4" id="resume"><%=employee.getResume()%></textarea></td>
        </tr>
      <tr>
        <td height="49" colspan="4"><div align="center">
          <input type="submit" name="Submit" value="修改">
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
