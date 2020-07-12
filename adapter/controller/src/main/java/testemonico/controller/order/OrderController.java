package testemonico.controller.order;

import testemonico.controller.CrudController;
import testemonico.controller.order.model.OrderDTO;
import testemonico.domain.entity.Order;
import testemonico.usecase.base.crud.*;

public class OrderController extends CrudController<OrderDTO, OrderDTO, Order, String> {

    public OrderController(CreateEntityUseCase<Order> createEntityUseCase,
                           UpdateEntityUseCase<Order> updateEntityUseCase,
                           DeleteEntityUseCase<Order, String> deleteEntityUseCase,
                           FindAllEntities<Order> findAllEntitiesUseCase,
                           FindEntityByIdUsecase<Order, String> findEntityByIdUseCase) {
        super(OrderDTO::toModel, OrderDTO::new, createEntityUseCase, updateEntityUseCase, deleteEntityUseCase, findAllEntitiesUseCase, findEntityByIdUseCase);
    }
}
