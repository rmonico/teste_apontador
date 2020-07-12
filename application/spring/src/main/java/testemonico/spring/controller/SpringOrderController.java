package testemonico.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testemonico.controller.order.OrderController;
import testemonico.controller.order.model.OrderDTO;
import testemonico.domain.entity.Order;

@RestController()
@RequestMapping("/api/vi/order")
public class SpringOrderController extends SpringCrudController<OrderController, OrderDTO, OrderDTO, Order, String> {

    @Autowired
    public SpringOrderController(OrderController orderController) {
        super(orderController);
    }
}
