<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="header1">
		<div class="shadow">
			<div id="logo">
				<h1>
					<span>M</span> <span>B</span> <span>S</span> <span>T</span> <span>U</span>
					<span>-</span> <span>A</span> <span>L</span> <span>U</span> <span>M</span>
					<span>N</span> <span>I</span>
				</h1>
			</div>
		</div>

		<div id="searcharea">
			<input type="text" name="" placeholder="Search here" id="searchbox">
		</div>
		<div id="profileIcon">
			<a href="./personalInformation?applicationId=<%=request.getParameter("applicationId")%>&verifiedStudentVersityId=<%=request.getParameter("verifiedStudentVersityId")%>"><i class="fa fa-user"
				style="font-size: 30px"></i></a>
		</div>
		<div id="gearicon">
			<i class="fa fa-gear" style="font-size: 30px"></i>
		</div>
		<div id="logouticon">
			<i class="fa fa-power-off" style="font-size: 30px;"></i>
		</div>

	</div>

</body>
</html>