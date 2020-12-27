<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<title>Events</title>
</head>
<body>
	<div class="container">
	<h1>Welcome ${ user.firstName }</h1>
	<a href="/logout">Logout</a>
	<div class="float float-left">
				<h3>Here are some events in your state:</h3>
				<table class="table table-dark table-hover">
					<thead>
						<tr>
							<th>Name</th>
							<th>Date</th>
							<th>City</th>
							<th>Host</th>
							<th>Action/Status</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${ usersStates }" var="event">
						<tr>
							<td><a href="/event/${ event.id }">${ event.name }</a></td>
							<td><fmt:formatDate value="${ event.date }" pattern="MMM dd, yyyy"/></td>
							<td>${ event.location }</td>
							<td>${ event.planner.firstName }</td>
							<td>
							<c:choose>
								<c:when test="${ event.planner.id == user.id }">
									<a href="/event/${ event.id }/edit">Edit</a> |
									<a href="/delete/${ event.id }">Delete</a>
								</c:when>
								<c:otherwise>
									<c:choose>
										<c:when test="${ event.attendee.contains(user) }">
											<span>Joining <a href="/cancel/${ event.id }">Cancel</a></span>
										</c:when>
										<c:otherwise>
											<a href="/join/${ event.id }">Join</a>								
										</c:otherwise>
									
									</c:choose>
								</c:otherwise>
							</c:choose>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				<h3>Here are some events in other states:</h3>
				<table class="table table-dark table-hover">
					<thead>
						<tr>
							<th>Name</th>
							<th>Date</th>
							<th>City</th>
							<th>State</th>
							<th>Host</th>
							<th>Action/Status</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${ otherStates }" var="event">
						<tr>
							<td><a href="/event/${ event.id }">${ event.name }</a></td>
							<td>${ event.date }</td>
							<td>${ event.location }</td>
							<td>${ event.state }</td>
							<td>${ event.planner.firstName }</td>
							<td>
							<c:choose>
								<c:when test="${ event.planner.id == user.id }">
									<a href="/event/${ event.id }/edit">Edit</a> |
									<a href="/delete/${ event.id }">Delete</a>
								</c:when>
								<c:otherwise>
									<c:choose>
										<c:when test="${ event.attendee.contains(user) }">
											<span>Joining <a href="/cancel/${ event.id }">Cancel</a></span>
										</c:when>
										<c:otherwise>
											<a href="/join/${ event.id }">Join</a>								
										</c:otherwise>
									
									</c:choose>
								</c:otherwise>
							</c:choose>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
	<form:form  class="user-form" action="/newevent" method="post" modelAttribute="event">
	<form:hidden value="${ userId }" path="planner"/>
	<div class="form-group">
		<form:label path="name">Event Name</form:label>
		<form:errors path="name"></form:errors>
		<form:input class="form-control" path="name"/>
		</div>
		<div class="form-group">
		<form:label path="date">Date</form:label>
		<form:errors path="date"></form:errors>
		<form:input type="date" class="form-control" path="date"/>
		</div>
		<div class="form-group">
		<form:label path="location">Location</form:label>
		<form:errors path="location"></form:errors>
		<form:input class="form-control" path="location"/>
		</div>
		<div class="form-group">
		<form:label path="state">State</form:label>
		<form:errors path="state"></form:errors>
		<form:select path="state">
		<c:forEach items="${ states }" var="s">
			<option value="${ s }">${ s }</option>
		</c:forEach>
		</form:select>
		</div>
		<button class="btn btn-primary">Create Event</button>
		</form:form>
		
	</div>

</body>
</html>