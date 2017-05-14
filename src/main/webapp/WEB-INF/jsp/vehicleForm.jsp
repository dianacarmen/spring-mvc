<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>New vehicle</title>
<style>.error {color: #ff0000; font-weight: bold;} </style>
</head>
<body>
<form:form method="post" modelAttribute="vehicle">
<table>
	<tr>
        <td>Vehicle No:</td>
        <td><form:input path="vehicleNo"/></td>
       <td><form:errors path="vehicleNo" cssClass="error"/></td>
    </tr>
	<tr>
        <td>Color:</td>
        <td><form:input path="color"/></td>
       <td><form:errors path="color" cssClass="error"/></td>
    </tr>
	<tr>
        <td>Seat:</td>
        <td><form:input path="seat"/></td>
       <td><form:errors path="seat" cssClass="error"/></td>
    </tr>
	<tr>
        <td>Wheel:</td>
        <td><form:input path="wheel"/></td>
       <td><form:errors path="wheel" cssClass="error"/></td>
    </tr>
    <tr>
        <td colspan="3"><input type="submit" value="Submit"/></td>
    </tr>
</table>
<form:errors path="*" cssClass="error"/>
</form:form>
</body>
</html>
