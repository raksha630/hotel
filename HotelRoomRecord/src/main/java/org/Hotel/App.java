package org.Hotel;

import org.Hotel.Model.Customer;
import org.Hotel.Service.ServiceRepository;
import org.Hotel.Service.ServiceRepositoryImpl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ServiceRepository service=new ServiceRepositoryImpl();
        Customer customer;
     int ch;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1->add customer 2->update 3->delete 4->search 5->display 6->exit");
            ch= sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("enter customer details");
                    System.out.println("enter room no. , customer name and phone no. respectively");
                    customer =new Customer(sc.nextInt(), sc.next(),sc.nextLong());
                    service.addCustomer(customer);
                    break;
                case 2:
                    System.out.println("enter room no. whose customer u want to update");
                    int roomNo=sc.nextInt();
                    customer=service.findByRoomNo(roomNo);
                    System.out.println("enter customer name");
                    customer.setCustomerName(sc.next());
                    System.out.println("enter customer phone number");
                    customer.setCustomerPhoneNo(sc.nextLong());
                    service.updateCustomer(customer);
                    System.out.println("updated successfully");
                    break;
                case 3:
                    System.out.println("enter the room number whose details are to be deleted");
                    roomNo=sc.nextInt();
                    customer=service.findByRoomNo(roomNo);
                    if(customer==null){
                        System.out.println("record not found");

                    }
                    else {
                        service.deleteCustomer(roomNo);
                        System.out.println("record deleted");
                    }
                    break;
                case 4:
                    System.out.println("enter the room No whose details are to be searched");
                    roomNo= sc.nextInt();
                    customer=service.findByRoomNo(roomNo);
                    if (customer==null){
                        System.out.println("record not found");
                    }
                    else {
                        System.out.println(customer);
                    }
                    break;
                case 5:
                    service.findAll().forEach(System.out::println);
                     break;
                case 6:
                    break;

            }
        }while (ch!=6);
    }
}
