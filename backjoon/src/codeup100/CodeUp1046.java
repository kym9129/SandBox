package codeup100;

import java.util.Scanner;

public class CodeUp1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split(" ");
		
		int a, b, c;
		a = Integer.parseInt(arr[0]);
		b = Integer.parseInt(arr[1]);
		c = Integer.parseInt(arr[2]);
		
		long sum = (long)a + (long)b + (long)c;
		double avrg = (double)sum / (double)arr.length;
		
		System.out.printf("%d%n%.1f", sum, avrg);

	}

}
