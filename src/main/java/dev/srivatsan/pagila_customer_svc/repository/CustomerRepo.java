package dev.srivatsan.pagila_customer_svc.repository;

import dev.srivatsan.pagila_customer_svc.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
