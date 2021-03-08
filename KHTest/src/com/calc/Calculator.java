package com.calc;

public class Calculator {

	public static void main(String[] args) {
		//main의 argument로 1자리 정수형(1부터 9까지만) 값을 2개 입력받아 4칙연산 결과를 출력한다. 입력값은 모두 int 형으로 처리한다.
		//함수 안에서 모든 코드 작업 진행
//		두 정수의 합, 차, 곱, 나누기한 몫을 출력한다.
//		단, 나누는 수(분모)가 0이거나 0보다 작으면 결과는 0 처리한다.
		//4와 2를 입력하였을 경우
//		합:6 
//		차:2 
//		곱:8 
//		나누기 : 2
		//모든 결과는 int 형으로 처리한다
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		if(num1 >= 1 && num1 <=9 || num2 >=1 && num2 <=9) {
			System.out.println("합 : " + (num1 + num2));
			System.out.println("차 : " + (num1 - num2));
			System.out.println("곱 : " + (num1 * num2));
			System.out.println("나누기 : " + (int)(num1 / num2));
		}

	}

}
