package ma.enset.openlabcustomerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
//Java bean with getters and setters
public class CustomerRequestDTO {
    private String id;
    private String name;
    private String email;
}
