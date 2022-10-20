package com.prak.model;

public class Account {
	private int accountNumber;
	private String bankName;
	private String bankBranch;
	
	public Account() {
		/* default constructor */
	}

	public Account(int accountNumber, String bankName, String bankBranch) {
		super();
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.bankBranch = bankBranch;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	@Override
	public String toString() {
		return String.format("Account [accountNumber=%s, bankName=%s, bankBranch=%s]", accountNumber, bankName,
				bankBranch);
	}
}
