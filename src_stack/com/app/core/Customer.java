package com.app.core;

public class Customer {

	int id;
	String name;
	String address;
	
	public Customer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	
//	why do we override the toString implementation
	@Override
	public String toString() {
		return "id: " + id +" name: "+ name +" address: "+ address;
	}
	
	
	
	

}


