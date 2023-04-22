package com.app.banking;

import java.time.LocalDate;

public class BankAccount {
	private int accountNumber;
	private String customerName;
	private String accountType;
	private double accountBalance;
	private LocalDate accountOpeningDate;
		
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

//	public void setAccountOpeningDate(LocalDate accountOpeningDate) {
//		this.accountOpeningDate = accountOpeningDate;
//	}

public BankAccount(int accountNumber, String customerName, String accountType, double accountBalance,
		LocalDate accountOpeningDate) {
	super();
	this.accountNumber = accountNumber;
	this.customerName = customerName;
	this.accountType = accountType;
	this.accountBalance = accountBalance;
	this.accountOpeningDate = accountOpeningDate;
}
@Override
public String toString() {
	return "BankAccount [accountNumber=" + accountNumber + ", customerName=" + customerName + ", accountType="
			+ accountType + ", accountBalance=" + accountBalance + ", accountOpeningDate=" + accountOpeningDate + "]";
}	

//	withdraw method
public double withdraw(double withdrawAmount) {
//	this.accountBalance = this.accountBalance - withdrawAmount;
	return this.accountBalance -= withdrawAmount;
//	return accountBalance;	 
}

	// deposit method
	public double deposit(double withdrawAmount) {
	return this.accountBalance -= withdrawAmount;	
	}
	
//	funds transfer
	public boolean fundTransfer(BankAccount recieverAccount, double transferAmount) {
		if 
		this.withdraw(transferAmount);
		recieverAccount.deposit(transferAmount);
		return true;
		
		return false;
	}
	
}
