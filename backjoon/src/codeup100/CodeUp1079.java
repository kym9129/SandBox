package codeup100;

import java.util.Scanner;

public class CodeUp1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			char input = sc.next().charAt(0); //입력받기 
			System.out.println(input);
			if(input == 'q') { //'q'입력받으면 종료
				return;
			}
			
		}

	}

}
