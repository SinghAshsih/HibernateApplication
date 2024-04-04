package com.hibernate;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello ! Hibernate");
		Configuration config = new Configuration();
		config.configure("/com/hibernate/hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		System.out.println(sessionFactory);

	}
}
