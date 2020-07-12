package testemonico.usecase.customer.crud;

import testemonico.domain.entity.Customer;
import testemonico.usecase.base.crud.AbstractUpdateEntity;
import testemonico.usecase.port.CustomerRepository;

public class UpdateCustomer extends AbstractUpdateEntity<Customer, String, CustomerRepository> {

    public UpdateCustomer(CustomerRepository repository) {
        super(repository);
    }
}

