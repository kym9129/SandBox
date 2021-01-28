package codeup100;

import java.util.Scanner;

public class CodeUp1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		int a; //시작 값
		int d; //등차의 값
		int n; //몇번째 수
		a = Integer.parseInt(arr[0]);
		d = Integer.parseInt(arr[1]);
		n = Integer.parseInt(arr[2]);
		
		int[] series = new int[n];
		
		//1 3 5
		//1 +3(4) +3(7) +3(10) +3(13)
		
		for(int i = 0; i < series.length; i++) {
			series[i] = a + (d * i);
//			System.out.println(series[i]);
		}
		System.out.println(series[n-1]);

	}

}
