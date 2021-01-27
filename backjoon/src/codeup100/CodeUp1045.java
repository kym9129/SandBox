package codeup100;

import java.util.Scanner;

public class CodeUp1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split(" ");
		int a, b;
		a = Integer.parseInt(arr[0]);
		b = Integer.parseInt(arr[1]);
		double result = (double)a / (double)b;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.printf("%.2f", result);

	}

}
