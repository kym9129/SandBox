package com.oop.body.controller;

import com.oop.body.model.Arm;
import com.oop.body.model.Body;
import com.oop.body.model.Head;
import com.oop.body.model.Leg;

public class ActionBody {
	
//	메인에서 다형성 사용 신체부위별 객체를 담을 수 있는 Body타입의 객체배열[5]을 생성후, 
//	임의의 신체객체를 각 인덱스별로 담습니다. 
//	그후 반복문을 통해서 각 객체별 고유메소드를 실행하세요.
//	+action(body:Body):void 메소드에서 객체별 고유메소드를 실행할 것
//	(instanceof연산자 사용 또는 동적바인딩 활용)


	public static void main(String[] args) {
		
		Body[] bodyArr = new Body[5];
		bodyArr[0] = new Head("노랑");
		bodyArr[1] = new Arm();
		bodyArr[2] = new Arm();
		bodyArr[3] = new Leg();
		bodyArr[4] = new Leg();
		
		for(int i = 0; i < bodyArr.length; i++) {
			bodyArr[i].action(bodyArr[i]);
			
		}

	}
	

}
