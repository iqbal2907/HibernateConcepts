package hibernate.concept.dbutill;

import hibernate.concept.genral.Student;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MySessionFactory {
	
	private static SessionFactory sessionFactory = createSessionFactory();

	public static SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Student.class);
		String userDBName = "HibernateConcepts";
		configuration.configure("hibernate.cfg.xml").setProperty("hibernate.connection.url",
				"jdbc:mysql://localhost:3306/" + userDBName + "?characterEncoding=UTF-8");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
