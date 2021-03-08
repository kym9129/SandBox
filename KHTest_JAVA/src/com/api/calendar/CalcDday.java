package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalcDday {

	public static void main(String[] args) {
		CalcDday c = new CalcDday();
		c.test1();
//		c.test2();

	}
	
	public void test1() {
//		수료일까지 남은 일수를 계산해서 다음과 같이 출력하세요.
//		->  D-193일입니다.
//		->  D-Day입니다.
		
		Calendar endDay = new GregorianCalendar(2021, 6, 8); //month-1
		Calendar now = new GregorianCalendar();
		
		long endMil = endDay.getTimeInMillis()/(1000*60*60*24);
		long nowMil = now.getTimeInMillis()/(1000*60*60*24);
		
		System.out.println("D-" + (endMil - nowMil) + "일 입니다.");
		if((endMil - nowMil) == 0)
			System.out.println("D-Day입니다.");
		
	}

	public void test2() {
//		Calendar클래스를 이용해서 D-DAY계산기를 만드세요.
//		출력은 다음과 같습니다.
//
//		 ->  193일 남았습니다. (D-DAY 전)
//		 ->  D-DAY입니다.(D-DAY)	
//		 ->  20일 지났습니다.(D-DAY가 지난 경우)
		
	}
}
