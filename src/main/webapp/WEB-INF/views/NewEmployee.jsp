<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<form action="/employee/save" method="post">
		Name : <input type="text" name="name" /><Br> <br> City : <input
			type="text" name="city" /><br> <Br> 
			
			
	JobType : <select name="jobType">

			<c:forEach items="${jobs}" var="j">
				<option value="${j.jobTypeId}">${j.jobTypeName}</option>
			</c:forEach>
			
		</select> 
		
		<br> <br> <input type="submit" value="Save Employee" />
	</form>
</body>
</html>