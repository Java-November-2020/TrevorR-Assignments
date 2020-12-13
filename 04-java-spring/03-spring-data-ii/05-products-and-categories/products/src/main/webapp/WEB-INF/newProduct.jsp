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
<title>New Product</title>
</head>
<body>
	<div class="container">
		<h1>New Product</h1>
		<div class="form-group">
			<form:form action="/products" method="POST" modelAttribute="products">
				<form:label path="name">Name</form:label>
				<form:errors path="name"/>
				<form:input class="form-control" path="name"/>
				<form:label path="description">Description</form:label>
				<form:errors path="description"/>
				<form:input class="form-control" path="description"/>
				<form:label path="price">Price</form:label>
				<form:errors path="price"/>
				<form:input class="form-control" path="price"/>
				<button>Create</button>	
			</form:form>
		</div>
	</div>
</body>
</html>