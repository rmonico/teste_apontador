package testemonico.controller.customer;

import testemonico.controller.CrudController;
import testemonico.controller.customer.model.CustomerDTO;
import testemonico.domain.entity.Customer;
import testemonico.usecase.base.crud.*;

public class CustomerController extends CrudController<CustomerDTO, CustomerDTO, Customer, String> {

    public CustomerController(CreateEntityUseCase<Customer> createEntityUseCase,
                              UpdateEntityUseCase<Customer> updateEntityUseCase,
                              DeleteEntityUseCase<Customer, String> deleteEntityUseCase,
                              FindAllEntities<Customer> findAllEntitiesUseCase,
                              FindEntityByIdUsecase<Customer, String> findEntityByIdUseCase) {
        super(CustomerDTO::toModel, CustomerDTO::new, createEntityUseCase, updateEntityUseCase, deleteEntityUseCase, findAllEntitiesUseCase, findEntityByIdUseCase);
    }
}
