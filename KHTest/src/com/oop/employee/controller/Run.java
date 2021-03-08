package com.oop.employee.controller;

import com.oop.employee.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
//		1, 홍길동, 남, 010-1234-5678
//		2, 유관순, 여, 010-3131-3131, 영업부, 3000000, 0.15
		Employee e = new Employee();
		Employee e1 = new Employee(1, "홍길동", '남', "010-1234-5678");
		Employee e2 = new Employee(2, "유관순", '여', "010-3131-3131", "영업부", 3000000, 0.15);
		e.printEmployee();
		e1.printEmployee();
		e2.printEmployee();
	}

}
