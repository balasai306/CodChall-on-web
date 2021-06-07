
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page import="java.util.List"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">

<title>Display user details</title>
</head>
<body style="background-color: lightgrey">

	<table border=1 class="table" style="border: 2px solid black;">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Mobile</th>
			<th>City</th>
			<th>State</th>
			<th>Country</th>
			<th>Email</th>

		</tr>



		<c:forEach var="i" items="${details}">

			<tr>

				<td>${i.id }</td>
				<td>${i.name }</td>
				<td>${i.mobileNum }</td>
				<td>${i.city }</td>

				<%-- <td>${ i.state}</td> --%>
				<c:choose> 
				<c:when test="${ fn:startsWith(i.state, 'A')}">
					<td>${fn:toUpperCase(i.state) }</td>
				</c:when>
				<c:otherwise>
				<td> ${i.state }</td>
				</c:otherwise>
				</c:choose> 


				<td>${i.country }</td>
				<td>${i.email }</td>
			</tr>
		</c:forEach>

		<%--  --%>

	</table>
	<br>
	<br>

	<!-- <p>
		click<a href="animation.html"> Animations</a> to see animations
	</p> -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>

</body>
</html>