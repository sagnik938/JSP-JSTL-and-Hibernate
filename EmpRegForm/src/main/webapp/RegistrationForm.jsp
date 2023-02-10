<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Creative Colorlib SignUp Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
</head>
<body>
	  <!-- main -->
  <div class="main-w3layouts wrapper">
    <h1>Creative SignUp Form</h1>
    <div class="main-agileinfo">
      <div class="agileits-top">
        <form action = "<%=request.getContextPath() %>/register" method="post">
          <input class="text" type="text" name="firstname" placeholder="Firstname" required="">
          <input class="text" type="text" name="lasttname" placeholder="Lastname" required="">
          <input class="text" type="text" name="username" placeholder="Username" required="">
          <input class="text" type="password" name="password" placeholder="Password" required="">
          <input class="text" type="text" name="address" placeholder="Address" required="">
            <input class="text" type="text" name="contact" placeholder="Contact" required="">
          <div class="wthree-text">
            <label class="anim">
              <input type="checkbox" class="checkbox">
              <span>I Agree To The Terms & Conditions</span>
            </label>
            <div class="clear"> </div>
          </div>
          <input type="submit" value="SIGNUP">
        </form>
      </div>
      </div>
      <ul class="colorlib-bubbles">
      <li></li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
    </ul>
  </div>
  <!-- //main -->
</body>
</html>