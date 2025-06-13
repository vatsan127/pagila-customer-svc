package dev.srivatsan.pagila_customer_svc.api;

import dev.srivatsan.pagila_customer_svc.entity.Customer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Pagila", description = "Pagila Customer SVC App")
public interface CustomerDetailsAPI {

    @Operation(summary = "Get Customer Details", description = "Get Customer Details with CustomerID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful"),
            @ApiResponse(responseCode = "404", description = "Customer not found."),
            @ApiResponse(responseCode = "500", description = "Internal Server Error.")
    })
    ResponseEntity<Customer> getCustomerDetailsByID(@Parameter(description = "Customer ID", required = true) int id);

}