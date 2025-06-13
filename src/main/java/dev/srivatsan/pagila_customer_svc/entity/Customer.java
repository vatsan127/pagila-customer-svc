package dev.srivatsan.pagila_customer_svc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Customer {
    @Id
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    @OneToOne
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    private Store store;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;

}
