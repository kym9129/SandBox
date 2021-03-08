package com.oop.coffee.run;

import com.oop.coffee.controller.CoffeeManager;

public class Run {

	public static void main(String[] args) {
		//  1. control클래스 객체생성 및 입력/출력 메소드 호출
		CoffeeManager cm = new CoffeeManager();
		
		cm.inputInfo();
		cm.outInfo();
	}

}
