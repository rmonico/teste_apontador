package testemonico.usecase.customer.crud;

import testemonico.domain.entity.Customer;
import testemonico.usecase.base.crud.AbstractDeleteEntity;
import testemonico.usecase.port.CustomerRepository;

public class DeleteCustomer extends AbstractDeleteEntity<Customer, String, CustomerRepository> {

    public DeleteCustomer(CustomerRepository repository) {
        super(repository);
    }
}

