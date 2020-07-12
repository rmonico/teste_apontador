package testemonico.controller.customer.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import testemonico.domain.entity.Location;

@Data
@NoArgsConstructor
public class LocationDTO {
    private String id;
    private String name;

    public LocationDTO(Location request) {
        setId(request.getId());
        setName(request.getName());
    }

    public static Location toModel(LocationDTO customerRequest) {
        return Location.builder()
                .id(customerRequest.getId())
                .name(customerRequest.getName())
                .build();
    }

}
