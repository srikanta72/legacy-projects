<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Computer Details Submission page</h2>
<form action="ComputerDetailsSubmitServlet" method="post">
		Name: 
		<input type="text" name="name">
		<br>
		Price:
		<input type="text" name="price">
		<br>
		Processor:
		<input type="text" name="processor">
		<br>
		RAM:
		<input type="text" name="ram">
		<br>
		HDD:
		<input type="text" name="hdd">
		<br>
		<input type="submit" value="Submit">
		<br>
	</form>
</body>
</html>