package org.Hotel.Service;

import org.Hotel.Model.Customer;

import java.util.List;

public interface ServiceRepository  {
    public boolean addCustomer(Customer customer);
    public boolean updateCustomer(Customer customer);
    public boolean deleteCustomer(Integer CustomerRoomNo);
    public Customer findByRoomNo(Integer CustomerRoomNo);
    public List<Customer> findAll();

}
