<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JPA page</title>
</head>
<body>
	<h1>JPA operation</h1>

	<form action="save" method="post">
		<pre>
        <input type="text" name="placeName" placeholder="enter the place name">
        <input type="text" name="pinCode" placeholder="enter the pin code">

        <input type="submit" value="Submit">
        </pre>
	</form>
</body>
</html>