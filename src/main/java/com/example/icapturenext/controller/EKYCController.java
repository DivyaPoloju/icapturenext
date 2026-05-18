package com.example.icapturenext.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.icapturenext.service.EKYCService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class EKYCController {
	
	private final EKYCService ekycService;
	
	@PostMapping("/verify")
	public ResponseEntity<String> verifyFingerprint(@RequestParam Long customerId,@RequestParam String fingerprintHash){
		
		String response=ekycService.verifyFingerprint(customerId,fingerprintHash);
		
		return ResponseEntity.ok(response);
	}

}
