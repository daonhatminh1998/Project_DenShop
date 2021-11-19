package com.hccs.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public void addProduct(Product product) {
		productDAO.addProduct(product);		
	}

	@Override
	@Transactional
	public ArrayList<Product> getProductsList() {
		return productDAO.getProductsList();
	}

	@Override
	@Transactional
	public Product getProduct(int Id) {
		return productDAO.getProduct(Id);
	}	

}
