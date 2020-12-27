<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<title>Register User</title>
</head>
<body>
	<div class="container">
	<form:form  class="user-form" action="/register" method="post" modelAttribute="user">
	 <h3>Register New User</h3>
	 <div class="form-group">
		<form:label path="firstName">First Name</form:label>
		<form:errors path="firstName"></form:errors>
		<form:input class="form-control" path="firstName"/>
		</div>
		<div class="form-group">
		<form:label path="lastName">Last Name</form:label>
		<form:errors path="lastName"></form:errors>
		<form:input class="form-control" path="lastName"/>
		</div>
		<div class="form-group">
		<form:label path="location">Location</form:label>
		<form:errors path="location"></form:errors>
		<form:input class="form-control" path="location"/>
		</div>
		<div class="form-group">
		<form:label path="state">Password</form:label>
		<form:errors path="state"></form:errors>
		<form:select path="state">
		<c:forEach items="${ states }" var="s">
			<option value="${ s }">${ s }</option>
		</c:forEach>
		</form:select>
		</div>
		<div class="form-group">
		<form:label path="email">Email</form:label>
		<form:errors path="email"></form:errors>
		<form:input class="form-control" path="email"/>
		</div>
		<div class="form-group">
		<form:label path="password">Password</form:label>
		<form:errors path="password"></form:errors>
		<form:input type="password" class="form-control" path="password"/>
		</div>
		<div class="form-group">
		<form:label path="conPassword">Confirm Password</form:label>
		<form:errors path="conPassword"></form:errors>
		<form:input type="password" class="form-control" path="conPassword"/>
		</div>
		<button class="btn btn-primary">Create User</button>
	</form:form>
	<form class="user-form" action="/login" method="POST">
	<h3>Login</h3>
	<p>${ loginError }</p>
	<div class="form-goup">
	<label for="lemail">Email</label>
	<input type="text" name="lemail" class="form-control">
	<label for="lpassword">Password</label>
	<input type="password" name="lpassword" class="form-control">
	</div>
	<button class="btn btn-primary">Login</button>
	</form>
	</div>
</body>
</html>