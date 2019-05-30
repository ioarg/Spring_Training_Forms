package john.learning.spring_mvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import john.learning.spring_mvc.validation.CourseCode;

public class Customer {
	private String firstName;
	
	@NotNull(message="required")
	@Size(min=1, message="required")
	private String lastName;
	@NotNull(message="required")
	@Min(value=0, message="Number must be greater than or equal to zero")
	@Max(value=10, message="Number must be at maximun 10")
	private Integer freePasses; 
	@Pattern(regexp="^[A-Za-z0-9]{5}", message="Invalid postal code. Only 5 characters please!")
	private String postalCode;
	@CourseCode(value="JL", message="It must start with JL")
	private String courseCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
}
