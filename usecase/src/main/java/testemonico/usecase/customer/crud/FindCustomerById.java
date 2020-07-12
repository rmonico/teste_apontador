package testemonico.usecase.customer.crud;

import testemonico.domain.entity.Customer;
import testemonico.usecase.base.crud.AbstractFindEntityById;
import testemonico.usecase.port.CustomerRepository;

public class FindCustomerById extends AbstractFindEntityById<Customer, String, CustomerRepository> {
    public FindCustomerById(CustomerRepository repository) {
        super(repository);
    }
}
