<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.webCodingChallenge.controller.LoginServlet"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">

<title>View Users</title>
</head>
<body>
	<main class="container">
		<div class="bg-light p-5 rounded">
			<h1>Details of the  user</h1>
			
			<div class="container-fluid">
				<table class="table table-hover">

					
						<c:forEach var="s" items="${details}">
							<tr>


								<td>${s}</td>

								<hr>

							</tr>
						</c:forEach>

					
				</table>
			</div>
		
		</div>
	</main>
</body>
</html>