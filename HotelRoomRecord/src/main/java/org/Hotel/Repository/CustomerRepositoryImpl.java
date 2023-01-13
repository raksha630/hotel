package org.Hotel.Repository;

import org.Hotel.Model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    ArrayList<Customer> CustomerList=new ArrayList<>();
    @Override
    public Customer addCustomer(Customer customer) {
        if (CustomerList.contains(customer)){
            return null;

        }
        CustomerList.add(customer);
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
      int index=CustomerList.indexOf(customer);
      if(index==-1){
          System.out.println("record not found");
      }
      CustomerList.set(index,customer);

        return customer;
    }

    @Override
    public Customer deleteCustomer(Integer CustomerRoomNo) {
        int index=CustomerList.indexOf(new Customer(CustomerRoomNo,"",0));
        if(index==-1){
            System.out.println("record not found");
        }

        return  CustomerList.remove(index);
    }

    @Override
    public Customer findByRoomNo(Integer CustomerRoomNo) {
        int index=CustomerList.indexOf(new Customer(CustomerRoomNo,"",0));
        if(index==-1){
            return null;
        }

        return CustomerList.get(index);
    }

    @Override
    public List<Customer> findAll() {
        return CustomerList;
    }
}
