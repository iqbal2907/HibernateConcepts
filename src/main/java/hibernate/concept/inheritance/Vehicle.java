package hibernate.concept.inheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED) // we can mention SINGLE_TABLE or TABLE_PER_CLASS here to change inheritance strategy
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
