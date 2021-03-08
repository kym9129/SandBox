package com.objectarray;

public abstract class BankAccount {
	protected int accNum;
	private int balance = 0;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(int accNum) {
		this.accNum = accNum;
	}
	
	public BankAccount(int accNum, int balance) {
		super();
		this.accNum = accNum;
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int money) {
		
		balance += money;
		System.out.println("입금 : " + money + ", 잔액 : " + balance);
		
	}
	
	public void withdraw(int money) {
		
	}

}
