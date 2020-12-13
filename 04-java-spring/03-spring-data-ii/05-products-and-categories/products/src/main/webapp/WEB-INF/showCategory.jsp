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
<title>Add Product</title>
</head>
<body>
	<div class="container">
		<h1>${ category.name }</h1>
		<h3>Products</h3>
		<ul>
		<c:forEach items="${ category.products }" var="p">
			<li>${ p.name }</li>			
		</c:forEach>
		</ul>
		<form:form action="/addProduct" method="POST" modelAttribute="association">
        <form:input type="hidden" path="category" value="${ category.id }"/>
        <div class="form-group">
        	<form:label path="product">Categories</form:label>
		    <form:errors path="product"/>
		    <form:select class="form-control" path="product">
		    	<c:forEach items="${ noProduct }" var="noP">
		        	<option value=${ noP.id }>${ noP.name }</option>
		        </c:forEach>
		    </form:select>
		 </div>
		 	<button class="btn btn-primary">Add</button>
		</form:form>
	</div>
</body>
</html>