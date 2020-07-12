package testemonico.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testemonico.controller.customer.CustomerController;
import testemonico.controller.customer.model.CustomerDTO;
import testemonico.domain.entity.Customer;

@RestController()
@RequestMapping("/api/v1/customer")
public class SpringCustomerController extends SpringCrudController<CustomerController, CustomerDTO, CustomerDTO, Customer, String> {

    @Autowired
    public SpringCustomerController(CustomerController customerController) {
        super(customerController);
    }

}
