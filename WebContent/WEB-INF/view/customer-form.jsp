<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Customer Registration Form</title>
	</head>
	<style>
			.error {color:red}	
	</style>
	<body>
		<form:form action="/spring-mvc-demo/customer/processForm" modelAttribute="customer">
			
			First name:<form:input path="firstName" />
			
			<br><br>
			
			Last name (*):<form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
						
			<br><br>

			<input type="submit" value="Submit" />
			
		</form:form>	
	</body>

</html>