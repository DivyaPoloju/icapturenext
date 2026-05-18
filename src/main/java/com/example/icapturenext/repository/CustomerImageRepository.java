package com.example.icapturenext.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.icapturenext.entity.CustomerImageEntity;
@Repository
public interface CustomerImageRepository extends JpaRepository<CustomerImageEntity,Long>{

	List<CustomerImageEntity>findByCustomerId(Long customerId);
}
