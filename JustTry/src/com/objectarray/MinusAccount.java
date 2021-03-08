package com.objectarray;

public class MinusAccount extends BankAccount {
	private int limit;

	public MinusAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MinusAccount(int accNum, int limit) {
		super(accNum);
		this.limit = limit;
		// TODO Auto-generated constructor stub
	}
	
	public MinusAccount(int accNum, int balance, int limit) {
		super(accNum, balance);
		this.limit = limit;
		// TODO Auto-generated constructor stub
	}

	public int getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public void withdraw(int money) {
		if( (super.getBalance() + limit) < money) {
			System.out.println("한도초과");
			return;
			
		}
		else {
			super.setBalance(getBalance()-money);
			System.out.println("대출 : " + money + "원, 잔여한도 : " + (limit - money) + "원");
		}
		
	}
	

}
