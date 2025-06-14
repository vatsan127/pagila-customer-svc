package dev.srivatsan.pagila_customer_svc;

import dev.srivatsan.pagila_customer_svc.service.CustomerDetailsSvc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public abstract class PagilaCustomerSvcApplication {

    private final CustomerDetailsSvc customerDetailsSvc;

    protected PagilaCustomerSvcApplication(CustomerDetailsSvc customerDetailsSvc) {
        this.customerDetailsSvc = customerDetailsSvc;
    }

    public static void main(String[] args) {
        SpringApplication.run(PagilaCustomerSvcApplication.class, args);
    }

}
