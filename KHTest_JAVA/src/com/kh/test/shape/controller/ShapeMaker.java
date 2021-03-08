package com.kh.test.shape.controller;

import com.kh.test.shape.model.vo.Circle;
import com.kh.test.shape.model.vo.RectAngle;

public class ShapeMaker {

	public static void main(String[] args) {
		
		Circle[] cArr = {new Circle(20), new Circle(40), new Circle(50)};
		for(int i = 0; i < cArr.length; i++) {
			cArr[i].draw();
		}
		System.out.println("");
		
		RectAngle[] rArr = {new RectAngle(20, 20), new RectAngle(50, 60)};
		for(int i = 0; i < rArr.length; i++) {
			rArr[i].draw();
		}
//		Circle c1 = new Circle(20);
//		Circle c2 = new Circle(40);
//		Circle c3 = new Circle(50);
		
//		
//		c1.draw();
//		c2.draw();
//		c3.draw();
//		
		
//		System.out.println("");
//		
//		RectAngle r1 = new RectAngle(20, 20);
//		RectAngle r2 = new RectAngle(50, 60);
		
//		
//		r1.draw();
//		r2.draw();
		
	}

}
