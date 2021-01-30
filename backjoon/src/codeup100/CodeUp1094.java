package codeup100;

import java.util.Scanner;

public class CodeUp1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//첫번째 입력값 : 사용자 입력
		int n = sc.nextInt();
		sc.nextLine();
		
		//두번째 입력값 -> 1~23 랜덤수가 n만큼 입력
		//String -> String[] -> int[]
		String input2 = sc.nextLine();
		String[] arr = input2.split(" ");
		int[] rndm = new int[arr.length]; //랜덤수 담길 배열
		for(int i = 0; i <arr.length; i++) {
			rndm[i] = Integer.parseInt(arr[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		int[] reverse = new int[arr.length]; //거꾸로 번호 담을 배열
		for(int i = 0; i < arr.length; i++) {
			reverse[i] = rndm[arr.length-(i+1)];
			String str = reverse[i] + " ";
			sb.append(str);
		}
		System.out.println(sb.toString().substring(0, sb.length()-1));
		

	}

}
