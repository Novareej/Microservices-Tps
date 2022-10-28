package ma.enset.openlabcustomerservice.dto;

import lombok.Data;

@Data
//Java bean with getters and setters
public class CustomerRequestDTO {
    private String id;
    private String name;
    private String email;
}
