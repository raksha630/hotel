package org.Hotel.Service;

import org.Hotel.Model.Customer;
import org.Hotel.Repository.CustomerRepository;
import org.Hotel.Repository.CustomerRepositoryImpl;

import java.util.List;

public class ServiceRepositoryImpl implements ServiceRepository{
    CustomerRepository repository=new CustomerRepositoryImpl();
    @Override
    public boolean addCustomer(Customer customer) {
        if (repository.addCustomer(customer)==null)
        return false;
        else {
            return true;
        }
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        if (repository.updateCustomer(customer)==null)
        return false;
        else {
            return true;
        }
    }

    @Override
    public boolean deleteCustomer(Integer CustomerRoomNo) {
        if (repository.deleteCustomer(CustomerRoomNo)==null)
        return false;
        else {
            return true;
        }
    }

    @Override
    public Customer findByRoomNo(Integer CustomerRoomNo) {
        return repository.findByRoomNo(CustomerRoomNo);
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }
}
