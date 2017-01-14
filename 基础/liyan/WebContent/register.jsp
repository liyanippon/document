<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:actionerror/>

<h3>Register for a prize by completing this form.</h3>

<s:form action="register" method="post">

 	  <s:textfield name="personBean.firstName" label="First name" />
 	  <s:textfield name="personBean.lastName" label="Last name" />
 	  <s:textfield name="personBean.email"  label ="Email"/>  
 	  <s:textfield name="personBean.age"  label="Age"  />
 	  
   	  <s:submit value="Register"></s:submit>
   	  
</s:form>	
 
</body>
</html>