package ma.enset.openlabcustomerservice.services;

import ma.enset.openlabcustomerservice.dto.CustomerRequestDTO;
import ma.enset.openlabcustomerservice.dto.CustomerResponseDTO;
import ma.enset.openlabcustomerservice.entities.Customer;
import ma.enset.openlabcustomerservice.mappers.CustomerMapper;
import ma.enset.openlabcustomerservice.repositories.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }


    @Override
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {
//       /*
//       * Mapping Objet objet
//       * Metier - UI */
//        Customer customer = new Customer();
//        customer.setId(customerRequestDTO.getId());
//        customer.setName(customerRequestDTO.getName());
//        customer.setEmail(customerRequestDTO.getEmail());

        Customer customer=customerMapper.customerRequestDTOToCustomer(customerRequestDTO);
//        // customer.setId(UUID.randomUUID().toString());
        Customer savedC = customerRepository.save(customer);
//
//        /*Mapping Objet objet
//         * Metier - UI */
//        CustomerResponseDTO customerResponseDTO= new CustomerResponseDTO();
//        customerResponseDTO.setId(savedC.getId());
//        customerResponseDTO.setName(savedC.getName());
//        customerResponseDTO.setEmail(savedC.getEmail());

        CustomerResponseDTO customerResponseDTO=customerMapper.customerToCustomerResponseDTO(savedC);


        return customerResponseDTO;
    }

    @Override
    public CustomerResponseDTO getCustomer(String id) {
        Customer customer=customerRepository.findById(id).get();

        return customerMapper.customerToCustomerResponseDTO(customer);
    }

    @Override
    public CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO) {
        Customer customer= customerMapper.customerRequestDTOToCustomer(customerRequestDTO);
        Customer customer_updated = customerRepository.save(customer);
        return customerMapper.customerToCustomerResponseDTO(customer_updated);
    }

    @Override
    public CustomerResponseDTO delete(CustomerRequestDTO customerRequestDTO) {
        return null;
    }

    @Override
    public List<CustomerResponseDTO> listCustomers() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerResponseDTO> customerResponseDTOS=
                customers.stream().map(cust -> customerMapper.customerToCustomerResponseDTO(cust)).collect(Collectors.toList());
        return customerResponseDTOS;
    }
}
