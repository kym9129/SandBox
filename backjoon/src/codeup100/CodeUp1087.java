package codeup100;

import java.util.Scanner;

public class CodeUp1087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		while(true) {
//			System.out.println(i);
			sum += i;
//			System.out.println("sum = " + sum);
			if(sum >= n) {
//				System.out.println("sum >= n : true");
				break;
			}
			else {
//				System.out.println("sum >= n : false");
				i++;
			}
		}
		System.out.println(sum);
	}

}
