package codeup100;

import java.util.Scanner;

public class CodeUp1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		if(num < 0) {
			System.out.println("minus");
			if(num % 2 == 0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			
		}else {
			System.out.println("plus");
			if(num % 2 == 0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}

	}

}
