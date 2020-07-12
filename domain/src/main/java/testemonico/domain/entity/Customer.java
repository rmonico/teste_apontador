package testemonico.domain.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder(toBuilder = true)
public class Customer extends Entity<String> {

    private String id;
    private String name;

    public static class CustomerBuilder extends EntityBuilder<String> {
    }

}
