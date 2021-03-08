package com.abst;

public class GraduateStudent extends Student {
	
	public GraduateStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GraduateStudent(int number, double point) {
		super(number, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean warning() {
		if(super.getPoint() >= 1.5 && super.getPoint() < 3.0)
			return true;
		
		return false;
	}

}
