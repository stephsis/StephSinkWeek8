package vacay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import vacay.beans.Passenger;
import vacay.repository.PassengerRepository;

/**
 * @author stephaniesink - sisink
 * CIS175 - Spring 2022
 * Mar 28, 2023
 */
@Controller
public class WebController {
	@Autowired
	PassengerRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllPassengers(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewPassenger(model);
		}
		
		model.addAttribute("passengers", repo.findAll());
		return "results";
	}

	@GetMapping("/inputPassenger")
	public String addNewPassenger(Model model) {
		Passenger p = new Passenger();
		model.addAttribute("newPassenger", p);
		return "input";
	}

	@GetMapping("/edit/{id}")
	public String showUpdatePassenger(@PathVariable("id") long id, Model model) {
		Passenger p = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + p.toString());
		model.addAttribute("newPassenger", p);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String revisePassenger(Passenger p, Model model) {
		repo.save(p);
		return viewAllPassengers(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Passenger p = repo.findById(id).orElse(null);
	    repo.delete(p);
	    return viewAllPassengers(model);
	}
}
