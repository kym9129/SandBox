package codeup100;

import java.util.Scanner;

public class CodeUp1038 {
	//https://codeup.kr/problem.php?id=1038

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		//입력 예시 : 123 -123 (공백으로 구분)
		
		//입력값 나눠서 int로 변환
		String[] arr = input.split(" ");
		long frst = Long.parseLong(arr[0]);
		long scnd = Long.parseLong(arr[1]);
		
		//계산
		System.out.println(frst + scnd);

	}

}
