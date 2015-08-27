/**
 * Value object student have two addresses and here our approach is table will have column for each property of student and address object. 
 * Hence if we are defining two objects we have to override the attributes and specify corresponding column name. Since two column with same name is not allowed in a single table.
 * NOTE : 
 * 1. By default column name is same as property name. we can change it using @column annotation
 * 2. For value object no need to save it explicitly. That is Session.save(student) is enough no need to save address object
 */
package hibernate.concept.columnforeachproperty;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student1 {
	@Id
	private String regNo;
	private String name;
	private String course;
	private Address officeAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="place", column = @Column(name="home_place")),
		@AttributeOverride(name="city", column = @Column(name="home_city")),
		@AttributeOverride(name="pin", column = @Column(name="home_pin"))
	})
	private Address homeAddress;

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

}
