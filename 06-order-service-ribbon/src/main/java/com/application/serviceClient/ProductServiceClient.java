package com.application.serviceClient;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.application.entity.Product;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceClient {
	
	private final  RestTemplate restTemplate  ; 
	
	public Product getProductById(long id)
	{
	
		String uri = "http://product-service/product/" + id ;
	
	Product product =  restTemplate.getForObject(uri, Product.class)  ;
	
	return product ;
	}

}