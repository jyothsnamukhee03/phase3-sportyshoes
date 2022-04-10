package org.sporty_shoes.repository;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sporty_shoes.model.Admin;
import org.springframework.orm.hibernate5.HibernateTemplate;

@SuppressWarnings("deprecation")
public class Repository {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	public boolean forgotPassword(String email,String password) {
		Session session=hibernateTemplate.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();  
		@SuppressWarnings("unchecked")
		Query<Admin> q=session.createQuery("update Admin set password=:p where email=:e");  
		q.setParameter("e",email);  
		q.setParameter("p",password);  
		  
		int status=q.executeUpdate();  
		System.out.println(status);  
		tx.commit();  
		return status>0?true:false;
	}
}