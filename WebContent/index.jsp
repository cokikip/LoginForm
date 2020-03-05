<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="/css/bootstrap.min.css">
<link href="css/style.css">
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>

<body>
s
table.padding-table td{
padding:10px;}
</style>
<h1 align="center">Login here</h1>
<div align="center">
<form action="LoginForm" method="post">
<table class="padding-table">
<tr class="form-group">
<td >User name:</td>
<td><input type="text" name="username" placeholder="User name" class="form-control"></td>
</tr>
<tr>
<td>Password:</td>
<td><input class="form-control" type="password" name="password" placeholder="********"></td>
</tr>

<tr>
<td colspan='2' align="center"> <button class="btn btn-success" type="submit" value="submit">Submit</button></td>
</tr>
</table>
</form>
</div>

</body>
</html>