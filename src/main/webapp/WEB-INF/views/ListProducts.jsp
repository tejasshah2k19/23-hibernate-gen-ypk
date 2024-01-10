<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Products</title>
</head>
<body>
	<h2>List Products</h2>

	<table border="1">
		<tr>
			<th>ProductId</th>
			<th>ProductName</th>
			<th>Price</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${list}" var="p">
			<tr>
				<td>${p.productId}</td><td>${p.name }</td> <td> ${p.price }</td>
		<td>Edit | <a href="deleteproduct?productId=${p.productId}">Delete</a> 
			|
			
			<a href="viewproduct?productId=${p.productId}">View</a>
		</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>