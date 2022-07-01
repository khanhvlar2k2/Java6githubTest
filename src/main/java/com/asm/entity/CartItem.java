package com.asm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {

	Integer productId;
	String productName;
	double oldprice;
	double price;
	int quantity = 1;
	String image;
	Double sale;
	
	
}
