package testemonico.domain.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder(toBuilder = true)
public class OrderItem extends Entity<String> {

    private String id;
    private Product product;
    private BigDecimal quantity;

    public static class OrderItemBuilder extends EntityBuilder<String> {
    }
}
