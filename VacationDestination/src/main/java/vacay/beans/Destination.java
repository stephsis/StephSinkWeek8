package vacay.beans;

import jakarta.persistence.Embeddable;

/**
 * @author stephaniesink - sisink
 * CIS175 - Spring 2022
 * Mar 7, 2023
 */
@Embeddable
public class Destination {
	private String country;
	private String city;
	
	
	public Destination() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Destination(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}



	//getters and setters
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Your vacation to: " + city + " in " + country;
	}

}
