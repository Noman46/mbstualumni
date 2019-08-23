<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${css}/myapp.css " rel="stylesheet" />

<script src="${js}/myapp.js" ></script>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<form:form method="post" modelAttribute="applicationForm" action="/mbstualumni/sendApplication" class="form-horizontal" role="form">
			<h2>Application Form</h2>
			<div class="form-group">
				<label for="fullName" class="col-sm-3 control-label">Full
					Name</label>
				<div class="col-sm-9">
					<form:input path="studentName" id="fullName" placeholder="Full Name"
						class="form-control"/>
				</div>
			</div>
			<div class="form-group">
				<label for="fatherName" class="col-sm-3 control-label">Father's
					Name</label>
				<div class="col-sm-9">
					<form:input path="fatherName" id="fatherName" placeholder="Father's Name"
						class="form-control"/>
				</div>
			</div>
			<div class="form-group">
				<label for="motherName" class="col-sm-3 control-label">Mother's Name* </label>
				<div class="col-sm-9">
					<form:input path="motherName" id="motherName" placeholder="Mother's Name"
						class="form-control" name="moterName"/>
				</div>
			</div>
			<div class="form-group">
				<label for="email" class="col-sm-3 control-label">Email* </label>
				<div class="col-sm-9">
					<form:input type = "email" path="studentemail" id="email" placeholder="Email"
						class="form-control" name="email"/>
				</div>
			</div>
				<div class="form-group">
				<label for="phoneNumber" class="col-sm-3 control-label">Phone
					number </label>
				<div class="col-sm-9">
					<form:input path="phone" id="phoneNumber"
						placeholder="Phone number" class="form-control"/> <span
						class="help-block">Your phone number won't be disclosed
						anywhere </span>
				</div>
			</div>			
		<%-- 	<div class="form-group">
				<label for="birthDate" class="col-sm-3 control-label">Date
					of Birth*</label>
				<div class="col-sm-9">
					<form:input type = "date" path="studentDOB" id="birthDate" class="form-control"/>
				</div>
			</div> --%>
			<div class="form-group">
                <label for="hscBoard" class="col-sm-3 control-label">HSC Board:</label>
                        <div class="col-sm-9">
                         <form:select path="hscBoard" class="custom-select custom-select-lg mb-3" id="hscBoard">
                              <form:option value="Dhaka">Dhaka</form:option>
                              <form:option value="Chittagong">Chittagong</form:option>
                              <form:option value="Barisal">Barisal</form:option>
                              <form:option value="Comilla">Comilla</form:option>
                              <form:option value="Jessore">Jessore</form:option>
                              <form:option value="Mymensingh">Mymensingh</form:option>
                              <form:option value="Rajshahi">Rajshahi</form:option>
                              <form:option value="Sylhet">Sylhet</form:option>
                              <form:option value="Dinajpur">Dinajpur</form:option>
                              <form:option value="Madrasa">Madrasa</form:option>
                         </form:select>
                        </div>                   
             </div>
             <div class="form-group">
				<label for="hscRoll" class="col-sm-3 control-label">Hsc Roll* </label>
				<div class="col-sm-9">
					<form:input path="hscRoll" id="hscRoll" placeholder="Hsc Roll"
						class="form-control" name="hscRoll"/>
				</div>
			</div>
			  <div class="form-group">
				<label for="session" class="col-sm-3 control-label">Session* </label>
				<div class="col-sm-9">
					<form:input path="versitySession" id="session" placeholder="2011-2012"
						class="form-control" name="session"/>
				</div>
			</div>
			 <div class="form-group">
				<label for="idNumber" class="col-sm-3 control-label">Id Number* </label>
				<div class="col-sm-9">
					<form:input path="versityId" id="idNumber" placeholder="Id Number"
						class="form-control" name="idNumber"/>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-3">Gender</label>
				<div class="col-sm-6">
					<div class="row">
						<div class="col-sm-4">
							<label class="radio-inline"> 
							<form:radiobutton path="gender" id="femaleRadio" value="Female"/>Female
							</label>
						</div>
						<div class="col-sm-4">
							<label class="radio-inline">
							<form:radiobutton path="gender" id="maleRadio" value="Male"/>Male
							</label>
						</div>
					</div>
				</div>
			</div>
			<!-- /.form-group -->
			<div class="form-group">
				<div class="col-sm-9 col-sm-offset-3">
					<span class="help-block">*Required fields</span>
				</div>
			</div>
			<button type="submit" class="btn btn-primary btn-block">Apply</button>
		</form:form>
		<!-- /form -->
	</div>
	<!-- ./container -->
</body>
</html>