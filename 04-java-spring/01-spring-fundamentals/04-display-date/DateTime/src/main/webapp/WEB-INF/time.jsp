<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}css/style.css" />
<script src="${pageContext.request.contextPath}js/time.js"></script>
<title>Current Time</title>
</head>
<body>
	<h1 id=time>${ timeFormat }</h1>
</body>
</html>