package codeup100;

import java.util.Scanner;

public class CodeUp1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		char[] chArr = input.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			
			System.out.println("\'" + chArr[i] + "\'");
		}

	}

}
