package codeup100;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CodeUp1027 {
	
	//https://codeup.kr/problem.php?id=1027

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] arr = input.split("\\.");
		int year, month, date;
		year = Integer.parseInt(arr[0]);
		month = Integer.parseInt(arr[1]);
		date = Integer.parseInt(arr[2]);
		
		DecimalFormat df = new DecimalFormat("00");
		DecimalFormat df2 = new DecimalFormat("0000");
		
		System.out.println(df.format(date) + "-" + df.format(month) + "-" + df2.format(year));

	}

}
