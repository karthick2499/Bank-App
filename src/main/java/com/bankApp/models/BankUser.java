package com.bankApp.models;

public class BankUser {
	
	int bankUserId;
	String bankUserName;
	String address;
	double availableBalance;
	String password;
	
	
	public BankUser(int bankUserId, String bankUserName, String address, double availableBalance, String password) {
		super();
		this.bankUserId = bankUserId;
		this.bankUserName = bankUserName;
		this.address = address;
		this.availableBalance = availableBalance;
		this.password = password;
	}
	
	
	public BankUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getBankUserId() {
		return bankUserId;
	}
	public void setBankUserId(int bankUserId) {
		this.bankUserId = bankUserId;
	}
	public String getBankUserName() {
		return bankUserName;
	}
	public void setBankUserName(String bankUserName) {
		this.bankUserName = bankUserName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
