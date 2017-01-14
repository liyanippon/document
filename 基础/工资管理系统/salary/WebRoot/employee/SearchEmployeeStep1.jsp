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
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="120" valign="top" background="../images/in_left_bg.gif"><%@ include file="EmployeeLeft.jsp"%></td>
    <td width="660" align="center">
	<p align="center" class="title1">查询人员档案</p>
	 <form name="form1" method="post" action="SearchEmployeeStep2.jsp">
	<table width="640" height="282" border="1" align="center" cellpadding="3" cellspacing="0" bordercolor="#CCCCCC">
      <tr>
        <td width="113" height="33"><div align="right"> 员工编号:</div></td>
        <td width="164"><input name="employeeid" type="text"  class="data" id="employeeid" size="6" maxlength="6" onkeyup="value=value.replace(/[^\d]/g,'')">      </td>
        <td width="98" height="33"><div align="right">姓名:</div></td>
        <td width="231"><input name="username" type="text"  class="data" id="username" size="8" maxlength="4" >
        </td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 性别: </div></td>
        <td><select name="sex" id="sex">
            <option value="" selected>所有</option>
            <option value="男">男</option>
            <option value="女">女</option>
          </select>
        </td>
        <td><div align="right">所属部门:</div></td>
        <td><select name="branch" id="branch">
            <option value="" selected>所有</option>
            <option value="总经理室">总经理室</option>
            <option value="副总经理室">副总经理室</option>
            <option value="销售部">销售部</option>
            <option value="生产部">生产部</option>
            <option value="研发部">研发部</option>
            <option value="采购部">采购部</option>
            <option value="财务部">财务部</option>
            <option value="人事部">人事部</option>
          </select>
        </td>
      </tr>
      <tr>
        <td><div align="right">籍贯: </div></td>
        <td><input name="nativeplace" type="text"  class="data" id="nativeplace" size="10" maxlength="10" >
        </td>
        <td height="33"><div align="right">婚姻状况: </div></td>
        <td><select name="marriage" id="marriage">
            <option value="" selected>所有</option>
            <option value="未婚">未婚</option>
            <option value="已婚">已婚</option>
            <option value="丧偶">丧偶</option>
            <option value="离异">离异</option>
          </select>
        </td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 政治面貌: </div></td>
        <td height="33"><select name="politics" id="politics">
            <option value="" selected>所有</option>
            <option value="党员">党员</option>
            <option value="团员">团员</option>
            <option value="群众">群众</option>
            <option value="其他">其他</option>
          </select>
        </td>
        <td height="33"><div align="right">民族: </div></td>
        <td><input name="folk" type="text"  class="data" id="folk" size="8" maxlength="4" ></td>
      </tr>
      <tr>
        <td height="33"><div align="right">学历: </div></td>
        <td><select name="education" id="education">
            <option value="" selected>所有</option>
            <option value="初中">初中</option>
            <option value="高中">高中</option>
            <option value="中专">中专</option>
            <option value="专科">专科</option>
            <option value="本科">本科</option>
            <option value="硕士">硕士</option>
            <option value="博士">博士</option>
          </select>
        </td>
        <td><div align="right">行政级别:</div></td>
        <td><select name="administrationlevel" id="administrationlevel">
            <option value="" selected>所有</option>
            <option value="科员">科员</option>
            <option value="副科级">副科级</option>
            <option value="科级">科级</option>
            <option value="副处级">副处级</option>
            <option value="处级">处级</option>
            <option value="副部级">副部级</option>
            <option value="部级">部级</option>
            <option value="其他">其他</option>
        </select></td>
      </tr>
      <tr>
        <td height="33"><div align="right"> 职务:</div></td>
        <td><select name="duty" id="duty">
            <option value="" selected>所有</option>
            <option value="工人">工人</option>
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
        </td>
        <td><div align="right">职称: </div></td>
        <td><select name="position" id="position">
            <option value="" selected>所有</option>
            <option value="助理工程师">助理工程师</option>
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
        <td height="33"><div align="right"> 在职情况: </div></td>
        <td><select name="incumbency" id="incumbency">
            <option value="" selected>所有</option>
            <option value="在职">在职</option>
            <option value="离职">离职</option>
            <option value="退休">退休</option>
            <option value="待聘">待聘</option>
            <option value="其他">其他</option>
          </select>
  * </td>
        <td><div align="right">用工形式: </div></td>
        <td><select name="incumbencytype" id="incumbencytype">
            <option value="" selected>所有</option>
            <option value="正式工">正式工</option>
            <option value="合同工">合同工</option>
            <option value="临时工">临时工</option>
            <option value="见习生">见习生</option>
            <option value="其他">其他</option>
          </select>
  *</td>
      </tr>
      <tr>
        <td height="49" colspan="4"><div align="center">
          <input type="submit" name="Submit" value="查询">
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
