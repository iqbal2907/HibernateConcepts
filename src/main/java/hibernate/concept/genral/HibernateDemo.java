package hibernate.concept.genral;

import org.hibernate.Session;

import hibernate.concept.dbutill.MySessionFactory;

public class HibernateDemo {

	public static void main(String[] args) {

		Session session = MySessionFactory.getSessionFactory().openSession();
		session.beginTransaction();

		Student student = new Student();
		student.setCourse("MCA");
		student.setName("AJAY");
		student.setRegNo("10MCMC01");

		session.save(student);
		session.getTransaction().commit();
		session.close();
	}
}
