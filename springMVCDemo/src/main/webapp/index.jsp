<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   <%@include file="WEB-INF/views/insertPerson.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>My Spring Project</h2>

<form:form action="person/listPerson" method="GET">
<input type="submit" >
</form:form>
</body>
</html>