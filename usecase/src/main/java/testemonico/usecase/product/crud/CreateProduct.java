package testemonico.usecase.product.crud;

import testemonico.domain.entity.Product;
import testemonico.usecase.base.crud.AbstractCreateEntity;
import testemonico.usecase.port.IdGenerator;
import testemonico.usecase.port.ProductRepository;

public class CreateProduct extends AbstractCreateEntity<Product, String, ProductRepository> {

    public CreateProduct(ProductRepository repository, IdGenerator<String> idGenerator) {
        super(repository, idGenerator);
    }

}
