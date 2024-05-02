package com.application.serviceClient;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.application.entity.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class ProductServiceClient {
	
	private final  DiscoveryClient discoveryClient ;
	
	
	//@CircuitBreaker(name = "productservice",fallbackMethod = "getDefaultProducts")
	public Product getProductById(long id)
	{
	List<ServiceInstance> instance =  discoveryClient.getInstances("product-service") ;
	
	log.warn("Instances list :: "+instance) ;
	
	String serviceBaseUrl =  instance.get(0).getUri().toString()  ;
	
	log.warn("serviceBaseUrl :: "+serviceBaseUrl) ;

	
	String url = serviceBaseUrl + "/product/"+id ;
	
	log.warn("url :: "+url) ;

	
	RestTemplate restTemplate = new RestTemplate();
	
	Product product =  restTemplate.getForObject(url, Product.class)  ;
	
	return product ;
	}
	
	public Product getDefaultProducts()
	{
		
		log.warn("AM HERE -------------------------")   ;
		Product product = new Product() ;
		
		
		product.setId(-1); 
		product.setDescription("Ths is default product from resilence4j");
		product.setName("Default Product");
		
		return product ;
	}

}
