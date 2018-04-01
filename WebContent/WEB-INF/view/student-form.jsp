<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Student Registration Form</title>
	</head>
	
	<body>
		<form:form action="processForm" modelAttribute="student">
			
			First name:
			<br> 
			<form:input path="firstName" />
			
			<br><br>
			
			Last name: 
			<br>
			<form:input path="lastName" />
						
			<br><br>

			Country:
			<form:select path="country">
			 	<form:options items="${student.countryOptions}" />		
			</form:select>
			
			<br><br>
			
			Favorite Programming Language: 
			<br/>
			Java <form:radiobutton path="favoriteLanguage" value="Java" />
			C# <form:radiobutton path="favoriteLanguage" value="C#" />
			PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
			
			<br><br>
			
			Favorite Operating System:
			<br>
			Linux <form:checkbox path="favoriteOperatingSystem" value="Linux"/>
			Microsoft <form:checkbox path="favoriteOperatingSystem" value="Microsoft"/>
			Mac Os <form:checkbox path="favoriteOperatingSystem" value="Mac Os"/>			
			
			<br><br>
			
			<input type="submit" value="Submit" />
			
		</form:form>	
	</body>

</html>