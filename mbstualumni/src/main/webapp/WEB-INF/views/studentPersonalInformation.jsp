<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Personal Information</title>
<link href="${css}/studentPersonalinfromation.css " rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
<script src="${js}/submitStudentJobInFormationForm.js"></script>
<script src="${js}/submitStudentPersonalInfo.js"></script>
<script type="text/javascript">
	//This is for the Personal Information Section Section
	// Clicking on Yes radio button a text filed appears.
	// Clicking on No radio button the text field disappears.
	function showInputFieldForHobby(x) {
		if (x == 1) {
			document.getElementById('hobbyInput').style.display = 'inline-block';
		}
		if (x == 0) {
			document.getElementById('hobbyInput').style.display = 'none';
		}
	}
	function showInputFieldForBlog(x) {
		if (x == 1) {
			document.getElementById('blogInput').style.display = 'inline-block';
		}
		if (x == 0) {
			document.getElementById('blogInput').style.display = 'none';
		}
	}
	function showInputFieldForVlog(x) {
		if (x == 1) {
			document.getElementById('vlogInput').style.display = 'inline-block';
		}
		if (x == 0) {
			document.getElementById('vlogInput').style.display = 'none';
		}
	}
</script>



<script type="text/javascript">
	// This is to count the inputed charecter inside the text area.
	function countCharcter(maxCharecter, charectersEntered) {
		var charecterThatInputedInTextArea = document
				.getElementById(maxCharecter).value.length;
		document.getElementById(charectersEntered).innerHTML = charecterThatInputedInTextArea;
	}
</script>
</head>

<body>

	<div class="proSettings">
		<form:form modelAttribute="studentImages"
			action="/mbstualumni/student/sendStudentImage" method="post"
			enctype="multipart/form-data">
			<div id="uploadfile">
				<div id="fileLabel">
					<form:label path="file">Select a beautiful image of yours</form:label>
				</div>
				<div id="fileInput">
					<input type="file" name="file" />
				</div>
				<div id="fileButt">
					<input type="submit" value="Submit" />
				</div>
			</div>
		</form:form>
		<form:form modelAttribute="studentJobInformation"
			action="/mbstualumni/student/sendStudentJobInformation" method="post"
			enctype="" id="jobForm">
			<div id="description">
				<p class="textcontrol">Please add your Favorite Quote</p>
				<form:input path="favouriteQoute" type="text" name=""
					autocomplete="off" id="favouriteQoute" />
			</div>

			<div id="job">

				<div id="firstJob">
					<div class="jobNumber">Your First Job</div>
					<div id="companyName">
						<lebel>Company Name</lebel>
						<div id="companyInput">
							<form:input type="text" path="companyName1" autocomplete="off"
								id="companyName1" />
						</div>
						<br> <br>
						<lebel>Your Job Position</lebel>
						<div id="jobPosition">
							<form:input type="text" path="jobPosition1" autocomplete="off"
								id="jobPosition1" />
						</div>
						<br> <br>
						<lebel>Job Duration</lebel>
						<div id="jobDuration">
							<form:input type="text" path="jobDuration1" autocomplete="off"
								id="jobDuration1" />
						</div>
					</div>
				</div>

				<div id="secondJob">
					<div class="jobNumber">Your Second Job</div>
					<div id="companyName">
						<lebel>Company Name</lebel>
						<div id="companyInput">
							<form:input type="text" path="companyName2" autocomplete="off"
								id ="companyName2" />
						</div>
						<br> <br>
						<lebel>Your Job Position</lebel>
						<div id="jobPosition">
							<form:input type="text" path="jobPosition2" autocomplete="off"
								id ="jobPosition2" />
						</div>
						<br> <br>
						<lebel>Job Duration</lebel>
						<div id="jobDuration">
							<form:input type="text" path="jobDuration2" autocomplete="off"
								id="jobDuration2" />
						</div>
					</div>
				</div>
				<div id="thirdJob">
					<div class="jobNumber">Your Third Job</div>
					<div id="companyName">
						<lebel>Company Name</lebel>
						<div id="companyInput">
							<form:input type="text" path="companyName3" autocomplete="off"
								id="companyName3" />
						</div>
						<br> <br>
						<lebel>Your Job Position</lebel>
						<div id="jobPosition">
							<form:input type="text" path="jobPosition3" autocomplete="off"
								id="jobPosition3" />
						</div>
						<br> <br>
						<lebel>Job Duration</lebel>
						<div id="jobDuration">
							<form:input type="text" path="jobDuration3" autocomplete="off"
								id="jobDuration3" />
						</div>
					</div>
				</div>

				<div id="fourthJob">
					<div class="jobNumber">Your Fourth Job</div>
					<div id="companyName">
						<lebel>Company Name</lebel>
						<div id="companyInput">
							<form:input type="text" path="companyName4" autocomplete="off"
								id="companyName4" />
						</div>
						<br> <br>
						<lebel>Your Job Position</lebel>
						<div id="jobPosition">
							<form:input type="text" path="jobPosition4" autocomplete="off"
								id="jobPosition4" />
						</div>
						<br> <br>
						<lebel>Job Duration</lebel>
						<div id="jobDuration">
							<form:input type="text" path="jobDuration4" autocomplete="off"
								id="jobDuration4" />
						</div>


					</div>
				</div>

			</div>
			<div id="divider"></div>





			<div id="description2">
				<input type="submit" value="Submit" />
			</div>
		</form:form>
		<div id="divider2"></div>






		<div id="personalInfo">
			<form:form modelAttribute="studentPersonalInformation"
				action="/mbstualumni/student/sendStudentPersonalInformation"
				method="post" enctype="" id="personalInfoForm">
				<div class="personalSection">Personal Information</div>
				<div id="wrapper1">
					<div id="hobby">
						<lebel> We would like to know about your hobby:</lebel>
					</div>
					<div id="hobbyInputRadio">
						<input type="radio" id="" onclick="showInputFieldForHobby(0)"
							name="studentsHobby" value="no">&nbspNo&nbsp&nbsp <input
							type="radio" id="" onclick="showInputFieldForHobby(1)"
							name="studentsHobby" value="yes">&nbspYes
					</div>
					<div id="hobbyInput">
						<form:input type="text" path="studentHobby" placeholder="Hobbies"
							autocomplete="off" id="studentHobby" />
					</div>
				</div>




				<div id="wrapper2">
					<div id="blog">
						<lebel>We would like to know if you writes any blog:</lebel>
					</div>
					<div id="blogInputRadio">
						<input type="radio" id="" onclick="showInputFieldForBlog(0)"
							name="studentsBlog" value="no">&nbspNo&nbsp&nbsp <input
							type="radio" id="" onclick="showInputFieldForBlog(1)"
							name="studentsBlog" value="yes">&nbspYes
					</div>
					<div id="blogInput">
						<form:input type="text" path="studentBlog" placeholder="URL"
							autocomplete="off" id="studentBlog" />
					</div>
				</div>


				<div id="wrapper3">
					<div id="vlog">
						<lebel>We would like to know if you writes any vlog:</lebel>
					</div>
					<div id="vlogInputRadio">
						<input type="radio" id="" onclick="showInputFieldForVlog(0)"
							name="studentsVlog" value="no">&nbspNo&nbsp&nbsp <input
							type="radio" id="" onclick="showInputFieldForVlog(1)"
							name="studentsVlog" value="yes">&nbspYes
					</div>
					<div id="vlogInput">
						<input type="text" path="studentVlog" placeholder="URL"
							autocomplete="off" id="studentVlog">
					</div>
				</div>




				<div id=wrapper4>
					<div id="blood">
						<label>Blood Group</label>
					</div>
					<div id="bloodInputRadio">
						<form:radiobutton path="studentBloodGroup" value="A+" />
						A+
						<form:radiobutton path="studentBloodGroup" value="A-" />
						A-
						<form:radiobutton path="studentBloodGroup" value="B+" />
						B+
						<form:radiobutton path="studentBloodGroup" value="B-" />
						B+
						<form:radiobutton path="studentBloodGroup" value="AB+" />
						AB+
						<form:radiobutton path="studentBloodGroup" value="AB-" />
						AB-
						<form:radiobutton path="studentBloodGroup" value="O+" />
						O+
						<form:radiobutton path="studentBloodGroup" value="O-" />
						O-
					</div>

				</div>


				<div id="wrapper5">
					<div id="social">
						<lebel>Please Share with us your social networks</lebel>
					</div>
					<div id="book">
						<lebel>Please Share with us your favourite books</lebel>
					</div>
				</div>
				<div id="socialinputText">

					<table class="iconInputField">

						<tr>
							<td><i class="fa fa-github icons"></i></td>
							<td><form:input type="text" path="studentGit"
									autocomplete="off" id="studentGit" /></td>
						</tr>
						<tr>
							<td><i class="fa fa-facebook icons"></i></td>
							<td><form:input type="text" path="studentFb"
									autocomplete="off" id="studentFb" /></td>
						</tr>
						<tr>
							<td><i class="fa fa-linkedin icons"></i></td>
							<td><form:input type="text" path="studentLinkedin"
									autocomplete="off" id="studentLinkedin" /></td>
						</tr>
						<tr>
							<td><i class="fa fa-instagram icons"></i></td>
							<td><form:input type="text" path="studentIn"
									autocomplete="off" id="studentIn" /></td>
						</tr>
						<tr>
							<td><i class="fa fa-twitter icons"></i></td>
							<td><form:input type="text" path="studentTwt"
									autocomplete="off" id="studentTwt" /></td>
						</tr>
					</table>

				</div>

				<div id="bookInputText">

					<table>
						<tr>
							<td><p id="paraForBook">Please add some of your
									favourite books and their description within 300 Charecters</p></td>
						</tr>
						<tr>
							<td id="testAreaBook"><form:textarea maxlength="300"
									id="maxCharecter" path="studentBooks" class="studentBooks"
									onkeyup="countCharcter('maxCharecter','charectersEntered');"
									onkeydown="countCharcter('maxCharecter','charectersEntered');"
									onmouseout="countCharcter('maxCharecter','charectersEntered');" />
								<br> You have entered&nbsp<span style="color: red;"
								id="charectersEntered">0</span>/300&nbspcharecters</td>
						</tr>
					</table>

				</div>
				<div id="butt3">
					<input type="submit" value="Submit" />
				</div>
			</form:form>



		</div>
	</div>

</body>
</html>

</body>
</html>