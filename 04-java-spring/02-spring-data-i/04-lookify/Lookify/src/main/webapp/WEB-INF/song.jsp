<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Song Info </title>
</head>
<body>
	<a href="/dashboard">dashboard</a>
	<h3>Title: ${ song.title }</h3>
	<h3>Artist: ${ song.artist }</h3>
	<h3>Rating: ${ song.rating }</h3>
	<a class="btn btn-danger" href="/delete/${ song.id }">Delete</a>

</body>
</html>