<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>
	<h1>You have been confirmed.</h1>
	The customer is confirmed ${customer.firstName} ${customer.lastName} with a freePasses ${ customer.freePasses }.
	<br/>
	The postal code for the customer is: ${customer.postalCode}.
	<br/>
	The courseCode the customer input was : ${customer.courseCode}.
	
</body>

</html>