<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<link type="text/css" rel="stylesheet" href="./css/forms.css">
</head>
<body>
<nav>
        <ul>
           <%-- <li><a href="${pageContext.request.contextPath}/BookView">Home</a></li> --%>
           <li><a href="${pageContext.request.contextPath}/login">Login</a></li>
           <li><a href="${pageContext.request.contextPath}/signup">Sign Up</a></li>
        </ul>
        </nav>
    <div class="signup-form">
<div class="title">Sign Up</div>
<form action="${pageContext.request.contextPath}/signup" method="post">

<label class="label" for="name">Name</label>
<input type="text" name="name" id="name" required="required">

<label class="label" for="phonenumber">Phone Number</label>
<input type="text" id="phonenumber" name="phonenumber"  placeholder="10-digit Mobile number" required="required" >

<label class="label" for="email">Email</label>
<input type="email" name="email" id="email" required="required">

<label class="label" for="password">Password</label>
<input type="password" name="password" id="password" required="required">

<div class="password-hint">Must consist of atleast 8 characters,a symbol,an uppercase,a lowercase letter</div>

<label class="label" for="password">Confirm Password</label>
<input type="password" name="Confirm Password" id="password" required="required" >
${message}
<button class="buttonforsignup" type="submit">Sign In</button>
</form>
</div>
</body>
</html>