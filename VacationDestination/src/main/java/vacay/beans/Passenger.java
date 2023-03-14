package vacay.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author stephaniesink - sisink
 * CIS175 - Spring 2022
 * Mar 7, 2023
 */
@Entity
public class Passenger {
	@Id
	@GeneratedValue
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	@Autowired
	private Destination destination;

	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Passenger(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public Passenger(int age, String firstName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public Passenger(int id, int age, String firstName, String lastName) {
		super();
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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

	public Destination getDestination() {
		return destination;
	}
	
	public void setDestination(Destination destination) {
		this.destination = destination;
	}


	@Override
	public String toString() {
		return "Passenger Information: ID: " + id + ", Age: " + age + ", Name: " + firstName + " " + lastName;
	}
	
	
}
