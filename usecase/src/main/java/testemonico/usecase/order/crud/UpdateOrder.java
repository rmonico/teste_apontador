package testemonico.usecase.order.crud;

import testemonico.domain.entity.Order;
import testemonico.usecase.base.crud.AbstractUpdateEntity;
import testemonico.usecase.port.OrderRepository;

public class UpdateOrder extends AbstractUpdateEntity<Order, String, OrderRepository> {

    public UpdateOrder(OrderRepository repository) {
        super(repository);
    }
}
