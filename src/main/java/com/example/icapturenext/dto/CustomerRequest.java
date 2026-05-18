package com.example.icapturenext.dto;

import lombok.Data;

@Data
public class CustomerRequest {
	
	private String fullName;
	private String mobileNumber;
	private String aadharNumber;
	private String panNumber;
	private String accountNumber;
	private String address;
	private String accountType;

}
