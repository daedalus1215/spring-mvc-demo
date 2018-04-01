<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
<title>Student Confirmation</title>
</head>

<body>
	<h1>You have been confirmed.</h1>
	<h2>${student.firstName}${student.lastName}</h2>
	<p>You selected ${student.country} country</p>
	<p>Your selected favorite language was: ${student.favoriteLanguage}</p>
	<ul>
		<c:forEach var="temp" items="${student.favoriteOperatingSystem}">
		<li>${temp}</li>
		</c:forEach>
	</ul>



</body>

</html>