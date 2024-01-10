<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<h2>New Product</h2>

	<form action="saveproduct" method="post">
	Name : <input type="text" name="name"/><br><Br>
	Price : <input type="text" name="price"/><br><Br> 
	Qty : <input type="text" name="qty"/><br><br> 
	
	<input type="submit" value="Save Product" /> 
	
	</form>
	
	<br><Br>
	<a href="listproducts">List Products</a>
</body>
</html>