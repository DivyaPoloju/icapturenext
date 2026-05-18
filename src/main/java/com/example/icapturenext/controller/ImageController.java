package com.example.icapturenext.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.icapturenext.service.ImageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/images")
@RequiredArgsConstructor
public class ImageController {
	private final ImageService imageService;
	
	@PostMapping("/upload/{customerid}")
	public ResponseEntity<String>upLoadImage(@PathVariable Long customerId,@RequestParam MultipartFile file) throws Exception{
		return ResponseEntity.ok(imageService.uploadImage(customerId, file));
		
	}
	

}
