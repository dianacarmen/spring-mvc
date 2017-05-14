<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <head>
        <title>Vehicles</title>
    </head>  
    <body>
		<table border="1">
			<tr>
				<th>Vehicle Nr</th>
				<th>Color</th>
				<th>Nr of wheels</th>
				<th>Nr of seats</th>
				<th>&nbsp;</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${allVehicles}" var="v">
    			<tr>
				    <td>${v.vehicleNo}</td>
				    <td>${v.color}</td>
				    <td>${v.wheel}</td>
				    <td>${v.seat}</td>
				    <td><a href="<%=request.getContextPath()%>/dyn/vehicles/edit?vehicleNo=${v.vehicleNo}">Edit</a></td>
				    <td><a href="<%=request.getContextPath()%>/dyn/vehicles/remove?vehicleNo=${v.vehicleNo}">Delete</a></td>
    			</tr>
			</c:forEach>
		</table>
		<br>
		
		<a href="<%=request.getContextPath()%>/dyn/vehicleForm">Add new vehicle</a>
		
	</body>
</html>
