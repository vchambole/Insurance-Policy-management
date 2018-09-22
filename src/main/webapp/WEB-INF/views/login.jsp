<html>
<head>
<title>Yahoo!!</title>
</head>
<body>
	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<form action="/login.do" method="POST">
		Name : <input name="userName" type="text" /> <br> 
		Password : <input name="password" type="password" /> <br> 
		Role: <input name="role" type="radio" value="admin" checked="checked"> Admin
		<input name="role" type="radio" value="agent">Agent
		<input name="role" type="radio" value="customer"> Customer <br>
		<input type="submit" value="submit" />
	</form>
	
	New User? <a href="/signup">click here</a> to SignUp
</body>
</html>