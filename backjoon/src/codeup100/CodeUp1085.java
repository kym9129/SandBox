package codeup100;

import java.util.Scanner;

public class CodeUp1085 {
	//참고 : https://ititit1.tistory.com/49?category=1140680
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		//44100 16 2 10 -> 1.7 MB
		
		String[] arr = input.split(" ");
		long h, b, c, s;
		h = Long.parseLong(arr[0]);
		b = Long.parseLong(arr[1]);
		c = Long.parseLong(arr[2]);
		s = Long.parseLong(arr[3]);
		double total = 0;
		
		total = h*b*c*s;
		
		double result = ((total / 8) / Math.pow(2, 10) / Math.pow(2, 10));
		
		System.out.printf("%.1f MB", result);
		
	}

}
