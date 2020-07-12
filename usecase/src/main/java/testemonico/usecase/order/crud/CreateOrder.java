package testemonico.usecase.order.crud;

import testemonico.domain.entity.Order;
import testemonico.usecase.base.crud.AbstractCreateEntity;
import testemonico.usecase.port.IdGenerator;
import testemonico.usecase.port.OrderRepository;

public class CreateOrder extends AbstractCreateEntity<Order, String, OrderRepository> {

    public CreateOrder(OrderRepository repository, IdGenerator<String> idGenerator) {
        super(repository, idGenerator);
    }
}

