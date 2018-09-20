<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUptitle</title>
</head>
<body>
	<h2>Fill the form to signUp</h2>
	<pre>
	<form  action ="/signup" method="post">
		First Name: 		<input name="name" type="text" /> <br> 
		Last Name: 		<input name="name" type="text" /> <br> 
		Email Name: 		<input name="name" type="text" /> <br> 
		Password: 		<input name="name" type="text" /> <br> 
		Confirm Password: 	<input name="name" type="text" /> <br>
		I am :			<input name="role" type="radio" value="an Agent"
				checked="checked"> an Agent
					<input name="role" type="radio" value="a Customer"> a Customer
		 
		<br>
		<input type="submit" value="submit" />
	</form>
</pre>

</body>
</html>