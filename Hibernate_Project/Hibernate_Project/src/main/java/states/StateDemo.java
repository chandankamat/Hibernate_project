package com.jspiders.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.pkg1.Certificate;
import com.jspiders.project.Student;

public class StateDemo {

	public static void main(String[] args) {

		//Practical of Hibernate Object State
		//Transient
		//Detached
		//Removed
		
		System.out.println("Example:");
		
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		  
		// Creating Student Object
		
		Student s1= new Student();
		s1.setId(112);
		s1.setName("Raghav kumar");
		s1.setCity("Madhubani");
		s1.setCeti(new Certificate("java Hibernate Course","2 Months"));
		
		// Student : Tansient
		
		Session s = f.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(s1);
		
		// Student : Persistent - session , database
		  
		s1.setName("Ankush Raj");
		
		tx.commit();
		s.close();
		
		// Student : Detached
		
		s1.setName("Sachin Kumar");
		System.out.println(s1);
		
		f.close();
		
	}

}
