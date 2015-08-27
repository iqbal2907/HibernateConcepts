package hibernate.concept.dbutill;

import hibernate.concept.columnforeachproperty.Student1;
import hibernate.concept.differenttableassociation.Student2;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MySessionFactory {
	
	private static SessionFactory sessionFactory = createSessionFactory();

	public static SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration();
/*		configuration.addAnnotatedClass(Student1.class);
		configuration.addAnnotatedClass(Student2.class);
		configuration.addAnnotatedClass(Address.class);
		configuration.addAnnotatedClass(hibernate.concept.onetoone.User.class);
		configuration.addAnnotatedClass(hibernate.concept.onetoone.Vehicle.class);
		configuration.addAnnotatedClass(hibernate.concept.onetomany.User.class);
		configuration.addAnnotatedClass(hibernate.concept.onetomany.Vehicle.class);
		configuration.addAnnotatedClass(hibernate.concept.manytomany.User.class);
		configuration.addAnnotatedClass(hibernate.concept.manytomany.Vehicle.class);
*/
		configuration.addAnnotatedClass(hibernate.concept.inheritance.Vehicle.class);
		configuration.addAnnotatedClass(hibernate.concept.inheritance.TwoWheeler.class);
		configuration.addAnnotatedClass(hibernate.concept.inheritance.FourWheeler.class);
				
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
