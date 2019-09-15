<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
<script>
 $(document).ready(function(){
	 
	 $("#time_button").click(function(){
		 //alert("I am clicked");
		 
		 $.ajax({
			 
			 url : '/mbstualumni/test/date',
			 success : function(data){
				 
				 $("#show").html(data)
			 }
			 
		 });
	 })
	 
 })
 
</script>
</head>
<body>
<h1>Ajax Test page</h1>

<button id ="time_button">Get Time</button>

<p id = "show"></p>
</body>
</html>