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
}

.ad .close {
	position: absolute;
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


	<div id="side-navbar">

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

				<li style="color: white;" id="colorChangeOption"><span><i
						class="fa fa-cog fa-spin fa-3x fa-fw"></i></span><span>Settings</span></li>

			</ul>
			</nav>
			<div id="colorChange"></div>
		</div>

	</div>
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
<script>
	document.getElementById("colorChangeOption").addEventListener("click", function() {
		var colorChangeOption =  document.getElementById("colorChange");
		 if (colorChangeOption.style.display === "none") {
			 colorChangeOption.style.display = "block";
			  } else {
				  colorChangeOption.style.display = "none";
			  }
	})
</script>
</html>