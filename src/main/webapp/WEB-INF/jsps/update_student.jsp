<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create student view</title>
</head>
<body>
<h1>  create student view</h1>
<form action="savestudent" method="post">


<table>
<tr>
<td>FirstName</td>
<td><input type="text" name="firstname"/></td>
</tr>
		<tr>
<td>LastName</td>
<td><input type="text" name="lastname"/></td>
</tr>
		<tr>
<td>Email</td>
<td><input type="text" name="email"/></td>
</tr>
		<tr>
<td>Contact</td>
<td><input type="text" name="contact"/></td>
</tr>
		<tr>
<td>City</td>
<td><input type="text" name="City"/></td>
</tr>
	

</table>

<input type="submit"	value="Save"/>

</form>
${msg}
</body>
</html>