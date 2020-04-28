
// This AJAX is for Saving the JOB INFORMATION Of the Student
jQuery(document).ready(function($) {
	$("#jobForm").submit(function(event) {
		
        
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		var thatForm = $(this);
		const queryString = window.location.search;
		//alert(queryString);
		const urlParams = new URLSearchParams(queryString);
		const applicationId = urlParams.get('applicationId')
		//alert(applicationId);
		const verifiedStudentVersityId = urlParams.get('verifiedStudentVersityId')
		//alert(verifiedStudentVersityId);
		applicationId
		saveJOBAJAX(thatForm,applicationId,verifiedStudentVersityId);
		//alert('hi');
		this.reset();
	})
});


function saveJOBAJAX(thatForm,applicationId,verifiedStudentVersityId) {
	var url = thatForm.attr('action'),
	    type = thatForm.attr('method'),
	    data = {};
	
	
	                              //console.log(url);
	                              //console.log(type);
	data["favouriteQoute"] = $("#favouriteQoute").val();
	data["companyName1"] = $("#companyName1").val();
	data["jobPosition1"] = $("#jobPosition1").val();
	data["jobDuration1"] = $("#jobDuration1").val();
	data["companyName2"] = $("#companyName2").val();
	data["jobPosition2"] = $("#jobPosition2").val();
	data["jobDuration2"] = $("#jobDuration2").val();
	data["companyName3"] = $("#companyName3").val();
	data["jobPosition3"] = $("#jobPosition3").val();
	data["jobDuration3"] = $("#jobDuration3").val();
	data["companyName4"] = $("#companyName4").val();
	data["jobPosition4"] = $("#jobPosition4").val();
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