<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="image" value="/resources/images" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="${css}/welcome.css">
</head>
<body>
	<section> 
	<video src="${image}/smoke.mp4" autoplay muted> </video>
	<h1>
		<span>M</span> <span>B</span> <span>S</span> <span>T</span> <span>U</span>
		<span>-</span> <span>A</span> <span>L</span> <span>U</span> <span>M</span>
		<span>N</span> <span>I</span>

	</h1>
	</section>
</body>
</html>