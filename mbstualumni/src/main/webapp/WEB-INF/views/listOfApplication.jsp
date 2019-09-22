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


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>








<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="${css}/adminpage.css">
<link rel="stylesheet" type="text/css"
	href="${css}/appliCationFormList.css">

<link rel="stylesheet" type="text/css" href="${css}/notification.css">

<script src="${js}/adminpage.js"></script>
<script src="${js}/jquery.dataTables.js"></script>
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>


<script src="${js}/notification.js"></script>


<script>

function changeActiveStatus(applicationId){
	
	$.ajax({
		
		url: "/mbstualumni/updateApplicationFormStatus",
		data: {applicationId: applicationId},
		success: function(data){
			
			alert(data);
			window.location.reload();
			
		}
		
	});
	
}

</script>


</head>
<body>
	<%@include file="./shared/adminHeader.jsp"%>
	<%@include file="./shared/sideNavBar.jsp"%>

	<div class="tableContainer">
		<div class="innerDidTable">
			<div class="row">
				<div class="col-xs-12">

					<table id="applicationListTable"
						class="table table-striped table-borderd">

						<thead>
							<tr>
								<th>Student's Name</th>
								<th>Father Name</th>
								<th>Mother Name</th>
								<th>DOB</th>
								<th>HSC Board</th>
								<th>HSC Roll</th>
								<th>Varsity's Session</th>
								<th>Varsity's ID</th>
								<th>Approved</th>
							</tr>
						</thead>
						
						<tbody>
						<c:forEach var="listValue" items="${listofForms}">
							<tr>
								<td>${listValue.studentName}</td>
								<td>${listValue.fatherName}</td>
								<td>${listValue.motherName}</td>
								<td>${listValue.studentDOB}</td>
								<td>${listValue.hscBoard}</td>
								<td>${listValue.hscRoll}</td>
								<td>${listValue.versitySession}</td>
								<td>${listValue.versityId}</td>
								<td><input type="button" value="Yes" onclick="changeActiveStatus(${listValue.applicationId})"> | <input type="button" value="No" onclick="msg()"></td>
							</tr>
							</c:forEach>
						</tbody>
						
					</table>
				</div>
			</div>
		</div>

	</div>
</body>
</html>