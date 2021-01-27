package codeup100;

import java.util.Scanner;

public class CodeUp1051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		if(b >= a)
			System.out.println(1);
		
		else
			System.out.println(0);

	}

}
