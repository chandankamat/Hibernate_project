package com.jspiders.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory =cfg.buildSessionFactory();
	        // Creating Question
//	        
//	        Question q1= new Question();
//	        q1.setQuestionId(1001);
//	        q1.setQuestion("what is java ?");
//	        
//	        
//	        // Creating answer
//	        
//	        Answer a1 = new Answer();
//             a1.setAnswerId(121);
//             a1.setAnswer("java is programing language");
//             a1.setQuestion(q1);
//             
//             Answer a2 = new Answer();
//             a2.setAnswerId(123);
//             a2.setAnswer("With the help of java we can create software");
//             a2.setQuestion(q1);
//             
//             Answer a3 = new Answer();
//             a3.setAnswerId(124);
//             a3.setAnswer("Java has diffrent type of Frameworks");
//             a3.setQuestion(q1);
//             
//             List<Answer> list = new ArrayList<Answer>();
//             list.add(a1);
//             list.add(a2);
//             list.add(a3);
//             
//             q1.setAnswers(list);
//             
             
             
	         //session
	         Session s= factory.openSession();
	         Transaction tx = s.beginTransaction();
	         
	         // Save
//	         s.save(q1);
//             s.save(a1);
//             s.save(a2);
//             s.save(a3);
	         
             Question q=(Question)s.get(Question.class,1001);
	         System.out.println(q.getQuestion());
             
	         for(Answer a:q.getAnswers()) {
	        	 System.out.println(a.getAnswer());
	         }

           
	         tx.commit();
	         
	         // fecting......
//	         
//	         Question newQ=(Question)s.get(Question.class,1001);
//	         System.out.println(newQ.getQuestion());
//	         System.out.println(newQ.getAnswer().getAnswer());
//	         s.close();
	        
	
	        factory.close();

}
}
