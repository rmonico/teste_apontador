package testemonico.config;

import testemonico.repository.InMemoryCustomerRepository;
import testemonico.repository.InMemoryOrderRepository;
import testemonico.repository.InMemoryProductRepository;
import testemonico.usecase.customer.crud.*;
import testemonico.usecase.order.crud.*;
import testemonico.usecase.port.CustomerRepository;
import testemonico.usecase.port.IdGenerator;
import testemonico.usecase.port.OrderRepository;
import testemonico.usecase.port.ProductRepository;
import testemonico.usecase.product.crud.*;
import testemonico.uuid.UuidGenerator;

public class SpringConfig {
    private final ProductRepository productRepository = new InMemoryProductRepository();
    private final CustomerRepository customerRepository = new InMemoryCustomerRepository();
    private final OrderRepository orderRepository = new InMemoryOrderRepository();
    private final IdGenerator<String> idGenerator = new UuidGenerator<String>();

    public CreateProduct createProduct() {
        return new CreateProduct(productRepository, idGenerator);
    }

    public UpdateProduct updateProduct() {
        return new UpdateProduct(productRepository);
    }

    public DeleteProduct deleteProduct() {
        return new DeleteProduct(productRepository);
    }

    public FindAllProducts findAllProducts() {
        return new FindAllProducts(productRepository);
    }

    public FindProductById findProductById() {
        return new FindProductById(productRepository);
    }

    public CreateCustomer createCustomer() {
        return new CreateCustomer(customerRepository, idGenerator);
    }

    public UpdateCustomer updateCustomer() {
        return new UpdateCustomer(customerRepository);
    }

    public DeleteCustomer deleteCustomer() {
        return new DeleteCustomer(customerRepository);
    }

    public FindAllCustomers findAllCustomers() {
        return new FindAllCustomers(customerRepository);
    }

    public FindCustomerById findCustomerById() {
        return new FindCustomerById(customerRepository);
    }

    public CreateOrder createOrder() {
        return new CreateOrder(orderRepository, idGenerator);
    }

    public UpdateOrder updateOrder() {
        return new UpdateOrder(orderRepository);
    }

    public DeleteOrder deleteOrder() {
        return new DeleteOrder(orderRepository);
    }

    public FindAllOrders findAllOrders() {
        return new FindAllOrders(orderRepository);
    }

    public FindOrderById findOrderById() {
        return new FindOrderById(orderRepository);
    }
}
