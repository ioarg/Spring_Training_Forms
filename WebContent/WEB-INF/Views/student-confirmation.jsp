<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head><title>Student Page</title></head>
	<body>
		<h2>Student Confirmation</h2>
		<p>First name : ${student.firstName}</p>
		<p>Last name : ${student.lastName}</p>
		<p>Country : ${student.country}</p>
		<p>Favorite Language : ${student.favoriteLanguage}</p>
		<p>Operating Systems</p>
		<ul>
			<c:forEach var="temp" items="${student.favoriteOSes}">
				<li>${temp}</li>
			</c:forEach>
		</ul>
	</body>
</html>