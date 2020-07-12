package testemonico.usecase.product.crud;

import testemonico.domain.entity.Product;
import testemonico.usecase.base.crud.AbstractUpdateEntity;
import testemonico.usecase.port.ProductRepository;

public class UpdateProduct extends AbstractUpdateEntity<Product, String, ProductRepository> {

    public UpdateProduct(ProductRepository repository) {
        super(repository);
    }
}

