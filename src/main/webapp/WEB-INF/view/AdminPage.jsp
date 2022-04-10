<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sporty Shoes-adminpage-jyothsna</title>
</head>
<body style="background-color:rgb(160,192,240)">
<center><br>
<a href=Home.jsp style="color:red;text-decoration:none ;font-size:35px;font-weight:bold;"><font>Sporty Shoes</a>
<br><br>

<h2 style="color:green;"><center>Admin Login</center></h2>
<div style="border:3px solid pink;width:25%;border-radius:20px;padding:20px">
 <form action=adminPage method=post>
	<label for=email><b>Email :-</b></label> <input type="email" name=email id=email /><br><br>
	<label for=pass><b>Pswd :-</b></label> <input type="password" name=password id=pass /><br><br>
	<input type=submit value=submit /> <input type=reset />
</form>
</div> <br>
<a href=forgotPassword style="font-size:25;color:red;">Forgot Password</a>
</center>

<p style="color:green;">${message}</p>

</body>
</html>