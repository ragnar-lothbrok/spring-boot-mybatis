package sample.spring.ibatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.spring.ibatis.dao.CustomerDAO;
import sample.spring.ibatis.model.Customer;
import sample.spring.ibatis.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    CustomerDAO customerDAO;

    public Customer getCustomer(Integer customerId) {
        return customerDAO.getCustomerById(customerId);
    }

    public List<Customer> getAllCustomer() {
        return customerDAO.getAllCustomers();
    }

    public Customer saveCustomer(Customer customer) {
        customer.setCustomerId(customerDAO.saveCustomer(customer));
        return customer;
    }

    public void deleteCustomersById(Integer customerId) {
        customerDAO.deleteCustomer(customerId);
    }

    public Customer updateCustomer(Customer customer) {
        customerDAO.updateCustomer(customer);
        return customer;
    }
}
