
// This AJAX is for Saving the Personal Information Of the Student
jQuery(document).ready(function($) {
	$("#personalInfoForm").submit(function(event) {
		
        
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		const queryString = window.location.search;
		var thatForm = $(this);
		//alert(queryString);
		const urlParams = new URLSearchParams(queryString);
		const applicationId = urlParams.get('applicationId')
		//alert(applicationId);
		const verifiedStudentVersityId = urlParams.get('verifiedStudentVersityId')
		//alert(verifiedStudentVersityId);
		applicationId
		savePersonalInfoAjax(thatForm,applicationId,verifiedStudentVersityId);
		//alert('hi');
		this.reset();
	});
});


function savePersonalInfoAjax(thatForm,applicationId,verifiedStudentVersityId) {
	var url = thatForm.attr('action'),
	    type = thatForm.attr('method'),
	    data = {};
	
	
	                              //console.log(url);
	                              //console.log(type);
	
	data["studentHobby"] = $("#studentHobby").val();
	data["studentBlog"] = $("#studentBlog").val();
	data["studentVlog"] = $("#studentVlog").val();
	data["studentBloodGroup"] = $("input[name='studentBloodGroup']:checked").val();
	data["studentGit"] = $("#studentGit").val();
	data["studentFb"] = $("#studentFb").val();
	data["studentLinkedin"] = $("#studentLinkedin").val();
	data["studentIn"] = $("#studentIn").val();
	data["studentTwt"] = $("#studentTwt").val();
	data["studentBooks"] = $("#maxCharecter").val();
	data["applicationId"] = applicationId;
	data["verifiedStudentVersityId"] = verifiedStudentVersityId;
	
	
	                            //console.log(data);

	
$.ajax({
		type : type,
		contentType : "application/json",
		url : url,
		data : JSON.stringify(data),
		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			console.log("SUCCESS: ", data);
			
		},
		error : function(e) {
			console.log("ERROR: ", e);
			
		},
		done : function(e) {
			console.log("DONE");
		}
	});
}