package org.Hotel.Repository;

import org.Hotel.Model.Customer;

import java.util.List;

public interface CustomerRepository {
     public Customer addCustomer(Customer customer);
     public Customer updateCustomer(Customer customer);
     public Customer deleteCustomer(Integer CustomerRoomNo);
     public Customer findByRoomNo(Integer CustomerRoomNo);
     public List<Customer> findAll();
}
