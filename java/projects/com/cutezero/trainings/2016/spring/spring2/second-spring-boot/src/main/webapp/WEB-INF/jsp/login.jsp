<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<h3>Login Page</h3>
	<hr>
	<form action="login" method="post">
<!-- 		Default param name expected at spring login handler 
				Username : <input type="text" name="j_username">
				Password : <input type="password" name="j_password">
 -->
		Username : <input type="text" name="username"> Password : <input
			type="password" name="password">
			<input type="submit" value="Login">
	</form>
</body>
</html>