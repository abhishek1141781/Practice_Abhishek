package com.app.core;

public interface Stack {

	public int STACK_SIZE = 5;

	void push(Customer c);

	Customer pop();
}
