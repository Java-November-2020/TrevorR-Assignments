<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
	<h1>Question Dashboard</h1>
	<table>
		<thead>
			<tr>
				<th>Questions</th>
				<th>Tags</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ questions }" var="q">
				<tr>
					<td><a href="/questions/${ q.id }">${ q.question }</a></td>
					<td><c:forEach items="${ q.tags }" var="tag">
						<span>${ tag.subject }</span>
					</c:forEach></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/questions/new">Ask Question</a>
</body>
</html>