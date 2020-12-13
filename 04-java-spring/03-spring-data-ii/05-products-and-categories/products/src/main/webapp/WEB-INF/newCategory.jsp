<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<title>New Category</title>
</head>
<body>
	<div class="container">
		<h1>New Category</h1>
		<div class="form-group">
			<form:form action="/categories" method="POST" modelAttribute="categories">
				<form:label path="name">Name</form:label>
				<form:errors path="name"/>
				<form:input class="form-control" path="name"/>
				<button>Create</button>	
			</form:form>
		</div>
	</div>

</body>
</html>