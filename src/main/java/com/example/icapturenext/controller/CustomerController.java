package com.example.icapturenext.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.icapturenext.dto.CustomerRequest;
import com.example.icapturenext.entity.CustomerEntity;
import com.example.icapturenext.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {
	private final CustomerService customerService;
	
	@PostMapping("/open-account")
	public ResponseEntity<CustomerEntity> openAccount(@RequestBody CustomerRequest request){
		
		return ResponseEntity.ok(customerService.createCustomer(request));
	}
	

}
