package dev.srivatsan.pagila_customer_svc.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Table
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    @SequenceGenerator(name = "customer_seq", sequenceName = "id_customer_seq", initialValue = 50, allocationSize = 25)
    private int id;

    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(min = 1, max = 50, message = "Last name must be between 2 and 50 characters")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @Valid
    @NotNull(message = "Address is mandatory")
    @OneToOne(
            cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true
    )
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(
            cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true
    )
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private List<Rental> rental;
}