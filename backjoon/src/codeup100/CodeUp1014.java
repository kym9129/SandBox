package codeup100;

import java.util.Scanner;

public class CodeUp1014 {
	
	//2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch1, ch2;
		ch1 = sc.next().charAt(0);
		ch2 = sc.next().charAt(0);
		
		System.out.printf("%s %s", ch2, ch1);

	}

}
