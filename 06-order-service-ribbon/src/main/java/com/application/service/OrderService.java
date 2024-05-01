package com.application.service;

import org.springframework.stereotype.Service;

import com.application.entity.Product;
import com.application.serviceClient.ProductServiceClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
	
	private final ProductServiceClient productServiceClient ;
	
	public Product getProductById(Long oid)
	{
		return productServiceClient.getProductById(oid);
	}

}
