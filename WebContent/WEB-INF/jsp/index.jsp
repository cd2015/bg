<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1><fmt:message key="app" /></h1>
<div>
	<c:choose>
		<c:when test="${pageContext.request.remoteUser == null}">
			<a href="<c:url value="/login" />">Login</a> |
			<a href="<c:url value="/register" />">Register</a>
		</c:when>
		<c:otherwise>
			   Welcome : <a href="<c:url value="/user" />" >${pageContext.request.remoteUser} </a>
		           | <a href="<c:url value="/logout" />" > Logout</a> 
		</c:otherwise>
	</c:choose>
</div>
</body>
</html>