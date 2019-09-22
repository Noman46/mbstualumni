function doRefresh() {
	$.ajax({
		url : "/mbstualumni/getApplicationFormNumber",
		success : function(data) {

			$("#show").html(data);

		}
	});

	setTimeout(function() {
		doRefresh();
	}, 10000);

}

$(document).ready(function() {
	doRefresh();
});