package com.app.tester;

import java.util.Scanner;

import com.app.core.FixedStack;
import com.app.core.Customer;
import com.app.core.GrowableStack;
import com.app.core.Stack;

public class TesterStack {

	public static void main(String[] args) {

//		use try with resources if possible
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		Stack stack = null;
		
		
		while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Choose Fixed Stack");
            System.out.println("2. Choose Growable Stack");
            System.out.println("3. Push data");
            System.out.println("4. Pop data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
			case 1:
				if (stack == null) {
					stack = new FixedStack();
					System.out.println("Fixed Stack selected");
				}
				else
					System.out.println("You can't select a stack again once you've already selected a stack");
				break;
				
			case 2:
				if (stack == null) {
                    stack = new GrowableStack();
                    System.out.println("Growable Stack selected.");
                } 
				else 
                    System.out.println("Stack already selected.");
				break;
				
			case 3:
                if (stack == null) {
                    System.out.println("No stack selected.");
                } 
                else {
					System.out.println("Enter CustomerId, CustomerName, CustomerAddress");
					stack.push(new Customer(sc.nextInt(), sc.next(), sc.next()));
                	
                    System.out.print("Enter customer id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter customer name: ");
                    String name = sc.next();
                    System.out.print("Enter customer address: ");
                    String address = sc.next();
                    Customer customers = new Customer(id, name, address);
                    try {
                        stack.push(customers);
                        System.out.println("Customer details added successfully.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
            case 4:
                if (stack == null) {
                    System.out.println("No stack selected.");
                } else {
                    Customer customers = stack.pop();
                    if (customers == null) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println(customers);
                    }
                }
                break;
            case 5:
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice.");
        }
    }

 }
}
				
				
            
            
            
            
            
            
            
            
            
            
            
		
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
//		System.out.println("Enter input \n" + "1. Fixed Stack \n" + "2. Growable Stack\n" + "3. Push Operation \n"
//				+ "4. Pop Operation\n" + "0. Exit\n");
//		
//		while(!exit) {
//			switch (sc.nextInt()) {
//			case 1: // Fixed stack selected
////				FixedStack() fxdstk = new FixedStack(STACK_SIZE);
//				FixedStack.customers;
//				if(customers[top] == null)
//				
//				break;
//				
//			case 2:
//				
//				break;
//			case 3:
//				
//				break;
//			case 4:
//				
//				break;
//	
//			default:
//				break;
//			}
//		}

		
