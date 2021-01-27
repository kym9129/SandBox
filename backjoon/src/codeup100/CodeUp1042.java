package codeup100;

import java.util.Scanner;

public class CodeUp1042 {
	//https://codeup.kr/problem.php?id=1042

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		//입력값 쪼개서 int변환
		String[] arr = input.split(" ");
		int a, b;
		a = Integer.parseInt(arr[0]);
		b = Integer.parseInt(arr[1]);
		
		int result = a / b;
		
		System.out.println(result);

	}

}
