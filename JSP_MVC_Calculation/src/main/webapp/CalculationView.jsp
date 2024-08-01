<%@page import="Calci.model.Calculation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculation</title>
</head>
<body>
<form action="CalculationController">
Number1<input type=text name="num1"><br>
Number2<input type=text name="num2"><br>
<input type="submit" value="Add">
</form>

<%! Calculation calci =null; %> //Declaration Tag
<% 								//java Code tag
	if(!session.isNew())
	{
	calci=(Calculation)session.getAttribute("Result");
	%>
	<h1>Num1 is <%=calci.getNum1() %></h1>//Output tag
	<h1>Num2 is <%=calci.getNum2() %></h1>
	<h1>Add is <%=calci.getSum() %></h1>
	<%} 
	session.invalidate();%>


</body>
</html>