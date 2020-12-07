<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Title</title>
</head>
<body>
 <a href="/dashboard">Dashboard</a>
<form:form method="POST" action="/songs" modelAttribute="song">
    <form:label path="title">Title
    <form:errors path="title"/>
    <form:input path="title"/></form:label>
    
    <form:label path="artist">Artist
    <form:errors path="artist"/>
    <form:input path="artist"/></form:label>
    
  
    
    <form:label path="rating">Rating (1-10)
    <form:errors path="rating"/>     
    <form:input  type= "number" path="rating"/></form:label>
    
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>