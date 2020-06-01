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
			<div class = "icons">
			<ul>
				<li><a href="#" title="MBSTU Life"><i class="fas fa-university"></i></a></li>
				<li><a href="./personalInformation?applicationId=<%=request.getParameter("applicationId")%>&verifiedStudentVersityId=<%=request.getParameter("verifiedStudentVersityId")%>" title="Settings"><i class="fas fa-users-cog"></i></a></li>
				<li><a href="#" title="Logout"><i class="fas fa-sign-out-alt"></i></a></li>
				<li><a href="#" title="Poem & Poetry"><i class="fas fa-theater-masks"></i></a></li>
				<li><a href="#" title="Blog"><i class="fas fa-pen-nib"></i></a></li>
				<li><a href="#" title="Donate Blood"><i class="fas fa-hand-holding-water"></i></a></li>
				<li><a href="#" title="Job Circular"><i class="fas fa-briefcase"></i></a></li>
				<li><a href="#" title="Academic Notes"><i class="fas fa-book-reader"></i></a></li>
			</ul>	
	</div>
		
	</div>


</body>
</html>