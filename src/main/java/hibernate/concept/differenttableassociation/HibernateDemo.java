package hibernate.concept.differenttableassociation;

import org.hibernate.Session;

import hibernate.concept.dbutill.MySessionFactory;

public class HibernateDemo {

	public static void main(String[] args) {

		Session session = MySessionFactory.getSessionFactory().openSession();
		session.beginTransaction();

		Student2 student = new Student2();
		student.setCourse("MCA");
		student.setName("AJAY");
		student.setRegNo("10MCMC01");

		//Address is a value object NOT Entity
		Address home = new Address();
		home.setCity("Delhi");
		home.setPlace("khanpur");
		home.setPin(825405);
		
		Address office = new Address();
		office.setCity("Hyderabad");
		office.setPlace("kavuri hill");
		office.setPin(500081);
		
		student.getAddressList().add(home);
		student.getAddressList().add(office);
		
		session.save(home);
		session.save(office);
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}
}
