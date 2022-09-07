package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class main {

	public static void main(String[] args) {
		// session mimari kullanarak tranjection yönetimini kullanmaktayız...
		// başlangıç olarak Session mimarisini fabrika oluşturarak getcurrent metodu ile oturum açıp sorgularımızı yazmaktayız
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session= factory.getCurrentSession();
		
	try {
		session.beginTransaction();
		// HQL - Hibarnate Query language
		// select * from city
		// from City c WHERE c.countryCode='TUR'
		// from City c WHERE c.countryCode='TUR' OR c.countryCode='USA'
		// from City c where c.name like '%kar%'
		// from City c ORDER By c.name DESC - ASC
		
//		List<String> countryCodes=session.createQuery("select c.countryCode from City c GROUP By c.countryCode ").getResultList();
//		
//		
//		
//		for(String countryCode:countryCodes) {
//			System.out.println(countryCode); 	
//			
//			
//		}
		// INSERT
//		City city= new City();
//		city.setName("ceyhan11");
//		city.setCountryCode("TUR");
//		city.setDistrict("akdeniz");
//		city.setPopulation(5200000);
//		
//		session.save(city);
		
		//UPDATE
//		City city=session.get(City.class,4083);
//		city.setPopulation(51000000);
//		session.save(city);
//		
//		
		// CRUD Creat Read Update Delete
		// DELETE
		City city=session.get(City.class,4083);
		session.delete(city);
		 
		session.getTransaction().commit();
		System.out.println("şehir eklendi");
		
	}finally {
		factory.close();
	}
	

	}

}
