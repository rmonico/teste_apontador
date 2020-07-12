package testemonico.usecase.customer.crud;

import testemonico.domain.entity.Customer;
import testemonico.usecase.base.crud.AbstractFindAllEntities;
import testemonico.usecase.port.CustomerRepository;

public class FindAllCustomers extends AbstractFindAllEntities<Customer, String, CustomerRepository> {

    public FindAllCustomers(CustomerRepository repository) {
        super(repository);
    }
}

