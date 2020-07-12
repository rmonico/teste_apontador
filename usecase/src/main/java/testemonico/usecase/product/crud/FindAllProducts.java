package testemonico.usecase.product.crud;

import testemonico.domain.entity.Product;
import testemonico.usecase.base.crud.AbstractFindAllEntities;
import testemonico.usecase.port.ProductRepository;

public class FindAllProducts extends AbstractFindAllEntities<Product, String, ProductRepository> {

    public FindAllProducts(ProductRepository repository) {
        super(repository);
    }
}

