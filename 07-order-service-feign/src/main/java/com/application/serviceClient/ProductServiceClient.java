package com.application.serviceClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.application.entity.Product;

@FeignClient("product-service")
public interface ProductServiceClient {
	
	@RequestMapping(value = "/product/{oid}",method = RequestMethod.GET )
	Product getProductById(@PathVariable("oid") long oid)  ;
	
	

}
