package com.example.icapturenext.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.icapturenext.dto.CustomerRequest;
import com.example.icapturenext.entity.CustomerEntity;
import com.example.icapturenext.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {

	
	private final CustomerRepository customerRepository;
	
	public CustomerEntity createCustomer(CustomerRequest request) {
		CustomerEntity entity=CustomerEntity.builder().fullName(request.getFullName()).mobileNumber(request.getMobileNumber())
				.aadharNumber(request.getAadharNumber()).panNumber(request.getPanNumber())
				.accountType(request.getAccountType())
				.status("Pending")
				.createdAt(LocalDateTime.now())
				.build();
		
		return customerRepository.save(entity);
	}
	
	
}
