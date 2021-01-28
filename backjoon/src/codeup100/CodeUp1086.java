package codeup100;

import java.util.Scanner;

public class CodeUp1086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		//44100 16 2 10 -> 1.7 MB
		
		String[] arr = input.split(" ");
		long r, g, b, s;
		r = Long.parseLong(arr[0]);
		g = Long.parseLong(arr[1]);
		b = Long.parseLong(arr[2]);
		double total = 0;
		
		total = r*g*b;
		
		double result = ((total / 8) / Math.pow(2, 10) / Math.pow(2, 10));
		
		System.out.printf("%.2f MB", result);

	}

}
