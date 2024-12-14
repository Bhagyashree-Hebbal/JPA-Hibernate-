<%@page isELIgnored = "false"%>
<html>
<head>
<title>SignIn Page</title>
</head>
<body>
<h2>Your in SignIn Page</h2>
<form action="signin" method="post">
<pre>
<input type="email" name="email" placeholder="Enter the Email">
<input type="password" name="password" placeholder="Enter the Password">

<input type="submit" value="SignIn">
</pre>
</form>
${msg}
</body>
</html>
