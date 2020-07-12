package testemonico.usecase.product.crud;

import testemonico.domain.entity.Product;
import testemonico.usecase.base.crud.AbstractDeleteEntity;
import testemonico.usecase.port.ProductRepository;

public class DeleteProduct extends AbstractDeleteEntity<Product, String, ProductRepository> {

    public DeleteProduct(ProductRepository repository) {
        super(repository);
    }
}

