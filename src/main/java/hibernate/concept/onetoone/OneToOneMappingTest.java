package hibernate.concept.onetoone;

import hibernate.concept.dbutill.MySessionFactory;

import org.hibernate.Session;

public class OneToOneMappingTest {

	public static void main(String[] args) {
	
		Session session = MySessionFactory.getSessionFactory().openSession();
		session.beginTransaction();


		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("BMW");
		
		User user = new User();
		user.setUserName("Ajay");
		user.setVehicle(vehicle);
		
		session.save(vehicle);
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}
}
