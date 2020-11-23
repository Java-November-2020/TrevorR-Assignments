<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Creator</th>
				<th>Version</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ language }" var="lang">
				<tr>
					<td><a href="languages/${ lang.id }">${ lang.name }</a></td>
					<td>${ lang.creator }</td>
					<td>${ lang.version }</td>
					<td>
						<a href="languages/${ lang.id }/edit">Edit</a>
						<form  action="/${lang.id}" method="post">
						    <input type="hidden" name="_method" value="delete">
						    <input class="btn btn-danger" type="submit" value="Delete">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<h1>Create Language</h1>
		<form:form action="/languages" method="post">
			<label for="name">Name</label>
			<input type="text" name="name">
			<label for="creator">Creator</label>
			<input type="text" name="creator">
			<label for="version">Version</label>
			<input type="text" name="version">
			<button>New Language</button>
		</form:form>        	
</body>