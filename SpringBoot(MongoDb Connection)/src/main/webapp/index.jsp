<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addEmployee">
Enter your  Employee ID: <input type="text" name="employee_Id"><br>
Enter Your Name: <input type="text" name="Employee_Name"><br>
Password: <input type="text" name="Password"><br>
<input type="submit" >
</form>
-------------------------------------------<br>
<form action="getEmployee" method="get">
Get Employee: <input type="submit" >
</form>
</body>
</html>