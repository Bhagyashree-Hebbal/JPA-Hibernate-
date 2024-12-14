<%@page isELIgnored = "false"%>
<html>
<head>
<title>SignUp Page</title>
</head>
<body>
<h2>Your in SignUp Page </h2>
<form action="signup" method="post">
<pre>
<input type="text" name="name" placeholder="Enter the Name">
<input type="email" name="email" placeholder="Enter the Email">
<input type="number" name="age" placeholder="Enter the Age">
<input type="number" name="phoneNo" placeholder="Enter the PhoneNo">
<input type="password" name="password" placeholder="Enter the Password">
<input type="password" name="confirmPassword" placeholder="Enter the ConfirmPassword">

<input type="submit" value="SignUp">
</pre>
</form>
<span>${msg}</span>
</body>
</html>
