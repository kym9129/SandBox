package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		// 1~100사이의 값일 때만
		if (input >= 1 && input <= 100) {
			// 2의배수 체크
			if (input % 2 == 0) {
				System.out.println("2의 배수입니다.");
			}

			else {
				System.out.println("2의 배수가 아닙니다.");
			}
		}

	}

}
