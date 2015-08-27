package hibernate.concept.inheritance;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {

	private String steeringHandel;

	public String getSteeringHandel() {
		return steeringHandel;
	}

	public void setSteeringHandel(String steeringHandel) {
		this.steeringHandel = steeringHandel;
	}

}
