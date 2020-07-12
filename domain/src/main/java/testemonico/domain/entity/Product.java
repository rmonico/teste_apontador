package testemonico.domain.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder(toBuilder = true)
public class Product extends Entity<String> {

    private String id;
    private String name;
    private BigDecimal price;

    public static class ProductBuilder extends EntityBuilder<String> {
    }

}


