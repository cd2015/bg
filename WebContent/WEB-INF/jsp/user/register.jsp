<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>Register forex beaural</h1>
	<div align="center">
		<form:form modelAttribute="command" method="POST">
			Name*: <form:input path="name" /><form:errors  path="name" /><br />
			Location*: <form:input path="physicalAddress" /><form:errors  path="physicalAddress" /><br />
			P.O Box: <form:input path="postalAddress" /><form:errors  path="postalAddress" /><br />
			Telephone*: <form:input path="phone" /><form:errors  path="phone" /><br />
			Slogan: <form:input path="slogan" /><form:errors  path="slogan" /><br />
			Email*: <form:input path="email" /><form:errors  path="email" /><br />
			Password*: <form:input path="password" type="password"/><form:errors  path="password" /><br />
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			<input type="submit" value="Register" />
		</form:form>
	</div>
</body>
</html>