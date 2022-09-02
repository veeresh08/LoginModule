
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>--%>
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>


	<div align=center><br><br>
	<h1>User Login</h1>
	
	<form action="Login" method="post">
		Enter username : <input type= "text" name ="uname"><br><br>
		Enter password  :<input type = "password" name="password"><br><br>
		<input type ="submit" value="login">
		<input type ="reset" value="reset">
	</form>
	</div>
</body>
</html>
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

    <div class="main">

        <section class="signup">
            <!-- <img src="images/signup-bg.jpg" alt=""> -->
            <div class="container">
                <div class="signup-content">
                    <form action="Login" method="post" id="signup-form" class="signup-form">
                        <h2 class="form-title">Login</h2>
                        
                        <div class="form-group">
                            <input type= "text" name ="name" class="form-input" id="name" placeholder="Your user name"/>
                        </div>
                        <div class="form-group">
                            <input type = "text" name="password" class="form-input" name="password" id="password" placeholder="Password"/>
                            <span toggle="#password" class="zmdi zmdi-eye field-icon toggle-password"></span>
                        </div>
                        
                     
                        <div class="form-group">
                            <input type="submit" name="submit" id="submit" class="form-submit" value="login"/>
                        </div>
                    </form>
                    <p class="loginhere">
                        Dont have an account ? <a href="registration.jsp" class="loginhere-link">Register here</a>
                    </p>
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>


