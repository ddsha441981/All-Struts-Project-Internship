<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"  %>

  <head>
  <s:head theme="ajax" debug="true"/>
  </head>
  
  <body>

  <s:form action="resultAction">
  
 <s:datetimepicker label="Select From" name="toDate" displayFormat="MM-dd-yy" required="true" />
 <s:datetimepicker label="Select To" name="fromDate" displayFormat="MM-dd-yy" required="true" />
 <s:datetimepicker label="Select Other" name="otherDate" displayFormat="MM-dd-yy" required="true" />
 
 <s:submit value="Click" align="center" /> 
 
 </s:form>

  </body>
