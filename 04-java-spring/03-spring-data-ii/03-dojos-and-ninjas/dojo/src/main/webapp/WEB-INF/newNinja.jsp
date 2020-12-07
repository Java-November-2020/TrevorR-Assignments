<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form method="POST" action="/ninjas" modelAttribute="ninja">
    <form:label path="dojo">Dojo</form:label>
	<form:errors path="dojo"/>
	<form:select path="dojo">
		<c:forEach items="${ dojos }" var="d">
			<form:option value="${ d.id }">${ d.name }</form:option>
		</c:forEach>
	</form:select>
    
    <form:label path="firstName">First Name
    <form:errors path="firstName"/>
    <form:input path="firstName"/></form:label>
    
    <form:label path="lastName">Last Name
    <form:errors path="lastName"/>     
    <form:input path="lastName"/></form:label>
    
    <form:label path="age">Age
    <form:errors path="age"/>     
    <form:input path="age"/></form:label>
    
    <input type="submit" value="Create"/>
</form:form>
	

</body>
</html>