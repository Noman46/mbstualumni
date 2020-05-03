// This AJAX is for Saving the JOB INFORMATION Of the Student
jQuery(document).ready(
		function($) {
			$("#btnPost").click(
					function(event) {

						// Prevent the form from submitting via the browser.
						event.preventDefault();
						const queryString = window.location.search;
						const urlParams = new URLSearchParams(queryString);
						const applicationId = urlParams.get('applicationId');
						const verifiedStudentVersityId = urlParams.get('verifiedStudentVersityId');
						var postAreaValue = $('#postArea').val();
						
						if(postAreaValue != ''){
							saveStudentPostAJAX(applicationId,verifiedStudentVersityId);
						}
						else if(postAreaValue == ''){
							alert("Hei, Write Something inside the Post area !!! What I should save?");
						}
						
						$('#postArea').val('');
					})
		});

function saveStudentPostAJAX(applicationId, verifiedStudentVersityId) {

	var data = {};

	data["post"] = $("#postArea").val();
	data["applicationId"] = applicationId;
	data["verifiedStudentVersityId"] = verifiedStudentVersityId;

	$.ajax({
		type : "post",
		contentType : "application/json",
		url : "/mbstualumni/student/savePost",
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