package codeup100;

import java.util.Scanner;

public class CodeUp1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split(" ");
		int n, m;
		n = Integer.parseInt(arr[0]);
		m = Integer.parseInt(arr[1]);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				System.out.println(i + " " + j);
			}
		}

	}

}
