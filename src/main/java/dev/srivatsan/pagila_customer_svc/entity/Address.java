package dev.srivatsan.pagila_customer_svc.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Table
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @SequenceGenerator(name = "address_seq", sequenceName = "id_address_seq", allocationSize = 25)
    private int id;

    @NotBlank(message = "District is mandatory")
    @Size(max = 50, message = "District name cannot exceed 50 characters")
    private String district;

    @NotBlank(message = "Address is mandatory")
    private String address ;

    @NotBlank(message = "Postal code is mandatory")
    @Pattern(regexp = "\\d{5}", message = "Postal code must be 5 digits")
    private String postalCode;

    @NotBlank(message = "Phone number is mandatory")
    @Pattern(regexp = "\\+?[0-9\\- ]{7,15}", message = "Invalid phone number format")
    private String phone;

}
