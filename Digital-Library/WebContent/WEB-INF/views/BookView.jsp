<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link type="text/css" rel="stylesheet" href="./css/home.css">
</head>
<body>
        <nav >
    
      <div id="logo">Digital Library</div>
      
        <ul class="nav-links-container">
          <!-- <li><a href="#" >Home</a></li> -->
          <li><a href="${pageContect.request.contextPath}/mybooks" >My Books</a></li>
          <li><a href="${pageContect.request.contextPath}/login" >Login</a></li>
          <li><a href="${pageContect.request.contextPath}/signup" >Sgin up</a></li>
         <%--  <li><a href="${pageContect.request.contextPath}"/mybooks ></a></li> --%>
          <li><a href="#" >CONTACT</a></li>
        </ul>
        </nav>
        <div class="body-div1">
             <div>Your books added</div>
             <a href="${pageContect.request.contextPath}/new"><button class="button" id="addbook"><i class="fas fa-plus-circle"></i>Add new book</button></a>
        </div>
</body>
</html>