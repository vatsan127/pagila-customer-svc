package dev.srivatsan.pagila_customer_svc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rental_seq")
    @SequenceGenerator(name = "rental_seq", sequenceName = "id_rental_seq", initialValue = 50, allocationSize = 25)
    private int id;
    private String storeName;
    private String filmName;

}
