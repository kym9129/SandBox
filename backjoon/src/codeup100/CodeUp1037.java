package codeup100;

import java.util.Scanner;

public class CodeUp1037 {

	public static void main(String[] args) {
		// int -> char
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input >=0 && input <=255) {
			char ch = (char)input;
			System.out.println(ch);
		}
		else {
			return;
		}

	}

}
