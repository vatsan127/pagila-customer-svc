package dev.srivatsan.pagila_customer_svc.controller;

import dev.srivatsan.pagila_customer_svc.api.CustomerDetailsAPI;
import dev.srivatsan.pagila_customer_svc.entity.Customer;
import dev.srivatsan.pagila_customer_svc.service.CustomerDetailsSvc;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDetailsController  implements CustomerDetailsAPI {

    private final CustomerDetailsSvc customerDetailsSvc;

    public CustomerDetailsController(CustomerDetailsSvc customerDetailsSvc) {
        this.customerDetailsSvc = customerDetailsSvc;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerDetailsByID(@PathVariable int id) {
        Customer customerDetails = customerDetailsSvc.getCustomerDetails(id);
        return ResponseEntity.ok(customerDetails);
    }

}
