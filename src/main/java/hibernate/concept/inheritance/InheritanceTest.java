package hibernate.concept.inheritance;

import hibernate.concept.dbutill.MySessionFactory;

import org.hibernate.Session;

public class InheritanceTest {
	
	public static void main(String[] args) {
		Session session = MySessionFactory.getSessionFactory().openSession();
		session.beginTransaction();
		
		Vehicle objVehicle = new Vehicle();
		objVehicle.setVechicleId(001);
		objVehicle.setVechicleName("Jeep");
		
		TwoWheeler objTwoWheeler = new TwoWheeler();
		objTwoWheeler.setSteeringHandel("bike");
		objTwoWheeler.setVechicleId(123);
		objTwoWheeler.setVechicleName("CBR");
		
		FourWheeler objFourWheeler = new FourWheeler();
		objFourWheeler.setSteeringWheel("CAR");
		objFourWheeler.setVechicleId(234);
		objFourWheeler.setVechicleName("BMW");
		
		session.save(objVehicle);
		session.save(objTwoWheeler);
		session.save(objFourWheeler);
		session.getTransaction().commit();
		session.close();
	}
	



}
