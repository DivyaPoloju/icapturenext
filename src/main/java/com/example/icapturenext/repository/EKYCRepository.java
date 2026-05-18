package com.example.icapturenext.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.icapturenext.entity.EKYCEntity;

public interface EKYCRepository extends JpaRepository<EKYCEntity,Long>{
	
	Optional<EKYCEntity> findByCustomerId(Long customerId);

}
