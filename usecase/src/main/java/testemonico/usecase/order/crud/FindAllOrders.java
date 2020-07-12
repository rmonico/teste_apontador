package testemonico.usecase.order.crud;

import testemonico.domain.entity.Order;
import testemonico.usecase.base.crud.AbstractFindAllEntities;
import testemonico.usecase.port.OrderRepository;

public class FindAllOrders extends AbstractFindAllEntities<Order, String, OrderRepository> {

    public FindAllOrders(OrderRepository repository) {
        super(repository);
    }
}

