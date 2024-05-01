package com.application.service;

import org.springframework.stereotype.Service;

import com.application.entity.Product;
import com.application.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository productRepository ;
	
	public Product getProductById(Long oid)
	{
		return productRepository.findById(oid).get()  ;
	}

}
