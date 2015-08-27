package hibernate.concept.onetomany;

import hibernate.concept.dbutill.MySessionFactory;

import org.hibernate.Session;

public class OneToManyMappingTest {

	public static void main(String[] args) {
	
		Session session = MySessionFactory.getSessionFactory().openSession();
		session.beginTransaction();

		User user = new User();

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("Audi");
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("BMW");

		Vehicle vehicle3 = new Vehicle();
		vehicle3.setVehicleName("Mercedes");
		
		user.setUserName("Ajay");
		user.getVehicle().add(vehicle1);
		user.getVehicle().add(vehicle2);
		user.getVehicle().add(vehicle3);
		
		
		session.save(vehicle1);
		session.save(vehicle2);
		session.save(vehicle3);
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}
}
