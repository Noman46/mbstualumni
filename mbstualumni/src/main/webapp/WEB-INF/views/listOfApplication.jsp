<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>List Of Application</title>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="${css}/adminpage.css">
<link rel="stylesheet" type="text/css" href="${css}/appliCationFormList.css">

<link rel="stylesheet" type="text/css" href="${css}/notification.css">

<script src="${js}/adminpage.js"></script>

<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>

<script src="${js}/notification.js"></script>





</head>
<body>
	<%@include file="./shared/adminHeader.jsp"%>
	<%@include file="./shared/sideNavBar.jsp"%>

	<div class="tableContainer">
		<div class = "innerDidTable">
		
		</div>

	</div>
</body>
</html>