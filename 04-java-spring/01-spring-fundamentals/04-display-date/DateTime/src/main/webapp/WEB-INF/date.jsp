<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}css/style.css" />
<script src="${pageContext.request.contextPath}js/date.js"></script>
<title>Current Date</title>
</head>
<body>
 	<h1 style="color:blue" id=date>${ dateFormat }</h1>
</body>
</html>