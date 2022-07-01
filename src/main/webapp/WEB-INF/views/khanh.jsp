<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Login V18</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="/css/util.css">
<link rel="stylesheet" type="text/css" href="/css/main.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<!--===============================================================================================-->
</head>
<body style="background-color: #666666;">

	<div class="limiter" style="width: 80%;">
		<div class="container-login100">
			<div class="wrap-login100">

				<form action="khanh" method="post"
					class="login100-form validate-form">
					<span class="login100-form-title p-b-43"> Login to continue

					</span>


					<div class="wrap-input100 validate-input"
						data-validate="Valid email is required: ex@abc.xyz">

						<input class="input100" type="text" name="username"
							value="${accountneeded.getUsername() }"> <span
							class="label-input100">Username</span>
					</div>
					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" name="password"
							value="${accountneeded.getPassword() }"> <span
							class="focus-input100"></span> <span class="label-input100">Password</span>
					</div>
					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" name="fullname"
							value="${accountneeded.getFullname() }"> <span
							class="focus-input100"></span> <span class="label-input100">FullName</span>
					</div>
					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" name="email"
							value="${accountneeded.getEmail() }"> <span
							class="focus-input100"></span> <span class="label-input100">Email</span>
					</div>
					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" name="photo"
							value="${accountneeded.getPhoto() }"> <span
							class="focus-input100"></span> <span class="label-input100">Photo</span>
					</div>
					<div class="flex-sb-m w-full p-t-3 p-b-32">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox"
								name="remember-me"> <label class="label-checkbox100"
								for="ckb1"> Remember me </label>
						</div>

						<div>
							<button type="submit" class="login100-form-btn" name="btnForget">
								Forgot Password?</button>
						</div>
					</div>
					<h1></h1>

					<div class="container-login100-form-btn">
						<button name="btnLoginzzz" type="submit" class="login100-form-btn">
							Login</button>
					</div>
					<div class="container-login100-form-btn">
						<button name="btnUpdatezz" formaction="/khanh/update"
							type="submit" class="login100-form-btn">Update</button>


					</div>
					<div class="text-center p-t-46 p-b-20">
						<span class="txt2"> or sign up using </span>
					</div>

					<div class="login100-form-social flex-c-m">
						<a href="#" class="login100-form-social-item flex-c-m bg1 m-r-5">
							<i class="fa fa-facebook-f" aria-hidden="true"></i>
						</a> <a href="#" class="login100-form-social-item flex-c-m bg2 m-r-5">
							<i class="fa fa-twitter" aria-hidden="true"></i>
						</a>
					</div>
				</form>
				<form action="khanh" method="post" class="position-absolute" style="top:1035px; right:300px">
					<input  type="text" name="searchInput" style="width:200px; background-color: gray; color: white; border-radius: 10px; line-height: 30px "> 
					<button name ="btnSearchne" class="btn btn-success" style="height: 35px">search</button>
				</form>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">UserName</th>
							<th scope="col">Password</th>
							<th scope="col">Fullname</th>
							<th scope="col">Email</th>
							<th scope="col">Photo</th>
							<th scope="col">Remove</th>
							<th scope="col">Edit</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="x" items="${accountjs}">
							<tr>
								<td>${x.username }</td>
								<td>${x.password }</td>
								<td>${x.fullname }</td>
								<td>${x.email }</td>
								<td>${x.photo }</td>
								<td><a href="/khanh/remove/${x.username }">Remove</a></td>
								<td><a href="/khanh/edit/${x.username }">Edit</a></td>


							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	</div>





	<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>