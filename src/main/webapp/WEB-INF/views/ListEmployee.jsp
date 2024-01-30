<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Employees</title>
</head>
<body>
	<h2>List Employees</h2>

	<table border="1">
		<tr>
			<th>EmployeeId</th>
			<th>Name</th>
			<th>City</th>
			<Th>Job</Th>
			<th>Action</th>
		</tr>
		<c:forEach items="${employees}" var="e">
			<tr>
				<td>${e.employeeId}</td>
				<td>${e.name }</td>
				<td> ${e.city }</td>
				<td>${e.jobType.jobTypeName}</td>
				<td>Edit | <a>Delete</a> </td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>