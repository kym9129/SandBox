package codeup100;

import java.util.Scanner;

public class CodeUp1034 {
	//https://codeup.kr/problem.php?id=1034
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//8진수 입력받기. String타입 
		String input = sc.nextLine();
		
		//10진수로 변환하여 출
		int output = Integer.valueOf(input, 8);
		System.out.println(output);

	}

}
