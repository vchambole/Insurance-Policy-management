<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUptitle</title>
</head>
<body>
	<h2>Fill the form to signUp</h2>
	
	<form action="/signup" method="POST">
  	<div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
	<pre>
	
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <label for="password-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="password-repeat" required>
    
    Role:
    <input type="radio" name="role" value="admin">Admin <input type="radio" name="role" value="agent">Agent<input type="radio" name="role" value="customer">Customer
    
    
	</pre>
    <label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>

    <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms and Privacy</a>.</p>

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button><button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form> 

</body>
</html>