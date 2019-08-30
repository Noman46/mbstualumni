<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


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

<script src="${js}/adminpage.js"></script>
</head>
<body>
	<div class="header">
		<div class="logo">
			<i class="fa fa-tachometer"></i> <span>Brand</span>
		</div>
		<a href="#" class="nav-trigger"><span></span></a>
	</div>
	<div class="side-nav">
		<div class="logo">
			<i class="fa fa-tachometer"></i> <span>Brand</span>
		</div>
		<nav>
		<ul>
			<li><a href="#"> <span><i class="fa fa-user"></i></span> <span>Users</span>
			</a></li>
			<li><a href="#"> <span><i class="fa fa-envelope"></i></span>
					<span>Messages</span>
			</a></li>
			<li class="active"><a href="#"> <span><i
						class="fa fa-bar-chart"></i></span> <span>Analytics</span>
			</a></li>
			<li><a href="#"> <span><i
						class="fa fa-credit-card-alt"></i></span> <span>Payments</span>
			</a></li>
		</ul>
		</nav>
	</div>
	<div class="main-content"></div>
</body>
</html>