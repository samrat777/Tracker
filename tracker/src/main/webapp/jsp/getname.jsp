<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Issues Information</title>
</head>
<body>
<h2>Client  Data</h2>


	<table border="1">

		<th>Id</th>
		<th>Componentname:</th>
		<th>Time</th>
		<th>ServiceImpacted</th>
		<th>ServerLogDetails</th>
		<th>OperationImpact</th>
		<th>CommercialImpact</th>
		<th>RootCauseAnalysis</th>
		<th>Resolution</th>
		

		<c:forEach var="list" items="${nameslist}" >
			<tr>
				
				<td>${list.id}</td>
				<td>${list.componentname}</td>
				<td>${list.Time}</td>
				<td>${list.ServiceImpacted}</td>
				<td>${list.ServerLogDetails}</td>
				<td>${list.OperationImpact}</td>
				<td>${list.CommercialImpact}</td>
				<td>${list.RootCauseAnalysis}</td>
				<td>${list.Resolution}</td>
				

			</tr>
		</c:forEach>
	</table>

</body>
</html>