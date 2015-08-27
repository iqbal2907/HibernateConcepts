package hibernate.concept.inheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	private int vechicleId;
	private String vechicleName;

	public int getVechicleId() {
		return vechicleId;
	}

	public void setVechicleId(int vechicleId) {
		this.vechicleId = vechicleId;
	}

	public String getVechicleName() {
		return vechicleName;
	}

	public void setVechicleName(String vechicleName) {
		this.vechicleName = vechicleName;
	}

}
