package testemonico.usecase.order.crud;

import testemonico.domain.entity.Order;
import testemonico.usecase.base.crud.AbstractFindEntityById;
import testemonico.usecase.port.OrderRepository;

public class FindOrderById extends AbstractFindEntityById<Order, String, OrderRepository> {
    public FindOrderById(OrderRepository repository) {
        super(repository);
    }
}
