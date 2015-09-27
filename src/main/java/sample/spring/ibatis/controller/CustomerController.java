package sample.spring.ibatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sample.spring.ibatis.model.Customer;
import sample.spring.ibatis.service.ICustomerService;

@RestController
@RequestMapping(value = "/customerService")
public class CustomerController {

    @Autowired
    ICustomerService customerService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable("id") Integer id) {
        return customerService.getCustomer(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Customer saveCustomer(Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCustomersById(@PathVariable("id") Integer id) {
        customerService.deleteCustomersById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateCustomersById(@PathVariable("id") Integer id, Customer customer) {
        customerService.updateCustomer(customer);
    }

}
