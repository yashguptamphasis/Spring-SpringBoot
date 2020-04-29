<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo!!</title>
</head>
<body>
<h1 color="red">From Jsp ${Error}</h1>
<h1 color="Green"> ${login}</h1>
<br>
<form method="post" action="login">
	Name : <input type="text" name="name">
	Password : <input type="text" name="password">
	<input type="submit">
	
</form>
<br>
<br>
<form method="post" action="create">
	To Create Account<input type="submit">
	
</form>


</body>
</html>