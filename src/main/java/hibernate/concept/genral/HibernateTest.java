package hibernate.concept.genral;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateTest {

	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sf = configuration.buildSessionFactory(sr);
		Session session = sf.openSession();

//		Session session = new Configuration().configure().buildSessionFactory(sr).openSession();
//		Session session = createSessionFactory().openSession();
		session.beginTransaction();

		Student student = new Student();
		student.setCourse("MCA");
		student.setName("AJAY");
		student.setRegNo("10MCMC01");

		session.save(student);
		session.getTransaction().commit();
		session.close();
	}

	public static SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration();
		String userDBName = "HibernateConcepts";
		configuration.configure().setProperty("hibernate.connection.url",
				"jdbc:mysql://localhost:3306/" + userDBName + "?characterEncoding=UTF-8");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}
}
