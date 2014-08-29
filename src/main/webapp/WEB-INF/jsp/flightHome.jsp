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
	<form:form commandName="flightSearchDto">
		<form:input path="arrLoc" />
		<form:errors path="arrLoc" />
		<form:input path="depLoc" />
		<form:errors path="depLoc" />
		<form:input path="flightDate" />
		<form:errors path="flightDate" />
		<form:input path="flightClass" />
		<form:errors path="flightClass" />
		<form:select path="outputPreference">
			<form:option value="Fare" />
			<form:option value="Duration>" />
		</form:select>
		<form:errors path="outputPreference"/>
		<input type="submit" value="Login">
	</form:form>

</body>
</html>