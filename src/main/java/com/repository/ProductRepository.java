package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {

	
}
