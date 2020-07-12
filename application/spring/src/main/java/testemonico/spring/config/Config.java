package testemonico.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import testemonico.config.SpringConfig;
import testemonico.controller.customer.CustomerController;
import testemonico.controller.order.OrderController;
import testemonico.controller.product.ProductController;

@Configuration
public class Config {

    private final SpringConfig config = new SpringConfig();

    @Bean
    public ProductController productController() {
        return new ProductController(config.createProduct(),
                config.updateProduct(),
                config.deleteProduct(),
                config.findAllProducts(),
                config.findProductById());
    }

    @Bean
    public CustomerController customerController() {
        return new CustomerController(config.createCustomer(),
                config.updateCustomer(),
                config.deleteCustomer(),
                config.findAllCustomers(),
                config.findCustomerById());
    }

    @Bean
    public OrderController orderController() {
        return new OrderController(config.createOrder(),
                config.updateOrder(),
                config.deleteOrder(),
                config.findAllOrders(),
                config.findOrderById());
    }
}
