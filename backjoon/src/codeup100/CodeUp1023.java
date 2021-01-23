package codeup100;

import java.util.Scanner;

public class CodeUp1023 {
	
	//https://codeup.kr/problem.php?id=1023

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Double input = sc.nextDouble();
		
		String str = input.toString();
//		System.out.println(str);
		
		String[] arr = str.split("\\.");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);

	}

}
