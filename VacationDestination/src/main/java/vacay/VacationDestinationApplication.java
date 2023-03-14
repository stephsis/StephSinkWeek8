package vacay;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vacay.beans.Destination;
import vacay.beans.Passenger;
import vacay.controller.BeanConfiguration;
import vacay.repository.PassengerRepository;

@SpringBootApplication
public class VacationDestinationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacationDestinationApplication.class, args);
		
		ApplicationContext appContext = new
				AnnotationConfigApplicationContext(BeanConfiguration.class);
				Passenger p = appContext.getBean("passenger", Passenger.class);
				System.out.println(p.toString());

	}
	
	@Autowired
	PassengerRepository repo;
	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Passenger c = appContext.getBean("passenger", Passenger.class);
		c.setFirstName("Stephanie");
		c.setLastName("Sink");
		repo.save(c);
		
		//Create a bean to use - not managed by Spring
		Passenger p = new Passenger(35, "Stephanie", "Sink");
		Destination a = new Destination("Europe", "France");
		p.setDestination(a);
		repo.save(p);
		
		List<Passenger> allPassengers = repo.findAll();
		for(Passenger people: allPassengers) {
			System.out.println(people.toString());
		}
		
//		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
//		((AbstractApplicationContext) appContext).close();
	
	}

}
