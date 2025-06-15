package dev.srivatsan.pagila_customer_svc;

import dev.srivatsan.pagila_customer_svc.service.EurekaInstanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public abstract class PagilaCustomerSvcApplication implements CommandLineRunner {

    private final EurekaInstanceService eurekaInstanceService;

    protected PagilaCustomerSvcApplication(EurekaInstanceService eurekaInstanceService) {
        this.eurekaInstanceService = eurekaInstanceService;
    }

    public static void main(String[] args) {
        SpringApplication.run(PagilaCustomerSvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        eurekaInstanceService.getActiveInstance();
    }
}
