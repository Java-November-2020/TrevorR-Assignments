<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
	<h1>Submitted Info</h1>
	<p>Name: ${ model.getName() }</p>
	<p>Dojo Location: ${ model.getLocation() }</p>
	<p>Favorite Language: ${ model.getLanguage() }</p>
	<p>Comment: ${ model.getComments() }</p>
</body>
</html>