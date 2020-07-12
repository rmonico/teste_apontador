package testemonico.controller.order.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import testemonico.controller.product.model.ProductDTO;
import testemonico.domain.entity.OrderItem;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class OrderItemDTO {
    private String id;
    private ProductDTO product;
    private BigDecimal quantity;

    public OrderItemDTO(OrderItem item) {
        setId(item.getId());
        setProduct(new ProductDTO(item.getProduct()));
        setQuantity(item.getQuantity());
    }

    public static OrderItem toModel(OrderItemDTO request) {
        return OrderItem.builder()
                .id(request.getId())
                .product(ProductDTO.toModel(request.getProduct()))
                .quantity(request.getQuantity())
                .build();
    }

}
