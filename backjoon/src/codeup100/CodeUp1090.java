package codeup100;

import java.util.Scanner;

public class CodeUp1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		int a; //시작 값
		int r; //등비의 값
		int n; //몇번째 수
		a = Integer.parseInt(arr[0]);
		r = Integer.parseInt(arr[1]);
		n = Integer.parseInt(arr[2]);
		
		long[] series = new long[n];
		
		//2 3 7
		//2 *3(6) *3(18) *3() +3(13)
		
		for(int i = 0; i < series.length; i++) {
			series[i] = (long) (a * Math.pow(r, i));
//			System.out.println("series[" + i + "] = " + series[i]);
		}
		System.out.println(series[n-1]);

	}

}
