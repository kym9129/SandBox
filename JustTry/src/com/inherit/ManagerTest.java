package com.inherit;

public class ManagerTest {
	
//	직원(Employee) 클래스를 상속하는 매니저(Manager) 클래스를 정의하고 사용하는 프로그램을 작성하시오.
//
//	- Employee 클래스
//	  필드: 봉급(salary)
//	  메소드:
//	     봉급의 getter/setter
//	     getTax - 세금액(봉급의 10%)을 리턴
//	     봉급을 매개변수로 받아 초기화 하는 생성자
//
//	- Manager 클래스 - Employee를 상속
//	  필드: 보너스(bonus)
//	  메소드:
//	     보너스의 getter/setter
//	     봉급과 보너스를 매개변수로 받아 초기화 하는 생성자 
//	     getTax 오버라이드 - 매니저의 속성에 적합하게 세금액(봉급과 보너스 총액의 10%)을 리턴
//
//	- ManagerTest 클래스의 main 메소드는 다음을 수행
//
//	(1) 봉급을 1000으로 초기화 한 직원 생성
//	(2) 직원 봉급, 세금액을 조회하여 출력
//
//	(3) 봉급을 1000, 보너스를 500로 초기화 한 매니저 생성
//	(4) 매니저의 봉급, 보너스, 세금액을 조회하여 출력

	public static void main(String[] args) {
		
		Manager m = new Manager(1000);
		System.out.println("봉급 : " + m.getSalary() + ", 세금액 : " + m.getTax());
		
		Manager m2 = new Manager(1000, 500);
		System.out.println("봉급 : " + m2.getSalary() + ", 보너스 : " +m2.getBonus() +  ", 세금액 : " + m2.getTax());

	}

}
