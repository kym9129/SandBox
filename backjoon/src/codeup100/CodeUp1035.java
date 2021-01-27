package codeup100;

import java.util.Scanner;

public class CodeUp1035 {
	
	//https://codeup.kr/problem.php?id=1035
	//16진수 -> 8진수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//16진수 입력받기
		String input = sc.nextLine();
		
		//16 -> 10
		int temp = Integer.valueOf(input, 16);
		
		//10 -> 8 출력
		System.out.println(Integer.toOctalString(temp));
		
		

	}

}
