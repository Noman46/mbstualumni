
function saveLike(postId,profileOwnerId) {

	var data = {};
//	alert("postId"+"---"+postId+"---applicationId"+profileOwnerId);

	data["postId"] = postId;
	data["applicationId"] = profileOwnerId ;
	

	$.ajax({
		type : "post",
		contentType : "application/json",
		url : "/mbstualumni/student/saveLike",
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
		
