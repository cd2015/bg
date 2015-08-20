<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1><fmt:message key="app" /></h1>

	<div id="login" align="center">
		<form action="<c:url value="/login"/>" method="POST">
			<c:if test="${param.error != null}">        
		        <div class="text-danger">Invalid email or password.</div>
		    </c:if>
		    <c:if test="${param.logout != null}">       
		        <div class="text-warning">You have been logged out.</div>
		    </c:if>
		    
			Email: <input type="text" name="email" /><br/>
			Password: <input type="password" name="password" /><br/>
			
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			<input type="submit" value="Login" />
		</form>
	</div>
</body>
</html>