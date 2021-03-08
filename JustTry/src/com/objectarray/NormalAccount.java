package com.objectarray;

public class NormalAccount extends BankAccount {

	public NormalAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NormalAccount(int accNum, int balance) {
		super(accNum, balance);
		// TODO Auto-generated constructor stub
	}

	public NormalAccount(int accNum) {
		super(accNum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(int money) {
		if((super.getBalance()-money) < 0) {
			System.out.println("잔액이 부족합니다. 잔액 : " + super.getBalance());
			return;
		}
		
		else {
			super.setBalance((getBalance()-money));
			System.out.println("출금 : " + money + "원, 잔액 : " + super.getBalance() + "원");
		}
		
		
	}
	
	

}
