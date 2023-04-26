package tester;

import java.util.Scanner;
// import


import com.app.core.Customer;
import com.app.core.FixedStack;
import com.app.core.GrowableStack;
import com.app.core.Stack;

public class StackTester {
	public static void main(String[] args) {
		boolean exit = false;
		Stack stack;
		try (Scanner sc = new Scanner(System.in)) {
			while (!exit) {
				System.out.println("Enter input \n" + "1. Fixed Stack \n" + "2. Growable Stack\n" + "3. Push Operation "
						+ "4. Pop Operation" + "0. Exit");
				int input = sc.nextInt();
				if (1 == input) {
					/*
					 * Fixed Stack
					 */
					stack = new FixedStack();
					System.out.println("Fixed stack of size 5 created \n");

					while (!exit) {
						System.out.println("1. push 2. pop 3.display 0. exit");
						switch (sc.nextInt()) {
						case 1:
							System.out.println("id, Name, Address");
							stack.push(new Customer(sc.nextInt(), sc.next(), sc.next()));
							System.out.println("Data Added");
							break;
						case 2:
							stack.pop();
							break;
						case 3:
							for (Customer s : ((FixedStack) stack).getCust()) {
								if (s != null)
									System.out.println(s);
							}
							break;
						case 0:
							exit = true;
							break;
						default:
							break;
						}
					}

				} else if (2 == input) {
					/*
					 * Growable Stack
					 */
					stack = new GrowableStack();
					System.out.println("Growable stack selected ");

					while (!exit) {
						System.out.println("1. push 2. pop 0. exit");
						switch (sc.nextInt()) {
						case 1:
							System.out.println("id, Name, Address");
							stack.push(new Customer(sc.nextInt(), sc.next(), sc.next()));
							break;
						case 2:
							stack.pop();
							break;
						case 3:
							for (Customer s : ((GrowableStack) stack).getCust()) {
								if (s != null)
									System.out.println(s);
							}
							break;
						case 0:
							exit = true;
							break;
						default:
							break;
						}
					}
				} else if (0 == input) {
					System.out.println("Exiting");
				}
			}
		}
	}
}
