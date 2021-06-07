<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="style.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
	
</script>

</head>

<body style="background-color: orange">
	<script src="jquery.js"></script>

	<div id="form-div"
		style="text-align: center; border: 5px solid black; pading 10px; ">
				<br>
		
		<h2>SIGN UP FOR REWARDS</h2>
		<hr style="height:3px ;color: black">
		
		<form action="login" method="get" name="loginform">
			<input type="text" name="userName" id="uname"
				placeholder="Email Address" required="required"> <br> <br>
			<input type="password" name="password" id="password"
				placeholder="password" required="required"> <br> <br>
			<!-- <input type="button" onclick="login(); show()" value="submit"> -->
			<button type="button" onclick="login(); show()">SignUp</button>
			<!-- <input type="button" value="details"
                            id="details"    onclick="window.location.href='details1.jsp'; return false;" />
	 -->
			<button type="submit" id="submit" style="visibility: hidden;">
				View Deatails</button>
		</form>
		<br>
		<br>

	</div>





	<script type="text/javascript">
		function show() {
			var showButton = document.getElementById("submit");
			showButton.style.visibility = "visible";
		}
	</script>
	<script src="login.js">
		
	</script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>


</body>

</html>