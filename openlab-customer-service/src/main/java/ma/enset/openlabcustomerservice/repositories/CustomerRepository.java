package ma.enset.openlabcustomerservice.repositories;

import ma.enset.openlabcustomerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {


}
