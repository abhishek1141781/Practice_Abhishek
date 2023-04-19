package Tester;

import java.time.LocalDate;
import java.util.Scanner;
import com.app.banking.BankAccount;

public class TestAccount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of users : ");
		BankAccount[] bankAccount = new BankAccount[sc.nextInt()];

		
		
		
		
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println("1.Accept account holder details from user\r\n"
					+ "2.Display \r\n"
					+ "3.Account summary\r\n" + 
					"4.Perform : Withdraw\r\n" + 
					"5.Deposit\r\n" + "6.Funds Transfer 0.EXIT)");
			System.out.println("Select the task to be performed : ");

			switch (sc.nextInt()) {
			case 1://Accept account holder details from the user
				System.out.println("Enter details of Account Holder as follow :"
						+ "Account Number,"
						+ "Customer Name,"
						+ "Account Type,"
						+ "Account Balance,"
						+ "AccountOpeningDate(YYYY-MM-DD)");
				bankAccount[counter++] = new BankAccount(sc.nextInt(),sc.next(),sc.next(),
						sc.nextDouble(),LocalDate.of(sc.nextInt(),sc.nextInt() ,sc.nextInt()));

				break;
			case 2://Display the list of users 
				for(BankAccount b : bankAccount)
				{
					System.out.println(b);
				}
				break;
			case 3://Account Summary of the given account
				System.out.println("Enter the index of whose summary user required:");
				int n=sc.nextInt();
				if(n < bankAccount.length)
				{
					System.out.println(bankAccount[n]);
					
				}
				else
					System.out.println("Invalid index entered!!!");
				break;
			case 4://Perform : Withdraw
				System.out.println("Enter the index for whose withdraw operation is performed:");
				int i=sc.nextInt();
				System.out.println("Enter the amount to be withdrawal:");
				double amount=sc.nextDouble();
				//double balance=bankAccount[i].getAccountBalance();
				//double balance =
				bankAccount[i].withdraw(amount);
				//bankAccount[i].setAccountBalance(balance);
				System.out.println("Withdrawal has been performed successfully !!! and updated balance is "+bankAccount[i].getAccountBalance());
				break;
			case 5://Deposit
				System.out.println("Enter the index for whose deposite operation is performed:");
				int d=sc.nextInt();
				System.out.println("Enter the amount to be deposite:");
				double deposite=sc.nextDouble();
				//double balance1 =
				bankAccount[d].deposit(deposite);
			//bankAccount[d].setAccountBalance(balance1);
				System.out.println("Deposite has been performed successfully !!! and updated balance is "+bankAccount[d].getAccountBalance());
				break;
			case 6://Funds Transfer
				System.out.println("Enter the bank account index from whom tranfer has to be made :");
				int ftw=sc.nextInt();
				System.out.println("Enter the bank account index to whom tranfer has to be done :");
				int ftd=sc.nextInt();
				System.out.println("Enter the amount to be transfered :");
				double fta=sc.nextDouble();
				bankAccount[ftw].fundTransfer(bankAccount[ftd],fta);

				break;
				
			case 0:
				exit = true;
				break;
			}

		}
		sc.close();
	}
}
