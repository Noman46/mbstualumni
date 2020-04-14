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
				<form:form modelAttribute="applicationForm" action="./student/loginToProfile" method="post" class="login100-form validate-form">
					<span class="login100-form-title p-b-34"> Account Login </span>

					<!-- ===================================================================================================================== -->
					<div class="wrap-input100 rs1-wrap-input100 validate-input m-b-20">
						<form:input id="first-name" class="input100" type="text"
							path ="studentemail" placeholder="Your Email" autocomplete="off"/>
						<span class="focus-input100"></span>
					</div>

					<!-- ===================================================================================================================== -->
					<div class="wrap-input100 rs2-wrap-input100 validate-input m-b-20">
						<form:input class="input100" type="password" path="studentName"
							 placeholder="Password" autocomplete="off"/> <span
							class="focus-input100"></span>
					</div>

					<!-- ============================================= USER CHECK BUTTON ======================================================================== -->
					<div id = "radioAll">
						<div id="radio1">
							<input type="radio">Admin
						</div>
						<div id="radio2">
							<input type="radio">Student
						</div>
					</div>
					<!-- ============================================= SIGN BUTTON======================================================================== -->
					<div class="container-login100-form-btn">
						
						<input class="login100-form-btn" type="submit" value="Sign in" />
					</div>
					<!--  ============================================ CHECK BOX =========================================================== -->



					<!-- ===================================================================================================================== -->
					<div class="w-full text-center p-t-27 p-b-239">
						<span class="txt1"> Forgot </span> <a href="#" class="txt2">
							User name / password? </a>
					</div>
					<!-- ===================================================================================================================== -->
					<div class="w-full text-center">
						<a href="#" class="txt3"> Sign Up </a>
					</div>
				</form:form>


				<!-- ======================================================== IMAGE DIV ============================================================= -->
				<div class="login100-more"
					style="background-image: url('${image}/bg-01.jpeg');"></div>
			</div>
		</div>
	</div>
</body>
</html>