package com.app.core;

public interface Stack {
	
	final int STACK_SIZE = 4;
	
//	all interface methods are implicitly declared as `public` and `abstract`
	void push(Customer c);
	Customer pop();
	
	

}
