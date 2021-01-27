package codeup100;

import java.util.Scanner;

public class CodeUp1048 {
//	https://codeup.kr/problem.php?id=1048
//	정수 2개(a, b)를 입력받아 a를 2b배 곱한 값으로 출력해보자.
//	0 <= a <= 10, 0 <= b <= 10
//	정수 2개가 공백을 두고 입력된다.
//	0 <= a, b <= 10
//	a 를 2b배 만큼 곱한 값을 출력한다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		System.out.println(a<<b);

	}

}
