package com.jspiders.project;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// get,load
		
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory =cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        // get student 102
       Student s2 = (Student) session.get(Student.class,102);
        System.out.println(s2);
        
        
//        Address ad = (Address) session.get (Address.class,3);
//        System.out.println(ad.getStreet() + " :" +ad.getCity() + " :" +ad.getAddedDate());
        
        
        session.close();
        factory.close();
        
        

	}

}
