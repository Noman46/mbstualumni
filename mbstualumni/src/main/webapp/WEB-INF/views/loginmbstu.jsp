<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="image" value="/resources/images" />
<html lang="en">
<head>
	<title>Login</title>
	
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<link rel="stylesheet" type="text/css" href="${css}/loginpageUtil.css">
	<link rel="stylesheet" type="text/css" href="${css}/loginpageMain.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form validate-form">
					<span class="login100-form-title p-b-34">
						Account Login
					</span>
					
<!-- ===================================================================================================================== -->					
					<div class="wrap-input100 rs1-wrap-input100 validate-input m-b-20">
						<input id="first-name" class="input100" type="text" name="username" placeholder="User name" autocomplete="off">
						<span class="focus-input100"></span>
					</div>
					
<!-- ===================================================================================================================== -->							
					<div class="wrap-input100 rs2-wrap-input100 validate-input m-b-20">
						<input class="input100" type="password" name="pass" placeholder="Password" autocomplete="off">
						<span class="focus-input100"></span>
					</div>
					
					
					
<!-- ============================================= SIGN BUTTON======================================================================== -->							
					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Sign in
						</button>
					</div>
<!--  ============================================ CHECK BOX =========================================================== -->	

				
					
<!-- ===================================================================================================================== -->		
					<div class="w-full text-center p-t-27 p-b-239">
						<span class="txt1">
							Forgot
						</span>

						<a href="#" class="txt2">
							User name / password?
						</a>
					</div>
<!-- ===================================================================================================================== -->		
					<div class="w-full text-center">
						<a href="#" class="txt3">
							Sign Up
						</a>
					</div>
				</form>


<!-- ======================================================== IMAGE DIV ============================================================= -->		
				<div class="login100-more" style="background-image: url('${image}/bg-01.jpeg');"></div>
			</div>
		</div>
	</div>
</body>
</html>