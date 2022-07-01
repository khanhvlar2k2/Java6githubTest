<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html style="font-size: 16px;">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="utf-8">
<meta name="keywords"
	content="LUXURY STUFFS, Supporting Your Success, ​Small Pricing Plan For Your Creative Business">
<meta name="description" content="">
<title>Product</title>
<link rel="stylesheet" href="/nicepage.css" media="screen">
<link rel="stylesheet" href="/Product.css" media="screen">
<script class="u-script" type="text/javascript" src="/jquery.js" defer=""></script>
<script class="u-script" type="text/javascript" src="/nicepage.js"
	defer=""></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta name="generator" content="Nicepage 4.11.3, nicepage.com">
<link id="u-theme-google-font" rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
	<jsp:include page="item/linkHeader.jsp"></jsp:include>
	




<meta name="theme-color" content="#478ac9">
<meta property="og:title" content="Product">
<meta property="og:type" content="website">
</head>
<body class="u-body u-xl-mode">
	<jsp:include page="item/itemHeader.jsp"></jsp:include>
	<section class="u-clearfix u-section-1" id="sec-09d0">
		<div class="u-clearfix u-sheet u-sheet-1">
			<div
				class="u-clearfix u-expanded-width u-gutter-0 u-layout-wrap u-layout-wrap-1">
				<div class="u-layout" style="">
					<div class="u-layout-row" style="">
						<div
							class="u-align-center u-container-style u-layout-cell u-left-cell u-size-30 u-size-xs-60 u-white u-layout-cell-1"
							src="">
							<div class="u-container-layout u-container-layout-1">
								<span
									class="u-file-icon u-icon u-icon-circle u-palette-1-base u-icon-1"><img
									src="images/${prd[0].image }" alt=""></span>
								<h2 class="u-text u-text-1">${prd[0].name }</h2>
								<p class="u-text u-text-2">We dont care who you are, we care
									about the fitness and exercise habits</p>
								<blockquote class="u-text u-text-3">Only $
									${prd[0].price }</blockquote>
								<a href=""
									class="u-active-none u-border-2 u-border-palette-1-base u-btn u-btn-rectangle u-button-style u-hover-none u-none u-btn-1">learn
									more</a>
							</div>
						</div>
						<div
							class="u-align-center u-container-style u-image u-layout-cell u-right-cell u-size-30 u-size-xs-60 u-image-1"
							src="" data-image-width="4189" data-image-height="3351">
							<div
								class="u-container-layout u-valign-middle u-container-layout-2"
								src=""></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="u-align-center u-clearfix u-section-2" id="sec-6444">
		<div class="u-clearfix u-sheet u-sheet-1">
			<h1 class="u-text u-text-default u-title u-text-1">Supporting
				Your Success</h1>
			<p class="u-large-text u-text u-text-variant u-text-2">
				The iPhone is&nbsp;<b>a smartphone made by Apple that combines a
					computer, iPod, digital camera and cellular phone into one device
					with a touchscreen interface</b>. The iPhone runs the iOS operating
				system, and in 2021 when the iPhone 13 was introduced, it offered up
				to 1 TB of storage and a 12-megapixel camera.
			</p>
			<a href=""
				class="u-border-2 u-border-grey-dark-1 u-btn u-btn-round u-button-style u-radius-50 u-btn-1">Read
				More</a>
		</div>
	</section>
	<section class="u-clearfix u-section-3" id="carousel_6e7d">
		<form>
			<div class="u-clearfix u-sheet u-sheet-1">
				<div class="u-align-center u-container-style u-group u-group-1">
					<div class="u-container-layout">
						<h2 class="u-text u-text-1">Explore our having devices.</h2>
						<h4 class="u-text u-text-1">Products</h4>

						<select style="float: right; width: 150px">
							<option value="All">All</option>
							<c:forEach var="z" items="${categoName }">
								<option >${z.name }</option>
							</c:forEach>
							
						</select>
					</div>
				</div>
				<div
					class="u-clearfix u-expanded-width u-gutter-30 u-layout-wrap u-layout-wrap-1">
					<div class="u-layout">
						<div class="u-layout-row">
							<c:forEach var="item" items="${product.content}">
								<div
									class="u-align-center u-container-style u-layout-cell u-left-cell u-size-15 u-size-30-md u-layout-cell-1">
									<div class="u-container-layout">
										<img class="u-image u-image-round u-radius-10 u-image-1"
											src="/images/${item.image }" alt="" id="imageProduct">
										<a href="/product/${item.id }" class="u-active-none u-btn u-button-style u-hover-none u-none u-text-hover-palette-2-base u-text-palette-1-base u-btn-1"><span class="u-icon u-text-palette-2-base"><svg class="u-svg-content" viewBox="0 0 511.334 511.334" style="width: 1em; height: 1em;"><path d="m506.887 114.74c-3.979-5.097-10.086-8.076-16.553-8.076h-399.808l-5.943-66.207c-.972-10.827-10.046-19.123-20.916-19.123h-42.667c-11.598 0-21 9.402-21 21s9.402 21 21 21h23.468l23.018 256.439c.005.302-.01.599.007.903.047.806.152 1.594.286 2.37l.842 9.376c.016.177.034.354.055.529 2.552 22.11 13.851 41.267 30.19 54.21-8.466 10.812-13.532 24.407-13.532 39.172 0 35.106 28.561 63.667 63.666 63.667 35.106 0 63.667-28.561 63.667-63.667 0-7.605-1.345-14.9-3.801-21.667h114.936c-2.457 6.767-3.801 14.062-3.801 21.667 0 35.106 28.561 63.667 63.667 63.667s63.667-28.561 63.667-63.667-28.561-63.667-63.667-63.667h-234.526c-15.952 0-29.853-9.624-35.853-23.646l335.608-19.724c9.162-.538 16.914-6.966 19.141-15.87l42.67-170.67c1.567-6.272.158-12.918-3.821-18.016z"></path>
                  </svg><img></span>&nbsp;Add to cart
                  </a>
										
										<h4  class="u-text u-text-2" style="top: 10px; ">${item.name }</h4>
										<h6 class="u-text u-text-2">$ ${item.price }</h6>
									</div>
								</div>
							</c:forEach>

							<nav aria-label="Page navigation example" style="margin-left: 470px">
								<ul class="pagination">
									<li class="page-item"><a class="page-link"
										href="/product?p=0">First</a></li>
									<li class="page-item"><a class="page-link"
										href="/product?p=${product.number-1}">Prev</a></li>
									<li class="page-item"><a class="page-link"
										href="${product.number+1}">Next</a></li>
									<li class="page-item"><a class="page-link"
										href="${product.totalPages-1}">Last</a></li>
									
								</ul>
							</nav>
						</div>
					</div>
				</div>
			</div>
		</form>
	</section>


	<footer class="u-clearfix u-footer u-grey-80" id="sec-3c67"
		style="top: 25px">
		<div class="u-clearfix u-sheet u-sheet-1">
			<div
				class="u-align-left u-social-icons u-spacing-10 u-social-icons-1">
				<a class="u-social-url" title="facebook" target="_blank" href=""><span
					class="u-icon u-social-facebook u-social-icon u-icon-1"><svg
							class="u-svg-link" preserveAspectRatio="xMidYMin slice"
							viewBox="0 0 112 112" style="">
							<use xmlns:xlink="http://www.w3.org/1999/xlink"
								xlink:href="#svg-ebf4"></use></svg>
						<svg class="u-svg-content" viewBox="0 0 112 112" x="0" y="0"
							id="svg-ebf4">
							<circle fill="currentColor" cx="56.1" cy="56.1" r="55"></circle>
							<path fill="#FFFFFF"
								d="M73.5,31.6h-9.1c-1.4,0-3.6,0.8-3.6,3.9v8.5h12.6L72,58.3H60.8v40.8H43.9V58.3h-8V43.9h8v-9.2
            c0-6.7,3.1-17,17-17h12.5v13.9H73.5z"></path></svg></span>
				</a> <a class="u-social-url" title="twitter" target="_blank" href=""><span
					class="u-icon u-social-icon u-social-twitter u-icon-2"><svg
							class="u-svg-link" preserveAspectRatio="xMidYMin slice"
							viewBox="0 0 112 112" style="">
							<use xmlns:xlink="http://www.w3.org/1999/xlink"
								xlink:href="#svg-7bbc"></use></svg>
						<svg class="u-svg-content" viewBox="0 0 112 112" x="0" y="0"
							id="svg-7bbc">
							<circle fill="currentColor" class="st0" cx="56.1" cy="56.1"
								r="55"></circle>
							<path fill="#FFFFFF"
								d="M83.8,47.3c0,0.6,0,1.2,0,1.7c0,17.7-13.5,38.2-38.2,38.2C38,87.2,31,85,25,81.2c1,0.1,2.1,0.2,3.2,0.2
            c6.3,0,12.1-2.1,16.7-5.7c-5.9-0.1-10.8-4-12.5-9.3c0.8,0.2,1.7,0.2,2.5,0.2c1.2,0,2.4-0.2,3.5-0.5c-6.1-1.2-10.8-6.7-10.8-13.1
            c0-0.1,0-0.1,0-0.2c1.8,1,3.9,1.6,6.1,1.7c-3.6-2.4-6-6.5-6-11.2c0-2.5,0.7-4.8,1.8-6.7c6.6,8.1,16.5,13.5,27.6,14
            c-0.2-1-0.3-2-0.3-3.1c0-7.4,6-13.4,13.4-13.4c3.9,0,7.3,1.6,9.8,4.2c3.1-0.6,5.9-1.7,8.5-3.3c-1,3.1-3.1,5.8-5.9,7.4
            c2.7-0.3,5.3-1,7.7-2.1C88.7,43,86.4,45.4,83.8,47.3z"></path></svg></span>
				</a> <a class="u-social-url" title="instagram" target="_blank" href=""><span
					class="u-icon u-social-icon u-social-instagram u-icon-3"><svg
							class="u-svg-link" preserveAspectRatio="xMidYMin slice"
							viewBox="0 0 112 112" style="">
							<use xmlns:xlink="http://www.w3.org/1999/xlink"
								xlink:href="#svg-d841"></use></svg>
						<svg class="u-svg-content" viewBox="0 0 112 112" x="0" y="0"
							id="svg-d841">
							<circle fill="currentColor" cx="56.1" cy="56.1" r="55"></circle>
							<path fill="#FFFFFF"
								d="M55.9,38.2c-9.9,0-17.9,8-17.9,17.9C38,66,46,74,55.9,74c9.9,0,17.9-8,17.9-17.9C73.8,46.2,65.8,38.2,55.9,38.2
            z M55.9,66.4c-5.7,0-10.3-4.6-10.3-10.3c-0.1-5.7,4.6-10.3,10.3-10.3c5.7,0,10.3,4.6,10.3,10.3C66.2,61.8,61.6,66.4,55.9,66.4z"></path>
							<path fill="#FFFFFF"
								d="M74.3,33.5c-2.3,0-4.2,1.9-4.2,4.2s1.9,4.2,4.2,4.2s4.2-1.9,4.2-4.2S76.6,33.5,74.3,33.5z"></path>
							<path fill="#FFFFFF"
								d="M73.1,21.3H38.6c-9.7,0-17.5,7.9-17.5,17.5v34.5c0,9.7,7.9,17.6,17.5,17.6h34.5c9.7,0,17.5-7.9,17.5-17.5V38.8
            C90.6,29.1,82.7,21.3,73.1,21.3z M83,73.3c0,5.5-4.5,9.9-9.9,9.9H38.6c-5.5,0-9.9-4.5-9.9-9.9V38.8c0-5.5,4.5-9.9,9.9-9.9h34.5
            c5.5,0,9.9,4.5,9.9,9.9V73.3z"></path></svg></span>
				</a> <a class="u-social-url" title="linkedin" target="_blank" href=""><span
					class="u-icon u-social-icon u-social-linkedin u-icon-4"><svg
							class="u-svg-link" preserveAspectRatio="xMidYMin slice"
							viewBox="0 0 112 112" style="">
							<use xmlns:xlink="http://www.w3.org/1999/xlink"
								xlink:href="#svg-bae3"></use></svg>
						<svg class="u-svg-content" viewBox="0 0 112 112" x="0" y="0"
							id="svg-bae3">
							<circle fill="currentColor" cx="56.1" cy="56.1" r="55"></circle>
							<path fill="#FFFFFF"
								d="M41.3,83.7H27.9V43.4h13.4V83.7z M34.6,37.9L34.6,37.9c-4.6,0-7.5-3.1-7.5-7c0-4,3-7,7.6-7s7.4,3,7.5,7
            C42.2,34.8,39.2,37.9,34.6,37.9z M89.6,83.7H76.2V62.2c0-5.4-1.9-9.1-6.8-9.1c-3.7,0-5.9,2.5-6.9,4.9c-0.4,0.9-0.4,2.1-0.4,3.3v22.5
            H48.7c0,0,0.2-36.5,0-40.3h13.4v5.7c1.8-2.7,5-6.7,12.1-6.7c8.8,0,15.4,5.8,15.4,18.1V83.7z"></path></svg></span>
				</a>
			</div>
		</div>
	</footer>
	<section class="u-backlink u-clearfix u-grey-80">
		<a class="u-link" href="https://nicepage.com/website-templates"
			target="_blank"> <span>Website Templates</span>
		</a>
		<p class="u-text">
			<span>created with</span>
		</p>
		<a class="u-link" href="" target="_blank"> <span>Website
				Builder Software</span>
		</a>.
	</section>
</body>
</html>