package com.jspiders.project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project started..!!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory =cfg.buildSessionFactory();
        
        // Creating object of Student class 
        Student s1= new Student();
        //s1.setId(102);
        s1.setName("Raghav Raj");
        s1.setCity("Dharmdiha");        
       System.out.println(s1);
       
       // Creating object of address Class
       
       Address ad = new Address();
       ad.setStreet("street2");
       ad.setCity("Delhi");
       ad.setOpen(true);
       ad.setAddedDate(new Date());
       ad.setX(1234.15);
       
        //Reading image

       FileInputStream fis = new FileInputStream("src/main/java/chandan_photo.jpg");
       byte[] data = new byte[fis.available()]; 
       fis.read(data);
       ad.setImage(data);
       
       
  	Session session= factory.openSession();
  	Transaction tx= session.beginTransaction();
  	session.save(s1);
  	session.save(ad);
  	tx.commit();
  	session.close();
  	  System.out.println("Done.....!!!!");
  	
       
     
     
    }
}
