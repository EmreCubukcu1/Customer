package com.CustomerService.CustomerService.Service;

import java.util.List;
import java.util.UUID;

import com.CustomerService.CustomerService.Model.Customer;
import com.CustomerService.CustomerService.Model.CustomerDto;

public interface CustomerService {
	
	Customer createCustomer(Customer customer);
	
	CustomerDto getCustomerById(UUID customerID);
	
	List<CustomerDto> getAllCustomer();
	
	CustomerDto updateCustomer(CustomerDto customer);
	
	void deleteCustomer(UUID customerID);

	CustomerDto convert(Customer customer );
	
}
