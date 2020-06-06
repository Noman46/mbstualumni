<div id="side-navbar">

	<div class="side-nav">
		<div class="logo">
			<i class="fa fa-tachometer"></i> <span>Brand</span>
		</div>

		<nav>
			<ul>
				<li>
				<a href="#"> <span><i class="fa fa-user"></i></span> <span>Users</span></a>
				</li>
				
				<li>
					<a href="#"> <span><i class="fa fa-envelope"></i></span><span>Messages</span></a>
				</li>
				<li class="active">
					<a href="#"> <span><i class="fa fa-bar-chart"></i></span> <span>Analytics</span></a>
				</li>
				<li>
					<a href="#"> <span><i class="fa fa-credit-card-alt"></i></span> <span>Payments</span></a>
				</li>
				<li>
					<a href="#"> <span><i class="fa fa-university" aria-hidden="true"></i></span> <span>MBSTU Life</span></a>
				</li>
				
			</ul>
		</nav>
		<form:form modelAttribute="mbstuImages" action="/mbstualumni/savembstulifeimage" method="post" enctype="multipart/form-data">
			<div id="uploadfile">
				<div id="fileLabel">
					
				</div>
				<div id="fileInput">
					<input type="file" name="file" />
				</div>
				<div id="fileButt">
					<input type="submit" value="Submit" />
				</div>
			</div>
		</form:form>


	</div>
</div>