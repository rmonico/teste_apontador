package testemonico.usecase.order.crud;

import testemonico.domain.entity.Order;
import testemonico.usecase.base.crud.AbstractDeleteEntity;
import testemonico.usecase.port.OrderRepository;

public class DeleteOrder extends AbstractDeleteEntity<Order, String, OrderRepository> {
    public DeleteOrder(OrderRepository repository) {
        super(repository);
    }
}
