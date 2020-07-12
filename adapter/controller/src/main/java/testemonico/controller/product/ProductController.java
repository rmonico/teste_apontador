package testemonico.controller.product;

import testemonico.controller.CrudController;
import testemonico.controller.product.model.ProductDTO;
import testemonico.domain.entity.Product;
import testemonico.usecase.product.crud.*;

public class ProductController extends CrudController<ProductDTO, ProductDTO, Product, String> {

    public ProductController(CreateProduct createProduct,
                             UpdateProduct updateProduct,
                             DeleteProduct deleteProduct,
                             FindAllProducts findAllProducts,
                             FindProductById findProductById) {
        super(ProductDTO::toModel, ProductDTO::new, createProduct, updateProduct, deleteProduct, findAllProducts, findProductById);
    }

}
