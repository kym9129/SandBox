package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcYourDays {
	//사용자로부터 생일(년, 월, 일)을 입력받고, 오늘이 태어난지 몇일 되었는지 출력하세요.


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("생년월일을 입력하세요. (ex. 1991-02-09) : ");
//		String input = sc.nextLine();
		String input = "1991-02-09";
		
		int year = Integer.parseInt(input.substring(0, 4));
		int month = Integer.parseInt(input.substring(5, 7));
		int date = Integer.parseInt(input.substring(8, 10));
		
		Calendar birth = new GregorianCalendar(year, month+1, date);
		Calendar now = new GregorianCalendar();
		long b = birth.getTimeInMillis() / (24*60*60*1000);
		long n = now.getTimeInMillis() / (24*60*60*1000);
		long dday = n-b;
		
		System.out.println("태어난 날로부터 " + dday + "일 되었습니다.");
		
	}

}
