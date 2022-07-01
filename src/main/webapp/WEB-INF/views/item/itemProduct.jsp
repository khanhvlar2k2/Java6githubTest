<div class="new_arrivals">
		<div class="container">
			<div class="row">
				<div class="col text-center">
					<div class="section_title new_arrivals_title">
						<h2>New Products</h2>
					</div>
				</div>
			</div>
			<div class="row align-items-center">
				<div class="col text-center">
					<div class="new_arrivals_sorting">
						<ul class="arrivals_grid_sorting clearfix button-group filters-button-group">
							<c:forEach var="x" items="${categoName }">
								<button class="btn btn-danger" style="width: 100px; ">${x.name }</button>
							</c:forEach>
							
						</ul>
					</div>
				</div>
			</div>
			<div class="row">
			<c:forEach var="x" items="${product.content }">
				<div class="col-md-3">
					<div class="product-grid">
						<!-- Product 1 -->
						<div class="product-item">
							<div class="product discount product_filter">
								<div class="product_image">
									<img src="/images/${x.image }" alt="">
								</div>
								<div class="favorite favorite_left"></div>
								<div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center"><span>-$20</span></div>
								<div class="product_info">
									<h6 class="product_name"><a href="/index/productDetails/${x.id }">${x.name }</a></h6>
									<div class="product_price">$ ${x.price }<span>$590.00</span></div>
								</div>
							</div>
							<div class="red_button add_to_cart_button"><a href="/index/${x.id }">add to cart</a></div>
						</div>
					</div>
				</div>
					</c:forEach>	
						<nav aria-label="Page navigation example" style="margin-left: 470px">
								<ul class="pagination">
									<li class="page-item"><a class="page-link"
										href="/index?p=0">First</a></li>
									<li class="page-item"><a class="page-link"
										href="/index?p=${product.number-1}">Prev</a></li>
									<li class="page-item"><a class="page-link"
										href="/index?p=${product.number+1}">Next</a></li>
									<li class="page-item"><a class="page-link"
										href="${product.totalPages-1}">Last</a></li>
									
								</ul>
							</nav>
			</div>
		</div>
	</div>