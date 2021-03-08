package com.kh.test.fruit.model.vo;

import java.util.Objects;

public class Fruit {
	
	String name;
	String flavor;
	
	
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Fruit(String name, String tast) {
		super();
		this.name = name;
		this.flavor = tast;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTast() {
		return flavor;
	}


	public void setTast(String tast) {
		this.flavor = tast;
	}


	@Override
	public String toString() {
		return "Fruit [name=" + name + ", tast=" + flavor + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, flavor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
