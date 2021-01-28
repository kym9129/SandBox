package codeup100;

import java.util.Scanner;

public class CodeUp1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		
		int a, m, d, n;
		a = Integer.parseInt(arr[0]); //시작 값
		m = Integer.parseInt(arr[1]); //곱할 값
		d = Integer.parseInt(arr[2]); //더할 값
		n = Integer.parseInt(arr[3]); //몇번쨰인지
		
//		System.out.printf("%d, %d, %d, %d%n", a, m, d, n);
		
		//a, a*m+d, (a*m+d)*m+d, ((a*m+d)*m+d)*m+d...
		//1, 1*(-2)+1, (1*(-2)+1)*(-2)+1
		
		long[] srs = new long[n];
		int temp = a;
		
		
		for(int i = 0; i <n; i++) {
			if(i == 0) {
				srs[i] = a;
//				System.out.println("1srs[" + i + "] = " + srs[i]);
			}
			else {
				srs[i] = (srs[i-1] * m) + d;
//				System.out.println("2srs[" + i + "] = " + srs[i]);
			}
		}
		System.out.println(srs[n-1]);

	}

}
