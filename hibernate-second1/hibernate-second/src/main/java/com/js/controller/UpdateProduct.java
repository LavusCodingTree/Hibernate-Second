package com.js.controller;

import com.js.dao.ProductCRUD;
import com.js.dto.Product;

public class UpdateProduct {

	public static void main(String[] args) {
		Product p = new Product();
		p.setName("watch");
		p.setBrand("titan");
		p.setPrice(2000);
		p.setQuantity(100);

		ProductCRUD pc = new ProductCRUD();
		if (pc.UpdateProductById(1, p)) {
			System.out.println("Updated");
		} else {
			System.out.println("failed");
		}

	}
}
