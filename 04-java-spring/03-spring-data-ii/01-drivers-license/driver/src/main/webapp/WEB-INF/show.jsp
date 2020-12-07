<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Drivers Information</title>
</head>
<body>
	<h1>${ driver.firstName }  ${ driver.lastName }</h1>
	<p>License Number ${ driver.license.numberToString() }</p>
	<p>State ${ driver.license.state }</p>
	<p>Expiration Date ${ driver.license.getExpirationDateFormatted() }</p>
</body>
</html>