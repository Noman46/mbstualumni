$(document).ready(
		function() {

			// SUBMIT FORM
			$("#jobForm").submit(function(event) {
				// Prevent the form from submitting via the browser.
				event.preventDefault();
				ajaxPost();
			});

			function ajaxPost() {

				
				
				var formData = {
						favouriteQoute : $("#favouriteQoute").val(),
						companyName1 : $("#companyName1").val(),
						jobPosition1 : $("#jobPosition1").val(),
						jobDuration1 : $("#jobDuration1").val(),
						companyName2 : $("#companyName2").val(),
						jobPosition2 : $("#jobPosition2").val(),
						jobDuration2 : $("#jobDuration2").val(),
						companyName3 : $("#companyName3").val(),
						jobPosition3 : $("#jobPosition3").val(),
						jobDuration3 : $("#jobDuration3").val(),
						companyName4 : $("#companyName4").val(),
						jobPosition4 : $("#jobPosition4").val(),
						jobDuration4 : $("#jobDuration4").val(),
				}
				alert('votore');

				// DO POST
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "sendStudentJobInformation",
					data : JSON.stringify(formData),
					dataType : 'json',
					success : function(result) {
						
						
					}
					
				});

			}

		})