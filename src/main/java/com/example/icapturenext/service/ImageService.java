package com.example.icapturenext.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.icapturenext.entity.CustomerImageEntity;
import com.example.icapturenext.repository.CustomerImageRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImageService {
	
	private final CustomerImageRepository repository;
	
	public String uploadImage(Long customerId,MultipartFile file) throws Exception{
		CustomerImageEntity image=CustomerImageEntity.builder()
				.customerId(customerId)
				.imageName(file.getOriginalFilename())
				.imageData(file.getBytes())
				.build();
		repository.save(image);
		
		return "Image Uploaded Sucessfully";
	}

}
