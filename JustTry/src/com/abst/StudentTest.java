package com.abst;

public class StudentTest {

	public static void main(String[] args) {
		Student ugs = new UnderGraduateStudent(11, 1.5);
		Student gs = new GraduateStudent(222, 1.5);
		
		System.out.println("lab7_2: 홍길동\n");
		System.out.println(ugs.getNumber() + " " + ugs.getPoint() + " " + ugs.warning());
		System.out.println(gs.getNumber() + " " + gs.getPoint() + " " + gs.warning());

	}

}
