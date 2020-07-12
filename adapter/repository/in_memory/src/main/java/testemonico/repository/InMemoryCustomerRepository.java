package testemonico.repository;

import testemonico.domain.entity.Customer;
import testemonico.usecase.port.CustomerRepository;

public class InMemoryCustomerRepository extends AbstractInMemoryRepository<Customer, String> implements CustomerRepository {
}
