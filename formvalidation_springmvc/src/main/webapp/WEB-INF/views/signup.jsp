<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page isELIgnored="false"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<style>
.error {
	color: red;
}
</style>
</head>
<body>

	<div class="container">
		<h2 class="text-center">Spring MVC 5 Form Handling Example - Sign
			up Form</h2>

		<form:form action="saveSignUpForm" method="post"
			modelAttribute="signUpForm">
			<div class="row">
				<div class="col-md-3"></div>
				<div class="col-md-6">

					<div class="form-group">
						<label for="firstname">First Name:</label><br>
						<form:input type="text" path="firstName" class="form-control" />
						<form:errors path="firstName" class="error" />
					</div>

					<div class="form-group">
						<label for="lastname">Last Name:</label><br>
						<form:input type="text" path="lastName" class="form-control" />


					</div>

					<div class="form-group">
						<label for="username">User Name:</label><br>
						<form:input type="text" path="userName" class="form-control" />
						<form:errors path="userName" class="error" />
					</div>

					<div class="form-group">
						<label for="password">Password:</label><br>
						<form:input type="password" path="password" class="form-control" />
						<form:errors path="password" class="error" />
					</div>

					<div class="form-group">
						<label for="email">Email:</label><br>
						<form:input type="text" path="email" class="form-control" />
						<form:errors path="email" class="error" />
					</div>

					<div class="form-group">
						<form:button type="submit" Class="btn btn-primary">Submit</form:button>
					</div>
				</div>
				<div class="col-md-3"></div>
			</div>
		</form:form>

	</div>


</body>
</html>