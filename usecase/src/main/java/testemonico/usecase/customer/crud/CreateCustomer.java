package testemonico.usecase.customer.crud;

import testemonico.domain.entity.Customer;
import testemonico.usecase.base.crud.AbstractCreateEntity;
import testemonico.usecase.port.CustomerRepository;
import testemonico.usecase.port.IdGenerator;

public class CreateCustomer extends AbstractCreateEntity<Customer, String, CustomerRepository> {

    public CreateCustomer(CustomerRepository repository, IdGenerator<String> idGenerator) {
        super(repository, idGenerator);
    }
}

