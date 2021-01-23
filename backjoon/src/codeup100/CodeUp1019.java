package codeup100;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CodeUp1019 {
//	년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
//	입력 예시 : 2013.8.5
//	출력 예시 : 2013.08.05

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split("\\.");
		
		double year = Double.parseDouble(arr[0]);
		double month = Double.parseDouble(arr[1]);
		double date = Double.parseDouble(arr[2]);
		
		//숫자형식변환
		DecimalFormat df = new DecimalFormat("00");
		DecimalFormat yearDf = new DecimalFormat("0000");
		
		//format은 double, long만 가능
		System.out.println(yearDf.format(year) + "." + df.format(month) + "." + df.format(date));
		
		


	}

}
