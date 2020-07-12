package testemonico.repository;

import testemonico.domain.entity.OrderItem;
import testemonico.usecase.port.OrderItemRepository;

public class InMemoryOrderItemRepository extends AbstractInMemoryRepository<OrderItem, String> implements OrderItemRepository {
}
