package com.masai.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {

		public static EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee");

		public static EntityManager ProvideEntityConnection() {
			
		return emf.createEntityManager();
		}

	

}
