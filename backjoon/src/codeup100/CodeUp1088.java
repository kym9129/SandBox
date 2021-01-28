package codeup100;

import java.util.Scanner;

public class CodeUp1088 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= n; i++) {
			if(!(i % 3 == 0)) {
				sb.append(i);
				sb.append(" ");
			}
			else {
				continue;
			}
		}
		System.out.println(sb.substring(0, sb.length()-1));
		
	}

}
