package com.CustomerService.CustomerService.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerService.CustomerService.Model.Customer;
import com.CustomerService.CustomerService.Model.CustomerDto;
import com.CustomerService.CustomerService.Service.CustomerService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping
public class CustomerController {
	
	private CustomerService customerService;
	
	@PostMapping("/customer")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        Customer createCustomer = customerService.createCustomer(customer);
        return new ResponseEntity<>(createCustomer, HttpStatus.CREATED);
    }

   
    @GetMapping("{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("id") UUID customerId){
        CustomerDto customer = customerService.getCustomerById(customerId);
        return new ResponseEntity<CustomerDto>(customer, HttpStatus.OK);
    }

    @GetMapping("/customer")
    public List<CustomerDto> getAllCustomer(){
       
        return customerService.getAllCustomer();
    }

    
    @PutMapping("/customerName")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable("id") String customerName,
                                           @RequestBody CustomerDto customer){
        customer.setCustomerName(customerName);
        CustomerDto updateCustomer = customerService.updateCustomer(customer);
        return new ResponseEntity<>(updateCustomer, HttpStatus.OK);
    }

    
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") UUID customerId){
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }
	

}
