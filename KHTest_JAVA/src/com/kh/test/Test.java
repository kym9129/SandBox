package com.kh.test;

import com.kh.test.person.model.vo.Person;

public class Test {

	public static void main(String[] args) {
		Person[] pArr = {new Person("홍길동", '남'), 
						new Person("신사임당", '여'), 
						new Person("장영실", '남'),};
		
//		Person p = new Person();
//		Person p1 = new Person("홍길동", '남');
//		Person p2 = new Person("신사임당", '여');
//		Person p3 = new Person("장영실", '남');
		
		for(int i = 0; i < pArr.length; i++){
			System.out.println(pArr[i].getName());
		}

	}

}
