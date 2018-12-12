<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Customers</title>
</head>
<body>

<div id="wrapper">
	<div id="header">
		<h2>CRM - Customer Relationship Manager</h2>
	</div>
</div>

<div id="container">
	<div id="content">
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
			<tr>
			
			<c:forEach var="customer" items="${customers}">
					<tr>
						<td>${customer.first_name}</td>
						<td>${customer.last_name}</td>
						<td>${customer.email}</td>
					<tr>
			</c:forEach>
		</table>
	</div>
</div>

</body>
</html>