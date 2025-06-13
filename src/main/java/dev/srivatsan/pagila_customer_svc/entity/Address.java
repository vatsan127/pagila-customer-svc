package dev.srivatsan.pagila_customer_svc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Entity
@Data
public class Address {
    @Id
    @Column(name = "address_id")
    private int addressId;
    private String address;
    private String district;
    private String postalCode;
    private String phone;

}
