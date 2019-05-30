<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head><title>Student Form</title></head>
	<body>
		<h2>Student form</h2>
		<p>Fill in this form to register as a student</p>
		<form:form action="processForm" modelAttribute="student">
			First name : <form:input path="firstName"/>
			<br>
			Last name : <form:input path="lastName"/>
			<br><br>
			<form:select path="country">
<%-- 				<form:option value="Brazil" label="Brazil"/> --%>
<%-- 				<form:option value="France" label="France"/> --%>
<%-- 				<form:option value="Italy" label="Italy"/> --%>
<%-- 				<form:option value="Netherlands" label="Netherlands"/> --%>
<%-- 				<form:option value="Other" label="Other.."/> --%>
					<form:options items="${student.countryOptions}"/>
			</form:select>
			<br><br>
			<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
			<br><br>
			<form:checkboxes path="favoriteOSes" items="${student.OSes}"/>
			<input type="submit" value="Submit">
		</form:form>
	</body>
</html>