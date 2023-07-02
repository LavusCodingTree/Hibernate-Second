package com.js.controller;

import com.js.dao.ProductCRUD;
import com.js.dto.Product;

public class DeleteProductById {

	public static void main(String[] args) {
		ProductCRUD pc = new ProductCRUD();
		if(pc.deleteProductById(6)) {
			System.out.println("Deleted Sucessfully");
		}else {
			System.err.println("Failed To Delete");
		}
		
	}
}