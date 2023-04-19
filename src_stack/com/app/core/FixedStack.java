package com.app.core;

public class FixedStack implements Stack {

//	why am i declaring this customer array as private
//	private Customer[] customers = new Customer[STACK_SIZE];
//	public Customer[] customers = new Customer[STACK_SIZE];
	public Customer[] customers;
	int top = -1;

//	void push (Customer c) { // Cannot reduce the visibility of the inherited method from Stack: asks for

	/*
	 * Cannot reduce the visibility of the inherited method from Stack: asks for the
	 * void push method to be made public in order to solve the problem. Since void
	 * push(Customer c) has been implicitly declared as public and abstract in the
	 * Stack interface, now obviously, since i've to implement the push method i
	 * can't make it abstract and thus i've to make it public as i can't change the
	 * method definition as while doing so i'm narrowing down the scope, i could
	 * widen the scope if i want. since it's already defined once when it was first
	 * created in the Stack interface
	 */

//	thus making `push` method, public here as opposed to no access specifier(default)
	@Override
	public void push(Customer c) {

//		at least one spot in the array should be empty
		if (top < customers.length - 1) {
			customers[++top] = c;
			System.out.println("Added the element to the stack !!!!!!!");
		} else
			System.out.println("Stack Overflowww !!!!");

	}

	@Override
	public Customer pop() {
//		at least one element should be present in the array
		if (top >= 0) {
			System.out.println("Printing the topmost member of stack: " + customers[top]);
			/*
			 * if we want to delete the data as well and display it when using the display
			 * all command but then we wont be able to return the customer type using the
			 * top variable in the return statement
			 */
//			customers[top] = null;
			top--;
		} else
			System.out.println("Stack Underflow !!!!!");

		return customers[top + 1];
	}

}
