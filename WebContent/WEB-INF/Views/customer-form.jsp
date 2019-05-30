<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Customer Form</title>
		<style>
			.error{
				color:red;
			}
		</style>
	</head>
	<body>
		<h2>Customer Registration</h2>
		<p>Fill out the form. Asterisk (*) means required </p>
		<form:form action="processForm" method="POST" modelAttribute="customer">
			<fieldset>
				<legend>Customer Details</legend>
				First Name : <form:input type="text" path="firstName"/><br><br>
				Last Name (*) : <form:input type="text" path="lastName" />
				<form:errors path="lastName" cssClass="error" /><br><br>
				Free Passes (*) : <form:input type="number" path ="freePasses"/> 
				<form:errors path="freePasses" cssClass="error"/><br><br>
				Postal Code : <form:input type="text" path="postalCode" />
				<form:errors path="postalCode" cssClass="error" /><br><br>
				Course Code : <form:input type="text" path="courseCode" />
				<form:errors path="courseCode" cssClass="error" /><br><br>
				<input type="submit" value="Submit" />
			</fieldset>
		</form:form>
	</body>
</html>