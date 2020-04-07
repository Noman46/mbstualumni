<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<spring:url var="css" value="/resources/css" /><><><
<spring:url var="js" value="/resources/js" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Profile Page</title>
<link rel="stylesheet" type="text/css"
	href="${css}/studentProfilePage.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

<%@include file="./shared/studentProfilePageHeader.jsp"%>
	
	<div class="leftbar">
		<div id="left1"></div>
		<div id="left2"></div>
		<div id="left3"></div>
		
		<div id="left4"></div>


	</div>

	<div class="messagediv">
		<div class="innerMessage">

			<div id="profileImage"></div>
			<div id="profileName"></div>
			<div id="profileMessage"></div>
			<div id="likeButton">
				<button class="buttonLike">Like</button>
			</div>
			<div id="commentButton">
				<button class="buttonCmnt">Comment</button>
			</div>

		</div>


		<div class="innerMessage">

			<div id="profileImage"></div>
			<div id="profileName"></div>
			<div id="profileMessage"></div>
			<div id="likeButton">
				<button class="buttonLike">Like</button>
			</div>
			<div id="commentButton">
				<button class="buttonCmnt">Comment</button>
			</div>

		</div>

		<div class="innerMessage">

			<div id="profileImage"></div>
			<div id="profileName"></div>
			<div id="profileMessage"></div>
			<div id="likeButton">
				<button class="buttonLike">Like</button>
			</div>
			<div id="commentButton">
				<button class="buttonCmnt">Comment</button>
			</div>

		</div>




	</div>
	<div></div>



	<div class="rightbar"></div>

</body>
</html>