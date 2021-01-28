package codeup100;

import java.util.Scanner;

public class CodeUp1092 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		
		int a, b, c;
		a = Integer.parseInt(arr[0]); //ex. 3일마다
		b = Integer.parseInt(arr[1]); //7일마다
		c = Integer.parseInt(arr[2]); //9일마다
		int day = 1;
		
		while(true) {
			if(day % a == 0 && day % b == 0 && day % c == 0) {
				System.out.println(day);
				break;
			}
			day++;
		}

	}

}
