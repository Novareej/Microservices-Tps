package ma.enset.openlabcustomerservice.services;

import ma.enset.openlabcustomerservice.dto.CustomerRequestDTO;
import ma.enset.openlabcustomerservice.dto.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {
    CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO getCustomer(String id);
    CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO delete(CustomerRequestDTO customerRequestDTO);
    List<CustomerResponseDTO> listCustomers();

}
