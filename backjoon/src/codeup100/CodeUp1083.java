package codeup100;

import java.util.Scanner;

public class CodeUp1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int i = 1;
		while(i <= input) {
			//3의배수일 경우 X출력 
			if(i % 3 == 0) {
				System.out.print("X");
			}
			else {
				System.out.print(i);
			}
			if(i == input) {
				break;
			}
			System.out.print(" ");
			i++;
		}

	}

}
