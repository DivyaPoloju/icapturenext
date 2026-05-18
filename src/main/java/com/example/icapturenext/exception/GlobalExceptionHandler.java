package com.example.icapturenext.exception;



import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<Map<String,Object>> handleCustomerNotFound(CustomerNotFoundException ex){
		
		Map<String, Object>response=new HashMap<>();
		response.put("timestame",LocalDateTime.now());
		response.put("status",HttpStatus.NOT_FOUND.value());
		response.put("error","Customer Not Found");
		response.put("message",ex.getMessage());
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(ImageUploadException.class)
	public ResponseEntity<Map<String,Object>> handledImageUpload(ImageUploadException ex){
		
		Map<String, Object>response=new HashMap<>();
		response.put("timestame",LocalDateTime.now());
		response.put("status",HttpStatus.BAD_REQUEST.value());
		response.put("error","image upload failed");
		response.put("message",ex.getMessage());
		
		return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(EKYCVerificationException.class)
	
		
	public ResponseEntity<Map<String,Object>> EKYCVerificationException(EKYCVerificationException ex){
		
		Map<String, Object>response=new HashMap<>();
		response.put("timestame",LocalDateTime.now());
		response.put("status",HttpStatus.BAD_REQUEST.value());
		response.put("error","ekyc verification failed");
		response.put("message",ex.getMessage());
		
		return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String,Object>> handledGlobalException(Exception ex){
		
		Map<String, Object>response=new HashMap<>();
		response.put("timestame",LocalDateTime.now());
		response.put("status",HttpStatus.INTERNAL_SERVER_ERROR.value());
		response.put("error","internal server error");
		response.put("message",ex.getMessage());
		
		return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
		
	}
	
		
}
