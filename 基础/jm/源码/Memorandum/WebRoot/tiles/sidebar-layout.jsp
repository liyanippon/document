<%@ page language="java" pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<table >
   <tr>
      <%-- Sidebar top component --%>
       <tiles:insert attribute="top"/>
   </tr>
   <tr>
      <%-- Sidebar bottom component --%>
       <tiles:insert attribute="bottom"/>
   </tr>
</table>