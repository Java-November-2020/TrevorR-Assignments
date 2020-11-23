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
		<h1>Edit Language</h1>
		<h1>Create Language</h1>
		<form action="/${id}/edit" method="post">
			<label for="name">Name</label>
			<input type="text" name="name">
			<label for="creator">Creator</label>
			<input type="text" name="creator">
			<label for="version">Version</label>
			<input type="text" name="version">
			<button>edit</button>
		</form>  
</body>
</html>