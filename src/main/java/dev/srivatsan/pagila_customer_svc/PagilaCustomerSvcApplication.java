package dev.srivatsan.pagila_customer_svc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public abstract class PagilaCustomerSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagilaCustomerSvcApplication.class, args);
    }

}
