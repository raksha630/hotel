package org.Hotel.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    private Integer CustomerRoomNo;
    private String CustomerName;
    private long CustomerPhoneNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(CustomerRoomNo, customer.CustomerRoomNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CustomerRoomNo);
    }
}
