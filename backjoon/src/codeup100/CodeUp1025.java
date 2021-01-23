package codeup100;

import java.util.Scanner;

public class CodeUp1025 {
//https://codeup.kr/problem.php?id=1025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		if(!(input >= 10000 && input <= 99999))
			return;
		
		//int -> string
		String str = Integer.toString(input);
			
		int first = Character.getNumericValue(str.charAt(0));
		int second = Character.getNumericValue(str.charAt(1));
		int third = Character.getNumericValue(str.charAt(2));
		int fourth = Character.getNumericValue(str.charAt(3));
		int fifth= Character.getNumericValue(str.charAt(4));

		System.out.println("[" + first * 10000 + "]");
		System.out.println("[" + second * 1000 + "]");
		System.out.println("[" + third * 100 + "]");
		System.out.println("[" + fourth * 10 + "]");
		System.out.println("[" + fifth + "]");

	}

}
