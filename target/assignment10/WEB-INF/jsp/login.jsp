<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<spring:message code="welcome.text" />
		<form:form commandName="loginDto">
			<form:input path="userName" />
			<form:input path="password" />
			<input type="submit" value="Login">
		</form:form>
	</h1>
</body>
</html>