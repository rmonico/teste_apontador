package testemonico.repository;

import testemonico.domain.entity.Product;
import testemonico.usecase.port.ProductRepository;

public class InMemoryProductRepository extends AbstractInMemoryRepository<Product, String> implements ProductRepository {

}
