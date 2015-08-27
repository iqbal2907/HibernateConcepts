package hibernate.concept.manytomany;

import hibernate.concept.dbutill.MySessionFactory;

import org.hibernate.Session;

public class ManyToManyMappingTest {

	public static void main(String[] args) {
	
		Session session = MySessionFactory.getSessionFactory().openSession();
		session.beginTransaction();

		User user1 = new User();
		User user2 = new User();
		User user3 = new User();

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("Audi");
		vehicle1.getUsers().add(user1);
		vehicle1.getUsers().add(user2);
		vehicle1.getUsers().add(user3);
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("BMW");
		vehicle2.getUsers().add(user1);
		vehicle2.getUsers().add(user2);
		vehicle2.getUsers().add(user3);
		

		Vehicle vehicle3 = new Vehicle();
		vehicle3.setVehicleName("Mercedes");
		vehicle3.getUsers().add(user1);
		vehicle3.getUsers().add(user2);
		vehicle3.getUsers().add(user3);
		
		user1.setUserName("Akash");
		user1.getVehicles().add(vehicle1);
		user1.getVehicles().add(vehicle2);
		user1.getVehicles().add(vehicle3);
		
		user1.setUserName("Umesh");
		user1.getVehicles().add(vehicle1);
		user1.getVehicles().add(vehicle2);
		user1.getVehicles().add(vehicle3);

		user1.setUserName("Ajay");
		user1.getVehicles().add(vehicle1);
		user1.getVehicles().add(vehicle2);
		user1.getVehicles().add(vehicle3);
		
		session.save(vehicle1);
		session.save(vehicle2);
		session.save(vehicle3);
		session.save(user1);
		session.save(user2);
		session.save(user3);
		session.getTransaction().commit();
		session.close();

	}
}
