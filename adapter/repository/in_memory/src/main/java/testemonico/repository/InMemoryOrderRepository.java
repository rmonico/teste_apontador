package testemonico.repository;

import testemonico.domain.entity.Order;
import testemonico.usecase.port.OrderRepository;

public class InMemoryOrderRepository extends AbstractInMemoryRepository<Order, String> implements OrderRepository {
}
