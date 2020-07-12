package testemonico.domain.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder(toBuilder = true)
public class Order extends Entity<String> {

    private String id;
    private Customer customer;
    private List<OrderItem> items;
    private BigDecimal totalPrice;

    public static class OrderBuilder extends EntityBuilder<String> {
    }

}
