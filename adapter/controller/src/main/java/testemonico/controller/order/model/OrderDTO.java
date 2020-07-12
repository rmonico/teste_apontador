package testemonico.controller.order.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import testemonico.controller.customer.model.CustomerDTO;
import testemonico.domain.entity.Order;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class OrderDTO {

    private String id;
    private CustomerDTO customer;
    private List<OrderItemDTO> items;
    private BigDecimal totalPrice;

    public OrderDTO(Order order) {
        setId(order.getId());
        setCustomer(new CustomerDTO(order.getCustomer()));
        setItems(order.getItems().stream().map(OrderItemDTO::new).collect(Collectors.toList()));
    }

    public static Order toModel(OrderDTO request) {
        return Order.builder()
                .id(request.getId())
                .customer(CustomerDTO.toModel(request.getCustomer()))
                .items(request.getItems().stream().map(OrderItemDTO::toModel).collect(Collectors.toList()))
                .build();
    }

}
