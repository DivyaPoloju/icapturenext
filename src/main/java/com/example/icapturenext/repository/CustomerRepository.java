package com.example.icapturenext.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.icapturenext.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{

}
