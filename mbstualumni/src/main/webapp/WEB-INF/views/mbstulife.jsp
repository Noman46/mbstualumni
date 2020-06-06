<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="image" value="/resources/mbstuImages" />
<spring:url var="js" value="/resources/js" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>MBSTU LIFE</title>

<link rel="stylesheet" type="text/css"
	href="${css}/mbstulife.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://kit.fontawesome.com/42066bab5c.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<h1>CSS GRID IMAGES</h1>

	<div class="container">
	<c:if test="${not empty mbstuImages}">
		<c:forEach items="${mbstuImages}" var="list">
		<div class="gallery-container w-3 h-2">
			<div class="gallery-item">
				<div class="love">
					<a href="im.html" target="_blank"><i class="fas fa-grin-hearts"></i></a>
				</div>
				<div class="image">
					<img src="${image}/${list[1]}.jpg"
						alt="nature">
				</div>
				<div class="text">Nature</div>
			</div>
		</div>
		</c:forEach>
	</c:if>

		



	</div>
</body>
</html>