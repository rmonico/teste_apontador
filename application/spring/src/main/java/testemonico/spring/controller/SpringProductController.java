package testemonico.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testemonico.controller.product.ProductController;
import testemonico.controller.product.model.ProductDTO;
import testemonico.domain.entity.Product;

@RestController()
@RequestMapping("/api/v1/product")
public class SpringProductController extends SpringCrudController<ProductController, ProductDTO, ProductDTO, Product, String> {

    @Autowired
    public SpringProductController(ProductController productController) {
        super(productController);
    }

}
