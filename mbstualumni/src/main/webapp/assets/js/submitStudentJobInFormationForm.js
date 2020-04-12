

jQuery(document).ready(function($) {
	$("#jobForm").submit(function(event) {
		
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
	data["jobDuration4"] = $("#jobDuration4").val();
	
	data["favouriteQoute"] = $("#favouriteQoute").val();
	                            
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