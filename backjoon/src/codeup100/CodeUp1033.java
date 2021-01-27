package codeup100;

import java.util.Scanner;

public class CodeUp1033 {
	
	//https://codeup.kr/problem.php?id=1033

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		String hexa = Integer.toHexString(input);
		
		char[] charr = hexa.toCharArray();
		
		for(int i = 0; i < charr.length; i++) {
			System.out.print(Character.toUpperCase(charr[i]));
		}
		

	}

}
