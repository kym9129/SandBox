package com.inherit;

public class Manager extends Employee {
	
	int bonus;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Manager(int salary) {
		super(salary);
	}

	public Manager(int salary, int bonus) {
		super(salary);
		this.bonus = bonus;
	}

	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public int getTax() {
		return (int)((super.getSalary() + bonus ) * 0.1);
	}

}
