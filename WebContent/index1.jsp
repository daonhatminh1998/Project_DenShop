<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello</h1>
	<jsp:useBean id="customers" class="com.hccs.advweb.CustomerList"
		scope="session"></jsp:useBean>

	<%
	ArrayList<com.hccs.advweb.Customer> cusList = customers.getCustomerList();
	for (com.hccs.advweb.Customer customer : cusList) {
	%>
	<table border='1'>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Message</th>
		</tr>
		<tr>
			<td><%=customer.getName()%></td>
			<td><%=customer.getEmail()%></td>
			<td><%=customer.getPhone()%></td>
			<td><%=customer.getMessage()%></td>
		</tr>

	</table>
	<%
	}
	%>

</body>
</html>