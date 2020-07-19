<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books </title>
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
       <form action="${PageContext.request.contextPath }/new" method="post">
          <input id="title" name="title" placeholder="Title" type="text">
          <input  id="price" name="price" placeholder="price" type="number" step="0.001" min="0">
          <input id="author" name="author" placeholder="author" type="text">
          <input id="no_of_books" name="no_of_books" placeholder="no_of_books" type="number" min="0">
          <button id="post" type="submit">POST</button>
       </form>
</body>
</html>