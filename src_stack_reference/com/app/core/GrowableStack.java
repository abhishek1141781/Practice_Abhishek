package com.app.core;

public class GrowableStack extends FixedStack {

	public GrowableStack() {
		super();

	}

	/*
	 * Growable Stack implementation
	 */
	@Override
	public void push(Customer c) {
		if (top < cust.length - 1) {
			cust[++top] = c;
			System.out.println("Success!!! Customer Data updated in Stack");
		} else {
			Customer[] tempcust = new Customer[cust.length * 2];
			for(int i=0; i<cust.length;i++)
			{
				tempcust[i]=cust[i];
			}
			cust= tempcust;// array length to be assigned // refer
			cust[++top] = c;
			System.out.println("Success!!! Customer Data updated in Stack");
		}
	}

}
