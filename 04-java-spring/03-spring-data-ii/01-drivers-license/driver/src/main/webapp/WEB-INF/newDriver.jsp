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
	<form:form method="POST" action="/driver" modelAttribute="driver">
    <form:label path="firstName">First Name
    <form:errors path="firstName"/>
    <form:input path="firstName"/></form:label>
    
    <form:label path="lastName">Last Name
    <form:errors path="lastName"/>
    <form:input path="LastName"/></form:label>    
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>