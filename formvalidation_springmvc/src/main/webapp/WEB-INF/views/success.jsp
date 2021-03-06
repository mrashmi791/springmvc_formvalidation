<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page isELIgnored="false"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h1>${message}</h1>
			<hr />

			<table class="table table-striped table-bordered">
				<tr>
					<td><b>First Name </b>: ${user.firstName}</td>
				</tr>
				<tr>
					<td><b>Last Name </b> : ${user.lastName}</td>
				</tr>
				<tr>
					<td><b>UserName </b> : ${user.userName}</td>
				</tr>
				<tr>
					<td><b>Email </b>: ${user.email}</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>