package codeup100;

import java.util.Scanner;

//주민번호 앞 6자리와 뒷 7자리가 '-'로 구분되어 입력된다.
//(입력값은 가상의 주민번호이다.)
//ex)110011-0000000
//
//input : 000907-1121112
//out : 0009071121112

public class CodeUp1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split("-");
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		String result = sb.toString();
		System.out.println(result);
		
	}

}
