<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Student Confirmation</title>
	</head>
	
	<body>
		<h1>You have been confirmed.</h1>	
		<h2>${student.firstName} ${student.lastName}</h2>
		<p>You selected ${student.country} country</p>
		<p>Your selected favorite language was: ${student.favoriteLanguage}</p>
		
	</body>

</html>