package com.objectarray;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		NormalAccount n1 = new NormalAccount(11, 1000);
		NormalAccount n2 = new NormalAccount(22);
		MinusAccount m1 = new MinusAccount(33, 1000, 500);
		MinusAccount m2 = new MinusAccount(44, 500);
		
		System.out.println("11번 계좌의 최대 출금 가능액 : " + n1.getBalance() + "원");
		System.out.println("22번 계좌의 최대 출금 가능액 : " + n2.getBalance() + "원");
		System.out.println("33번 계좌의 최대 출금 가능액 : " + (m1.getLimit() + m1.getBalance()) + "원");
		System.out.println("44번 계좌의 최대 출금 가능액 : " + (m2.getLimit() + m2.getBalance()) + "원");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출금액을 정수로 입력하세요. : ");
		int wMoney = sc.nextInt();
		
		n1.withdraw(wMoney);
		n2.withdraw(wMoney);
		m1.withdraw(wMoney);
		m2.withdraw(wMoney);
		
		System.out.println("입금액을 정수로 입력하세요. : ");
		int dMoney = sc.nextInt();
		
		n1.deposit(dMoney);
		n2.deposit(dMoney);
		m1.deposit(dMoney);
		m2.deposit(dMoney);
		
		
		
		System.out.println("11번 계좌의 최대 출금 가능액 : " + n1.getBalance() + "원");
		System.out.println("22번 계좌의 최대 출금 가능액 : " + n2.getBalance() + "원");
		System.out.println("33번 계좌의 최대 출금 가능액 : " + (m1.getLimit() + m1.getBalance()) + "원");
		System.out.println("44번 계좌의 최대 출금 가능액 : " + (m2.getLimit() + m2.getBalance()) + "원");

	}

}
