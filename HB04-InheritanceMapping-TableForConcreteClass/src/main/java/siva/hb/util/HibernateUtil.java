package siva.hb.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory = null;

	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory geSessionFactory() {
		return sessionFactory;
	}
}
