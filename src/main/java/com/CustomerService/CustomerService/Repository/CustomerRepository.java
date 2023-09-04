package com.CustomerService.CustomerService.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomerService.CustomerService.Model.Customer;
import com.CustomerService.CustomerService.Model.CustomerDto;

public interface CustomerRepository extends JpaRepository<Customer,UUID>{

}
