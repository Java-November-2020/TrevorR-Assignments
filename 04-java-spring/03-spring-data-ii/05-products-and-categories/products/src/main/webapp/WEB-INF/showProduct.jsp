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
<title>Add Category</title>
</head>
<body>
	<div class="container">
		<h1>${ product.name }</h1>
		<p>${ product.description }</p>
		<h3>Categories</h3>
		<ul>
			<c:forEach items="${ product.categories }" var="c">
				<li>${ c.name }</li>			
			</c:forEach>
		</ul>
		<form:form action="/addCategory" method="POST" modelAttribute="association">
        <form:input type="hidden" path="product" value="${ product.id }"/>
        <div class="form-group">
			<form:label path="category">Categories</form:label>
		    <form:errors path="category"/>
		    <form:select class="form-control" path="category">
		        <c:forEach items="${ noCategory }" var="noC">
		        	<option value=${ noC.id }>${ noC.name }</option>
		        </c:forEach>
		    </form:select>
		</div>
		    <button class="btn btn-primary">Add</button>
		</form:form>
	</div>
</body>
</html>