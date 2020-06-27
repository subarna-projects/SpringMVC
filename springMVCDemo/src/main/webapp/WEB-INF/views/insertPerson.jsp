<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="person/savePerson" method="POST" modelAttribute="person">
	<input type="text" name="firstName">
		FirstName:<br>
		<input type="text" name="lastName">
		LastName:<br>
		<input type="text" name="phnmbr">
		PhoneNumber:<br>
		<input type="number" name="age">
		 Age:<br>
		<input type="submit">
	</form:form>
</body>
</html>