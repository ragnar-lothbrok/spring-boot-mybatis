package sample.spring.ibatis.service;

import java.util.List;

import sample.spring.ibatis.model.Customer;

public interface ICustomerService {
    public Customer getCustomer( Integer id);

    public List<Customer> getAllCustomer();

    public Customer saveCustomer(Customer customer);

    public void deleteCustomersById( Integer id);
    
    public Customer updateCustomer(Customer customer);
}