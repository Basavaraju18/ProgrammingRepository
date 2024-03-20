package com.basava.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
	
	private void saveToTable() {
		Students s1 = new Students();
    	s1.setId(1);
    	s1.setName("Arun");
    	
    	Students s2 = new Students();
    	s2.setId(2);
    	s2.setName("Basav");
    	
    	Students s3 = new Students();
    	s3.setId(3);
    	s3.setName("Charan");
    	
    	Students s4 = new Students();
    	s4.setId(4);
    	s4.setName("Darshan");
    	
    	Configuration cfg = new Configuration().configure().addAnnotatedClass((Students.class));
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	session.save(s1);
    	session.save(s2);
    	session.save(s3);
    	session.save(s4);
    	
    	transaction.commit();

	}
	
	//=========================================================================
	
	private static void updateTotable() {

		Transaction transaction = null;
		
		try {
		Configuration cfg = new Configuration().configure().addAnnotatedClass((Students.class));
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		 transaction = s.beginTransaction();
		
		Students student = s.get(Students.class, 70);
		student.setName("Ajinkya Rahane");
		
		transaction.commit();
		
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.getMessage();
		}
	}
    public static void main( String[] args )
    {
    	updateTotable();
    }
}
