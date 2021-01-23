package codeup100;

import java.util.Scanner;

public class CodeUp1026 {
	
	//https://codeup.kr/problem.php?id=1026

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split(":");
		
		int[] arrInt = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			arrInt[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.println(arrInt[1]);
		
	}

}
