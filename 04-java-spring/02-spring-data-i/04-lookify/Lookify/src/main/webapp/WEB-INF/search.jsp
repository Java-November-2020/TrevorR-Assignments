<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>
<body>
	<h1>Searching for ${ artist }</h1>
	<a href="/dashboard">dashboard</a>
		<form action="/songs/search">
				<input type="text" name="artist"/>
				<button >Search More Artists</button>
			</form>
		<table >
			<thead>
				<tr>
					<th>Title</th>
					<th>Artist</th>
					<th>Rating</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ song }" var="song">
				<tr>
					<td><a href="/songs/${ song.id }">${ song.title }</a></td>
					<td>${ song.artist }</td>
					<td>${ song.rating }</td>
					<td><a class="btn btn-danger" href="/delete/${ song.id }">Delete</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>

</body>
</html>