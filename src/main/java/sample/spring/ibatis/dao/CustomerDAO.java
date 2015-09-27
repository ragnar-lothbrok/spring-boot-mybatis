    package sample.spring.ibatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import sample.spring.ibatis.model.Customer;

public interface CustomerDAO {
    
	public List<Customer> getAllCustomers();

	public Customer getCustomerById(@Param("customerId")int customerId);

	public int saveCustomer(@Param("customer") Customer customer);
	
	public void updateCustomer(@Param("customer") Customer customer);

	public void deleteCustomer(@Param("customerId") int customerId);
}
