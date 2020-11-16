<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter the code</title>
</head>
<body>
	<h1 style ="color:red">${ error }</h1>	
	<h1>What is the code?</h1>
	<form method="POST" action="/login" >
		<input type="text" name="code">
		<br>
	    <button>Try Code</button>
	</form>
</body>
</html>