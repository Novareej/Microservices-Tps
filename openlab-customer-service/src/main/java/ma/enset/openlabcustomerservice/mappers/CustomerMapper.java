package ma.enset.openlabcustomerservice.mappers;

import ma.enset.openlabcustomerservice.dto.CustomerRequestDTO;
import ma.enset.openlabcustomerservice.dto.CustomerResponseDTO;
import ma.enset.openlabcustomerservice.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);
    Customer customerRequestDTOToCustomer(CustomerRequestDTO customerRequestDTO);

}
