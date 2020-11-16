<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey</title>
</head>
<body>
	<div>
		<form action="/result" method="POST">
			<label>Your Name: <input type="text" name="name"></label>
			<br>
			<label for="location">Dojo Location: </label>
				<select name="location" id="location">
					<option value="sanjose">San-Jose</option>
					<option value="burbank">Burbank</option>
					<option value="online">Online</option>
				</select>
				<br>
			<label for="language">Favorite Language</label>
				<select name="language" id="language">
					<option value="python">Python</option>
					<option value="java">Java</option>
					<option value="mern">Mern</option>
				</select>
				<br>
			<label for="comments">Comments (optional)</label>
			<br>
				<textarea name=comments rows="4"></textarea>
				<br>
			<button>Submit</button>
		</form>		
	</div>

</body>
</html>