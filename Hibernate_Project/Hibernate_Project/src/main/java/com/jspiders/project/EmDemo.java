package com.jspiders.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.pkg1.Certificate;


public class EmDemo {

	public static void main(String[] args) {

		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory =cfg.buildSessionFactory();
	        
	        Student s3 = new Student();
	        s3.setId(1201);
	        s3.setName("Shiva Nand");
	        s3.setCity("Pachrukhi");
	        
	        Certificate c1 = new Certificate();
            
	        c1.setCourse("java");
	        c1.setDuration("2 months");
	        s3.setCeti(c1);
	        
	        
	        Student s4 = new Student();
	        s4.setId(1202);
	        s4.setName("Sachin Kumar");
	        s4.setCity("Rajuahi");
	        
	        Certificate c2 = new Certificate();
	        s4.setCeti(c2);
            
	        c2.setCourse("HTML");
	        c2.setDuration("3 months");
	        
	        
	        Session s = factory.openSession();
	        Transaction tx = s.beginTransaction();
	        
	        //objects save
	        s.save(s3);
	        s.save(s4);
	        
	        tx.commit();

	        s.close();
	        factory.close();
	        
	        
	        
	        
	      }

}
