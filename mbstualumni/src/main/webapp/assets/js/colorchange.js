document.getElementById("colorChangeOption").addEventListener("click",
		function() {
			var colorChangeOption = document.getElementById("colorChange");
			if (colorChangeOption.style.display === "none") {
				colorChangeOption.style.display = "block";
			} else {
				colorChangeOption.style.display = "none";
			}
		})

function callGreen() {

	var GREEN = document.getElementsByClassName("side-nav");
	GREEN[0].style.backgroundColor = "green";
}