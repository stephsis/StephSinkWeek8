package vacay.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author stephaniesink - sisink
 * CIS175 - Spring 2022
 * Mar 7, 2023
 */
@Entity
@Data
@NoArgsConstructor
public class Passenger {
	@Id
	@GeneratedValue
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	private int phoneNumber; 
	@Autowired
	private Destination destination;
	
	
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

}
