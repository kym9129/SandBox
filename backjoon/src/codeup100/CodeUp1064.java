package codeup100;

import java.util.Scanner;

public class CodeUp1064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		System.out.println(a > b ? (b > c? c : b) : (a > c ? c : a));

	}

}
