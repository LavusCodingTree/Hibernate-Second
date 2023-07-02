package com.js.controller;

import com.js.dao.ProductCRUD;
import com.js.dto.Product;

public class InsertProduct {

	public static void main(String[] args) {
	Product p = new Product();
	p.setName("watch");
	p.setBrand("noise");
	p.setPrice(3499);
	p.setQuantity(20);
	
	ProductCRUD pc = new ProductCRUD();
	if(pc.insertProduct(p)) {
		System.out.println("inserted successfully");
	}else {
		System.out.println("failed to insert");
	}

	}

}
