<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Form</title>
</head>
<body>

	<div class="container">

		<div class="card mx-auto mt-5 " style="width: 80%;">
			<div class="card-body">
				<h3 class="text-center  " style="text-transform: uppercase;">form</h3>
				<form class="mt-3" action="handleform" method="post">


					<div class="form-group">
						<label for="formGroupExampleInput">Name</label> <input type="text"
							class="form-control" id="formGroupExampleInput" name="name"
							placeholder="Enter your Name">
					</div>


					<div class="form-group">
						<label for="formGroupExampleInput">ID</label> <input type="text" name="id"
							class="form-control" id="formGroupExampleInput"
							placeholder="Enter your ID">
					</div>


					<div class="form-group">
						<label for="formGroupExampleInput">your DOB</label> <input
							type="text" class="form-control" id="formGroupExampleInput" name="date"
							placeholder="dd/mm/yy">
					</div>
					<div class="form-group">
						<select class="custom-select" multiple name="courses">

							<option value="1">Java</option>
							<option value="2">python</option>
							<option value="3">C++</option>
							<option value="3">Django</option>
							<option value="3">React</option>
						</select>
					</div>


					<fieldset class="form-group">
						<div class="row">
							<legend class="col-form-label col-sm-3 pt-0">Select
								Gender</legend>
							<div class="col-sm-0">
								<div class="form-check">
									<input class="form-check-input" type="radio" name="gender"
										id="gridRadios1" value="Male" checked> <label
										class="form-check-label" for="gridRadios1"> Male </label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="radio" name="gender"
										id="gridRadios2" value="Female"> <label
										class="form-check-label" for="gridRadios2"> Female </label>
								</div>

							</div>
						</div>
					</fieldset>
					<div class="form-group">
						<select class="form-control form-control-sm" name="type">
							<option>Old Student</option>
							<option>Normal Student</option>
						</select>
					</div>
					<div class="card">
					<div class="card-body">
					<p>your address</p>
					<div class="form-group">
					<input type="text" name="address.street" class="form-control" placeholder="Enter street">
					
					</div>
					<div class="form-group">
					<input type="text" name="address.city" class="form-control" placeholder="Enter city">
					
					</div>
					
					</div>
					
					</div>

					<div class="container text-center">
						<button type="submit" class="btn btn-primary">Submit</button>


					</div>


				</form>

			</div>

		</div>

	</div>






	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>