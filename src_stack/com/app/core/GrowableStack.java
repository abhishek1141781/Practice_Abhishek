package com.app.core;

//public class GrowableStack implements Stack { //better option is to extend Fixed stack rather than implements Stack
public class GrowableStack extends FixedStack {

//	Type mismatch: cannot convert from Customer[] to Customer
//	Customer customers = new Customer[STACK_SIZE];
	Customer[] customers = new Customer[STACK_SIZE];
//	is it necessary to declare the top variable as private
	int top = -1;

//	constructor for GrowableStack using super of Stack interface
	public GrowableStack() {
		super();
	}

	/*
	 * Implementation of GrowableStack
	 */
	
	

	@Override
	public void push(Customer c) {
		if (top < customers.length - 1) {
			customers[++top] = c;
			System.out.println("Added the element to the stack !!!!!!!");
		} else {
			System.out.println("Creating a new array of size " + customers.length);
			Customer[] temp = new Customer[customers.length * 2];

//			copying all data from existing customers array inside the new created temp array only possible using for loop not possible using for each loop
			for (int i = 0; i < customers.length; i++)
				temp[i] = customers[i];

//		reassigning the newly made temp back to the customers array thought i can't actually visualize how is it actually working bts, as how come an array of size double of customers can be assigned back to it
			customers = temp;
			customers[++top] = c;
			System.out.println(
					"Created a new array of length " + customers.length + ". Added the element to the stack !!!!!!!");
		}
	}

//	@Override
//	public Customer pop() {
//
//	}

}
