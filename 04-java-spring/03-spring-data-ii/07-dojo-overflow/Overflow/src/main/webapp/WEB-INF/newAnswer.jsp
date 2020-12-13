<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Answer Question</title>
</head>
<body>
	<h1>${ question.question }</h1>
		<ul>
			<c:forEach items="${ tags }" var="t">
				<li>${ t.subject }</li>
			</c:forEach>
		</ul>
	<table>
		<thead>
			<tr>
				<th>Answers</th>
			</tr>
		</thead>
		<tbody>
				<tr>
					<td>
					<c:forEach items="${ answers }" var="a">
					<span>${ a.answer }</span>
					</c:forEach>
					</td>
				</tr>
		</tbody>
	</table>
	<form:form action="/answer" method="POST" modelAttribute="a">
	<form:label path="answer">Answer</form:label>
	<form:errors path="answer"></form:errors>
	<form:textarea path="answer"/>
	 <form:hidden path="question" value="${ question.id }"/>
	<button>Add</button>
	</form:form>
</body>
</html>