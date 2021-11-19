package com.hccs.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Product> getProductsList() {
		ArrayList<Product> productsList = 
				(ArrayList<Product>)sessionFactory.
				getCurrentSession().createQuery("FROM Product").
				list();
		return productsList;
	}

	@Override
	public Product getProduct(int Id) {
		Product product = (Product)sessionFactory.getCurrentSession().get(Product.class, Id);
		return product;
	}

}
