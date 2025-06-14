package dev.srivatsan.pagila_customer_svc.api;

import dev.srivatsan.pagila_customer_svc.entity.Customer;
import dev.srivatsan.pagila_customer_svc.exception.ErrorResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Pagila", description = "Pagila Customer SVC App")
public interface CustomerDetailsAPI {

    @Operation(
            summary = "Get Customer Details",
            description = "Fetches customer details by customer ID. Returns 200 if found, 404 if not found, and 500 for any internal errors."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Customer found successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Customer.class))),
            @ApiResponse(responseCode = "400", description = "Invalid customer ID supplied.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Customer not found for the given ID.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Internal server error while processing the request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
    })
    ResponseEntity<Customer> getCustomerDetailsByID(
            @Parameter(description = "Unique ID of the customer to be fetched", required = true, example = "5")
            @PathVariable int id
    );

    @Operation(
            summary = "Save Customer",
            description = "Creates a new customer entry. Returns 201 if created successfully, 400 for validation errors, and 500 for internal errors."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Customer created successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Customer.class))),
            @ApiResponse(responseCode = "400", description = "Invalid input. Check the customer details provided.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Internal server error while creating the customer.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
    })
    ResponseEntity<Customer> saveCustomer(
            @Parameter(description = "Customer object that needs to be created", required = true, schema = @Schema(implementation = Customer.class))
            @Valid @RequestBody Customer customer
    );


}