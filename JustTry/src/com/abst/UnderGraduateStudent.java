package com.abst;

public class UnderGraduateStudent extends Student {

	public UnderGraduateStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnderGraduateStudent(int number, double point) {
		super(number, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean warning() {
		if(super.getPoint() < 1.5)
			return true;
		
		return false;
	}
	
}
