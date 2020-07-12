package testemonico.usecase.product.crud;

import testemonico.domain.entity.Product;
import testemonico.usecase.base.crud.AbstractFindEntityById;
import testemonico.usecase.port.ProductRepository;

public class FindProductById extends AbstractFindEntityById<Product, String, ProductRepository> {

    public FindProductById(ProductRepository repository) {
        super(repository);
    }
}
