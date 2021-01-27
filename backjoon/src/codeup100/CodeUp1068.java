package codeup100;

import java.util.Scanner;

public class CodeUp1068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input >=90)
			System.out.println("A");
		else if(input >=70 && input <= 89)
			System.out.println("B");
		else if(input >=40 && input <= 69)
			System.out.println("C");
		else if(input <= 39)
			System.out.println("D");

	}

}
