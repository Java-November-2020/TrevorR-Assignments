<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Event</title>
</head>
<body>
<div class="container">
<h1>${ event.name }</h1>
<a href="/logout">Logout</a>
<a href="/dashboard">Dashboard</a>
<p>Host: ${ event.planner.firstName }${ event.planner.lastName }</p>
<p>Date: <fmt:formatDate value="${ event.date }" pattern="MMM dd, yyyy"/></p>
<p>Location: ${ event.location }</p>
<p>People Attending ${ event.attendee.size() }</p>
<table>
<thead>
<tr>
<td>Name</td>
<td>Location</td>
</tr>
</thead>
<tbody>
	<c:forEach items="${ event.attendee }" var="att">
		<tr>
		<td>${ att.firstName } ${ att.lastName }</td>
		<td>${ att.location }</td>
		</tr>
	</c:forEach>
</tbody>

</table>

</div>

</body>
</html>