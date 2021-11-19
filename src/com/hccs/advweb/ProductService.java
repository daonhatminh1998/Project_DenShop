package com.hccs.advweb;

import java.util.ArrayList;

public interface ProductService {

	
	public void addProduct(Product product);
	
	public Product getProduct(int Id);
	
	public ArrayList<Product> getProductsList();
	
}
