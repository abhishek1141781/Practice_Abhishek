package com.app.banking;

import java.time.LocalDate;

public class BankAccount {
	private int accountNumber;
	private String customerName;
	private String accountType;
	private double accountBalance;
	private LocalDate accountOpeningDate;

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", customerName=" + customerName + ", accountType="
				+ accountType + ", accountBalance=" + accountBalance + ", accountOpeningDate=" + accountOpeningDate
				+ "]";
	}

	public BankAccount(int accountNumber, String customerName, String accountType, double accountBalance,
		LocalDate accountOpeningDate) {
	super();
	this.accountNumber = accountNumber;
	this.customerName = customerName;
	this.accountType = accountType;
	this.accountBalance = accountBalance;
	this.accountOpeningDate = accountOpeningDate;
}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public LocalDate getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public void setAccountOpeningDate(LocalDate accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	public double withdraw(double amount) {
		System.out.println("The withdrawal amount is "+amount);
		return accountBalance=(accountBalance - amount);
	}

	public double deposit(double amount) {
		
		return accountBalance=accountBalance+amount ;
	}

	public void fundTransfer(BankAccount anotherAccount, double amount) {
		this.accountBalance = accountBalance - amount;
		anotherAccount.accountBalance = anotherAccount.accountBalance + amount;
	}

}
