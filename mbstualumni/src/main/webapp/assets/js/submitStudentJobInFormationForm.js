

jQuery(document).ready(function($) {
	$("#jobForm").submit(function(event) {
		

		// Prevent the form from submitting via the browser.
		event.preventDefault();
		saveJobAjax();
		//alert('hi');
		this.reset();
	});
});


function saveJobAjax() {
	var data = {}
	data["companyName1"] = $("#companyName1").val();
	
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "/mbstualumni/saveJob",
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