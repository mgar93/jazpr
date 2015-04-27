<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h3>Login</h3>
<p style="color:<%= request.getParameter("color") != null ? request.getParameter("color") : "black" %>;"><%= request.getParameter("message") != null? request.getParameter("message") : "" %></p>
<form method="post" action="LoginServlet">
username:<input type="text" name="name"><br>
password:<input type="password" name="pass"><br>
<input type="submit">
</form>
<a href="index.jsp">back</a><br>
</body>
</html>