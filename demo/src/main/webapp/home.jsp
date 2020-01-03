<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add">
	<input name="name" type="text" placeholder="name">
	<input name="age" placeholder="age" type="text">
	<input type="submit" >
</form>

Get all List
<form action="getList">
<input type="submit" value="Get List">
</form>

Update Age
<form action="update">
<input type="text" placeholder="Enter name for age updation" name="name">
<input type="number" placeholder="Age to be updated" name="age">
<input type="submit">
</form>
</body>
</html>