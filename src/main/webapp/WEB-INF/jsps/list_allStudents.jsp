<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list all Leads</title>
</head>
<body>
<h1>List All Students</h1>
<table border="1">

<tr>
					<th>firstname</th>
					<th>lastname</th>
					<th>email</th>
					<th>contact</th>
				<!-- 	 <th>City</th>  --> 
					 <th>Delete</th>
					<th>Update</th> 

</tr>

   <c:forEach var="Student" items="${students}">
    
    <tr>
  
    <td>${Student.firstname}</td>
    <td>${Student.lastname}</td>
     <td>${Student.email}</td>
    <td>${Student.contact}</td>
 <%--  <td>${Student.City}</td>  --%>
   <td><a href="delete?id=${Student.id}">delete</a></td>
    
    <td><a href="update?id=${Student.id}">update</a></td> 
    </tr>
    </c:forEach>
 
 
   
</table>
</body>
</html>