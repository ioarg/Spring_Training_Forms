<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Customer Confirmation</title>
	</head>
	<body>
		<section>
			<article>
				<h2>Customer Confirmed!</h2>
				<p>Welcome ${customer.firstName} ${customer.lastName}</p>
				<p>Your postal code is : ${customer.postalCode}</p>
				<p>Your have ${customer.freePasses} free passes!</p>
				<p>It seems your selected course is ${customer.courseCode}</p>
			</article>
		</section>
	</body>
</html>