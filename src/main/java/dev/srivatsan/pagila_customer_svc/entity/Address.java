package dev.srivatsan.pagila_customer_svc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @SequenceGenerator(name = "address_seq", sequenceName = "id_address_seq", allocationSize = 25)
    private int id;
    private String address;
    private String district;
    private String postalCode;
    private String phone;

}
