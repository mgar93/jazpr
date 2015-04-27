<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<h3>Register</h3>
<p style="color:red;"><%= request.getParameter("message") != null? request.getParameter("message") : "" %></p>
<form method="post" action="RegisterServlet">
username:<input type="text" name="name" required><br>
password:<input type="password" name="pass" required><br>
confrim password:<input type="password" name="pass2" required><br>
email:<input type="text" name="email" required><br>
<input type="checkbox" name="admin" value="true">Admin<br>
<input type="submit">
</form>
<a href="index.jsp">back</a><br>
</body>
</html>