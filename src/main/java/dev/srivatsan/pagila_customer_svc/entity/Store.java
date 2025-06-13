package dev.srivatsan.pagila_customer_svc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class Store {
    @Id
//    @Column(name = "store_id")
    private int storeId;
    private int managerStaffId;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;
}
