package com.app.core;

import java.util.Arrays;

public class FixedStack implements Stack {

	/*
	 * Customer array to be created of Fixed size Initial Top index =-1
	 */
	protected Customer[] cust;
	protected int top;

	public FixedStack() {
		this.cust = new Customer[STACK_SIZE];
		this.top = -1;
	}

	
	
	public Customer[] getCust() {
		return cust;
	}



	/*
	 * Create implementation class of Stack i/f -- FixedStack
	 */
	@Override
	public void push(Customer c) {
		if (top < cust.length - 1) {
			cust[++top] = c;
			System.out.println("Success!!! Data updated in Stack");
		} else {
			System.out.println("Stack Overflow");
		}
	}

	@Override
	public Customer pop() {

		if (top == -1) {
			System.out.println("Empty Underflow");
			return null;
		}
		System.out.println(cust[top] + " has been deleted from list");
		cust[top]=null;
		return cust[top--] ;
	}

	@Override
	public String toString() {
		return super.toString()	+ "FixedStack [cust=" + Arrays.toString(cust) +"]";
	}


}
