function doRefresh(){
	   $.ajax({
	      url : "/mbstualumni/adminView1",
	      
	      success : function(data){
				 
				 $("#show").html(data)
			 }
	   });
	   setTimeout(function() {
	      doRefresh();
	   }, 2000);
	}

	$(document).ready(function () {
	  doRefresh(); 
	});