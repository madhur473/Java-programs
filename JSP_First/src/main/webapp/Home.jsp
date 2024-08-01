<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<%@ include file="Contact.jsp" %>
<%! int n1,n2,add; %>
<%
n1=10;
n2=10;
add=n1+n2;
%>
First Name: <input type=text ><br>
<input type=submit>
<h1>Hello</h1>
<h1> Todayss Date is <%=new Date() %></h1>
<h1> Addition is <%=add %> </h1>
</body>
</html>