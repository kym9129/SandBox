package com.abst;

public abstract class Student {
	private int number;
	private double point;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int number, double point) {
		super();
		this.number = number;
		this.point = point;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public int getNumber() {
		return number;
	}
	
	public boolean warning() {
		
		return false;
	}

}
