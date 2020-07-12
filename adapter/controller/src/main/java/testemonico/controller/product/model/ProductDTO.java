package testemonico.controller.product.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import testemonico.domain.entity.Product;

import java.math.BigDecimal;

// TODO Extract a AbstractDTO
@Data
@NoArgsConstructor
public class ProductDTO {

    private String id;
    private String name;
    private BigDecimal price;

    public ProductDTO(Product product) {
        setId(product.getId());
        setName(product.getName());
        setPrice(product.getPrice());
    }

    public static Product toModel(ProductDTO request) {
        return Product.builder()
                .id(request.getId())
                .name(request.getName())
                .price(request.getPrice())
                .build();
    }

}
