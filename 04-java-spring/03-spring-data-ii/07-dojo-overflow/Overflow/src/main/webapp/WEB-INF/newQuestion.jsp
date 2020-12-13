<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ask a Question</title>
</head>
<body>
	<h1>What is your question?</h1>
	<form:form action="/question" method="POST" modelAttribute="newQuestion">
	<form:label path="question">Question</form:label>
	<form:errors path="question"></form:errors>
	<form:textarea path="question"/>
	<form:label path="tags">Tags</form:label>
	<form:errors path="tags"></form:errors>
	<form:input path="tags"/>
	<button>Create</button>
	</form:form>
	

</body>
</html>