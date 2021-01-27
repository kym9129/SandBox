package codeup100;

import java.util.Scanner;

public class CodeUp1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split(" ");
		int[] arr2 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
			
			if(arr2[i] %2 == 0)
				System.out.println(arr[i]);
		}
	}

}
