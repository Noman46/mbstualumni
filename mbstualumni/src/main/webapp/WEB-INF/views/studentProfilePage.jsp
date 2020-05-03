<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="image" value="/resources/images" />
<spring:url var="js" value="/resources/js" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Profile Page</title>
<link rel="stylesheet" type="text/css"
	href="${css}/studentProfilePage.css">
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript">
	$(document).ready(function() {

		$('.btn').click(function() {

			$('#post').slideToggle("slow");
			$('#btnPost').toggle();
			var buttonValue = $('#postClose').html();
			//alert(buttonValue);
			if (buttonValue === "Share Your Thoughts") {
				$('#postClose').html("Close");
			}
			if (buttonValue === "Close") {
				$('#postClose').html("Share Your Thoughts");
			}

		})
	});
</script>
</head>
<body>

	<%@include file="./shared/studentProfilePageHeader.jsp"%>
	<%@include file="./shared/studentProfilePageLeft.jsp"%>


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

			<div id="profileImage">
				<img src="" width="50" height="50" />
			</div>
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


	<%@include file="./shared/studentProfilePageRight.jsp"%>


</body>
</html>