<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="/license" modelAttribute="license">
    <form:label path="driver">Driver</form:label>
		        <form:errors path="driver"/>
		        <form:select path="driver">
		        <c:forEach items="${ drivers }" var="d">
		        	<form:option value="${ d.id }">${ d.firstName } ${ d.lastName }</form:option>
		        </c:forEach>
		        </form:select>
    
    <form:label path="state">State
    <form:errors path="state"/>
    <form:input path="state"/></form:label>
    
  
    
    <form:label path="expirationDate">Expiration Date
    <form:errors path="expirationDate"/>     
    <form:input  type= "date" path="expirationDate"/></form:label>
    
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>