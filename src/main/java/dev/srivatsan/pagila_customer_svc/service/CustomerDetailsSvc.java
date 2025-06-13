package dev.srivatsan.pagila_customer_svc.service;

import dev.srivatsan.pagila_customer_svc.entity.Customer;
import dev.srivatsan.pagila_customer_svc.repository.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerDetailsSvc {

    private final CustomerRepo customerRepo;

    public CustomerDetailsSvc(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer getCustomerDetails(int id){
        Optional<Customer> byId = customerRepo.findById(id);
        return byId.get();
    }

}
