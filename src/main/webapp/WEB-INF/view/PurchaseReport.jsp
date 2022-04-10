<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sporty Shoes</title>
<style>
table,th,td {
	
	border:1px solid black;
	text-align:center;
}
h2{
	color : green;
}
</style>

</head>
<body style="background-color:#FFC8FB;">
<center>
<h2>Purchase Report</h2>
<br>
<table style="width:100%">
	<tr>
		<th style = "color: red;">Product name</th>
		<th style = "color: red;">User Email</th>
		<th style = "color: red;">Date</th>
		<th style = "color: red;">Price</th>
	</tr>
	
	<c:forEach var="report" items="${report}">
	
		<tr>
			<td> ${report.reportProductName} </td>
			<td> ${report.reportUserEmail} </td>
			<td> ${report.reportDate} </td>
			<td> ${report.reportPrice} </td>
		</tr>
	
	</c:forEach>
			
</table>

</center>
</body>
</html>