<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login/Sign Up</title>
<link type="text/css" rel="stylesheet" href="./css/forms.css">
</head>
<body>
      <nav>
        <ul>
         <%-- <li><a href="${pageContext.request.contextPath}/new">Home</a></li>
           <li><a href="${pageContext.request.contextPath}/login">Login</a></li> --%>
           <li><a href="${pageContext.request.contextPath}/signup">Sign Up</a></li>
        </ul>
        </nav>
        <div class="login-form">
           <div class="title">Login</div>
           <form action="${pageContext.request.contextPath}/login" method="post">
                    <label class="label" for="email">Email</label>
                    <input type="text" name="email" id="email" required="required">
                    <label class="label" for="password">Password</label>
                    <input type="password" name="password" id="password" required="required">
                    ${message}
                    <button class="button" type="submit">Login</button>
                    <a class="forgot-password" href="">Forgot Password</a>
            </form>
        </div>
</body>
</html>