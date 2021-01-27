package codeup100;

import java.util.Scanner;

public class CodeUp1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] strArr = input.split(" ");
		int[] intArr = new int[strArr.length];
		
		for(int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
			
			if(intArr[i] % 2 == 0)
				System.out.println("even");
			else
				System.out.println("odd");
		}

	}

}
