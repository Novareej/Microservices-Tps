package ma.enset.openlabcustomerservice.services;

import ma.enset.openlabcustomerservice.dto.CustomerRequestDTO;
import ma.enset.openlabcustomerservice.dto.CustomerResponseDTO;
import ma.enset.openlabcustomerservice.entities.Customer;
import ma.enset.openlabcustomerservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    @Override
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {
        Customer 
        return null;
    }

    @Override
    public CustomerResponseDTO getCustomer(String id) {
        return null;
    }

    @Override
    public CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO) {
        return null;
    }

    @Override
    public CustomerResponseDTO delete(CustomerRequestDTO customerRequestDTO) {
        return null;
    }

    @Override
    public List<CustomerResponseDTO> listCustomers() {
        return null;
    }
}
