package testemonico.controller.customer.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import testemonico.domain.entity.Customer;

@Data
@NoArgsConstructor
public class CustomerDTO {
    private String id;
    private String name;

    public CustomerDTO(Customer request) {
        setId(request.getId());
        setName(request.getName());
    }

    public static Customer toModel(CustomerDTO customerRequest) {
        return Customer.builder()
                .id(customerRequest.getId())
                .name(customerRequest.getName())
                .build();
    }

}
