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
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>


<style>
.ad {
	position: absolute;
	width: 300px;
	height: 250px;
	border: 1px solid #ddd;
	left: 50%;
	transform: translateX(-50%);
	top: 250px;
	z-index: 10;
}

.ad .close {
	position: absolute;
	font-family: 'ionicons';
	width: 20px;
	height: 20px;
	color: #fff;
	background-color: #999;
	font-size: 20px;
	left: -20px;
	top: -1px;
	display: table-cell;
	vertical-align: middle;
	cursor: pointer;
	text-align: center;
}
</style>


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
	<div class="main-content">
		<div class="title">Analytics</div>
		<div class='ad'>
			<div class="close">
				<i class="ion-ios-close-empty"></i>
			</div>
			<script async
				src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
			<!-- kodhus demos -->
			<ins class="adsbygoogle"
				style="display: inline-block; width: 300px; height: 250px"
				data-ad-client="ca-pub-8408356133845039" data-ad-slot="8154430505"></ins>
			
		</div>
		<div class="main">
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
</html>