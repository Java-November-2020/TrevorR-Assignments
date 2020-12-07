<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Top Ten Songs</title>
</head>
<body>
<a href="/dashboard">dashboard</a>
<h3>Top Ten Songs</h3>
<table >
	<tbody>
		<c:forEach items="${ song }" var="song">
			<tr>
				<td>${ song.rating }</td>
				<td><a href="/songs/${ song.id }">${ song.title }</a></td>
				<td>${ song.artist }</td>
				<td><a class="btn btn-danger" href="/delete/${ song.id }">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
</body>
</html>