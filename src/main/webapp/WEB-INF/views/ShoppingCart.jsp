<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping Cart</title>
<link rel="stylesheet" href="/css/cart.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<jsp:include page="item/linkHeader.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="item/itemHeader.jsp"></jsp:include>

	<section class="h-120 h-custom" style="background-color: #eee;">
		<div class="container h-100 py-5">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col">
					<div class="card shopping-cart" style="border-radius: 15px;">
						<div class="card-body text-black">

							<div class="row">
								<div class="col-lg-6 px-5 py-4">
									<h3 class="mb-5 pt-2 text-center fw-bold text-uppercase">Your
										products</h3>
									<c:forEach var="x" items="${cart.getItems() }">
										<div class="d-flex align-items-center mb-5">
											<div class="flex-shrink-0">
												<img src="/images/${x.image }" class="img-fluid"
													style="width: 60px; height: 60px; margin-right: 20px; border-radius: 10px"
													alt="Generic placeholder image">
											</div>
											<div class="flex-grow-1 ms-3">

												<h5 class="text-primary">${x.productName }</h5>
												<h6 style="color: #9e9e9e;">Color: ${x.productId }</h6>
												<div class="d-flex align-items-center">
													<p class="fw-bold mb-0 me-5 pe-3" style="color: red">
														$ ${x.price}
														<del style="color: grey; margin-right: 10px">$
															${x.oldprice }</del>
													</p>
													<form action="/cart/update/${x.productId}" method="post">
														<input type="number" class="input-sm text-center"
															onchange="this.form.submit()" name="quantity" min="1"
															max="99"
															value="${ x.quantity <= 0 || x.quantity >= 100 ?  x.setQuantity(1) : x.quantity }"
															style="width: 100%;">
													</form>
													<p style="margin-left: 200px"><a href="/cart/remove/${x.productId }"> remove</a></p>
												</div>
											</div>
										</div>
									</c:forEach>


									<hr class="mb-4"
										style="height: 2px; background-color: #1266f1; opacity: 1;">

									<div class="d-flex justify-content-between p-2 mb-2"
										style="background-color: #e1f5fe;">
										<h5 class="fw-bold mb-0">Total:</h5>
										<h5 class="fw-bold mb-0">${cart.getAmount()}$</h5>
									</div>
								</div>
								<div class="col-lg-6 px-5 py-4">

									<h3 class="mb-5 pt-2 text-center fw-bold text-uppercase">Payment</h3>

									<form class="mb-5" action="/cart/khanh" method="get">

										<div class="form-outline mb-5">
											<input name="email" type="text" id="typeText"
												class="form-control form-control-lg" size="17"
												value="${userCart.getEmail() }" minlength="19" maxlength="100" />
											<label class="form-label" for="typeText">Email</label>
										</div>

											<input name="account" id="typeName"
												class="form-control form-control-lg" size="17"
												value="${userCart.getUsername()}"/> <label class="form-label"
												for="typeName">Name </label>

										<div class="row">
											<div class="col-md-12 mb-5">
												<div class="form-outline">
													<input name="address" type="text" id="typeExp"
														class="form-control form-control-lg" value=""
														size="7" id="exp" minlength="7" maxlength="50" /> <label
														class="form-label" for="typeExp">Địa chỉ</label>
												</div>
											</div>
											
										</div>
										<p class="mb-5">
											If you have any questions, just text us <a
												href="https://www.facebook.com/KhanhsiTea/">Contact Me</a>.
										</p>
											<button formaction="/cart/khanh"  class="btn btn-primary btn-block btn-lg">Buy
											now</button>
										<h5 class="fw-bold mb-5"
											style="position: absolute; bottom: 0;">
											<a href="/product"><i class="fa fa-angle-left me-2"></i>Back
												to shopping</a>
										</h5>
									</form>

								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
<jsp:include page="item/itemFooter.jsp"></jsp:include>
</html>