package vacay.controller;

import org.springframework.context.annotation.Bean;

import vacay.beans.Destination;
import vacay.beans.Passenger;

/**
 * @author stephaniesink - sisink
 * CIS175 - Spring 2022
 * Mar 7, 2023
 */
public class BeanConfiguration {
	
	@Bean
	public Passenger passenger() {
		Passenger bean = new Passenger();
		bean.setFirstName("Stephanie");
		bean.setLastName("Sink");
		bean.setAge(35);
		return bean;
	}
	
	@Bean
	public Destination destination() {
		Destination bean = new Destination("Europe", "France");
		return bean;
	}

}
