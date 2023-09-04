package com.CustomerService.CustomerService.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerService.CustomerService.Config.CustomerMapper;
import com.CustomerService.CustomerService.Model.Customer;
import com.CustomerService.CustomerService.Model.CustomerDto;
import com.CustomerService.CustomerService.Repository.CustomerRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	
	

	@Override
	public Customer createCustomer(Customer customer) {
		Customer userSavedToDB = this.customerRepository.save(customer);
        return userSavedToDB;
		
	}

	@Override
	public CustomerDto getCustomerById(UUID customerID) {
		return null;
		
	}

	@Override
	public List<CustomerDto> getAllCustomer() {
		return customerRepository.findAll()
				.stream()
				.map(this::convert)
				.collect(Collectors.toList());
		
	
		
	}
	@Override
	public CustomerDto convert(Customer customer) {
		
		CustomerDto customerDto = new CustomerDto();
		
		customerDto.setCustomerName(customer.getCustomerName());
		customerDto.setCustomerLastName(customer.getCustomerLastName());
		customerDto.setDateofBirth(customer.getDateofBirth());
		customerDto.setEmail(customer.getEmail());
		customerDto.setPhoneNumber(customer.getPhoneNumber());
		return customerDto;
	}

	@Override
	public CustomerDto updateCustomer(CustomerDto customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(UUID customerID) {
		
		customerRepository.deleteById(customerID);
		
	}

}
