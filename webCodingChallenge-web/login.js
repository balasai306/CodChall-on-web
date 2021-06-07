function login() {

	var userName = $("#uname").val();
	var password = $("#password").val();
	var myData = {
		userName: userName,
		password: password
	}
	console.log(myData);

	if ((userName != "") && (password != "")) {
		console.log("inside if");
		let xhr = new XMLHttpRequest();
		var userName = $("#uname").val()
		var password = $("#password").val()
		let json = JSON.stringify({
			userName: $("#uname").val(),
			 		password: $("#password").val()
		  });
		  console.log("json is"+json)
		  xhr.open("POST","login", '/submit')
		  xhr.setRequestHeader('Content-type', 'application/json; charset=utf-8');
		  
		  xhr.send(json);

	}






	// $.ajax({
	// 	type: "POST",
	// 	url: "login",
	// 	dataType: "json",
	// 	data: {
	// 		userName: $("#uname").val(),
	// 		password: $("#password").val()
	// 	}

	// 	/* success : function(result) {
	// 		alert('SUCCESS');
	// 	}  */
	// });

}
// else{
// console.log("inside else");
// details.style.Display = "none";
// $.ajax({
// type: "GET",
// url: "Error",
// dataType: "json",
// data: {

// }

// });


// }