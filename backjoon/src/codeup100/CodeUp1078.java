package codeup100;

import java.util.Scanner;

public class CodeUp1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//1 -> 1 2 3 4 5 -> 2 + 4 = 6
		//10 -> 1 2 3 4 5 6 7 8 9 10 -> 2+4+6+8+10
		int[] arr = new int[input/2];
		int idx = 0;
		for(int i = 1; i <=input; i++) {
//			System.out.println("i = " + i);
			if(i % 2 == 0) {
				arr[idx] = i; //짝수일 때만 배열에 넣는다.
//				System.out.println("arr["+idx+"]=" + arr[idx]);
				idx++;
			}
//			System.out.println("i2 = " + i);
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}

}
