<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page isELIgnored="false"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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


</head>
<body>
	<div class="container">
		<h2 class="text-center">Student Sign
			up Form</h2>

		<form:form action="saveStudent" method="post"
			modelAttribute="student">
			<div class="row">
				<div class="col-md-3"></div>
				<div class="col-md-6">
					 <form:hidden path="id" />
					<div class="form-group">
						<label for="name">Name:</label><br>
						<form:input type="text" path="name" class="form-control" />
					</div>


					<div class="form-group">
						<label for="email">Email:</label><br>
						<form:input type="text" path="email" class="form-control" />
					</div>
					
					<div class="form-group">
						<label for="adress">Address:</label><br>
						<form:input type="text" path="address" class="form-control" />
					</div>
	
					<div class="form-group">
						<label for="password">Password:</label><br>
						<form:input type="password" path="password" class="form-control" />
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