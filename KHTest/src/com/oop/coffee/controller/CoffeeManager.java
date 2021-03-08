package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

/**
 * control클래스 구현내용.
    1. Coffee 클래스에 대한 객체 배열(세계3대커피정보) 선언함. 배열크기 3.
    2. 사용자에게 키보드로 세계3대 커피정보를 입력받아, 각 객체에 기록함
    3. 출력 확인함
    <세계3대커피>
    ---------------------------
    원산지           지역
    ---------------------------
    예멘          모카마타리
    자메이카       블루마운틴
    하와이           코나
    ---------------------------
 * @author jin
 *
 */

public class CoffeeManager {
	public static final int COFFEE_LENGTH = 3;
	private Coffee[] coffeeArray = new Coffee[COFFEE_LENGTH];
	
	//입력메소드
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < COFFEE_LENGTH; i++) {
			//입력값 받기
			System.out.println("원산지 입력 : ");
			String inputOrigin = sc.next();
			System.out.println("지역 입력 : ");
			String inputLocation = sc.next();
			
			//객체배열에 파라미터생성자로 값 넣기
			coffeeArray[i] = new Coffee(inputOrigin, inputLocation);
			
		}
		
	}
	
	public void outInfo() {
		System.out.println("<세계3대커피>\n" + 
				"---------------------------\n" + 
				"원산지           지역\n" + 
				"---------------------------");
		for(Coffee c : coffeeArray) {
			System.out.println(c.information());
		}
	}
	

}
