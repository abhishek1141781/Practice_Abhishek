package com.app.banking;

import java.time.LocalDate;

public class BankAccount {
	private int AccountNumber;
	private String CustomerName;
	private String AccountType;
	private double AccountBalance;
	private LocalDate AccountOpeningDate;
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}
	public LocalDate getAccountOpeningDate() {
		return AccountOpeningDate;
	}
	public void setAccountOpeningDate(LocalDate accountOpeningDate) {
		AccountOpeningDate = accountOpeningDate;
	}
	
	

}
