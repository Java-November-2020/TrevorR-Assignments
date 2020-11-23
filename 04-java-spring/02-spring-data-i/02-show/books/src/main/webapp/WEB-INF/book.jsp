<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book one</title>
</head>
<body>
<h1>${book.title}</h1>
<p>Description: ${book.description}</p>
<p>Language: ${book.language}</p>
<p>Number of pages: ${book.numberOfPages}</p>
<a href="/books/${book.id}/edit">Edit Book</a>
<form action="/books/${book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>

</body>
</html>