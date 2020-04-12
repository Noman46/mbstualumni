
// This AJAX is for Saving the Personal Information Of the Student
jQuery(document).ready(function($) {
	$("#personalInfoForm").submit(function(event) {
		
        var thatForm = $(this)
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		saveJobAjax(thatForm);
		//alert('hi');
		this.reset();
	});
});


function saveJobAjax(thatForm) {
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