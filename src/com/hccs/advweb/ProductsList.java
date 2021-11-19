package com.hccs.advweb;

import java.util.ArrayList;

public class ProductsList {

	private static ArrayList<Product> productsList;
	
	public static ArrayList<Product> getProductsList() {
		return productsList;
	}
	public static void setProductsList(ArrayList<Product> productsList) {
		productsList = productsList;
	}

	public static ArrayList<Product> addStudent(Product product) {
		getProductsList().add(product);
		return productsList;
	}
	

}
