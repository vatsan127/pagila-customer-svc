package dev.srivatsan.pagila_customer_svc.api;

import dev.srivatsan.pagila_customer_svc.entity.Customer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Tag(name = "Pagila", description = "Pagila Customer SVC App")
public interface CustomerAPI {

    @Operation(summary = "Get Customer Details", description = "Get Customer Details with CustomerID")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful")})
    ResponseEntity<Customer> getCustomerDetailsByID(@Parameter(description = "Customer ID", required = true) @PathVariable int id);

}