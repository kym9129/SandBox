package com.oop.method.nonstatic;

public class NonStatic {

	//1. 반환값 없고 매개변수 없는 메소드
    //실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
    //메소드명 : printLottoNumbers
	public void printLottoNumbers() {
		final int LENGTH = 6;
		int[] lottoArr = new int[LENGTH];
		
		//1~45까지의 임의의 정수 6개 발생
		for(int i = 0; i < 6; i++) {
			int lottoNum = (int)(Math.random()*45)+1;
			lottoArr[i] = lottoNum;
			System.out.print(lottoNum + " ");
			
			//중복검사
			for(int j = 0; j < i; j++) {
				if(lottoArr[j] == lottoNum)
					i--;
			}
			
		}
		
	}
    
    
    //2. 반환값 없고 매개변수 있는 메소드
    //실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
    //메소드명 : outputChar
	public void outputChar(int num, char ch) {
		//ex. 3, 'a' -> aaa
		
		for(int i = 0; i < num; i++) {
			System.out.println(ch);
		}
	}
    
    
    //3. 반환값 있고 매개변수 없는 메소드
    //실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
    //메소드명 : alphabet
	public char alphabet() {
		int rndm = 0; //// 65~90, 97~122
		while(true) {
			rndm = (int)(Math.random()*122)+1;
			if(rndm >= 'a' && rndm <= 'z' || rndm >= 'A' && rndm <= 'Z') {
				break;
			}
		}
		
		return (char)rndm;
	}
    
    
    //4. 반환값 있고 매개변수 있는 메소드
    //실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
    //추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
    //메소드명 : mySubstring


}
