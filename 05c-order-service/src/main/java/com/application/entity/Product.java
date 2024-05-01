package com.application.entity;

import lombok.Data;

@Data
public class Product {
	

	private long id ; 
	
	private String name;
	private String description;
	private float price;
	private long quantity;
	

}
