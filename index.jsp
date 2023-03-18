<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 hello wrld..
 
 <form action = "add">
 Enter 1st number : <input type="text" name ="num1"><br>
 Enter 2nd number : <input type="text" name ="num2"><br>
 <input type = "submit"><br>
 </form>
 <form action = "fetch">
 
 <input type = "submit" value = "fetch All"><br>
 </form>
 
 <form action = "addAlien" method = "post">
 Enter your ID : <input type="text" name ="aid"><br>
 Enter your Name : <input type="text" name ="aname"><br>
 <input type = "submit"><br>
 </form>
 
 <form action = "getAlien" >
 Enter your ID : <input type="text" name ="aid1"><br>
 
 <input type = "submit"><br>
 </form>
</body>
</html>