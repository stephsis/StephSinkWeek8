package vacay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vacay.beans.Passenger;

/**
 * @author stephaniesink - sisink
 * CIS175 - Spring 2022
 * Mar 12, 2023
 */
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
