<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="leftbar">
		<div id="image">

			<c:if test="${(imageCode != '')}">
				<img src="${image}/${imageCode}.jpg" width="200" height="200">
			</c:if>
			
		</div>
		<div id="left1"></div>
		<div id="left2"></div>
		<div id="left3"></div>
		<div id="left4"></div>
		<div id="left5"></div>

	</div>
	<div class="postButton">
		<button class="btn" id="postClose">Share Your Thoughts</button>
		<button id="btnPost" class="btn" style="display: none;">Post</button>
	</div>
	<div id="post">
		<textarea id="postArea" rows="6" cols="106"></textarea>
	</div>

</body>
</html>