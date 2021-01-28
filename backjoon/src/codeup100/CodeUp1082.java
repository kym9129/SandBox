package codeup100;

import java.util.Scanner;

public class CodeUp1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		//Integer.parseInt(String s, int radix)
		//숫자형의 문자열을 첫번째 인자값으로 받고 변환할 진수값을 입력하면 
		//해당 진수에 맞춰 Integer형으로 변환해줌
		int num = Integer.parseInt(input, 16);

		
		for(int i = 1; i < 16; i++) {
			System.out.printf("%X*%X=%X%n", num, i, num * i);
		}

	}

}
