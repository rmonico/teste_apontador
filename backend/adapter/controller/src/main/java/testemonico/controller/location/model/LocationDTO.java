package testemonico.controller.location.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import testemonico.domain.entity.Location;

@Data
@NoArgsConstructor
public class LocationDTO {
    private String id;
    private String name;
    private String phone;
    private String address;

    public LocationDTO(Location request) {
        setId(request.getId());
        setName(request.getName());
        setAddress(request.getAddress());
        setPhone(request.getPhone());
    }

    public static Location toModel(LocationDTO locationRequest) {
        return Location.builder()
                .id(locationRequest.getId())
                .name(locationRequest.getName())
                .phone(locationRequest.getPhone())
                .address(locationRequest.getAddress())
                .build();
    }

}
