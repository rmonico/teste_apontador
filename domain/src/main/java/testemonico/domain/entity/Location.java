package testemonico.domain.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder(toBuilder = true)
public class Location extends Entity<String> {

    private String id;
    private String name;
    private String phone;
    private String address;

    public static class LocationBuilder extends EntityBuilder<String> {
    }

}
