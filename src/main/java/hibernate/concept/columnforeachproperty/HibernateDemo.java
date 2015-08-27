package hibernate.concept.columnforeachproperty;

import org.hibernate.Session;

import hibernate.concept.dbutill.MySessionFactory;

public class HibernateDemo {

	public static void main(String[] args) {

		Session session = MySessionFactory.getSessionFactory().openSession();
		session.beginTransaction();

		Student1 student = new Student1();
		student.setCourse("MCA");
		student.setName("AJAY");
		student.setRegNo("10MCMC01");

		//Address is a value object NOT Entity
		Address home = new Address();
		home.setCity("Delhi");
		home.setPlace("khanpur");
		home.setPin(500081);
		student.setHomeAddress(home);
		
		Address office = new Address();
		office.setCity("Hyderabad");
		office.setPlace("kavuri hill");
		office.setPin(500081);
		student.setOfficeAddress(office);
		
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}
}
