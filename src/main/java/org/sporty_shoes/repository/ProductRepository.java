package org.sporty_shoes.repository;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sporty_shoes.model.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;


public class ProductRepository {

	
	HibernateTemplate hibernateTemplate;

	
	public ProductRepository() {
		super();
	}

	
	public ProductRepository(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public List<Product> getAllProducts(){
		
		List<Product> productList=hibernateTemplate.loadAll(Product.class);
		return productList;
		
	}
	
	public Boolean deleteProduct(int id) {
		
		try {
		Session session=hibernateTemplate.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Product p=session.get(Product.class, id);
		session.delete(p);
		transaction.commit();
		session.close();
		}
		catch(Exception e) {
			return false;
		}
		return true;
	}
}