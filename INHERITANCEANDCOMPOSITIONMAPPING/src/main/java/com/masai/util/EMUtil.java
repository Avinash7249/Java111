package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Person");
	
	public static EntityManager provideConnection() {
		
		return emf.createEntityManager();
	}

}
