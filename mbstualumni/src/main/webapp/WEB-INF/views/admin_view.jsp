<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Admin-dashboard</title>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="${css}/adminpage.css">
<link rel="stylesheet" type="text/css" href="${css}/notification.css">


<script src="${js}/adminpage.js"></script>

<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>

<script src="${js}/notification.js"></script>



<style>
.ad {
	position: absolute;
}

.ad .close {
	position: absolute;
}
</style>


</head>
<body>
	<%@include file="./shared/adminHeader.jsp"%>
	<%@include file="./shared/sideNavBar.jsp"%>

	<div class="main-content">
		<div class="title"></div>
		<div class='ad'>
			<div class="close">
				<i class="ion-ios-close-empty"></i>
			</div>
		</div>
		<div class="main">
			<div class="widget"
				style="text-align: center; flex-basis: 98%; height: 100px; padding: 0 10px 10px 10px; font-size: 1.1em">


				Resize the browser to see the menu in tablet and mobile views</div>
			<div class="widget">
				<div class="title">Number of views</div>
				<div class="chart"></div>
			</div>
			<div class="widget">
				<div class="title">Number of likes</div>
				<div class="chart"></div>
			</div>
			<div class="widget">
				<div class="title">Number of comments</div>
				<div class="chart"></div>
			</div>

		</div>
	</div>

</body>
<script type="text/javascript" src="${js}/colorchange.js"></script>


</html>