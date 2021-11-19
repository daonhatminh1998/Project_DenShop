package com.hccs.advweb;

import java.util.ArrayList;

public interface ProductDAO {

	public void addProduct(Product product);
	
	public ArrayList<Product> getProductsList();
	
	public Product getProduct(int Id);
	
}
