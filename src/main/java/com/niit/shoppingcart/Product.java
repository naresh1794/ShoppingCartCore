package com.niit.shoppingcart;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	
	private String id;
	
	private String name;
	
	private int price;
	
	private  String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	
	
}
