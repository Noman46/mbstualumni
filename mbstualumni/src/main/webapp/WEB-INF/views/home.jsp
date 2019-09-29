<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="image" value="/resources/images" />

<html lang="en">
<head>
  <title>MBSTU-ALUMNI</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <!-- ======================================================================================== -->
  <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

  <!-- ======================================================================================== -->

	<link rel="stylesheet" type="text/css" href="${css}/loginpageUtil.css">
	<link rel="stylesheet" type="text/css" href="${css}/loginpageMain.css">
  <script
  src="https://code.jquery.com/jquery-2.2.4.min.js"
  integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
  crossorigin="anonymous"></script>
  
<style>

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
  width:100%;
  height: 100vh;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
  
}
.navbar:hover{
box-shadow: 0px 1px 10px black;
}

#about{
width: 700px;
height: 300px;
background-color:black;
opacity:0.5;
position: absolute;
top:0;
bottom: 0;
left: 0;
right: 0;   
margin: auto;
display:none;
box-shadow: 2px 2px 2px 8px white;
}
#contact{
width: 700px;
height: 300px;
background-color:black;
opacity:0.5;
position: absolute;
top:0;
bottom: 0;
left: 0;
right: 0;   
margin: auto;
display:none;
box-shadow: 2px 2px 2px 8px white;
}

</style>

<script>
function showAbout(){
 var about = document.getElementById('about');
 var contact = document.getElementById('contact');

 if(about.style.display == 'none' || about.style.display == ''){
about.style.display = 'block';
contact.style.display = 'none';

}else
about.style.display = 'none'


}
</script>
<script>
function showContact(){
 var contact = document.getElementById('contact');
 var about = document.getElementById('about');

 if(contact.style.display == 'none' || contact.style.display == ''){
contact.style.display = 'block';
about.style.display = 'none';


}else
contact.style.display = 'none'


}
</script>

</head>
<body style = "background-image: url('${image}/bg-03.jpeg');">

<!-- ================== -->

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand animated bounce" href="#">MBSTU-ALUMNI</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#">HOME</a></li>
      <li><a href="#" onclick="showAbout()">ABOUT</a></li>
      <li><a href="#" onclick="showContact()">CONTACT</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="./getApplication"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="./loginmbstu"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
  
</nav>


<!-- ================== -->
	<div id="about" style = "color:white; text-align:center;">ABOUT</div>
	<div id="contact" style = "color:white; text-align:center;"> Contact</div>


</body>
</html>