package com.example.icapturenext.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.icapturenext.entity.EKYCEntity;
import com.example.icapturenext.repository.EKYCRepository;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class EKYCService {
	
	private final EKYCRepository repository;
	public String verifyFingerprint(Long customerId,String fingerprintHash) {
		boolean verified=fingerprintHash !=null && fingerprintHash.length()>10;
		 EKYCEntity ekyc=EKYCEntity.builder()
				 .customerId(customerId)
				 .fingerPrintHash(fingerprintHash)
				 .ekycStatus(verified ? "VERIFIED" : "FAILED")
				 .verifiedAt(LocalDateTime.now())
				 .build();
		 repository.save(ekyc);
		 return verified ? "eKYC SUccess": "eKYC Failed";
	}
	

}
